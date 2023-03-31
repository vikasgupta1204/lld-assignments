package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.PracticalFactory.DbExample;

public class MysqlDatabase implements  Database{

    @Override
    public void connect() {
        System.out.println("Connected to mysql database");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("executing query for mysql: "+query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting the mysqldb");
    }
}
