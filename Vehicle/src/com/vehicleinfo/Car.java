package com.vehicleinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Car {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register driver
		//forName method of Class of java.lang package is static 
		//hence we use this with class name in our static method
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//building connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","sonali");
		
		//writing variable for query writing
//		String query =("insert into car values('Harrier','TATA','Black'),('Forturner','Tiago','White')");
		//create statement
		Statement st = con.createStatement();
		
		//
		int row = st.executeUpdate("insert into car values('Harrier','TATA','Black'),('Forturner','Tiago','White')");
		System.out.println(row);
		System.out.println("Data Successfully Inserted");
		con.close();
		st.close();
		
	}

}
