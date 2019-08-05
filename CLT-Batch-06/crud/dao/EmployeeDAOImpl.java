package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection() {
		try {
			conRef = DBConnection.prepareConnection();
		}
		
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("connection error..");
		}
	}

	@Override
	public void addEmployee(Employee refEmployee) {
		getConnection();
		try {
			
			
			psRef = conRef.prepareStatement("insert into employee(id,name,password) values (?,?,?)");
			psRef.setInt(1,refEmployee.getEmployeeID());
			psRef.setString(2,refEmployee.getEmployeeName());
			psRef.setString(3,refEmployee.getEmployeePassword());
			
			psRef.executeUpdate();
			System.out.println("Record has been added");
			
		}
		catch(SQLException e){
			System.out.println("cannot add record");
		}
		finally {
			try {
				conRef.close();
			}
			catch(SQLException e){
				System.out.println("cannot close connection");
			}
		}
		
		
	}//end of addEmployee

	@Override
	public void updateEmployee(Employee refEmployee) {
		getConnection();
		try {
			
			
			psRef = conRef.prepareStatement(" update employee set name = ?,password = ? where id = ?");
			
			psRef.setString(1,refEmployee.getEmployeeName());
			psRef.setString(2,refEmployee.getEmployeePassword());
			psRef.setInt(3,refEmployee.getEmployeeID());
			
			
			psRef.executeUpdate();
			System.out.println("Record has been updated");
			
		}
		catch(SQLException e){
			System.out.println("cannot update record");
		}
		finally {
			try {
				conRef.close();
			}
			catch(SQLException e){
				System.out.println("cannot close connection");
			}
		}
		
		
	}//end of updateEmployee
	
	@Override
	public List<Employee> ListEmployee(Employee refEmployee) {
		
		getConnection();
		List<Employee> list=new ArrayList<Employee>();		
		try {
			psRef = conRef.prepareStatement("select * from employee");
			ResultSet rs = psRef.executeQuery();
		
			if(rs.next()){ 
				do{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				}while(rs.next());
			}
			
		} 
		
		catch (Exception e) {
				System.out.println("cannot get Employee Details..");
		} 
		
		return list;
	} // end of ListEmployee
	
	
	@Override
	public void IDEmployee(Employee refEmployee) {
		getConnection();
		try {
		psRef = conRef.prepareStatement("SELECT * FROM employee where id = ?");
		   psRef.setInt(1,refEmployee.getEmployeeID());
		   ResultSet rs1 = psRef.executeQuery();
		
		     if(rs1.next()){ 
		    	
				do{
					
				System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3));
				}
				while(rs1.next());
			}
			} 
		
		catch (Exception e) {
				System.out.println("cannot get Employee Details for respective ID..");
		} 
		finally {
			try {
				conRef.close();
			}
			catch(SQLException e){
				System.out.println("cannot close connection");
			}
		
		
	}
	

}
	
	@Override
	public void DeleteEmployee(Employee refEmployee) {
		getConnection();
		try {
		psRef = conRef.prepareStatement("DELETE FROM employee where id = ?");
		   psRef.setInt(1,refEmployee.getEmployeeID());
		   psRef.executeUpdate();
			System.out.println("Record has been deleted");
			
		}
		catch(SQLException e){
			System.out.println("cannot delete record");
		}
		finally {
			try {
				conRef.close();
			}
			catch(SQLException e){
				System.out.println("cannot close connection");
			}
		}
	}
}
