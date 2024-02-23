FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8081
ADD target/user-roles-0.0.1-SNAPSHOT.jar user-roles.jar
ENTRYPOINT ["java","-jar","user-roles.jar"]