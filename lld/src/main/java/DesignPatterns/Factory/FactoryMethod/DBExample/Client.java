package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.FactoryMethod.DBExample;

public class Client {

    public static void main(String[] args) {
        Database db=new PostgreSqlDatabase();
        Query q=db.createQuery();
        db.connect();
        db.setUrl();
        q.createQuery();
        db.shutdown();
        db.restart();

    }
}
