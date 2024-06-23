FROM openjdk:latest
WORKDIR /target/
COPY ./src/ .
ENTRYPOINT [ "java", "Main.java" ]