package com.inteviewprep.Multithreading;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
   /*     List<Integer> nums=List.of(8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,8,3,2,10,15,12,4,14,89,45,31,8,3,2,10,15,12,4,14,89,45,31,73,56,89,11,90,
                87,65,49,11,221,242,9181,151,383,37474,2626,4744,2010,3747,3657,4868,355,19202,17474,16464,48595);
        ExecutorService executorService= Executors.newCachedThreadPool();
        long currentTime= System.currentTimeMillis();
        Multithreading.ArraySorter arraySorter=new Multithreading.ArraySorter(nums,executorService);
        Future<List<Integer>> ansFuture= executorService.submit(arraySorter);
        List<Integer> ans=ansFuture.get();
        ans.forEach(a-> System.out.print(a+" "));
        long currentTime1=System.currentTimeMillis();
        System.out.println();
        System.out.println(currentTime1-currentTime);
        executorService.shutdown();
*/

      /*  long currentTime= System.currentTimeMillis();
        Multithreading.ArraySorter arraySorter=new Multithreading.ArraySorter(nums);

        List<Integer> ans=arraySorter.sort(nums);
        ans.forEach(a-> System.out.print(a+" "));
        long currentTime1=System.currentTimeMillis();
        System.out.println();
        System.out.println(currentTime1-currentTime); */
      //  executorService.shutdown();

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            TableCreator t=new TableCreator(i);
            Thread thread=new Thread(t);
            thread.start();

        }
    }
}
