# Project Overview

This project was based on my interest of learning more about REST APIs and how they worked. I spent some time researching and learning more about REST APIs and then created a few using the Spring Boot framework and Java. The first one was created following a tutorial online and then I created a couple more. I created one that hosted the data locally on the server so it would lose it once the server was shutdown. Then I create one that would connect to a MySql Database and expose the data through an API endpoint.

I learned a lot about the architecture and purpose of using REST APIs. It also was extremely helpful to use the Spring Boot framework because everything was easily configured and worked without too much hassle. 

[Software Demo Video](https://youtu.be/js1ly6iFFV4)

# Development Environment

* Java 11
* Spring Boot
* Intellij 2022.2.2 
* MySql Database

# Useful Websites

* [Tutorial on Creating REST API using Spring Boot](https://www.geeksforgeeks.org/how-to-create-a-rest-api-using-java-spring-boot/)
    * Simple overview of the code required to create a REST API using Spring Boot and hosting the data on the Tomcat Server
    * Use the "Spring Initializr" within Intellij when creating the project and then add the code found here
* [Tutorial on using MySql Database](https://www.youtube.com/watch?v=KbXeVexjy7A)
    * Great overview of how to configure the MySql database and setup the controllers to handle the data



# Future Work

* Connect to a cloud database
* Add more functionality/calls to the api
* Work through hosting multiple REST controllers on one server

# Helpful Notes

* The Mysql database configuration has to been done in the application.properties file which is found at src/main/resources. It contains the database password so that is not committed. URL to the database, username, and password. All of the information about this can be found in the youtube video linked above.