FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/user-roles-1.1.0.jar user-roles.jar
ENTRYPOINT ["java","-jar","user-roles.jar"]