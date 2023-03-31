package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.PracticalFactory.DbExample;

public class PostgresqlDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("connected to Postgresql database");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("executing the query for postgresql database: "+query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting the postgresql database");
    }
}
