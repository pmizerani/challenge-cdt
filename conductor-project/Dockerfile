FROM adoptopenjdk/openjdk11:alpine
ADD ./target/conductor-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/conductor-service.jar"]

EXPOSE 8080