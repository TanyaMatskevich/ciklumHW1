package com.ciklum.matskevich.java_SE.lecture41;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcesor(2);
        executor.execute(processor);

        Runnable processor2 = new MessageProcesor(3);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcesor(4);
        executor.execute(processor3);

        Runnable processor4 = new MessageProcesor(4);
        executor.execute(processor4);

        executor.shutdown();

        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("submitted all tasks...");
    }
}
