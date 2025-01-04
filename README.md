# wallclockshop
#### to package with maven 
#### ./mvnw package && java -jar target/wallclockshop-spring-boot-docker-0.1.0.jar
### 
#### to build dockerfile 
####  docker build -t springdocker/wallclockshop .
#### to run docker built image 
#### docker run -p 8080:8080 springdocker/wallclockshop
docker rm -vf $(docker ps -aq)