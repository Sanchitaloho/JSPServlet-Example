package com.jsp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.beans.Product;
import com.jsp.beans.User;
import com.jsp.dao.DBConnection;

public class callconnection {

			public List<Product> searchProducts(String searchString) throws SQLException {
				Connection connection=null;
				Statement statement=null;
				ResultSet set=null;
			Product product = null;
			List<Product> products = new ArrayList<>();
			
			try{
		   connection = DBConnection.getConnectionToDatabase();
			String sql2 = "select * from product where name like '%"+searchString+"%'";
			String sql = "select * from product";
			
			statement = connection.createStatement();  //  Create a statement and resultset
			set = statement.executeQuery(sql);
			
			while(set.next()){
				product= new Product();
				product.setCode(set.getString("CODE"));
				product.setName(set.getString("NAME"));
				product.setPrice(set.getInt("PRICE"));
				products.add(product);
				}

			}
			catch(SQLException exception){
				exception.printStackTrace();
			}	
			finally {
				try {
						if (statement != null ) {
						    statement.close();
								}
							if (connection != null) {
							connection.close();
								}
							} 
				catch (Exception e) {
								e.printStackTrace();
							}
						}
			return products;
		}
			
			public int registerUser(User user) {
				int rowsAffected = 0;

				try {
					// get the connection for the database
					Connection connection = DBConnection.getConnectionToDatabase();

					// write the insert query
					String insertQuery = "insert into users values(?,?,?,?,?,?)";

					// set parameters with PreparedStatement
					java.sql.PreparedStatement statement = connection.prepareStatement(insertQuery);
					statement.setString(1, user.getUsername());
					statement.setString(2, user.getPassword());
					statement.setString(3, user.getFirstName());
					statement.setString(4, user.getLastName());
					statement.setInt(5, user.getAge());
					statement.setString(6, user.getActivity());

					// execute the statement
					rowsAffected = statement.executeUpdate();

				} catch (SQLException exception) {
					exception.printStackTrace();
				}
				return rowsAffected;  
			}
			

	}
	


