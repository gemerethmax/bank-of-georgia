FROM maven:3.9-eclipse-temurin-21-alpine

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8081

CMD ["java", "-jar", "target/event-service-1.0.0.jar"]