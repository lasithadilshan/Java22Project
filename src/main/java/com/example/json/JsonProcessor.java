package com.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProcessor {
    public static void run() throws Exception {
        System.out.println("🔹 Running JSON Processing Demo...");

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Alice\", \"age\":30}";

        // Convert JSON to Java Object
        Person person = mapper.readValue(jsonString, Person.class);
        System.out.println("🔹 Person: " + person.name() + ", Age: " + person.age());
    }

    record Person(String name, int age) {}
}
