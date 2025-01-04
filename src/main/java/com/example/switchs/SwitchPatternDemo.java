package com.example.switches;

public class SwitchPatternDemo {
    public static void run() {
        System.out.println("🔹 Running Enhanced Switch Expressions...");

        Object obj = "Hello";

        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown Type";
        };

        System.out.println("✅ " + result);
    }
}