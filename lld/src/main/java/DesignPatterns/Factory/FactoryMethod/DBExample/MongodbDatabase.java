package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.FactoryMethod.DBExample;

public class MongodbDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connected to Mongodb database....");
    }

    @Override
    public void shutdown() {
        System.out.println("shutting down mongodb database....");
    }

    @Override
    public void restart() {
        System.out.println("restarting mongodb database....");
    }

    @Override
    public void setUrl() {
        System.out.println("setting url for mongodb database....");
    }

    @Override
    public Query createQuery() {
        return new MogoDBQuery();
    }
}
