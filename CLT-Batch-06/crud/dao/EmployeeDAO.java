package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee refEmployee);
	public void updateEmployee(Employee refEmployee);
	List<Employee> ListEmployee(Employee refEmployee);
	public void IDEmployee(Employee refEmployee);
	public void DeleteEmployee(Employee refEmployee);

}
