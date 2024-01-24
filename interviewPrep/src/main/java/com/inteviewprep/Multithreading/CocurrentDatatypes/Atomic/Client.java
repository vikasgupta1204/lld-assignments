package com.inteviewprep.Multithreading.CocurrentDatatypes.Atomic;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c=new Count();
        Adder adder=new Adder(c);
        Subtractor subtractor=new Subtractor(c);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();
    Thread.sleep(500);
System.out.println("Final value is "+c.data.get());

    }
}
