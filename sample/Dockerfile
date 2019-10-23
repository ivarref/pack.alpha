FROM openjdk:11.0.2-slim

ADD target/lib/lib /app/lib
ADD target/classes /app/classes

WORKDIR /app

ENTRYPOINT ["java", "-cp", "classes:lib/*", "myapp.core"]