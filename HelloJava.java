import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

record User(String name, int age) {}

public class HelloJava {
    void main() throws IOException {
        User user = new User("Alice", 30);
        ObjectMapper mapper = new ObjectMapper();
        
        // Convert object to JSON
        String json = mapper.writeValueAsString(user);
        System.out.println("JSON Output: " + json);
        
        // Convert JSON back to object
        User userFromJson = mapper.readValue(json, User.class);
        System.out.println("User from JSON: " + userFromJson);
    }
}
