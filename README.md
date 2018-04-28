# Spring-Boot-Docker
A very basic starter project for anyone to get started with Dockerizing Spring Boot Application



You can run this application standalone with or without docker and using docker.

But here, we are going to use Docker.

Setup Steps:

1- Install Docker on host machine

After this either you can directly pull Docker image from Docker Hub and follow below mentioned step to run the app  or you can create your own docker image(find the steps, mentioned later) and push it a docker hub and then do a pull on any other host machine and follow the below mentioned steps


2- run this command 

```sh
docker pull shubham108/spring_docker
```
where shubham108/spring_docker is the name of user-name/repo


3- check if image is pulled correctly
```sh
docker images
```

4- You can see something like
```sh
shubham108/spring_docker          latest                   b518619f35c6        2 hours ago         159MB
```

5-run this command
```sh
docker run -d -p 8282:8282 <image-id>
```

6- run this command
```sh
curl -XGET 'localhost:8282/hello'
```

Output will be "Hello"


For creating your own image from Dockerfile.

1- Goto Project's root directory
2- run this command

```sh
docker build -t shubham108/spring_docker:latest .
```
Docker picks up Dockerfile from the current directory to create an image

3-
```sh
docker push <user-name>/spring_docker:latest
```
