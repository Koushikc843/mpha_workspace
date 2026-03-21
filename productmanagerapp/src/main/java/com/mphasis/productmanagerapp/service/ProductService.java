package com.mphasis.productmanagerapp.service;

import java.util.List;

import com.mphasis.productmanagerapp.dao.ProductDAO;
import com.mphasis.productmanagerapp.model.ProductModel;

public class ProductService {
	private ProductDAO pd=new ProductDAO();
	
	public List<ProductModel> getAllProducts(){
		return pd.findAll();
	}
	

}
