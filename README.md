# Docker Java Product Store

A small frontend-only Java Spring Boot application designed for Docker practice.

## Requirements

- Java 17+
- Maven 3.9+
- Docker

## Run locally

```bash
mvn spring-boot:run
```

Open:

http://localhost:8080

## Build the JAR

```bash
mvn clean package
```

## Build Docker image

```bash
docker build -t product-store:1.0 .
```

## Run Docker container

```bash
docker run --name product-store -p 8080:8080 product-store:1.0
```

Open:

http://localhost:8080

## Docker Compose

```bash
docker compose up --build
```

Stop:

```bash
docker compose down
```

## Suggested Docker exercises

1. Build the image manually.
2. Run it with a different host port, e.g. `9090:8080`.
3. Run two containers using different host ports.
4. Inspect the image with `docker image inspect`.
5. Inspect the container with `docker inspect`.
6. View logs with `docker logs`.
7. Stop/start/restart the container.
8. Change the application and rebuild the image.
9. Try removing the `EXPOSE` instruction and observe what changes.
10. Later, add environment variables and a health check.
