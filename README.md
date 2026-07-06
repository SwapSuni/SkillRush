# 💼 SkillRush - Full Stack Job Portal

SkillRush is a full-stack job portal application built using **Spring Boot**, **Spring Security**, **Spring Data JPA (Hibernate)**, **Thymeleaf**, and **MySQL**. It provides a secure platform where recruiters can post and manage job opportunities, while job seekers can search, save, and apply for jobs through personalized dashboards.

The application follows the **MVC architecture** and implements **role-based authentication and authorization**, providing separate experiences for Recruiters and Job Seekers.

---

Note: Uploaded profile photos and resumes are stored on the server's local filesystem. In a production environment, these should be stored in cloud object storage (e.g., Cloudinary or Amazon S3) to ensure persistence across deployments.

## 🚀 Features

### 👨‍💼 Job Seeker

- Secure Registration & Login
- Personalized Job Seeker Dashboard
- Create and Update Profile
- Upload Profile Picture
- Upload Resume
- Search jobs with multiple filters:
  - Job Title
  - Location
  - Employment Type
  - Remote / Office
  - Date Posted
- View detailed job information
- Apply for jobs
- Save jobs for later
- Track applied and saved jobs
- Prevent duplicate applications

---

### 🏢 Recruiter

- Secure Recruiter Authentication
- Personalized Recruiter Dashboard
- Create and Manage Company Profile
- Post New Jobs
- Edit Existing Jobs
- Delete Job Posts
- View all posted jobs
- View all candidates who applied for a job
- Open candidate profiles directly
- Download candidate resumes

---

## 🔐 Authentication & Authorization

- Spring Security
- Role-Based Access Control
- Separate dashboards for:
  - Recruiters
  - Job Seekers
- Protected URLs
- Session-based Authentication

---

## 🛠 Tech Stack

### Backend

- Java
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Hibernate

### Frontend

- Thymeleaf
- HTML5
- CSS3
- Bootstrap
- JavaScript

### Database

- MySQL

### Build Tool

- Maven

### IDE

- IntelliJ IDEA

### Version Control

- Git
- GitHub

---

## 📂 Project Structure

```
SkillRush
│
├── config
├── controller
├── entity
├── repository
├── services
├── templates
├── static
│   ├── css
│   ├── js
│   └── images
├── application.properties
└── pom.xml
```

---

## 📸 Screenshots

> Adding screenshots after deployment

- Login Page
- Registration
- Job Seeker Dashboard
- Recruiter Dashboard
- Job Details
- Post Job
- Edit Profile
- Candidate List
- Saved Jobs

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/<your-username>/SkillRush.git
```

### Move into project

```bash
cd SkillRush
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/SkillRush.jar
```

Open

```
http://localhost:8080
```

---

## 📖 Database

The application uses **MySQL** as its relational database.

Major entities include:

- Users
- UsersType
- RecruiterProfile
- JobSeekerProfile
- JobCompany
- JobLocation
- JobPostActivity
- JobSeekerApply
- JobSeekerSave

Relationships are implemented using **JPA/Hibernate** annotations.

---

## 🏗 Architecture

The project follows a layered architecture:

```
Controller
      ↓
Service
      ↓
Repository
      ↓
MySQL Database
```

This separation improves maintainability, scalability, and testability.

---

## ✨ Key Highlights

- Full-stack Java application
- Spring Boot MVC Architecture
- Role-based authentication
- Personalized dashboards
- Resume upload and download
- Candidate profile management
- Job search with filters
- Save jobs functionality
- One-click job applications
- Recruiter candidate management
- Responsive UI using Bootstrap
- Clean layered architecture

---

## 👨‍💻 Author

**Swapnil S. Sinha**

- Java Backend Developer
- Spring Boot Developer
- Full Stack Java Enthusiast

---

## ⭐ If you like this project

Please consider giving it a **Star ⭐** on GitHub.
