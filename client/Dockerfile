FROM openjdk:17-jdk-slim

VOLUME /tmp

ARG JAR_FILE
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]