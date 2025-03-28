FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/user-roles-*.jar user-roles.jar
ENTRYPOINT ["java","-jar","user-roles.jar"]