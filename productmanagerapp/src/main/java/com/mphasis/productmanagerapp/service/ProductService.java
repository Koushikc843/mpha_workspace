package com.mphasis.productmanagerapp.service;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.productmanagerapp.model.ProductModel;

public class ProductService {
	private List<ProductModel> products=new ArrayList<>();
	
	public ProductService() {
		products.add(new ProductModel("P1","Pen",100));
		products.add(new ProductModel("P2","Marker",100));
		products.add(new ProductModel("P3","Mouse",100));
		
	}
	public List<ProductModel> getAllProducts(){
		return products;
	}
	

}
