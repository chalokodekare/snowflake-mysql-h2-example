## spring-boot-microservice-with-snowflake-mysql-h2

To understand microservice structure, check https://github.com/chalokodekare/skeleton-service.

------------------------------------------------------------------------------------------------

### Tools/Version

```sh
Java Version : 17 
Gradle Version : 7.4.2
````

------------------------------------------------------------------------------------------------

### Setup

------------------------------------------------------------------------------------------------

### Starting up the service:

```sh
1. Do "gradle bootrun" or execute "run.bat" file.
   To bootrun with production profile:
       gradle bootrun --args='--spring.profiles.active=production'
2. If using Docker, Do
    2.1 Do "gradle bootjar or gradle build" to build jar file. 
    2.2 Execute run/local-build.sh to build docker image.
    2.3 Execute run/local-run.sh to run latest docker image.
3. To run in Intellij, Run/Debug main method in Application.java class.
```

------------------------------------------------------------------------------------------------

### Sample APIs to test.

```sh
Use postman collection inside tools/postman folder.
```

------------------------------------------------------------------------------------------------
