/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAO.ProductDAO;
import DAO.TypeDAO;
import Model.Product;
import Model.Type;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author hbtth
 */
public class homeController extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ProductDAO db = new ProductDAO();
            TypeDAO dbt = new TypeDAO();
            List<Product> list = db.getAllProductFlashSale();
            List<Product> listItem1 = list.subList(0, 4);
            List<Product> listItem2 = list.subList(4, 8);
            List<Product> listItem3 = list.subList(8, 12);
            request.setAttribute("listItem1", listItem1);
            request.setAttribute("listItem2", listItem2);
            request.setAttribute("listItem3", listItem3);
            request.setAttribute("list", db.getAllProduct());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
