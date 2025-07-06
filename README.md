Spring Boot User CRUD API
This project is a simple Spring Boot REST API for managing users (Create, Read, Update, Delete) with MySQL database and Swagger UI for API documentation.

📜 Features

✅ Create User

✅ Get All Users

✅ Get User by ID

✅ Update User

✅ Delete User

✅ Error handling with custom exceptions

✅ API documentation with Swagger UI

🛠️ Tech Stack
Java 21 (or your Java version)
Spring Boot 
Spring Data JPA
MySQL
Swagger (Springfox/OpenAPI)

⚙️ Setup Instructions:

1️⃣ Clone the Repository
git clone https://github.com/yourusername/spring-boot-user-crud.git
cd spring-boot-user-crud

2️⃣ Database Setup
Create a MySQL database (e.g., spring_boot_demo).

Update your application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/spring_boot_demo
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

3️⃣ Build and Run
Using Maven:
./mvnw spring-boot:run
Or using your IDE (VS Code/IntelliJ/Eclipse), run SpringBootDemoApplication.java.

📄 API Documentation
Once the application is running:

🌐 Visit:
http://localhost:8080/swagger-ui/index.html
You will see all API endpoints with request/response examples and can test them directly.

🖥️ API Endpoints
Method	Endpoint	Description
POST	/api/users	Create user
GET	/api/users	Get all users
GET	/api/users/{id}	Get user by ID
PUT	/api/users/{id}	Update user
DELETE	/api/users/{id}	Delete user

📂 Project Structure
src/main/java/com/example/spring_boot_demo/
    controllers/          // REST Controllers
    entity/               // JPA Entities
    exceptions/           // Custom Exceptions
    repository/           // Spring Data JPA Repositories
    SpringBootDemoApplication.java // Main class

src/main/resources/
    application.properties
