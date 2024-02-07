FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.18_10

ADD target/chainsaw-store-service.jar chainsaw-store-service.jar
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "/chainsaw-store-service.jar"]