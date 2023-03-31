package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.PracticalFactory.DbExample;

public class MongodbDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("connected to mongodb sql");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("executing query for mongodb database: "+query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting the mongodb database");
    }
}
