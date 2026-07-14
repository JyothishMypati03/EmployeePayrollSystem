# Java IO - UC4: Write Employee Payroll to a File

## Objective

Implement a Java program to store **Employee Payroll** information in a file using the **Java NIO (New Input/Output) API**.

The application creates Employee Payroll objects, writes them to a text file, and verifies the write operation by counting the number of employee entries.

---

# Problem Statement

The Employee Payroll application currently stores employee information only in memory.

To make the data persistent, the application should write employee payroll details into a file using Java NIO.

This use case demonstrates how to:

- Create Employee Payroll objects.
- Store employee data in a collection.
- Write employee payroll data into a text file.
- Count the number of employee records written to the file.

---

# Project Structure

```text
EmployeePayrollSystem
│
├── src
│   └── main
│       └── java
│           └── com
│               └── bridgelabz
│                   └── employeepayroll
│                       ├── EmployeePayrollData.java
│                       ├── EmployeePayrollService.java
│                       └── EmployeePayrollSystem.java
│
├── PayrollFiles
│   └── employee-payroll.txt
│
├── README.md
└── pom.xml
```

---

# Classes

## EmployeePayrollData

### Responsibilities

- Store employee information.
- Provide a constructor.
- Convert employee details into a string using the `toString()` method.

### Fields

- Employee ID
- Employee Name
- Employee Salary

---

## EmployeePayrollService

### Responsibilities

- Store employee objects in a list.
- Add employees to the payroll.
- Create the payroll directory if it does not exist.
- Write employee payroll details into a text file.
- Count the number of employee records.

---

## EmployeePayrollSystem

### Responsibilities

- Start the application.
- Create employee payroll objects.
- Add employees to the payroll service.
- Write employee payroll data to the file.

---

# Java NIO Classes Used

## Path

Represents the location of a file or directory.

Example:

```java
Path file = Paths.get("PayrollFiles", "employee-payroll.txt");
```

---

## Paths

Creates `Path` objects.

Example:

```java
Paths.get("PayrollFiles");
```

---

## Files

Provides utility methods for file operations.

Methods used:

- `exists()`
- `createDirectories()`
- `write()`

---

# Collection Used

## ArrayList

```java
List<EmployeePayrollData>
```

Stores multiple employee payroll objects before writing them to the file.

---

# Features Implemented

- Create Employee Payroll objects.
- Store employee objects in a list.
- Create a directory if it does not exist.
- Write employee payroll data to a text file.
- Count the number of employee entries.
- Verify successful file creation.

---

# Program Flow

1. Start the application.
2. Create employee payroll objects.
3. Store employees in a list.
4. Create the payroll directory if it does not exist.
5. Create the payroll file.
6. Write employee payroll data into the file.
7. Count the number of employee records.
8. Display a success message.
9. End the program.

---

# Sample Output

```text
Employee Payroll Written Successfully.

Number of Employees : 3
```

---

# employee-payroll.txt

```text
101,Jyothish,50000.0
102,Rahul,45000.0
103,Kiran,60000.0
```

---

# Java Concepts Used

- Java NIO (`java.nio.file`)
- Path
- Paths
- Files
- List
- ArrayList
- Constructors
- Method Overriding (`toString()`)
- Exception Handling (`IOException`)

---

# Learning Outcome

After completing UC4, you will understand how to:

- Store Java objects in a collection.
- Write data to a file using Java NIO.
- Create directories programmatically.
- Persist application data.
- Verify file operations by counting employee entries.

---

# Git Branch

```text
feature/UC4-WriteEmployeePayrollToFile
```

---

# Commit Message

```text
feat(UC4): write employee payroll data to file using Java NIO
```
