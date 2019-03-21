FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/trial-employeeservice-app/src
COPY pom.xml /usr/src/trial-employeeservice-app
RUN mvn -f /usr/src/trial-employeeservice-app/pom.xml clean package
FROM gcr.io/distroless/java
COPY --from=build /usr/src/trial-employeeservice-app/target/trial-employeeservice-app-0.0.1-SNAPSHOT.jar /usr/trial-employeeservice-app/trial-employeeservice-app-0.0.1-SNAPSHOT.jar
EXPOSE 8010
ENTRYPOINT ["java","-jar","/usr/trial-employeeservice-app/trial-employeeservice-app-0.0.1-SNAPSHOT.jar"]