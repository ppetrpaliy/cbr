FROM adoptopenjdk/openjdk16:alpine-jre
RUN mkdir /opt/app
COPY target/cbr-1.0-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/cbr-1.0-SNAPSHOT.jar"]