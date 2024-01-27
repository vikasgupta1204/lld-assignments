package com.inteviewprep.AOP.daoImpl;

import com.inteviewprep.AOP.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Override
    public void addAccount() {
        System.out.println(getClass()+": Doing my db work: Adding an account");
    }
}
