#!/bin/bash

echo "🚀 Running Java 22 Features Project..."

# Ensure the script stops on first error
set -e

# Clean and compile the project
echo "🔹 Cleaning and building the project..."
mvn clean package

# Run the compiled JAR with Java 22 preview features enabled
echo "🔹 Running the project..."
java --enable-preview -jar target/Java22Project-1.0-SNAPSHOT-shaded.jar