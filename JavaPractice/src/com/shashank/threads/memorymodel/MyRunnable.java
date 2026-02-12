package com.shashank.threads.memorymodel;

public class MyRunnable implements Runnable {

    int count = 0;
    @Override
    public void run() {

        for(int i=0; i < 1_00_00_00; i++) {
            this.count++;
        }
        System.out.println(Thread.currentThread().getName() + "- " + this.count);

    }
}
