package com.inteviewprep.AOP.dao;

import com.inteviewprep.AOP.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountDao {
    public  void addAccount();
    public List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);
}
