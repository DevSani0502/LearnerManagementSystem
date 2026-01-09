# Learner Management System (LMS)

## Overview
The **Learner Management System (LMS)** is a **Java Core–based application** designed to manage students, courses, and student enrollments. The system allows users to add students, create courses, and enroll students into courses with proper validation.

This project is built using **Object-Oriented Programming (OOP)** concepts and follows **SOLID principles** to ensure clean, maintainable, and scalable code. It also demonstrates the use of **Enums** for predefined constants and **Custom Exceptions** for handling business logic errors effectively.

---

## Features
- Add and manage students
- Add and manage courses
- Enroll students into courses
- Business rule validation using custom exceptions
- Use of enums for fixed values (e.g., course type, status)
- Clean design following SOLID principles

---

## Technologies Used
- Java (Core Java)
- Object-Oriented Programming (OOP)
- SOLID Principles
- Enums
- Custom Exceptions

---

## Why this structure is good

- DTOs separate data from logic
- Repository layer handles data storage
- Service + ServiceImpl follows Dependency Inversion (SOLID)
- Enums & Custom Exceptions improve type safety and validation
- Router + Main cleanly manage application flow

## Project Structure (Example)
- LearnerManagementSystem
- ├── .idea
- ├── src
- │   ├── enums
- │   │   └── EnrollmentStatus.java
- │   │
- │   ├── exceptions
- │   │   └── (Custom exception classes)
- │   │
- │   ├── LearnerManagement
- │   │   ├── LMSMain.java
- │   │   └── LMSRouter.java
- │   │
- │   ├── models
- │   │   ├── CourseDTO.java
- │   │   ├── EnrollmentDTO.java
- │   │   └── StudentDTO.java
- │   │
- │   ├── repository
- │   │   ├── CourseRepo.java
- │   │   ├── EnrollmentRepo.java
- │   │   └── StudentRepo.java
- │   │
- │   ├── service
- │   │   ├── CourseService.java
- │   │   ├── EnrollmentService.java
- │   │   └── StudentService.java
- │   │
- │   ├── serviceImpl
- │   │   ├── CourseServiceImpl.java
- │   │   ├── EnrollmentServiceImpl.java
- │   │   └── StudentServiceImpl.java
- │   │
- │   └── utility
- │       └── BasicMethods.java

## Learning Objectives

- Strengthen Core Java fundamentals
- Apply SOLID principles in a real-world project
- Understand enums and custom exception handling
- Improve clean code and layered architecture

## Future Enhancements

- Persist data using files or a database
- Search and filter functionality
- Role-based access (Admin / Student)
- Unit testing using JUnit