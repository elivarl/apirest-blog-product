# API REST de Gestión de Productos

Este proyecto es una API REST desarrollada con Spring Boot para la gestión de información de productos.

## Tecnologías Utilizadas

- Java 21
- Spring Boot 3.5.6
- Spring Data JPA
- MySQL
- Maven

## Requisitos Previos

- JDK 21
- Maven
- MySQL

## Configuración

1. Clone el repositorio
2. Configure la base de datos MySQL en `src/main/resources/application.properties`
3. Ejecute el proyecto usando Maven:

```bash
mvn spring-boot:run
```

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── icodeap/
│   │           └── product/
│   │               ├── controller/
│   │               ├── entity/
│   │               └── repository/
│   └── resources/
│       └── application.properties
```

## Características

- CRUD completo para la gestión de productos
- Persistencia de datos con MySQL
- Arquitectura REST

## API Endpoints

La API proporciona los siguientes endpoints:

- `GET /api/products`: Obtener todos los productos
- `GET /api/products/{id}`: Obtener un producto por ID
- `POST /api/products`: Crear un nuevo producto
- `PUT /api/products/{id}`: Actualizar un producto existente
- `DELETE /api/products/{id}`: Eliminar un producto

## Licencia

Este proyecto está bajo la Licencia MIT.

## Desarrollado por

Desarrollado por Elivar Largo - [icodeap](https://icodeap.com)
