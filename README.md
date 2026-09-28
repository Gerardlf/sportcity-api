# SportCity API

API REST desarrollada con Spring Boot para gestionar pistas deportivas y reservas.

La API proporciona los servicios necesarios para que la aplicación móvil SportCity pueda consultar las pistas disponibles y gestionar las reservas de los usuarios.

## 🛠️ Tecnologías

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- REST API
- Render

## 🔌 Endpoints principales

### Pistas

`GET /api/pistas`  
Obtiene el listado de pistas deportivas disponibles.

### Reservas

`GET /api/reservas`  
Obtiene las reservas almacenadas.

`POST /api/reservas`  
Crea una nueva reserva.

## 🚀 Despliegue

La API está desplegada en Render y utiliza PostgreSQL como base de datos.

Forma parte del proyecto SportCity y es consumida por la aplicación móvil Android.
