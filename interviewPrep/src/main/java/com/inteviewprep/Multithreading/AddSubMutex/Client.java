package com.inteviewprep.Multithreading.AddSubMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c=new Count();
        Lock lock=new ReentrantLock();
        c.data=0;
       // ExecutorService ex= Executors.newCachedThreadPool();
        Adder adder=new Adder(c,lock);
        Subtractor subtractor=new Subtractor(c,lock);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();
     //   ex.execute(adder);
     //   ex.execute(subtractor);
     //   ex.shutdown();
    Thread.sleep(500);
System.out.println("Final value is "+c.display());

    }
}
