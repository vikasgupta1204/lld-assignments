package com.inteviewprep.Multithreading.CocurrentDatatypes.Atomic;
public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
          //  System.out.println("Lock taken by:"+Thread.currentThread().getName());
          //  lock.lock();
            count.data.addAndGet(-i);
            System.out.println("Value subtracted and updated value is "+count.data.get());

            //   lock.unlock();
          //  System.out.println("Lock released by:"+Thread.currentThread().getName()+" and count value is "+ count.data);


        }
    }
}
