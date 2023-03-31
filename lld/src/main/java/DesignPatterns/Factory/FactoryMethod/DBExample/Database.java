package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.FactoryMethod.DBExample;

public interface Database {
    public void connect();
    public void shutdown();
    public void restart();
    public void setUrl();
    public Query createQuery();
}
