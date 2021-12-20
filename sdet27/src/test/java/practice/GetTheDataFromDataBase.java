package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import com.mysql.cj.jdbc.Driver;

public class GetTheDataFromDataBase {
 public static void main(String[] args)throws Throwable {
	
Connection connection = null;
	try {
		//register the database
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		
		//Establish the connection with database
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		
		//issue the statement
		
		Statement statement =connection.createStatement();
		//execute queries
		
		ResultSet result = statement.executeQuery("select * from studentsinfo;");
		while(result.next()) {
			
			System.out.println(result.getString(2));
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//close the database connection
		
		connection.close();
	}
	
	
				
			}
		
		
		
		
	}
	


