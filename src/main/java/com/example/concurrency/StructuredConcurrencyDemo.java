package com.example.concurrency;

import java.util.concurrent.*;

public class StructuredConcurrencyDemo {
    public static void run() throws InterruptedException, ExecutionException {
        System.out.println("🔹 Running Structured Concurrency Demo...");

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            var task1 = executor.submit(() -> {
                Thread.sleep(1000);
                return "✅ Task 1 Completed!";
            });
            var task2 = executor.submit(() -> {
                Thread.sleep(500);
                return "✅ Task 2 Completed!";
            });

            System.out.println(task1.get());
            System.out.println(task2.get());
        }
    }
}