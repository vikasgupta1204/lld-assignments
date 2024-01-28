package com.inteviewprep.AOP.dao;


import org.springframework.stereotype.Component;

@Component
public interface MembershipDao {
    public void addAccount();
    public boolean addSillyAccount();
}
