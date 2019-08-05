package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {

	void callAddEmployee(Employee refEmployee);
	void callUpdateEmployee(Employee refEmployee);
	List<Employee> callListEmployee(Employee refEmployee);
	void callEmployeeId(Employee refEmployee);
	void callDeleteEmployeeId(Employee refEmployee);
	
	
	
	

}
