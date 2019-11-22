package com.shashank.threads;

public class ThreadDeadlock {

    public static void main(String...strings) {

        Thread printNumbers = new Thread(new PrintNumbers());
        Thread printAlphabets = new Thread(new PrintAlphabets());
        
        printNumbers.start();
        printAlphabets.start();
    }
}


class PrintNumbers implements Runnable{

    @Override
    public void run() {
        
        for(int i = 0; i < 100; i++) {
            System.out.println("Number::" + i);
        }
    }
}


class PrintAlphabets implements Runnable{

    @Override
    public void run() {
        
        for(char c= 'a'; c <= 'z'; c++) {
            System.out.println("Alphabet :: " + c);
        }
    }
    
}