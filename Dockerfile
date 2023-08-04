FROM openjdk:17
COPY target/dockertutorial.jar dockertutorial.jar
ENTRYPOINT ["java","-jar","/dockertutorial.jar"]