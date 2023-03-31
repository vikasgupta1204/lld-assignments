package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class MySqlDbFactory implements  DbFactory{
    @Override
    public Query createQuery() {
        return new MySqlDbQuery();
    }

    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}
