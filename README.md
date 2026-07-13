# Java IO - UC2: File Operations

## Objective

Implement a Java program to demonstrate basic **File Operations** using the Java NIO (`java.nio.file`) package.

The application performs the following operations:

- Check whether a file or directory exists.
- Create a new directory.
- Create an empty file.
- Delete a file.
- Verify that the file has been deleted.
- List all files and directories.
- List files based on a specific extension (for example, `.txt`).

---

# Problem Statement

Before storing Employee Payroll data in a file, the application should know how to perform basic file operations such as creating files, checking whether they exist, deleting files, and listing available files.

This use case introduces the Java File API, which will be used in the upcoming Employee Payroll File I/O use cases.

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
│                       ├── EmployeePayrollSystem.java
│                       └── FileOperationsDemo.java
│
├── README.md
└── .gitignore
```

---

# Class

## FileOperationsDemo

### Responsibilities

- Check whether a file or directory exists.
- Create directories.
- Create empty files.
- Delete files.
- Verify file deletion.
- List all files and directories.
- Display files based on extension.

---

# Java NIO Classes Used

## Path

Represents the location of a file or directory.

Example:

```java
Path path = Paths.get("PayrollFiles");
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
- `createFile()`
- `delete()`
- `newDirectoryStream()`

---

## DirectoryStream

Used to iterate through files inside a directory.

Example:

```java
DirectoryStream<Path> stream =
        Files.newDirectoryStream(directory);
```

---

# Features Implemented

- Check whether a file exists.
- Create a new directory.
- Create an empty file.
- Delete a file.
- Verify file deletion.
- List all files and directories.
- Filter files using a file extension.

---

# Program Flow

1. Start the application.
2. Check whether the directory exists.
3. Create the directory if it does not exist.
4. Create an empty file.
5. Verify the file exists.
6. Display all files in the directory.
7. Display only `.txt` files.
8. Delete the file.
9. Verify the file no longer exists.
10. End the program.

---

# Sample Output

```text
Checking if path exists: false

Directory created:
C:\Users\Jyothish\PayrollFiles

Empty file created:
employee.txt

All Files

employee.txt

Files with .txt extension

employee.txt

File deleted successfully.

File exists after deletion: false
```

---

# Java Concepts Used

- Java NIO (`java.nio.file`)
- Path
- Paths
- Files
- DirectoryStream
- Exception Handling (`IOException`)
- Loops
- Conditional Statements

---

# Learning Outcome

After completing UC2, you will understand how to:

- Work with files and directories.
- Create and delete files.
- Check whether a file exists.
- List files inside a directory.
- Filter files using extensions.
- Use the Java NIO File API.

---

# Git Branch

```text
feature/UC2-FileOperations
```

---

# Commit Message

```text
feat(UC2): demonstrate basic file operations using Java NIO
```
