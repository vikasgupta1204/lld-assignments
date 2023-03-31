package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MongodbTransaction implements Transaction{
    @Override
    public void createTransaction() {
        System.out.println("Mongodb Transaction is opened");
    }
}
