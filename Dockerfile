FROM openjdk:17
EXPOSE 3030
ADD target/shelfish.jar shelfish.jar
ENTRYPOINT ["java","-jar","/shelfish.jar"]