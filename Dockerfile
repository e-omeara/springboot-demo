FROM maven:3.9.10-eclipse-temurin-24 AS build
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:24-jdk-slim
COPY --from=build /target/myproject-0.0.1-SNAPSHOT.jar myproject.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "myproject.jar"]
# This Dockerfile builds a Java application using Maven and then runs it in a slim OpenJDK container.