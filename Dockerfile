FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/user-roles-*.jar user-roles.jar
ENTRYPOINT ["java","-jar","user-roles.jar"]
EXPOSE 8080