FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/trial-zuul-app/src
COPY pom.xml /usr/src/trial-zuul-app
RUN mvn -f /usr/src/trial-zuul-app/pom.xml clean package
FROM gcr.io/distroless/java
COPY --from=build /usr/src/trial-zuul-app/target/trial-zuul-app-0.0.1-SNAPSHOT.jar /usr/trial-zuul-app/trial-zuul-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/trial-zuul-app/trial-zuul-app-0.0.1-SNAPSHOT.jar"]