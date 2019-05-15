FROM openjdk:11-jre-slim
ADD /build/libs/application.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]