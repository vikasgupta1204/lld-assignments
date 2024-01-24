package com.inteviewprep.Multithreading.Semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        int maxSizeOfStore=20;
        Semaphore producerSemaphore=new Semaphore(maxSizeOfStore);
        Semaphore consumerSemaphore=new Semaphore(0);
        Queue<Shirt> store=new ConcurrentLinkedDeque<>();
        Producer p1=new Producer(maxSizeOfStore,"p1",store,producerSemaphore,consumerSemaphore);
        Producer p2=new Producer(maxSizeOfStore,"p2",store,producerSemaphore,consumerSemaphore);
        Producer p3=new Producer(maxSizeOfStore,"p3",store,producerSemaphore,consumerSemaphore);
        Consumer c1=new Consumer(maxSizeOfStore,"c1",store,producerSemaphore,consumerSemaphore);
        Consumer c2=new Consumer(maxSizeOfStore,"c2",store,producerSemaphore,consumerSemaphore);
        Consumer c3=new Consumer(maxSizeOfStore,"c3",store,producerSemaphore,consumerSemaphore);
        Consumer c4=new Consumer(maxSizeOfStore,"c4",store,producerSemaphore,consumerSemaphore);
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();



    }
}
