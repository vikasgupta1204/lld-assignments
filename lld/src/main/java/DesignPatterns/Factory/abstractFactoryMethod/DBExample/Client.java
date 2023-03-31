package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.AbstractFactory.DBExample;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
        Database db=new MongodbDatabase();
        DbFactory dbf=db.createFactory();
        Connection c=dbf.createConnection();
        Query q=dbf.createQuery();
        Transaction t=dbf.createTransaction();
        c.createConnection();
        q.createQuery();
        t.createTransaction();



    }
}
