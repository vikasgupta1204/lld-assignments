package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class PostgreSqlTransaction implements  Transaction{

    @Override
    public void createTransaction() {
        System.out.println("Postgresql transaction is opened");
    }
}
