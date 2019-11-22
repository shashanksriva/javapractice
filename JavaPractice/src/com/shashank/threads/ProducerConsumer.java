package com.shashank.threads;

public class ProducerConsumer {

    public static void main(String...strings) throws InterruptedException {
        
        Producer prodThread = new Producer();
        Consumer consThread = new Consumer();
        
        prodThread.start();
        prodThread.join();
        
        consThread.start();
    }
}

class Producer extends Thread {
    public void run() {
        for(int i=0 ; i < 100; i++)
            System.out.println("Produced :: ");
    }
}

class Consumer extends Thread {
    public void run() {
        for(int i=0 ; i < 100; i++)
            System.out.println("Consumed :: ");
    }
}