package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class VerifyTheDataFromDataBase {
	public static void main(String[] args) throws SQLException {
		System.out.println("start");
		String expectedstudentID ="2";
				Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//Establish the connection with database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		//issue the statement
		Statement statement = connection.createStatement();
		//execute queries
	ResultSet result = statement.executeQuery("select * from studentsinfo");
	while(result.next()) {
		if(result.getString(1).equals(expectedstudentID)) {
			System.out.println("passed");
		}
	}
	connection.close();
	}
}

	
		
	
	
