package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MongodbConnection implements  Connection{

    @Override
    public void createConnection() {
        System.out.println("Mongo db Connection is opened");
    }
}
