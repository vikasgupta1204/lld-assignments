package com.inteviewprep;

import com.inteviewprep.AOP.dao.AccountDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.Socket;

@SpringBootApplication
public class InterviewPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPrepApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(@Qualifier("accountDaoImpl") AccountDao theAccountDao){
		return runner->{
			demoTheBeforeAdvice(theAccountDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao) {
		theAccountDao.addAccount();
	}
}
