# Kafka Location Data Producer and Consumer

Kafka Location Data Producer and Consumer is a Java Spring Boot application that demonstrates how to use Apache Kafka to produce and consume dummy location data.

## Installation

1. **Prerequisites**: 
   - Java 11 or higher
   - Apache Kafka (installation instructions: [Apache Kafka Quickstart](https://kafka.apache.org/quickstart))

2. **Useful commands**:
   - To Start the Zookeeper and Kafka server using following commands
     ```sh
     bin\windows\zookeeper-server-start.bat config\zookeeper.properties
     bin\windows\kafka-server-start.bat config\server.properties
     ```sh
   -  To create Kafka topic named `location-update-topic`:
     ```sh
     bin\windows\kafka-topics.bat --create --topic location-update-topic --bootstrap-server localhost:9092
     ```
   - To start the Producer on this topic:
     ```sh
     bin\windows\kafka-console-producer.bat --topic location-update-topic --bootstrap-server localhost:9092
     ```
   - To start the Consumer on this topic:
     ```sh
     bin\windows\kafka-console-consumer.bat --topic location-update-topic --from-beginning --bootstrap-server localhost:9092
     ```
   - Or you can directly run the Spring Boot application to register the producer and consumer for the same topic.
     

4. **Producing and Consuming Data**:
   - The producer endpoint (`/update`) generates and sends 200,000 sample location data entries to the Kafka topic `location-data-topic`.
   - The consumer consumes messages from the `location-data-topic` topic and logs them to the console.
   - You can simultaneously view this from console as well.

## Project Structure

- `src/main/java/com/deliveryboy/service/`: Contains the service class for producing location data.
- `src/main/java/com/deliveryboy/controller/`: Contains the controller class for exposing the REST Endpoint.
- `src/main/java/com/deliveryboy/config/`: Contains the Kafka configuration class.
- `src/main/resources/`: Contains application properties and Kafka configuration.
  Similarly for Consumer ther are similar files

## Configuration

Kafka configurations can be modified in `src/main/resources/application.properties`.

## Usage

- Access the producer endpoint at http://localhost:8080/location/update and hit POST request to start producing data.
- Check the console logs to see the consumed data.
