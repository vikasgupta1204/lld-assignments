package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MongodbDatabase implements  Database{
    @Override
    public DbFactory createFactory() {
        return new MongoDbFactory();
    }
}
