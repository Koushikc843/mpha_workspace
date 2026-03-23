package com.mphasis.productmanagerapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import com.mphasis.productmanagerapp.model.ProductModel;

public class ProductDAO {
	
	public List findAll(){
		
		List<ProductModel> products=new ArrayList<>();
	
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
			ProductModel p=new ProductModel(rs.getString("id"),rs.getString("name"),rs.getDouble("price"));
			products.add(p);
		
		}
		rs.close();
		ps.close();
		con.close();
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return products;
	}
	
public int saveProduct(ProductModel product){
	int n=0;
		
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
		String query="select into product values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, product.getId());
		ps.setString(2, product.getName());
		ps.setDouble(3, product.getPrice());
		
		n=ps.executeUpdate();
		
		ps.close();
		con.close();
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return n;
	}
}


