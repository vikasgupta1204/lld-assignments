package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.PracticalFactory.DbExample;

public class DatabaseFactory {

    public static Database createDatabaseConnection(String dbtype){
        if(dbtype.equalsIgnoreCase("mysql")){
            return new MysqlDatabase();
        }
        else if(dbtype.equalsIgnoreCase("postgresql")){
            return new PostgresqlDatabase();
        }
        else if(dbtype.equalsIgnoreCase("mongodb")){
            return  new MongodbDatabase();
        }
        return null;
    }
}
