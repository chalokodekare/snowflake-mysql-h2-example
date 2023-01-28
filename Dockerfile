FROM openjdk:17-jdk-bullseye
LABEL maintainer="ChaloCodeKare"

# Create a user; it's not a ROOT user and its UID is 1100.
USER 1100

ARG app
ARG version

RUN echo $app
RUN echo $version

EXPOSE ${PORT}

RUN pwd

COPY /build/libs/${app}-${version}.jar /opt/${app}/service.jar

WORKDIR /opt/${app}

#--add-opens=java.base/java.nio=ALL-UNNAMED is to fix snowflake compatibility issue with java 17.
ENTRYPOINT ["java", "--add-opens=java.base/java.nio=ALL-UNNAMED", "-jar","service.jar"]