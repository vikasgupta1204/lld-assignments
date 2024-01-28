package com.inteviewprep;

import com.inteviewprep.AOP.dao.AccountDao;
import com.inteviewprep.AOP.dao.MembershipDao;
import com.inteviewprep.AOP.model.Account;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class InterviewPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPrepApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(@Qualifier("accountDaoImpl") AccountDao theAccountDao, MembershipDao membershipDao){
		return runner->{
			demoTheBeforeAdvice(theAccountDao,membershipDao);
			demoTheAfterReturningAdvice(theAccountDao);
			demoTheAfterThrowingAdvice(theAccountDao);
		};
	}
	private void demoTheAfterThrowingAdvice(AccountDao theAccountDao) {
		List<Account> accounts=null;


		try {
			boolean tripWire=true;
			theAccountDao.findAccounts(tripWire);
		} catch (Exception e) {
			System.out.println("\n\nMain Program: demoTheAfterReturningAdvice. caught exception:"+e);
		}

	//	System.out.println("-----------");
		//System.out.println(accounts);
	//	System.out.println("\n");
	}


	private void demoTheAfterReturningAdvice(AccountDao theAccountDao) {
	List<Account> accounts= theAccountDao.findAccounts();
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("-----------");
		System.out.println(accounts);
		System.out.println("\n");
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao, MembershipDao membershipDao) {
	//	theAccountDao.addAccount();
	//	membershipDao.addAccount();
	//	membershipDao.addSillyAccount();
	}
}
