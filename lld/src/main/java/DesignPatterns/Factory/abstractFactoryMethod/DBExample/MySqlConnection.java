package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MySqlConnection implements  Connection{
    @Override
    public void createConnection() {
        System.out.println("MySQl connection is opened");
    }
}
