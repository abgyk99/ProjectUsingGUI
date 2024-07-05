package com.Test.VehcleDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Mobile {
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle" ,"root", "sonali");
		Statement st = con.createStatement();
		
		PreparedStatement pr = con.prepareStatement("insert into mobile values (?,?)");
		pr.setString(1, "Xiami");
		pr.setString(2, "Redm");
		pr.executeUpdate();
		System.out.println("Submitted ........! ");
	}
}
