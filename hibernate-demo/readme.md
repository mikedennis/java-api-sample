# JAVA APIS using Postgres backend #
Setup roughly based upon 
- https://stackabuse.com/implementing-hibernate-with-spring-boot-and-postgresql/
- https://www.developersoapbox.com/creating-a-rest-api-effortlessly-with-spring-rest-repositories/

To build/run:
- Start postgres container
    - ``` docker-compose up ```
- First time run create the database
    - ``` CREATE DATABASE hibernatedemo; ```
- Start JAVA API
    - Run HibernateDemoApplication.java

To build/run the app on docker:
- Start postgres container (need to split postgres docker up and app startup)
- Build Maven with only the postgres docker container running
    - ``` cd hibernate-demo && ./mvnw package ```
- Build docker image of app (make sure you are in hibernate-demo folder)
    - ``` docker build -t your-container-name . ```
- First time run create the database
    - ``` CREATE DATABASE hibernatedemo; ```
- Start container(s)
    - ``` docker-compose up ```

Test:
- API will be running at localhost:8080
  - Beers _RepositoryRestResource_ 
    - http://localhost:8080/beers
  - Phones _RestController_ 
    - http://localhost:8080/api/v1/phones 
- h2 db console at 
    - http://localhost:8080/h2-console
