package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.PracticalFactory.DbExample;

public class Client {
    public static void main(String[] args) {
        Database database = DatabaseFactory.createDatabaseConnection("postgresql");
        if(database!=null) {
            database.connect();
            database.executeQuery("select * from Student");
            database.disconnect();
        }
        else{
            System.out.println("db object is null");
        }
    }
}
