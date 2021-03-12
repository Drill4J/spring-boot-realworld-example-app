FROM java:jre

EXPOSE 8080

COPY /build/libs/spring-boot-realworld-example-app-0.0.1-SNAPSHOT.jar /spring-boot-realworld-example-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar spring-boot-realworld-example-app-0.0.1-SNAPSHOT.jar
