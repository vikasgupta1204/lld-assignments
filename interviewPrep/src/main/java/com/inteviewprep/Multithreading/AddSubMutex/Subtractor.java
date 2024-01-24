package com.inteviewprep.Multithreading.AddSubMutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;
    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(int i=0;i<100000;i++){
          //  System.out.println("Lock taken by:"+Thread.currentThread().getName());
          //  lock.lock();
            count.increment(-i);
         //   lock.unlock();
          //  System.out.println("Lock released by:"+Thread.currentThread().getName()+" and count value is "+ count.data);


        }
    }
}
