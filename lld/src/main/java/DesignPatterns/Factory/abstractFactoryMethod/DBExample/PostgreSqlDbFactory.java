package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class PostgreSqlDbFactory implements  DbFactory{
    @Override
    public Query createQuery() {
        return new PostgreSqlQuery();
    }

    @Override
    public Connection createConnection() {
        return new PostgreSqlConnection();
    }

    @Override
    public Transaction createTransaction() {
        return new PostgreSqlTransaction();
    }
}
