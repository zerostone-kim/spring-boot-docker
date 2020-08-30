FROM openjdk:8-jre-alpine
VOLUME /tmp
EXPOSE 80
ARG JAR_FILE=build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]