package com.shashank.threads.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsMain {

    public static void main(String...args) {
        ExecutorService executorService = Executors.newFixedThreadPool(9);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 10; i++) {
            int finalI1 = i;
            Future<?> submit = executorService.submit(
                    () -> {
                        long result = factorial(finalI1);
                        System.out.println("Factorial result :: >> " + result);
                    }
            );
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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
