# 1. Usamos una imagen que ya tiene Java y Maven instalados para compilar
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# 2. Usamos una imagen más ligera solo para ejecutar el programa
FROM openjdk:17-jdk-slim
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]