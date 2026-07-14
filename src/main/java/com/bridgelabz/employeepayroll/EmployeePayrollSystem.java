package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollSystem {

    public  static  void  main(String[] args){

        EmployeePayrollService service = new EmployeePayrollService();

        // Add employees
        service.addEmployee(new EmployeePayrollData(
                101,
                "Jyothish",
                50000));

        service.addEmployee(new EmployeePayrollData(
                102,
                "Rahul",
                45000));

        service.addEmployee(new EmployeePayrollData(
                103,
                "Kiran",
                60000));

        // Write to file
        service.writeEmployeePayroll();


    }

}
