package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnectionToDatabase() {
		Connection connection = null;
		
		 String hostName = "localhost";
	        String sqlInstanceName = "SQLEXPRESS";
	        String database = "mytest";
	        String userName = "sa";
	        String password = "12345";

		try {

			// load the driver class
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("SQL server JDBC Driver Registered!");

			// get hold of the DriverManager
			
		// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
	    // String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"+ ";instance=" + sqlInstanceName + ";databaseName=" + database;
			//connection = DriverManager.getConnection("jdbc:sqlserver://192.168.0.13/SQLEXPRESS;databasename=JSPServletExample;integratedSecurity=true");
			connection = DriverManager.getConnection("jdbc:sqlserver://csrsql.database.windows.net:1433;database=TestDBCSR;user=csradmin@csrsql;password=csr@1234;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your SQL server JDBC Driver?");
			e.printStackTrace();

		}

		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("Connection made to DB!");
		}
		return connection;
	}

}
