package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

public class PostgreSqlQuery implements  Query{

    @Override
    public void createQuery()
    {
        System.out.println("create query for postgresql");
    }
}
