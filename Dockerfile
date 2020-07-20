FROM openjdk:8
VOLUME /tmp
ADD target/user-jenkin-docker.jar user-jenkin-docker.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "user-jenkin-docker.jar"]