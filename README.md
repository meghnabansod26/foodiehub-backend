# 🍔 FoodieHub – Full Stack Food Delivery Application (Backend)

## 🚀 Project Overview

FoodieHub is a production-ready full-stack food delivery backend built using Spring Boot and MongoDB.  
The application provides secure REST APIs for user authentication, food management, cart operations, order processing, online payment integration, and image storage.

It supports role-based access for **Users** and **Admins** with secure JWT-based authentication and authorization.


## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Security
- MongoDB (NoSQL Database)
- JWT Authentication
- Razorpay Payment Gateway Integration
- AWS S3 (Image Storage)
- Maven


## 🔐 Security Features

- JWT-based Authentication
- Role-based Authorization (USER / ADMIN)
- Encrypted Password Storage using BCrypt
- Secure REST API endpoints


## 📦 Core Features

### 👤 User Functionalities
- User Registration & Login
- Browse Food Items
- Add to Cart
- Place Orders
- Secure Online Payment via Razorpay
- View Order History

### 🛠️ Admin Functionalities
- Add / Update / Delete Food Items
- Upload Images to AWS S3
- Manage Orders
- Manage Users


## 💳 Payment Integration

Integrated Razorpay payment gateway to enable secure online transactions (Test Mode supported).


## ☁️ Image Storage

All food item images are securely stored using AWS S3 bucket storage.


## 🗄️ Database

MongoDB is used as a NoSQL database to manage:
- Users
- Products
- Orders
- Cart Data


## 🏗️ Application Architecture

Client (React User/Admin)  
        ↓  
Spring Boot REST APIs  
        ↓  
MongoDB Database  
        ↓  
AWS S3 (Image Storage)  
        ↓  
Razorpay (Payment Gateway)


## ▶️ Run Locally

1. Clone the repository  
2. Configure MongoDB connection in `application.properties`  
3. Add Razorpay and AWS credentials  
4. Run the application:

