FROM openjdk:8
EXPOSE 8080

ENTRYPOINT ["java","-jar","/jenkins-docker.jar"]
