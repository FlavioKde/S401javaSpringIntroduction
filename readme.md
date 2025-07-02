# 🧪 Spring Boot Maven Project – `S04T01N01`

Welcome to your first touchpoint with **Spring Boot**, the **HTTP protocol**, **Postman**, and **Maven** dependency management. This project is designed to be your gentle (but solid 💥) entry into building REST APIs with Java.

---

## 📦 Project Metadata

| Key            | Value                           |
|----------------|---------------------------------|
| **Group**      | `cat.itacademy.s04.t01.n01`     |
| **Artifact**   | `S04T01N01`                     |
| **Name**       | `S04T01N01`                     |
| **Package**    | `cat.itacademy.s04.t01.n01`     |
| **Packaging**  | `JAR`                           |
| **Java**       | `11+`                           |
| **Build Tool** | `Maven`                         |

---

## 🚀 Dependencies

This project includes the following Spring Boot modules:

- 🔁 **Spring Web** – for building RESTful APIs
- 💡 **Spring Boot DevTools** – for faster development via auto-restarts

---

## ⚙️ Setup Instructions

1. Go to [https://start.spring.io](https://start.spring.io)
2. Generate a **Maven** + **Java** Spring Boot project with the provided metadata and dependencies
3. Download and unzip the project
4. Import into **Eclipse** via:  
   `File > Import > Existing Maven Project`
5. Set port in `src/main/resources/application.properties`:

   ```properties
   server.port=9000
📡 REST Endpoints
✅ GET /HelloWorld
Uses @RequestParam

Optional nom parameter (defaults to UNKNOWN)

Example:

http://localhost:9000/HelloWorld

http://localhost:9000/HelloWorld?nom=Flavio

✅ GET /HelloWorld2/{nom}
Uses @PathVariable

Parameter is optional

Example:

http://localhost:9000/HelloWorld2

http://localhost:9000/HelloWorld2/Flavio

💬 Sample Response
text
Hola, Flavio. Estàs executant un projecte Maven
🛠️ Maven Commands
To get comfortable with Maven CLI, try running these inside your project root:

Command	Description
mvn compile	Compile the project
mvn package	Create the .jar file
mvn clean	Clean compiled files
mvn spring-boot:run	Run the Spring Boot app

## 📂 Project Structure

plaintext
src/
└── main/
    ├── java/
    │   └── cat/
    │       └── itacademy/
    │           └── s04/
    │               └── t01/
    │                   └── n01/
    │                       ├── S04T01N01Application.java
    │                       └── controller/
    │                           └── HelloWorldController.java
    └── resources/
        └── application.properties

## 🧠 Learning Outcomes

✅ Understand how to scaffold Spring Boot apps using Spring Initializr

✅ Define REST endpoints using @RequestParam and @PathVariable

✅ Use Maven to compile and run your project

✅ Test your API via Postman using query and path parameters

🔄 Feel free to enhance this README as your project evolves. This is just your launching pad!
