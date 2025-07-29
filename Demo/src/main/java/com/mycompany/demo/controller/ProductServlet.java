/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo.controller;

import com.mycompany.demo.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 *
 * @author 20113
 */
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Dell", 15000000));
        products.add(new Product(2, "Điện thoại iPhone", 20000000));
        products.add(new Product(3, "Tai nghe Bluetooth", 1500000));

        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/products.jsp");
        dispatcher.forward(request, response);
    }
}
