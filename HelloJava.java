import java.util.List;
import java.util.SequencedCollection;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloJava {
    void main() {
        System.out.println("\n🔥 Welcome to Java 22 Advanced Features 🔥\n");

        // 🔹 String Templates (Preview Feature)
        String name = "Alice";
        int age = 30;
        String message = STR."Hello, \{name}! You are \{age} years old.";
        System.out.println(message);

        // 🔹 Sequenced Collections (Ordered List & Set)
        SequencedCollection<String> fruits = List.of("Apple", "Banana", "Cherry");
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        SequencedCollection<String> cities = new LinkedHashSet<>(List.of("New York", "Paris", "Tokyo"));
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        // 🔹 Stream API Enhancements - Using `mapMulti`
        List<String> words = List.of("Java", "22", "Rocks!");
        words.stream()
             .mapMulti((word, consumer) -> {
                 consumer.accept(word.toUpperCase());
                 consumer.accept(word.toLowerCase());
             })
             .forEach(System.out::println);

        // 🔹 Virtual Threads - Lightweight Concurrency
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Running Virtual Thread " + taskId);
                });
            }
        }  // Virtual Threads automatically close when done

        System.out.println("\n✅ Java 22 Features Demonstrated Successfully!");
    }
}
