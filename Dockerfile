FROM openjdk:8-jdk-alpine
COPY target/sample2-1.0-SNAPSHOT-jar-with-dependencies.jar ./target/Application.jar
COPY src/main/Static/* src/main/Static/
ENTRYPOINT java -jar target/Application.jar
