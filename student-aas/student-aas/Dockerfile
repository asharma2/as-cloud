# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="atulkumarsharma1986@gmail.com"

# Make port 8080 available to the world outside this container
EXPOSE 8080

ARG JAR_FILE=target/student-aas-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} student-aas.jar


ENTRYPOINT ["java","-jar","student-aas.jar", "com.cloud.student.Application"]