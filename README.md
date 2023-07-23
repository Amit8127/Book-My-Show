# Book My Show APIs Spring Boot Project

This project is a Spring Boot implementation of the backend APIs for a ticket booking system similar to the popular platform "BookMyShow". It provides a set of RESTful APIs that enable client applications to interact with the ticket booking system and perform various operations.

## Features
* **User Registration:** Users can create an account, log in, and manage their profile information.
* **Movie Management:** Admin users can add, edit, and remove movie from the system.
* **Theater Management:** Admin users can add, allocate seats, edit, and remove Theaters from the system.
* **Ticket Booking:** Users can browse through the available movie, select the desired event, and book tickets for it.
* **Seat Selection:** Users can choose their preferred seats from the available options for a selected event.
* **Booking History:** Users can view their booking history and check the details of their past bookings.
* **Email Notifications:** Users receive email notifications for successful bookings and important updates.
## Technologies Used
* **Java 8+**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **MySQL (as the database)**
* **Maven (for dependency management)**
* **SMTP Server (for sending email notifications)**

## Project Working FlowChart

![BMSflowchart.jpg](src%2Fmain%2Fjava%2Fcom%2Fdriver%2FbookMyShow%2FImages%2FBMSflowchart.jpg)

## Swagger-ui Screen Shot

![Book-my-show API's.png](src%2Fmain%2Fjava%2Fcom%2Fdriver%2FbookMyShow%2FImages%2FBook-my-show%20API%27s.png)
## Getting Started
To set up the project on your local machine, follow these steps:

1. Clone the repository: `git clone https://github.com/Amit8127/Book-My-Show.git`
2. Navigate to the project directory: `cd book-my-show`
3. Configure the database settings in `application.properties` file.
4. Build the project using Maven: `mvn clean install`
5. Run the application: `mvn spring-boot:run`
6. The application will be accessible at `http://localhost:8080`.

## Database Setup
This project uses MySQL as the database. Follow these steps to set up the database:
1. Install MySQL on your local machine.
2. Create a new database named bookmyshow.
3. Update the database configuration in `application.properties` file.
## API Documentation
The API documentation for this project can be found at `http://localhost:8080/swagger-ui.html`. It provides detailed information about each API, including request/response formats and parameters.
<!-- ## Authentication
Some APIs require authentication to access. To authenticate, send a request with the user's credentials (username and password) to the `/login` API. Upon successful authentication, you will receive an access token in the response. Include this token in the Authorization header of subsequent requests as a Bearer token. -->
## Acknowledgments
* **Spring Boot**
* **MySQL**
## Contributing
Contributions to the project are welcome. If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.