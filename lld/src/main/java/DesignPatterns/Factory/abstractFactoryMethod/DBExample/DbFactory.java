package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public interface DbFactory {
    public Query createQuery();
    public Connection createConnection();
    public Transaction createTransaction();
}
