package com.inteviewprep.AOP.aspect;

import com.inteviewprep.AOP.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Before("execution(* add*())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n==>>>Executing @BeforeAdvice on add Account");
    }

    @AfterReturning(pointcut = "execution(* com.inteviewprep.AOP.dao.AccountDao.findAccounts(..))",returning = "result")
    public void afterReturningFindAccounts(JoinPoint theJointPoint, List<Account> result){
        System.out.println("\n==>>>Executing @AfterReturningAdvice "+this.getClass().getDeclaredMethods());
        System.out.println("result are here:"+result);
    }

    @AfterThrowing(
            pointcut = "execution(* com.inteviewprep.AOP.dao.AccountDao.findAccounts(..))\",returning = \"result",
            throwing = "theExc"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint,Throwable theExc){
        System.out.println("\n==>>>Executing @AfterThrowingAdvice "+this.getClass().getDeclaredMethods());
        System.out.println("\nThe error thrown is:"+theExc);
    }
}
