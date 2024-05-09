Spring Boot REST API with PostgreSQL

This repository contains a simple Spring Boot application that implements a REST API using PostgreSQL as the database. Prerequisites

Before running this application, ensure that you have the following installed:

Java Development Kit (JDK)
PostgreSQL database
Maven (for building and managing dependencies)
Setup

Clone the repository:

bash
git clone git@github.com:dev-vanshi/RestApi_SpringBoot.git

Configure the PostgreSQL database:

Create a new PostgreSQL database.

Update the application.properties file with your database credentials:

bash

spring.datasource.url=jdbc:postgresql://localhost:5432/your_data
spring.datasource.username=your_user
spring.datasource.password=12345
Run the application:

bash

mvn spring-boot:run

Test the API endpoints:
    Once the application is running, you can access the API endpoints using tools like cURL, Postman, or simply a web browser.
    Sample endpoints:
        GET /api/load - Get all users
        GET /api/load/{id} - Get user by ID
        POST /api/load - Create a new user
        PUT /api/load/{id} - Update user by ID
        DELETE /api/load/{id} - Delete user by ID
Technologies Used

Spring Boot
PostgreSQL
Maven
Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.Spring Boot REST API with PostgreSQL

This repository contains a simple Spring Boot application that implements a REST API using PostgreSQL as the database. Prerequisites

Before running this application, ensure that you have the following installed:

Java Development Kit (JDK)
PostgreSQL database
Maven (for building and managing dependencies)
Setup

Clone the repository:

bash
git clone git@github.com:dev-vanshi/loads.git

Configure the PostgreSQL database:

Create a new PostgreSQL database.

Update the application.properties file with your database credentials:

bash

spring.datasource.url=jdbc:postgresql://localhost:5432/your_data
spring.datasource.username=your_user
spring.datasource.password=12345
Run the application:

bash

mvn spring-boot:run

Test the API endpoints:
    Once the application is running, you can access the API endpoints using tools like cURL, Postman, or simply a web browser.
    Sample endpoints:
        GET /api/load - Get all users
        GET /api/load/{id} - Get user by ID
        POST /api/load - Create a new user
        PUT /api/load/{id} - Update user by ID
        DELETE /api/load/{id} - Delete user by ID
Technologies Used

Spring Boot
PostgreSQL
Maven
Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.
