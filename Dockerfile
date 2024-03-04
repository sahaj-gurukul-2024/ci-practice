FROM eclipse-temurin:21.0.2_13-jre
COPY ci-practice-0.1-all.jar .
EXPOSE 8080
CMD java -jar ci-practice-0.1-all.jar
