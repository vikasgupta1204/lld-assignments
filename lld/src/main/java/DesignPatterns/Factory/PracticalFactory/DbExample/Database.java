package com.v2.spingbootspringcore.spingbootspringcore.DesignPatterns.Factory.PracticalFactory.DbExample;

import javax.xml.crypto.Data;

public interface Database {

    public void connect();
    public void executeQuery(String query);
    public void disconnect();
}
