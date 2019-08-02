package controller;

import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class AdminController {
	Employee refEmployee;
	EmployeeService refEmployeeService;
	
	
	public void adminProcess() {
		//userInput();
		userInputUpdate();
	}
	
	void userInput() {
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID");
		int empID = sc.nextInt();
		refEmployee.setEmployeeID(empID);
		
		System.out.println("Enter employee Name");
		String empName = sc.next();
		refEmployee.setEmployeeName(empName);
		
		System.out.println("Enter employee Password");
		String empPassword = sc.next();
		refEmployee.setEmployeePassword(empPassword);
		
		refEmployeeService.callAddEmployee(refEmployee);
		
	}
		
	void userInputUpdate() {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID");
		int empID = sc.nextInt();
		refEmployee.setEmployeeID(empID);
		
		System.out.println("Enter employee Name");
		String empName = sc.next();
		refEmployee.setEmployeeName(empName);
		
		System.out.println("Enter employee Password");
		String empPassword = sc.next();
		refEmployee.setEmployeePassword(empPassword);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
		
	}
	
	

}
