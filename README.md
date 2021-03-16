# API FIRST Design

> Project responsible for externalize using API First approach

## Stack:
* Java 11
* Spring Boot
* Gradle
* Docker
* logback - melhor formatação dos logs

## How to build

### Java REST API
```bash
./gradlew 
```
### Docker
```bash
docker build -t <usuario>/api-first .
```
## How to run

### Docker

```bash
docker run -it -d -p 8080:8080 <usuario>/api-first
```

## Documentation

__This app was developed using [open specification](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md) principles. Use the swagger doc to navigate and test the main resources:__

```javascript
GET /swagger-ui.html
```
### Summary
#### Status App
__Request__:
```javascript
GET /status
```

## Next Steps

* CI support. [Travis](http://travis-ci.org/) and [CircleCI](https://circleci.com/)
* Integration testing using
* [Quarkus](https://quarkus.io/) support
* [UBI](https://developers.redhat.com/products/rhel/ubi) container
