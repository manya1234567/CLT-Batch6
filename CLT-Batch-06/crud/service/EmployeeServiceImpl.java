package service;

import java.util.List;

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
	 
	 @Override
		public List<Employee> callListEmployee(Employee refEmployee) {
			refEmployeeDAO = new EmployeeDAOImpl();
			return refEmployeeDAO.ListEmployee(refEmployee);
		}
	 @Override
	 public void callEmployeeId(Employee refEmployee) {
		 
		 refEmployeeDAO = new EmployeeDAOImpl();
	      refEmployeeDAO.IDEmployee(refEmployee);
	      
	 }
	 
 public void callDeleteEmployeeId(Employee refEmployee) {
		 
		 refEmployeeDAO = new EmployeeDAOImpl();
	      refEmployeeDAO.DeleteEmployee(refEmployee);
	      
	 }
	
}
