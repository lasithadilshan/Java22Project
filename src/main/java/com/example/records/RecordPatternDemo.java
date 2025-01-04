package com.example.records;

public class RecordPatternDemo {
    record Person(String name, int age) {}

    public static void run() {
        System.out.println("🔹 Running Pattern Matching for Records...");

        Object obj = new Person("Alice", 30);

        if (obj instanceof Person(String name, int age)) {
            System.out.println("🔹 Name: " + name + ", Age: " + age);
        }
    }
}