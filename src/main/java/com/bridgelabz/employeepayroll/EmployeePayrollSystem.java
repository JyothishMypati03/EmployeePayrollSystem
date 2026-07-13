package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollSystem {

    public  static  void  main(String[] args){

        // Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // List to store employee records
        List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

        // Create Employee Payroll Service object
        EmployeePayrollService employeePayrollService =
                new EmployeePayrollService(employeePayrollList);

        // Read employee details from console
        employeePayrollService.readEmployeePayrollData(scanner);

        // Display employee details on console
        employeePayrollService.writeEmployeePayrollData();


    }

}
