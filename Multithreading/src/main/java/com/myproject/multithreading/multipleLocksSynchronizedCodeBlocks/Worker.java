package com.myproject.multithreading.multipleLocksSynchronizedCodeBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 class Worker {
     Object lock1 = new Object();
     Object lock2 = new Object();
    private final Random random = new Random();

    public List<Integer> list1 = new ArrayList<>();
    public List<Integer> list2 = new ArrayList<>();

    public void stageOne(){
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }
    public void stageTwo(){
        synchronized (lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }
    public void process(){
        for(int i=1; i<1000; i ++){
            stageOne();
            stageTwo();
        }
    }

    public void main1() {
        System.out.println("starting*********");
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable(){

            @Override
            public void run() {
                process();
            }
        });
        Thread thread2 = new Thread(new Runnable(){

            @Override
            public void run() {
                process();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken to process******  "+(end-start));
        System.out.println("List1  "+list1 +"; List2   "+list2);
    }
}