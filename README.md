# Java-UserRoles

## Prerequisites
- Java 17 or greater

## H2 database

### Dependencies

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Properties
```yaml
#
# h2 database
#
spring.datasource.url= jdbc:h2:mem:test
spring.datasource.driverClassName= org.h2.Driver
spring.datasource.username= sa
spring.datasource.password=
spring.jpa.database-platform= org.hibernate.dialect.H2Dialect
spring.h2.console.enabled= true
spring.jpa.hibernate.ddl-auto=create
```

With this configuration, you can access the H2 Console at http://localhost:8080/h2-console (assuming the application is running on the default port).
To log in you have to use the username "sa" and the password is empty.
Do not forget to change the JDBC URL to jdbc:h2:mem:test in the console.

```curl
curl -X POST \
  http://localhost:8081/api/v1/user/roles \
  -H 'Content-Type: application/json' \
  -d '{
    "email": "ingefabianflorez@gmail.com"
  }'

```

```curl
curl -X GET \
  http://localhost:8081/api/v1/roles \
  -H 'Content-Type: application/json'
```