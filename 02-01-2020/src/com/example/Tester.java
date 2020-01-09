package com.example;

import comm.example.Employee;

public class Tester {

	public static void main(String[] args) {
		Employee employee=Employee.createEmployee(1,"navitha",12000);
		System.out.println(employee.displayEmployeeDetails());

	}

}
