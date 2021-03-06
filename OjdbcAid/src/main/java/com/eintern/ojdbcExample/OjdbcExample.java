package com.eintern.ojdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "admin", "admin");
		
		Statement getEmployees = conn.createStatement();
		
		ResultSet rs = getEmployees.executeQuery("SELECT FIRST_NAME, LAST_NAME, AGE FROM EMP");
		
		while (rs.next()){
			System.out.println("Name: " + rs.getString(2) + ", " + rs.getString(1));
		}
				
		rs.close();
		getEmployees.close();
		conn.close();

	}

}
