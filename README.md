# MeliChallenge

## Versiones
- Maven 4.0.0
- Docker 20.10.17
- Java 11

## Desarrollo
El proyecto Meli, es una API que consiste en almacenar y mostrar datos relacionados a una IP ingresada por sistema.
Cada vez que realicemos una consulta mediante una IP, proporsionada manualmente, nos mostrara informacion relacionada a la geolocalizacion de la IP ingresada, como por ejemplo:
- Pais
- Idioma
- Fecha actual
- Moneda
- Hora
- Distancia estimada
Todo estos datos, seran almacenados en una base de datos mysql, la misma trabajara con redis para mejorar el rendimiento.

La API fue desarrollada en Java 11, utilizando herramientas como:
- Spring Boot, tecnologia que nos permite crear aplicaciones autocontenidas
- Swagger, tegnologia que nos permite documentar la API
- Docker, tecnologia que nos permite desarrollar, implementar y ejecutar aplicaciones dentro de contenedores
- Maven, tecnologia para gestión y construcción de software
- Redis, tecnologia de almacenamiento dinamico mediante memoria cache

## Swagger Endpoints

http://localhost:8080/swagger-ui.html

-POST /IpGeolocations/create :  se registra la IP y se almacenan los valores obtenidos
-GET /getIpGeolocations : Consulta sobro los datos de la IP ingresada
-GET /getCountryInfo : Consulta informacion del pais con los datos obtenidos del /getIpGeolocations

## Conclusion
El proyecto no se logro de la manera mas eficiente y contiene errores de compilacion.
No se pudo levantar correctamente el contenedor Docker.
Se pensaron mejoras futuras como el manejo de la base de datos espejo en Redis y la division de contenedores en docker para mejorar el rendimiento en el consumo y evitar fluctuaciones agresivas dividiendo la cantidad de petisiones.
