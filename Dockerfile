# ---------- Build ----------
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B -DskipTests package

# ---------- Runtime ----------
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
# Render inyecta $PORT; Spring debe usarlo
ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-Dserver.port=${PORT}","-jar","/app.jar"]
