FROM openjdk:17
COPY target/dockertutorial.jar dockertutorial.jar
ENV MYSQL_HOST=sibamysql
ENTRYPOINT ["java","-jar","/dockertutorial.jar"]