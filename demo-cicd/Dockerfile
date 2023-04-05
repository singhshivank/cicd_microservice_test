FROM openjdk:17
# EXPOSE 8080
# ADD demo-cicd/target /test
# WORKDIR /test
# RUN bash -c 'dir'
ARG JAR_FILE
COPY ${JAR_FILE} demo-cicd/target/springboot-cicd-demo1.jar
ADD demo-cicd/target/springboot-cicd-demo1.jar springboot-cicd-demo1.jar
ENTRYPOINT ["java","-jar","/springboot-cicd-demo1.jar"]