FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD build/libs/hackathon-backend-0.0.1-SNAPSHOT.jar hackathon-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","hackathon-backend-0.0.1-SNAPSHOT.jar"]