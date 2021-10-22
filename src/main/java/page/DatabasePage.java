package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabasePage {

	public static String getData(String columnName) throws Throwable {
		
	//	Setting properties for mySQL
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl = "jdbc:mysql://localhost:3306/april2021";
		String sqlUsername= "root";
		String sqlPassword= "root";
		String query = "Select * from users";
		
		//create connection to local database
		
		Connection connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
		
		// Empowering the connection referance veriable to execute queries
		
		Statement Statement = connection.createStatement();
		//Delivering the sql query
		ResultSet rs = Statement.executeQuery(query);
		
		while(rs.next()) {
			
			return rs.getString(columnName);
		}
				
		
		return columnName;
		
	}
}
