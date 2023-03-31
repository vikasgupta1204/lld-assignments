package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.FactoryMethod.DBExample;

public class MySqlQuery implements  Query{
    @Override
    public void createQuery() {
        System.out.println("create query for mysqlquery");
    }
}
