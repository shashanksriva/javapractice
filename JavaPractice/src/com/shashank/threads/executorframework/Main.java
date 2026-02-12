package com.shashank.threads.executorframework;

public class Main {


    public static void main(String... strings) {
        long startTime = System.currentTimeMillis();
        Thread [] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI1 = i;
            threads[i-1] = new Thread(
                    () -> {
                        long result = factorial(finalI1);
                        System.out.println("Factorial result :: >> " + result);
                    }
            );
            threads[i-1].start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total Time :: " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
