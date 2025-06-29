## 🌱 Spring Boot REST API with Maven

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.3-green?logo=spring)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-11-blue?logo=openjdk)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-4.0.0-red?logo=apachemaven)](https://maven.apache.org/)

## 📄 Project Description
First contact with Spring Boot and Maven through a simple REST API that demonstrates:
- Basic controller implementation
- Request parameter handling
- Path variable usage
- Maven project structure

---

## 🛠️ Project Setup

### 🚀 Spring Initializr Configuration
| Setting            | Value                          |
|--------------------|--------------------------------|
| **Project**        | Maven                          |
| **Language**       | Java                           |
| **Spring Boot**    | 3.5.3 (latest stable)          |
| **Group**         | cat.itacademy.s04.t01.n01      |
| **Artifact**      | S04T01N01                      |
| **Java**          | 11                             |
| **Packaging**     | Jar                            |
| **Dependencies**  | Spring Web, Spring Boot DevTools |

---

## 📂 Project Structure
S04T01N01/
├── src/
│ ├── main/
│ │ ├── java/cat/itacademy/s04/t01/n01/
│ │ │ ├── controller/
│ │ │ │ └── HelloWorldController.java
│ │ │ └── S04T01N01Application.java
│ │ └── resources/
│ │ └── application.properties
└── pom.xml

text

---

## ⚙️ Configuration

### application.properties
```properties
server.port=9000
spring.application.name=S04T01N01
HelloWorldController.java
java
package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @GetMapping("/HelloWorld2/{nom}")
    public String saluda2(@PathVariable(required = false) String nom) {
        String name = (nom != null) ? nom : "UNKNOWN";
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }
}
🌐 API Endpoints
Endpoint	Method	Parameter Type	Example Usage	Response
/HelloWorld	GET	RequestParam	http://localhost:9000/HelloWorld?nom=John	"Hola, John. Estàs executant un projecte Maven"
/HelloWorld	GET	(default)	http://localhost:9000/HelloWorld	"Hola, UNKNOWN. Estàs executant un projecte Maven"
/HelloWorld2/{nom}	GET	PathVariable	http://localhost:9000/HelloWorld2/Anna	"Hola, Anna. Estàs executant un projecte Maven"
/HelloWorld2	GET	(optional)	http://localhost:9000/HelloWorld2	"Hola, UNKNOWN. Estàs executant un projecte Maven"
🚀 Getting Started
Prerequisites
Java 11+

Maven 3.6+

Installation
Generate project from start.spring.io with above configuration

Import to Eclipse:

text
File > Import > Existing Maven Project
Maven Commands
bash
# Compile project
mvn compile

# Build package
mvn package

# Clean target directory
mvn clean

# Run application
mvn spring-boot:run
Testing the API
After running the application, test these endpoints:

http://localhost:9000/Api/HelloWorld

http://localhost:9000/Api/HelloWorld?nom=Alice

http://localhost:9000/Api/HelloWorld2

http://localhost:9000/Api/HelloWorld2/Bob

## 🧠 Concepts Demonstrated
REST controller implementation

Request parameter handling (@RequestParam)

Path variable usage (@PathVariable)

Spring Boot auto-configuration

Maven project structure

## 📚 Learning Resources
Spring Boot Documentation

Maven Getting Started Guide

Spring Request Mapping

<div align="center"> <sub>Developed with ❤️ using Spring Boot and Maven</sub> </div> ```
Key features:

Clear visual hierarchy with badges and structured sections

Complete API documentation with example responses

Step-by-step setup instructions from Spring Initializr

Code snippets for key components

Maven command cheatsheet

Endpoint reference table

Learning resources section

Mobile-responsive Markdown formatting

The README maintains all the requested exercise details while presenting them in a professional, developer-friendly format that would appear excellent on GitHub or other platforms.

