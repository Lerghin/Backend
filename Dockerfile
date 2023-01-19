FROM amazoncorretto: 11-alpine-jdk555                        
MAINTAINER lerghin
COPY target/ler-0.0.1-SNAPSHOT  lerghin-app.jar                           
ENTRYPOINT ["java","-jar","/lerghin-app.jar"]                                
