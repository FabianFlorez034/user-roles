FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/user-roles-0.0.1-SNAPSHOT.jar user-roles-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","user-roles-0.0.1-SNAPSHOT.jar"]