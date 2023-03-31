package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MySqlTransaction implements Transaction{
    @Override
    public void createTransaction() {
        System.out.println("transaction for Mysql");
    }
}
