package com.inteviewprep.Multithreading.Producer_Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Consumer implements Runnable{
    private int maxSizeOfStore;
    private String name;
    private Queue<Shirt> store=new LinkedList<>();

    public Consumer(int maxSizeOfStore, String name, Queue<Shirt> store) {
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            if(store.size()>0){
                store.remove();
                System.out.println(name+" consumed. Left shirt count="+store.size());
            }
        }
    }
}
