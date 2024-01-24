package com.inteviewprep.Multithreading.AdderSub;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c=new Count();
        c.data=0;
       // ExecutorService ex= Executors.newCachedThreadPool();
        Adder adder=new Adder(c);
        Subtractor subtractor=new Subtractor(c);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();
     //   ex.execute(adder);
     //   ex.execute(subtractor);
     //   ex.shutdown();
    Thread.sleep(1);
        System.out.println(c.data);

    }
}
