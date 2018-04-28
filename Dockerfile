FROM java:8-jdk-alpine
MAINTAINER shubham.21691@gmail.com
EXPOSE 8282
ADD build/libs/SpringDocker-1.0-SNAPSHOT.jar SpringDocker-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringDocker-1.0-SNAPSHOT.jar"]
