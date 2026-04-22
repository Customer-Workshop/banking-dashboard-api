# Banking Dashboard API

A Spring Boot REST API that connects to an existing PostgreSQL database and exposes banking analytics via REST endpoints.

## Features

- Connects to a live PostgreSQL database with 9 tables and 7 materialized views
- Exposes 6 dashboard endpoints for analytics data from materialized views
- Provides DDL introspection endpoint via `information_schema`
- Supports filtering (tier-based, minimum deposits)
- Refresh materialized views on demand
- Swagger/OpenAPI documentation
- Dockerized for easy deployment

## Prerequisites

- Java 17+
- Maven 3.6+
- PostgreSQL database (existing)

## Quick Start

```bash
# Build
mvn clean package

# Run
java -jar target/dashboard-api-0.0.1-SNAPSHOT.jar

# Or with custom DB config
java -jar target/dashboard-api-0.0.1-SNAPSHOT.jar \
  --spring.datasource.url=jdbc:postgresql://host:5432/banking \
  --spring.datasource.username=user \
  --spring.datasource.password=pass
```

## Docker

```bash
docker build -t banking-dashboard-api .
docker run -p 8080:8080 \
  -e SPRING_DATASOURCE_URL=jdbc:postgresql://host:5432/banking \
  -e SPRING_DATASOURCE_USERNAME=user \
  -e SPRING_DATASOURCE_PASSWORD=pass \
  banking-dashboard-api
```

## API Endpoints

### Dashboard

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/dashboard/customer-portfolio` | Customer portfolio data (filter: `?tier=GOLD`) |
| GET | `/api/dashboard/branch-performance` | Branch performance metrics (filter: `?min_deposits=100000`) |
| GET | `/api/dashboard/monthly-transactions` | Monthly transaction volume |
| GET | `/api/dashboard/loan-risk` | Loan risk summary |
| GET | `/api/dashboard/credit-card-utilization` | Credit card utilization |
| GET | `/api/dashboard/top-customers` | Top customers by AUM (filter: `?tier=PLATINUM`) |
| POST | `/api/dashboard/refresh-views` | Refresh all materialized views |

### Schema

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/schema/tables` | All tables and columns in the banking schema |

### Documentation

| URL | Description |
|-----|-------------|
| `/swagger-ui.html` | Swagger UI |
| `/v3/api-docs` | OpenAPI JSON spec |

## Running Tests

```bash
mvn test
```

## Architecture

```
controller -> service -> repository -> database
```

- **Controller**: REST endpoints with Swagger annotations
- **Service**: Business logic, filtering, view refresh
- **Repository**: Spring Data JPA repositories
- **Entity**: JPA entities mapped to materialized views
- **DTO**: API response wrapper and schema introspection DTOs
