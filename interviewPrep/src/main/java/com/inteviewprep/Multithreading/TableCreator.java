package com.inteviewprep.Multithreading;

public class TableCreator implements Runnable{
    int num;
    public TableCreator(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(num+" times "+i+" is "+(num*i));
        }
    }
}
