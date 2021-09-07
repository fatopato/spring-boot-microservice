# Spring Boot Microservice
Spring Boot Microservice sample by using Config server and Eureka Discovery

## Structure

There are 2 main microservices: itemManagement and profileManagement. Configuration of the services is completed by configserver. Eureka is running on discoveryserver.

## Default URLs
discoveryserver:    http://localhost:8081/

configserver:       http://localhost:8082/

profilemanagement:  http://localhost:8083/

itemmanagement:     http://localhost:8084/

## Run the app

You need to run discoveryserver first to initialize discovery Then configserver should start. After that itemmanagement and profilemanagement services can be up.

## Sample requests:

Create Employee Profile:
```shell
curl --location --request POST 'http://localhost:8083/api/v1/employeeProfile/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Test User",
    "address": "No place to go"
}'
```
Get Employee Profiles:
```shell
curl --location --request GET 'http://localhost:8083/api/v1/employeeProfile/' \
--data-raw ''
```



Create Item:
```shell
curl --location --request POST 'http://localhost:8084/api/v1/item/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Test Item",
    "description": "Awesome product"
}'
```
Get Items:
```shell
curl --location --request POST 'http://localhost:8084/api/v1/item/' \
--data-raw ''
```
