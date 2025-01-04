package com.example.concurrency;

public class VirtualThreadsDemo {
    public static void run() {
        System.out.println("🔹 Running Virtual Threads Demo...");

        Thread.startVirtualThread(() -> {
            System.out.println("✅ Virtual Thread Executing...");
        });
    }
}
