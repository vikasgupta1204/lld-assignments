package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class PostgreSqlDatabase implements  Database{
    @Override
    public DbFactory createFactory() {
        return new PostgreSqlDbFactory();
    }
}
