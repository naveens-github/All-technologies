package demo;

public class SynchornizedExample {
    int count =0;

    public synchronized void increament(){
        count++;
    }

    public static void main(String[] args) {
        SynchornizedExample synchornizedExample = new SynchornizedExample();
        synchornizedExample.doWork();
    }
    public void doWork(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    increament();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    increament();
                }
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
        System.out.println("count is "+count);
    }
}
