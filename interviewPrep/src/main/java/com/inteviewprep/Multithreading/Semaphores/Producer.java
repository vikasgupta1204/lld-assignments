package com.inteviewprep.Multithreading.Semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    private int maxSizeOfStore;
    private String name;
    private Queue<Shirt> store=new ConcurrentLinkedDeque<>();
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Producer(int maxSizeOfStore, String name, Queue<Shirt> store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
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
                producerSemaphore.acquire();
                store.add(new Shirt());
                System.out.println(name+" produced. Left shirt count="+store.size());
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
