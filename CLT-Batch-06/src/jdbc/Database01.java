package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.ResultSet;

public class Database01 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Connection con = MyConnection.prepareConnection();
		System.out.println("creating table in given database..");
		Statement st = con.createStatement();
		/*String sql = "CREATE TABLE students" +
		           "(mobile INTEGER not NULL," +
				    " name VARCHAR(25), " +
		          " email varchar(35), " +		           
		           " PRIMARY KEY (mobile))";
		st.executeUpdate(sql);
		System.out.println("Created table in given database...");*/
		
		
		
		/*String sql = "INSERT INTO students " +
		           " VALUES (676098616, 'Yugal', 'yugal@gmail.com')";
		st.executeUpdate(sql);
		System.out.println("Data inserted successfully");*/
		
		
		
		
		/*String sql = " DELETE FROM students " +
	                "WHERE mobile = 96016891";
	       st.executeUpdate(sql);
	       System.out.print("Record deleted from table successfully");*/
		
		String sql = "SELECT mobile,name,email FROM students";
		          ResultSet rs = st.executeQuery(sql);
		          
		   System.out.println("\n\n");
		   System.out.println("Mobile\t\t"+"Name"+"\t\t"+"Email");
		   System.out.println("=================================================================");
		   
		   while(rs.next()) {
			   System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		   }
	}
	       
          
}

