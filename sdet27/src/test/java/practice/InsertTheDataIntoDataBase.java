package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertTheDataIntoDataBase {

	public static void main(String[] args)throws Throwable {
		
	

			//register the database
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			
			
			//Establish the connection with database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			//issue the statement
			
			Statement statement =connection.createStatement();
			//execute quarry
		int result=statement.executeUpdate("insert into studentsinfo(fname,lname,address)value('syam','dsp','india')");
			//verification
			if(result==1) {
				System.out.println("==>one set of data is added to database<==");
			}else {
				System.out.println("==>data is not add to database");
			}
			connection.close();
}
				
			
				
				
				
				
				
			}
			

