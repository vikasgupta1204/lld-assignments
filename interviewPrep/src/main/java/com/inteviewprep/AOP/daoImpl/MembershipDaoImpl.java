package com.inteviewprep.AOP.daoImpl;

import com.inteviewprep.AOP.dao.MembershipDao;
import org.springframework.stereotype.Component;

@Component
public class MembershipDaoImpl implements MembershipDao {
    @Override
    public void addAccount() {
        System.out.println(getClass()+": Doing my db work: Adding an account:"+getClass().getEnclosingMethod());
    }

    @Override
    public boolean addSillyAccount() {
        System.out.println(getClass()+": Doing my db work: addSillyAccount: "+this.getClass().getDeclaredMethods());

        return false;
    }
}
