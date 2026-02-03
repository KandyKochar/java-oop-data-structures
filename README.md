# Java OOP Data Structures — Person Hierarchy

A Java project implementing an object-oriented person hierarchy with Professor, Student, and Teaching Assistant roles using abstract classes and inheritance.

## Overview
Models academic roles with participation hour calculations using a Person abstract class. Each role (Professor, Student, TA) overrides participation logic based on their responsibilities.

## Features
- Abstract Person base class
- Professor with partial participation hours
- Student with full course participation
- TA with lab-only participation hours
- Demonstrates polymorphism and method overriding

## Technologies Used
- **Language:** Java (JDK 8+)
- **IDE:** Eclipse

## Project Structure
```
src/
+-- Person.java       # Abstract base class for all academic roles
+-- Professor.java    # Professor with partial participation logic
+-- Student.java      # Student with full course hour participation
+-- TA.java           # Teaching Assistant with lab-only participation
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ DataStructure.Person
```

## Author
Kandy Kochar
