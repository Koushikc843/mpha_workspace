package com.mphasis.productmanagerapp.controller;

import java.io.IOException;
import java.util.List;

import com.mphasis.productmanagerapp.model.ProductModel;
import com.mphasis.productmanagerapp.service.ProductService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/productcontroller")
public class ProductController extends HttpServlet {

    private ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<ProductModel> products = productService.getAllProducts();

        req.setAttribute("products", products);
        req.getSession().setAttribute("products", products);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/products.jsp");
        rd.forward(req, resp);
    }
}