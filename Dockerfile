FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
        ADD EcodationJavaFullStack4-0.0.1-SNAPSHOT.jar app.jar
        ENTRYPOINT ["java","-jar","app.jar"]