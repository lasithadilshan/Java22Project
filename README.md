# Java 22 Features Project

## 🚀 Introduction

This project demonstrates the latest features introduced in **Java 22**. It covers structured concurrency, pattern matching, records, switch enhancements, and JSON processing using **Jackson**.

---

## 📌 Features

- **Structured Concurrency**: Manage concurrent tasks efficiently.
- **Pattern Matching for Records**: Improved destructuring capabilities.
- **Switch Pattern Matching**: Enhanced switch expressions.
- **Records**: Immutable data classes.
- **JSON Processing**: Using Jackson for serialization and deserialization.

---

## 🛠️ Project Structure

```
Java22Project/
│── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── Main.java
│   │   │   ├── concurrency/StructuredConcurrencyDemo.java
│   │   │   ├── json/JsonProcessor.java
│   │   │   ├── records/RecordPatternDemo.java
│   │   │   ├── switch/SwitchPatternDemo.java
│   ├── test/
│── pom.xml
│── run.sh
│── README.md
```

---

## 🛠️ Prerequisites

- **Java 22** installed
- **Apache Maven** installed
- **Git** (optional, for version control)

---

## 🔧 Build and Run the Project

### **Step 1: Clone the Repository**

```sh
git clone https://github.com/lasithadilshan/Java22Project.git
cd Java22Project
```

### **Step 2: Build the Project**

```sh
mvn clean package
```

### **Step 3: Run the Project**

```sh
java --enable-preview -cp target/classes com.example.Main
```

### **Step 4: Run the Project Using run.sh**

```sh
chmod +x run.sh
./run.sh
```

---

## 📜 Example Output

```
🚀 Running Java 22 Features Project...

🔹 Running Structured Concurrency Demo...
✅ Task 1 Result: 10
✅ Task 2 Result: 20
🔹 Person: Alice, Age: 30
🔹 Long String: Hello, Java 22!
✅ JSON Processing Successful!
✅ Execution Completed!
```

---

## 🛠️ Contributing

Contributions are welcome! Feel free to submit issues or pull requests.

---

## 📜 License

This project is licensed under the Creative Commons Zero v1.0 Universal License.

---

## 📧 Contact

For any questions, reach out at **[dilshantilakaratne29@gmail.com](mailto\:dilshantilakaratne29@gmail.com)**.