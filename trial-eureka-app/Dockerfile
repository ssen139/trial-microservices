FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/trial-eureka-app/src
COPY pom.xml /usr/src/trial-eureka-app
RUN mvn -f /usr/src/trial-eureka-app/pom.xml clean package
#FROM gcr.io/distroless/java
COPY --from=build /usr/src/trial-eureka-app/target/trial-eureka-app-0.0.1-SNAPSHOT.jar /usr/trial-eureka-app/trial-eureka-app-0.0.1-SNAPSHOT.jar
EXPOSE 8010
ENTRYPOINT ["java","-jar","/usr/trial-eureka-app/trial-eureka-app-0.0.1-SNAPSHOT.jar"]