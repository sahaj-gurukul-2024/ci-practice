FROM eclipse-temurin:21.0.2_13-jre
COPY team4-office-lunch-management-0.1-all.jar .
EXPOSE 8080
CMD java -jar team4-office-lunch-management-0.1-all.jar