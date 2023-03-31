package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MongoDbFactory implements DbFactory{

    @Override
    public Query createQuery() {
        return new MongodbQuery();
    }

    @Override
    public Connection createConnection() {
        return new MongodbConnection();
    }

    @Override
    public Transaction createTransaction() {
        return new MongodbTransaction();
    }
}
