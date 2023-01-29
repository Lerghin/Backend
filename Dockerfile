FROM amazoncorretto:17-alpine-jdk                        
MAINTAINER lerghin
COPY target/ler-0.0.1-SNAPSHOT.jar  lerghin-app.jar                           
ENTRYPOINT ["java","-jar","/lerghin-app.jar"]                                
