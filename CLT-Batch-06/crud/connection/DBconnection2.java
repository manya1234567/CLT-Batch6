package connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection2 {
	public static Connection myConnection() {
		Connection con = null;
		FileReader fReader = null;
		Properties propRef = new Properties();
		
		try {
			fReader = new FileReader("db.properties");
			propRef.load(fReader);
			Class.forName(propRef.getProperty("db_driver_class"));
			con = DriverManager.getConnection(
				propRef.getProperty("db_url"),
				propRef.getProperty("db_username"),
				propRef.getProperty("db_password")
				);
			
		
		}catch(IOException|ClassNotFoundException|SQLException e){
			System.out.println("DBConnection2=> DB connection error");
		}
		return con;
	}

}
