package com.mphasis.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCMain {
	public static void main(String [] args) {
		System.out.println("Welcome to JDBC...!!!");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="root@39";
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",user,password);
			String query="select *from products";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id")+" : "+rs.getString("name")+" : "+rs.getInt("price"));
			}
			rs.close();
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
