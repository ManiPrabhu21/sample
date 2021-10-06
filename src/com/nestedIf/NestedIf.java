package com.nestedIf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NestedIf {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "887083");
		// url-->jdbc:oracle:thin:@localhost:1521:xe
		// oracle -->Db
		// thin -->driver
		// @localhost -->Ip address where data is stored
		// 1521-->port number
		// xe -->service provider

		String query = "select * from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet executeQuery = prepareStatement.executeQuery();

		while (executeQuery.next()) {

			int int1 = executeQuery.getInt("employee_id");
			System.out.println(int1);

			String string = executeQuery.getString("first_name");
			System.out.println(string);
		}
		connection.close();
	}
}
