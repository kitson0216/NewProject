FROM java:8-jre
MAINTAINER kit <cdkit01@hotmail.com>
WORKDIR /app
ADD . /app
EXPOSE 8080

CMD ["java", "-jar", "/app/target/HelloWorld-0.0.1-SNAPSHOT.jar", "-p", "8080"]
