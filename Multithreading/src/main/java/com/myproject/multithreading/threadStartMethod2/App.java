package com.myproject.multithreading.threadStartMethod2;

class Runner implements Runnable {
    public void run(){
        for(int i=1; i<10; i++){
            System.out.println("Hello "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        thread1.start();
        thread2.start();
    }
}
