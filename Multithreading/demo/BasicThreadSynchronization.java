package demo;

import java.util.Scanner;

class Processor1 extends Thread{
    private boolean running = true;

    public void run(){
        while(running){
            System.out.println("Hello ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown(){
        running = false;
    }
}
public class BasicThreadSynchronization {
    public static void main(String[] args) {
        Processor1  processor1 = new Processor1();
        processor1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        processor1.shutdown();
    }
}
