package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ArraySorter implements Callable<List<Integer>> {
    List<Integer> nums;
    ExecutorService executorService;

    public ArraySorter(List<Integer> nums) {
        this.nums = nums;
    }

    public ArraySorter(List<Integer> nums, ExecutorService executorService) {
        this.nums = nums;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(nums.size()<=1)return  nums;
        int mid=nums.size()/2;
        List<Integer> leftArray=new ArrayList<>();
        int i=0;
        while(i<mid){
            leftArray.add(nums.get(i));i++;
        }
        List<Integer> rightArray=new ArrayList<>();
        while (i<nums.size()){
            rightArray.add(nums.get(i));i++;
        }

       Future<List<Integer>> leftArrayFuture= executorService.submit(new ArraySorter(leftArray,executorService));
       Future<List<Integer>> rightArrayFuture=  executorService.submit(new ArraySorter(rightArray,executorService));
       List<Integer> leftArrayList=leftArrayFuture.get();
       List<Integer> rightArrayList=rightArrayFuture.get();

       int x=0;int y=0;
       List<Integer> sortedList=new ArrayList<>();
       while(x<leftArrayList.size()&&y<rightArrayList.size()){
           if(leftArrayList.get(x)<rightArrayList.get(y)){
               sortedList.add(leftArrayList.get(x));x++;
           }
           else{
               sortedList.add(rightArrayList.get(y));y++;
           }
       }
        while(x<leftArrayList.size()){
            sortedList.add(leftArrayList.get(x));x++;
        }
        while(y<rightArrayList.size()){
            sortedList.add(rightArrayList.get(y));y++;
        }

        return sortedList;
    }

    public List<Integer> sort(List<Integer> integers){
        if(integers.size()<=1)return  integers;
        int mid=integers.size()/2;
        List<Integer> leftArray=new ArrayList<>();
        int i=0;
        while(i<mid){
            leftArray.add(integers.get(i));i++;
        }
        List<Integer> rightArray=new ArrayList<>();
        while (i<integers.size()){
            rightArray.add(integers.get(i));i++;
        }


        List<Integer> leftArrayList=sort(leftArray);
        List<Integer> rightArrayList=sort(rightArray);

        int x=0;int y=0;
        List<Integer> sortedList=new ArrayList<>();
        while(x<leftArrayList.size()&&y<rightArrayList.size()){
            if(leftArrayList.get(x)<rightArrayList.get(y)){
                sortedList.add(leftArrayList.get(x));x++;
            }
            else{
                sortedList.add(rightArrayList.get(y));y++;
            }
        }
        while(x<leftArrayList.size()){
            sortedList.add(leftArrayList.get(x));x++;
        }
        while(y<rightArrayList.size()){
            sortedList.add(rightArrayList.get(y));y++;
        }

        return sortedList;
    }
}
