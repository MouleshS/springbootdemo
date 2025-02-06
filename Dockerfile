FROM openjdk:17-oracle
COPY build/libs/*.jar springapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springapp.jar"]