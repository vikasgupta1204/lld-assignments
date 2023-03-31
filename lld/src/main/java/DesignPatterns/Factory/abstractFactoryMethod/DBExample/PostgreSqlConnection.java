package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class PostgreSqlConnection implements  Connection{
    @Override
    public void createConnection() {
        System.out.println("Postgresql Connection is opened");
    }
}
