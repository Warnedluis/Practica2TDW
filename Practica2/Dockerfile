# ===== ETAPA 1: Compilar el proyecto =====
FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

# Descargamos dependencias primero para aprovechar el caché
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiamos tu código y compilamos
COPY src ./src
RUN mvn clean package -DskipTests

# ===== ETAPA 2: Ejecutar el proyecto =====
FROM eclipse-temurin:25-jre-alpine

WORKDIR /app

# Copiamos el JAR generado
COPY --from=build /app/target/*.jar app.jar

# Exponemos el puerto
EXPOSE 8080

# Arrancamos la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]