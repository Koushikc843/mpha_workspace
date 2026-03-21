package com.mphasis.productmanagerapp.controller;

import java.io.IOException;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.mphasis.productmanagerapp.model.ProductModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/downloadpdf")
public class DownloadPdfController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

    
        List<ProductModel> products = 
                (List<ProductModel>) req.getSession().getAttribute("products");

       
        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition", "attachment; filename=products.pdf");

        Document document = new Document();

        try {
            PdfWriter.getInstance(document, resp.getOutputStream());
            document.open();

            document.add(new Paragraph("Product List\n\n"));
            PdfPTable table = new PdfPTable(3);
            table.addCell("ID");
            table.addCell("Name");
            table.addCell("Price");
            for (ProductModel p : products) {
                table.addCell(p.getId());
                table.addCell(p.getName());
                table.addCell(String.valueOf(p.getPrice()));
            }

            document.add(table);
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}