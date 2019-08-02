package service;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	 EmployeeDAO refEmployeeDAO;
	 @Override
	 public void callAddEmployee(Employee refEmployee) {
		 
		 refEmployeeDAO = new EmployeeDAOImpl();
		 refEmployeeDAO.addEmployee(refEmployee);
	 }
	 @Override
	 
	 public void callUpdateEmployee(Employee refEmployee) {
		 refEmployeeDAO = new EmployeeDAOImpl();
		 refEmployeeDAO.updateEmployee(refEmployee);
	 }
	
}
