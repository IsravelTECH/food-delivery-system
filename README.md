# food-delivery-system
# 🍔 Foodie Delivery System

This is a full-stack Foodie Delivery System that supports user authentication (signup/login), order management, payments, and contact forms. The backend can be implemented with either Spring Boot or Express.js, and the frontend is built with plain HTML, CSS, and JavaScript.

---

## 📁 Project Structure

### Backend (Node.js + Express.js)
project-root/
├── index.js # Express backend entry point
├── public/ # Frontend files served by Express
│ ├── signup.html
│ ├── login.html
│ ├── home.html
│ └── script.js
├── package.json

shell
Copy
Edit

### Backend (Java + Spring Boot)
src/
├── main/
│ ├── java/
│ │ └── com/yourapp/...
│ ├── resources/
│ │ ├── application.properties
│ │ └── static/
│ │ ├── signup.html
│ │ ├── login.html
│ │ ├── home.html
│ │ └── script.js

yaml
Copy
Edit

---

## 🧪 Prerequisites

- Node.js (for Express version)
- IntelliJ IDEA (for Spring Boot version)
- MySQL Server
- VS Code (for editing frontend or backend)

---

## 🚀 Running Backend (Express.js)

1. Install dependencies:

```bash
npm install
Start MySQL server and ensure a foodie_db database is created.

Run the backend:

bash
Copy
Edit
node index.js
Server will run at http://localhost:8080

🧬 MySQL Setup
sql
Copy
Edit
CREATE DATABASE foodie_db;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  email VARCHAR(255) UNIQUE,
  password VARCHAR(255)
);
🔐 API Endpoints (Express)
Method	Route	Description
POST	/api/users/signup	User signup
POST	/api/users/login	User login
GET	/api/users	Get all users
DELETE	/api/users/:id	Delete user by ID

🧾 Running Spring Boot App
Open in IntelliJ IDEA

Add static files to: src/main/resources/static

Set database config in application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/foodie_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Run the app:

bash
Copy
Edit
./mvnw spring-boot:run
OR run the main() method in IntelliJ.

🌐 Running Frontend (Both Versions)
Option A: With Express.js
Visit: http://localhost:8080/signup.html

Option B: With Spring Boot
Visit: http://localhost:8080/signup.html

Option C: With VS Code (Live Server)
Right-click on signup.html → Open with Live Server

🔒 JWT Integration
Once JWT is implemented:

On login, backend returns a token

Frontend stores it in localStorage

Send token in headers for protected routes:

js
Copy
Edit
fetch("/api/protected", {
  headers: {
    Authorization: `Bearer ${token}`
  }
})
📜 script.js (Frontend Logic)
Handles form submission for signup/login, fetches user data, and stores JWT.

Make sure to include it in all your HTML files:

html
Copy
Edit
<script src="script.js"></script>
🧼 Cleaning & Building
To clean and build Spring Boot:

bash
Copy
Edit
./mvnw clean install
📬 Contact
For issues or improvements, feel free to open an issue or submit a PR.

📄 License
MIT License

yaml
Copy
Edit

---

Would you like me to package this `README.md` and add it to your project ZIP? I can also include the final working HTML/JS files if needed.







