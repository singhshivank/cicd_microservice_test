FROM openjdk:17
EXPOSE 8080
RUN bash -c 'dir'
ADD /target/springboot-cicd-demo1.jar springboot-cicd-demo1.jar
ENTRYPOINT ["java","-jar","/springboot-cicd-demo1.jar"]