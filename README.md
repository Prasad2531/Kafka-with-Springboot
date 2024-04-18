Kafka Location Data Producer and Consumer
This project is a Java Spring Boot application that demonstrates how to use Apache Kafka to produce and consume dummy location data.

Getting Started
Prerequisites
Java 11 or higher
Apache Kafka (installation instructions: Apache Kafka Quickstart)
Running the Application
Start Apache Kafka and create a topic named location-data:

sh
Copy code
bin/kafka-server-start.sh config/server.properties
bin/kafka-topics.sh --create --topic location-data --bootstrap-server localhost:9092
Run the Spring Boot application:

sh
Copy code
./mvnw spring-boot:run
Producing and Consuming Data
The producer endpoint (/produce) generates and sends 200,000 sample location data entries to the Kafka topic location-data.
The consumer consumes messages from the location-data topic and logs them to the console.
Project Structure
src/main/java/com/example/kafka/: Contains the main application code.
KafkaProducerController.java: Defines the REST controller for producing data.
KafkaConsumer.java: Defines the Kafka consumer for consuming data.
src/main/resources/: Contains application properties and Kafka configuration.
Configuration
Kafka configurations can be modified in src/main/resources/application.properties.
Usage
Access the producer endpoint at http://localhost:8080/produce to start producing data.
Check the console logs to see the consumed data.
