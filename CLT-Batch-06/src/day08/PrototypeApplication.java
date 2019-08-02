package day08;

import java.util.Scanner;

public class PrototypeApplication {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id");
		int employeeID = sc.nextInt();
		
		System.out.println("Enter employee name");
		String empName = sc.next();
		
		System.out.println("Enter employee designation");
		String designation = sc.next();
		
		EmployeeDetails refEmployeeDetails1 = new EmployeeDetails();
		 refEmployeeDetails1.setEmpID(employeeID);
		 refEmployeeDetails1.setEmpName(empName);
		 refEmployeeDetails1.setDesignation(designation);
		 refEmployeeDetails1.showRecord();
		 
		 // cloning object
		 
		 EmployeeDetails  refEmployeeDetails2 = (EmployeeDetails)  refEmployeeDetails1.clone();
		 refEmployeeDetails2.showRecord();
		
		
		

	}

}
