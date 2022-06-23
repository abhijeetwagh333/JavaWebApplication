FROM openjdk:17-oracle
EXPOSE 8080
ADD target/JavaWebApplication-0.0.1-SNAPSHOT.jar JavaWebApplication-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/JavaWebApplication-0.0.1-SNAPSHOT.jar"]