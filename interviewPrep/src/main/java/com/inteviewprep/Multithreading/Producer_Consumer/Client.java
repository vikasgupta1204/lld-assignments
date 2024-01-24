package com.inteviewprep.Multithreading.Producer_Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        int maxSizeOfStore=20;
        Queue<Shirt> store=new LinkedList<>();
        Producer p1=new Producer(maxSizeOfStore,"p1",store);
        Producer p2=new Producer(maxSizeOfStore,"p2",store);
        Producer p3=new Producer(maxSizeOfStore,"p3",store);
        Consumer c1=new Consumer(maxSizeOfStore,"c1",store);
        Consumer c2=new Consumer(maxSizeOfStore,"c2",store);
        Consumer c3=new Consumer(maxSizeOfStore,"c3",store);
        Consumer c4=new Consumer(maxSizeOfStore,"c4",store);
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();



    }
}
