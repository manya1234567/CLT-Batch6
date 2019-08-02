package day08;

public class EmployeeDetails implements MyPrototype {

	 int empID;
	 String empName;
	 String designation;
	
}
public void setEmpName(String empName) {
	
	this.empName = empName;
	
}

public void setDesignation(String designation) {
	
	this.designation = designation;
	
}

@override

public MyPrototype clone() throws CloneNotSupportedEXception{
	
	System.out.println("\n Cloning My Prototype object");
	return(MyPrototype)super.clone();
	void showRecord{
		
		System.out.println("\nEmployee ID\tEmployee Name\tEmployeeDesignation");
		
	}

  
}