package com.inteviewprep.AOP.daoImpl;

import com.inteviewprep.AOP.dao.AccountDao;
import com.inteviewprep.AOP.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Override
    public void addAccount() {
        System.out.println(getClass()+": Doing my db work: Adding an account");
    }

    @Override
    public List<Account> findAccounts() {
//        Account account1=new Account("John","silver");
//        Account account2=new Account("Mohan","gold");
//        Account account3=new Account("Luca","Platinum");
//
//        List<Account> accounts=List.of(account1,account2);
        return findAccounts(false);
    }

    @Override
    public List<Account> findAccounts(boolean tripWire) {

        if(tripWire==true){
            throw new RuntimeException("No method allowed");
        }
        Account account1=new Account("John","silver");
        Account account2=new Account("Mohan","gold");
        Account account3=new Account("Luca","Platinum");

        List<Account> accounts=List.of(account1,account2);
        return accounts;
    }
}
