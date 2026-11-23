# bodegas-backend

Backend en Spring Boot para el sistema de bodegas y productos.

## Requisitos

- Java 21

## Ejecución

Desde la carpeta del proyecto:

```
.\mvnw.cmd spring-boot:run
```

En Linux o Mac:

```
./mvnw spring-boot:run
```

La API corre en http://localhost:8080

- `GET /bodegas`
- `POST /bodegas`

Se usa H2 en memoria, así que no hay que configurar base de datos. Los datos de prueba se cargan al iniciar.
