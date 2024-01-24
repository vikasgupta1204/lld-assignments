package com.inteviewprep.Multithreading.Semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private int maxSizeOfStore;
    private String name;
    private Queue<Shirt> store=new ConcurrentLinkedDeque<>();
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Consumer(int maxSizeOfStore, String name, Queue<Shirt> store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                consumerSemaphore.acquire();
                store.remove();
                System.out.println(name+" consumed. Left shirt count="+store.size());
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
