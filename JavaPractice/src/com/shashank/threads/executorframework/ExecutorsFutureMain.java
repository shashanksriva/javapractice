package com.shashank.threads.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsFutureMain {

    public static void main(String...args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> 42); //Callable
        //Runnable has a future to check status of the task
        System.out.println(future.get());
        executorService.shutdown();
    }

}
