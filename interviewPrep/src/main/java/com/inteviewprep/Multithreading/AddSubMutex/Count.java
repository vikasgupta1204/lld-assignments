package com.inteviewprep.Multithreading.AddSubMutex;

public class Count {
    public int data=0;

    public synchronized void increment(int value){
        this.data+=value;
    }

    public int display(){
        return  this.data;
    }
}
