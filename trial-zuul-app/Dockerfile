FROM openjdk:8-jdk-alpine
MAINTAINER Sourav Sen <ssen@yodlee.com>

FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY --from=0 D:\Java\workspace\microserviceProjects\trial-zuul-app /app
RUN mvn install

VOLUME /tmp
EXPOSE 8010
ARG JAR_FILE=target/rest-service-1.0.0.jar
ADD ${JAR_FILE} rest-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/rest-service-1.0.0.jar"]