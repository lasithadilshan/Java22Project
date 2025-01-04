package com.example;

import com.example.concurrency.StructuredConcurrencyDemo;
import com.example.concurrency.VirtualThreadsDemo;
import com.example.json.JsonProcessor;
import com.example.records.RecordPatternDemo;
import com.example.switches.SwitchPatternDemo;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("🚀 Running Java 22 Features Project...");

        StructuredConcurrencyDemo.run();
        VirtualThreadsDemo.run();
        RecordPatternDemo.run();
        SwitchPatternDemo.run();
        JsonProcessor.run();

        System.out.println("✅ Execution Completed!");
    }
}
