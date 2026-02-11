# Use Java 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy all project files
COPY . .

# Give permission to mvnw (important for Linux)
RUN chmod +x mvnw

# Build the application (skip tests)
RUN ./mvnw clean package -DskipTests

# Expose port (Render will override with PORT)
EXPOSE 8080

# Run the generated jar
CMD ["sh", "-c", "java -jar target/*.jar"]
