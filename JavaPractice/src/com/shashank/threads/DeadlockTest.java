package com.shashank.threads;

public class DeadlockTest {


}


class Pen {

    private final Paper paper;

    public Pen(Paper paper) {
        this.paper = paper;
    }

    public synchronized void write() {
        System.out.println(Thread.currentThread().getName() + " is using paper .. ");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writing => " + this);
    }
}

class Paper {

    private final Pen pen;

    public Paper(Pen pen) {
        this.pen = pen;
    }

    public synchronized void write(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using pen .. ");
        pen.finishWriting();
    }

    public void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writing => " + this);
    }
}