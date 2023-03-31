package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.FactoryMethod.DBExample;

public class PostgreSqlDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("connected to PostgreSql");
    }

    @Override
    public void shutdown() {
        System.out.println("shutting down postgresql");
    }

    @Override
    public void restart() {
        System.out.println("restarting postgresql....");
    }

    @Override
    public void setUrl() {
        System.out.println("setting url for postgresql......");
    }

    @Override
    public Query createQuery() {
        return new PostgreSqlQuery();
    }
}
