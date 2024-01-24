package com.inteviewprep.Multithreading.AddSubMutex;

public class Counter {
    int data;

    public Counter(int data) {
        this.data = data;
    }
   synchronized public void incValue(int offset){
        this.data+=offset;
    }
    synchronized public int getValue(){
        return this.data;
    }

    synchronized  public  void  decValue(int offset){
        this.data-=offset;
    }
}
