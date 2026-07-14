package com.bridgelabz.employeepayroll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileReader {

    public static void main(String[] args) {

        // Path of the file to read
        Path filePath = Paths.get("PayrollFiles", "employee-payroll.txt");

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(filePath);

            System.out.println("Employee Payroll Data");
            System.out.println("---------------------");

            // Print each line one by one
            for (String line : lines) {
                System.out.println(line);
            }

            // Count total number of entries
            System.out.println("\nTotal Employees : " + lines.size());

        } catch (IOException e) {
            System.out.println("File not found or cannot be read.");
            System.out.println(e.getMessage());
        }
    }


}
