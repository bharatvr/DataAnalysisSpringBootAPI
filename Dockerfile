FROM openjdk:8-jdk-alpine

RUN apk update && apk add bash

RUN  apk add curl
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","bsingh.data.analysis.DataAnalysisSpringBootApiApplication"]