package controller;

import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class AdminController {
	Employee refEmployee;
	EmployeeService refEmployeeService;
	
	
	public void adminProcess() {
		userInput();
		userInputUpdate();
	    userListDisplay();
		userEmployeeByID();
		userDeleteEmployeeByID();
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
		
		System.out.println("Enter changed employee Name");
		String empName = sc.next();
		refEmployee.setEmployeeName(empName);
		
		System.out.println("Enter changed employee Password");
		String empPassword = sc.next();
		refEmployee.setEmployeePassword(empPassword);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
		
	}
	
	void userListDisplay() {
		System.out.println("Listing all employees.......");
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		refEmployeeService.callListEmployee(refEmployee);
		
	}
	
	void userEmployeeByID() {
		System.out.println("Enter Employee ID of employee to display:");
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int empID = sc.nextInt();
		refEmployee.setEmployeeID(empID);
		refEmployeeService.callEmployeeId(refEmployee);
		
		
	}
	
	void userDeleteEmployeeByID() {
		System.out.println("Enter Employee ID of employee to delete:");
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int empID = sc.nextInt();
		refEmployee.setEmployeeID(empID);
		refEmployeeService.callDeleteEmployeeId(refEmployee);
		
		
	}
	
	

}
