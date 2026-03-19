Smart Complaint & Issue Tracking System

## Project Overview
This is a backend application built using Spring Boot to manage and track complaints in a society such as maintenance, water, and electricity issues.

## Tech Stack
- Java 17
- Spring Boot
- Hibernate (JPA)
- MySQL
- Maven
- Postman
- JWT Authentication

## Features
- User Registration & Login (JWT authentication)
- Complaint Creation, Update, Delete
- Complaint Status Tracking (Pending → In Progress → Resolved)
- Role-based system (Admin/User)
- Exception Handling & Validation
- Secure APIs using JWT Token

## Authentication
- Login API generates JWT token
- Token required in all secured APIs

## API Endpoints

### Auth
- POST /auth/login

### Complaint
- POST /complaints
- GET /complaints
- PUT /complaints/{id}
- DELETE /complaints/{id}

## Setup Instructions

1. Clone the repository
2. Open in Eclipse/IntelliJ
3. Configure MySQL in application.properties
4. Run the application
5. Use Postman to test APIs

## Sample Login
```json
{
  "email": "prashant@gmail.com",
  "password": "1234"
}
