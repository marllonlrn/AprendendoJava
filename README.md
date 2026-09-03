# Learning Java

This repository documents my practical progress with Java, from language fundamentals to building applications and REST APIs.

## About me

I am **Marllon Lorran**, an aspiring developer. I use this space to record exercises, notes, and small projects created during my studies, with a focus on writing clean code, understanding the fundamentals, and improving consistently.

My current goal is to use Java to develop **REST APIs**.

## Learning goals

- Strengthen my programming logic and knowledge of Java syntax;
- Master object-oriented programming;
- Work with collections, exceptions, files, and tests;
- Learn data persistence with SQL and JPA;
- Create REST APIs with Spring Boot;
- Develop well-organized, portfolio-ready projects.

## Current content

### Lesson 1 — First program

Introduces the basic structure of a Java application, the `main` method, `String` variables, and displaying messages in the console.

### Lesson 2 — Variables and conditional statements

Calculates the average of two grades and uses `if` and `else` to report whether the student passed or failed.

### Lesson 3 — User input

Uses the `Scanner` class to read two grades from the terminal, calculate their average, and display the result. On systems configured for English, decimal grades should be entered with a period, such as `7.5`.

### Lesson 4 — For loops

Demonstrates ascending and descending counts, custom increments, accumulation, array iteration, enhanced for loops, `continue`, `break`, and nested loops.

### Lesson 5 — Introduction to object-oriented programming

Demonstrates introductory OOP concepts with the `Person` class: objects, private fields, constructors, methods, and state changes.

## Project structure

```text
src/
├── Lesson1.java
├── Lesson2.java
├── Lesson3.java
├── Lesson4.java
└── Lesson5.java
```

## How to run

Prerequisite: install the [JDK](https://www.oracle.com/java/technologies/downloads/) and ensure it is available in your terminal.

From the project root, compile all lessons:

```powershell
javac -encoding UTF-8 -d out src/*.java
```

Then run the lesson you want. For example:

```powershell
java -cp out Lesson3
```

## Progress

- [x] Basic structure of a Java program
- [x] The `main` method and console output
- [x] Variables and string concatenation
- [x] Data types and operators
- [x] Conditional statements
- [x] User input with `Scanner`
- [x] Introduction to methods and object-oriented programming
- [x] Loop structures
- [ ] Collections, exceptions, and tests
- [ ] REST APIs with Spring Boot

## Technologies

- Java
- JDK

---

This repository will be updated as I progress in my studies.
