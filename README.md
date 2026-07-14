# Java IO - UC3: Watch Service

## Objective

Implement a Java program to monitor a directory for file system changes using the Java NIO `WatchService` API.

The application continuously watches a specified directory and detects the following events:

- File Creation
- File Modification
- File Deletion

---

# Problem Statement

In many real-world applications, it is important to monitor changes in a directory.

Instead of repeatedly checking the folder manually, Java provides the **WatchService** API to automatically detect file system events.

This use case demonstrates how to watch a directory and receive notifications whenever files are created, modified, or deleted.

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
│                       └── WatchServiceDemo.java
│
├── README.md
└── .gitignore
```

---

# Class

## WatchServiceDemo

### Responsibilities

- Create a directory if it does not exist.
- Create a WatchService object.
- Register a directory for monitoring.
- Detect file creation events.
- Detect file modification events.
- Detect file deletion events.
- Continuously monitor the directory for changes.

---

# Java NIO Classes Used

## Path

Represents the location of the directory to monitor.

Example:

```java
Path folder = Paths.get("PayrollFiles");
```

---

## FileSystems

Creates the default file system.

Example:

```java
WatchService watchService =
        FileSystems.getDefault().newWatchService();
```

---

## WatchService

Monitors the registered directory for changes.

---

## WatchKey

Represents a registration with the WatchService.

It is used to retrieve file system events.

---

## WatchEvent

Represents an individual file system event.

Supported events:

- ENTRY_CREATE
- ENTRY_MODIFY
- ENTRY_DELETE

---

# Features Implemented

- Create directory if it does not exist.
- Monitor a directory continuously.
- Detect file creation.
- Detect file modification.
- Detect file deletion.
- Display event details on the console.

---

# Program Flow

1. Start the application.
2. Create the directory if it does not exist.
3. Create a WatchService object.
4. Register the directory with the WatchService.
5. Wait for file system events.
6. Detect Create, Modify, and Delete operations.
7. Display the event on the console.
8. Continue monitoring the directory.

---

# Sample Output

```text
Watching Folder:

C:\Users\Jyothish\PayrollFiles

ENTRY_CREATE -> employee.txt

ENTRY_MODIFY -> employee.txt

ENTRY_DELETE -> employee.txt
```

---

# Java Concepts Used

- Java NIO (`java.nio.file`)
- Path
- Paths
- FileSystems
- WatchService
- WatchKey
- WatchEvent
- Loops
- Exception Handling (`IOException`, `InterruptedException`)

---

# Learning Outcome

After completing UC3, you will understand how to:

- Monitor a directory using Java.
- Detect file system events.
- Use the Java WatchService API.
- Build applications that automatically respond to file changes.

---

# Git Branch

```text
feature/UC3-WatchService
```

---

# Commit Message

```text
feat(UC3): implement watch service to monitor directory changes
```

---
