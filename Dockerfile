FROM node:12-alpine as build-client
WORKDIR /app
COPY ./client/package.json ./
COPY ./client/package-lock.json ./
RUN npm install
COPY ./client/ ./
RUN npm run build

FROM maven:3.6.1-jdk-11-slim as build-server
WORKDIR /app/server
COPY ./server/pom.xml ./
COPY ./server/ ./
COPY --from=build-client /app/dist/ ./src/main/resources/public
RUN mvn install

FROM openjdk:11-jre-slim as release
WORKDIR /app
COPY --from=build-server /app/server/target/server-1.0-SNAPSHOT.jar ./thread.jar
RUN groupadd -r myapp && useradd -r -g myapp myapp
USER myapp
ENTRYPOINT exec java -jar /app/thread.jar