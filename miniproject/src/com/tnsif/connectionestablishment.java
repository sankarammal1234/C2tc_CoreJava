package com.tnsif;

import java.sql.Connection;

import java.sql.*;




public class connectionestablishment

{

	public static Connection getConnection() throws ClassNotFoundException, SQLException

	{

	

	     //register the connection

		Class.forName("com.mysql.cj.jdbc.Driver");

		

		//establish the connection

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","sankarammal@123");
		System.out.println("connection created");

		return con;

		

		

	}

}