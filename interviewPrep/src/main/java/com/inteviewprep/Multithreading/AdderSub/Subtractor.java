package com.inteviewprep.Multithreading.AdderSub;

import java.util.concurrent.ExecutorService;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count) {
        this.count = count;

    }

    @Override
    public void run() {
        for(int i=0;i<1000000;i++){
            count.data--;
        }
    }
}
