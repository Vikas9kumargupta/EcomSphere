# 🌟 Spring Boot E-Commerce Application

## 🚀 Overview
This project is a fully functional **E-Commerce platform** built with **Spring Boot**. It offers a seamless shopping experience with **user authentication, product management, order processing, and secure payment integration**. Designed with **RESTful API principles**, it supports **role-based access control** for better security and management.

---

## ✨ Features
- ✅ **User Authentication & JWT-based Authorization** 🔐  
- ✅ **Role-Based Access Control** (Admin, Customer, User) 🛂  
- ✅ **Product Catalog Management** 🛍️  
- ✅ **Shopping Cart & Order Processing** 🛒  
- ✅ **Secure Payment Gateway Integration** 💳  
- ✅ **RESTful API Design** 🌐  
- ✅ **Spring Security Implementation** 🛡️  
- ✅ **User Address Management & Order Shipment** 🚚  

---

## 🛠 Technologies Used
- 🚀 **Spring Boot**  
- 🔐 **Spring Security**  
- 🔑 **JWT (JSON Web Token)**  
- 🗃️ **Spring Data JPA**  
- 🐬 **MySQL** *(or H2 for an in-memory database)*  
- ⚡ **Lombok**  
- 📦 **Maven**  

---

## ⚙️ Installation and Setup

### 📌 Prerequisites
Ensure you have the following installed before setting up the project:
- **Java 17+** ☕
- **Maven** 🏗️
- **MySQL** *(optional, if not using H2)* 🗄️

### 📥 Steps to Run the Application
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/spring-boot-ecommerce.git
   cd spring-boot-ecommerce
   ```
2. **Configure the database in `application.properties`** (for MySQL):
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. **Build and run the application:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

---

## 📁 API Endpoints

### 🔐 Authentication
- **POST** `/api/auth/signup` - Register a new user 📝
- **POST** `/api/auth/signin` - Authenticate and receive a JWT token 🔑

### 🛍️ Product Management
- **GET** `/api/products` - View all products 📜
- **POST** `/api/products` - Add a new product (**Admin Only**) ➕
- **PUT** `/api/products/{id}` - Update a product (**Admin Only**) ✏️
- **DELETE** `/api/products/{id}` - Delete a product (**Admin Only**) ❌

### 🛒 Shopping Cart & Orders
- **POST** `/api/cart/add` - Add an item to the cart 🛒
- **GET** `/api/cart` - View items in the cart 🛍️
- **POST** `/api/orders/checkout` - Checkout and place an order 📦
- **GET** `/api/orders/{id}` - View order details 📝

### 📍 Managing User Address & Order Shipment
- **POST** `/api/address` - Add or update user address 🏠
- **GET** `/api/address` - Retrieve user address 📍
- **POST** `/api/orders/{id}/ship` - Ship an order (**Admin Only**) 🚚

---

## 🔥 Usage
1. **Register a new user** using `/api/auth/signup` 📋
2. **Log in** using `/api/auth/signin` to get a JWT token 🔑
3. **Use the token** to access secure endpoints by including it in the `Authorization` header:
   ```sh
   Bearer <your_jwt_token>
   ```
4. **Admins** can manage products and orders, while **customers** can browse, add to cart, and place orders.

---

## 🔒 Security Implementation
- 🔹 **JWT Filter** for token validation 🔐  
- 🔹 **UserDetailsService** for authentication 👤  
- 🔹 **Password Encryption** using BCrypt 🔑  
- 🔹 **Role-Based Access Control** 🛂  

---

## 🤝 Contributing
We welcome contributions! 🎉 Feel free to **fork** this repository and submit **pull requests**. Let’s build something amazing together! 🚀

---

## 📜 License
This project is licensed under the **MIT License** 📝.

---

## 👨‍💻 Author
Developed with ❤️ by **Vikas Kumar Gupta** 🚀

---

## 📞 Contact
For any queries or contributions, please reach out:
- 📧 Email: vikasgup074@gmail.com  
- 🔗 LinkedIn: [Vikas Kumar Gupta](https://www.linkedin.com/in/work-with-vikas/)  
- 💻 GitHub: [Vikas9kumargupta](https://github.com/Vikas9kumargupta)  
