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

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/products.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String price = req.getParameter("price");

        double priceValue = Double.parseDouble(price);

        ProductModel p = new ProductModel(id, name, priceValue);

        productService.saveProduct(p);

        // Redirect back to product list
        resp.sendRedirect("productcontroller");
    }
}