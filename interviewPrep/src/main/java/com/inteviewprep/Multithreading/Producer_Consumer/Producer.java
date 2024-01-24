package com.inteviewprep.Multithreading.Producer_Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Producer implements  Runnable{
    private int maxSizeOfStore;
    private String name;
    private Queue<Shirt> store=new LinkedList<>();

    public Producer(int maxSizeOfStore, String name, Queue<Shirt> store) {
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            if(store.size()<maxSizeOfStore){
                store.add(new Shirt());
                System.out.println(name+" produced. Left shirt count="+store.size());
            }
        }
    }
}
