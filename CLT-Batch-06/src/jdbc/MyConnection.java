package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {
   
	 public static Connection prepareConnection() throws SQLException,ClassNotFoundException{
		 String connectionURL = "jdbc:mysql://localhost:3306/clt6";
		 String uname = "root";
		 String pwd = "password";
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection ref = DriverManager.getConnection(connectionURL,uname,pwd);
		 return ref;
	 }
}
