/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.ProductDAO;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hbtth
 */
public class searchControll extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String txtSearch = request.getParameter("txtSearch");
        ProductDAO db = new ProductDAO();
        List<Product> list = db.searchProductByName(txtSearch);
        request.setAttribute("listProduct", list);
        request.setAttribute("txtSearch", txtSearch);
        request.getRequestDispatcher("index-search.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int choice = Integer.parseInt(request.getParameter("sort"));
        String txtSearch = request.getParameter("txtSearch");
        ProductDAO db = new ProductDAO();
        List<Product> list = db.searchProductByName(txtSearch);
        switch (choice) {
            case 1: {
                list.sort(Comparator.comparing(Product::getSalePrice).reversed());
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                list.sort(Comparator.comparing(Product::getNameProduct));
                break;
            }
            case 4: {
                list.sort(Comparator.comparing(Product::getSalePrice));
                break;
            }
        }
        request.setAttribute("listProduct", list);
        request.setAttribute("txtSearch", txtSearch);
        request.setAttribute("choice", choice);
        request.getRequestDispatcher("index-search.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
