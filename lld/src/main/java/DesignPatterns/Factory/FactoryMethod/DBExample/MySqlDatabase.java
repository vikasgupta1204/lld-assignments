package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.FactoryMethod.DBExample;

public class MySqlDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connected to MySqldb");
    }

    @Override
    public void shutdown() {
        System.out.println("shutting down mysql");
    }

    @Override
    public void restart() {
        System.out.println("restarting mysql.....");
    }

    @Override
    public void setUrl() {
        System.out.println("Setting url.. mysql.dbconnect.com");
    }

    @Override
    public Query createQuery() {
            return new MySqlQuery();
    }
}
