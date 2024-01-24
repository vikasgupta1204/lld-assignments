package com.inteviewprep.Multithreading.CocurrentDatatypes.Atomic;

public class Adder implements  Runnable{
    Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.data.addAndGet(i);
            System.out.println("Value added and updated value is "+count.data.get());
        }
    }
}
