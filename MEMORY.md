# hexagonal-spring-boot-template

## Project Overview
Spring Boot 4.0.5 hexagonal architecture template. Base package: `com.cbcode.testinghexagonal`.
Java 26, Maven, PostgreSQL (runtime), H2 (test), Flyway, Spring Security + JWT (jjwt 0.13.0), Argon2 (bcprov), Jakarta Validation.

## Package Structure (src/main/java/.../hexagonalspringboottemplate/)
```
domain/
  model/              ← pure domain entities & value objects (no framework annotations)
  port/
    input/            ← use-case interfaces (driving ports), e.g. CreateUserUseCase
    output/           ← repository/gateway interfaces (driven ports), e.g. UserRepository
  service/            ← domain service implementations of input ports
  exception/
    DomainException   ← abstract base runtime exception
    EntityNotFoundException ← concrete domain exception

application/
  usecase/            ← application-level use-case orchestrators

infrastructure/
  adapter/
    input/
      web/            ← @RestController (driving adapters)
        dto/
          request/    ← inbound DTOs with @Valid annotations
          response/   ← outbound DTOs
        mapper/       ← web DTO ↔ domain mappers
    output/
      persistence/    ← JPA persistence adapters implementing output ports
        entity/       ← @Entity JPA classes (never exposed to domain)
        mapper/       ← entity ↔ domain mappers
        repository/   ← Spring Data JPA repositories (*JpaRepository)
  config/
    ApplicationConfig ← @EnableConfigurationProperties(JwtProperties), Argon2 PasswordEncoder
  security/
    SecurityConfig    ← stateless JWT security filter chain
    jwt/
      JwtProperties   ← @ConfigurationProperties(prefix="app.jwt") record
      JwtService      ← interface (generateToken, extractUsername, isTokenValid)
      JwtServiceImpl  ← JJWT 0.12-style implementation (Jwts.parser())
      JwtAuthenticationFilter ← OncePerRequestFilter populating SecurityContext

shared/
  response/ApiResponse ← generic record wrapper: success, message, data, timestamp
  exception/GlobalExceptionHandler ← @RestControllerAdvice mapping domain exceptions to HTTP
```

## Test Structure (src/test/java/.../hexagonalspringboottemplate/)
```
domain/service/             ← pure JUnit5 + Mockito, no Spring context
infrastructure/adapter/
  input/web/                ← @WebMvcTest slice tests
  output/persistence/       ← @DataJpaTest slice tests (H2)
integration/                ← @SpringBootTest full context (test profile)
```

## Key Config Files
- `application.yaml` — base config, active profile: dev, server port 8080, context `/api`, app.jwt.*
- `application-dev.yaml` — PostgreSQL via env vars (POSTGRES_HOST/PORT/DB/USER/PASSWORD)
- `application-prod.yaml` — PostgreSQL, Flyway enabled, show-sql false
- `application-test.yaml` — H2 in-memory, Flyway disabled, ddl-auto: create-drop
- `db/migration/` — Flyway SQL migrations (V1__create_users_and_others_entities.sql)

## JWT Config (application.yaml)
```yaml
app:
  jwt:
    secret: ${JWT_SECRET:change-me-in-production-min-32-chars!!}
    expiration-ms: ${JWT_EXPIRATION_MS:86400000}
```

## Naming Conventions
- Input ports: `<Action><Entity>UseCase`
- Output ports: `<Entity>Repository` or `<Entity>Gateway`
- Domain services: `<Entity>Service`
- Web adapters: `<Entity>Controller`
- Persistence adapters: `<Entity>PersistenceAdapter`
- JPA repos: `<Entity>JpaRepository`
- JPA entities: `<Entity>Entity`
- Mappers: `<Entity>WebMapper`, `<Entity>PersistenceMapper`
- Request DTOs: `<Action><Entity>Request`
- Response DTOs: `<Entity>Response`
