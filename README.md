# Notification System

## Overview

Java project that simulates sending notification

## Tech

- [Java 21](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Spring Boot](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Spring Schecule](https://spring.io/guides/gs/scheduling-tasks)
- [Docker Compose](https://docs.docker.com/compose/)
- [Sql Server](https://www.microsoft.com/pt-br/sql-server/sql-server-downloads)

## How to run

- Clone repo
```
git clone https://github.com/arthurlopesr/notification-system
```
- Run RabbitMQ and MongoDB:
```
docker-compose up -d
```
- Run the Spring Boot application
- Access application at `http://localhost:8080`.

## API Endpoints
The API provides the following endpoints:

**API Notification**
```markdown
POST /notification - Create a new notification schedule
GET /notification{notificationId} - Return notification schedule
DELETE /notification/{notificationId} - Delete a product
```
