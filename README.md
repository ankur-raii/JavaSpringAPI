# 💳 JavaSpringAPI – Payment REST API Microservice

JavaSpringAPI is a simple and secure REST API microservice built using **Java Spring Boot** for handling basic payment records. It demonstrates backend architecture, CRUD operations, and RESTful design principles.

## 🚀 Features

- Create, Read, Update, and Delete payments
- Uses in-memory H2 database
- Built using Spring Boot, Spring JPA, and Lombok
- Follows layered architecture (Controller → Service → Repository)

## 🧰 Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Maven

---

## 🛠️ Installation

### 1. Clone the project

```bash
git clone https://github.com/YOUR_USERNAME/JavaSpringAPI.git
cd JavaSpringAPI
```

### 2. Run the project using Maven

Make sure you have Java and Maven installed.

```bash
mvn spring-boot:run
```

The server starts at:  
**http://localhost:8080**

---

## 📬 API Endpoints

| Method | Endpoint          | Description          |
|--------|-------------------|----------------------|
| POST   | `/payments`       | Create payment       |
| GET    | `/payments`       | Get all payments     |
| GET    | `/payments/{id}`  | Get payment by ID    |
| PUT    | `/payments/{id}`  | Update payment       |
| DELETE | `/payments/{id}`  | Delete payment       |

### ✅ Sample JSON for POST

```json
{
  "payerName": "Ankur",
  "amount": 1200.50,
  "paymentMethod": "UPI"
}
```

---

## 🖥️ Database Access

Visit:  
[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave blank)*

---

## 📂 Project Structure

```
JavaSpringAPI/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/javapay/javaspringapi/
│       │       ├── controller/
│       │       ├── model/
│       │       ├── repository/
│       │       └── service/
│       └── resources/
│           ├── application.properties
├── pom.xml
```

---

## 🙋‍♂️ Author

**Ankur Raj**  
🧑‍🎓 MCA Student, NIET Greater Noida  
🏆 Winner – Ideasurge 2024, Blockchain Credential System  
📧 Email: [ankur.rai.7247@google.com]

---

## 📄 License

This project is open-source and free to use under the [MIT License](LICENSE).
