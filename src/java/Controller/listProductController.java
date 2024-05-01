/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.CategoryDAO;
import Model.Category;
import Model.Product;
import Model.Type;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hbtth
 */
public class listProductController extends HttpServlet {

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

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idCategory = Integer.parseInt(request.getParameter("idCategory"));
        String idType = request.getParameter("idType");
        CategoryDAO db = new CategoryDAO();
        Category category = db.getCategoryByID(idCategory);
        List<Product> list = new ArrayList();
        if (idType != null && idType.length() != 0) {
            int idtype = Integer.parseInt(idType);
            for (Type i : category.getListtype()) {
                if (i.getIdType() == idtype) {
                    for (Product j : i.getListproduct()) {
                        list.add(j);
                    }
                }
            }
        } else {
            for (Type i : category.getListtype()) {
                for (Product j : i.getListproduct()) {
                    list.add(j);
                }
            }
        }
        request.setAttribute("idType", idType);
        request.setAttribute("listProduct", list);
        request.setAttribute("category", category);
        request.getRequestDispatcher("index-list-product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idCategory = Integer.parseInt(request.getParameter("idCategory"));
        String idType = request.getParameter("idType");
        CategoryDAO db = new CategoryDAO();
        Category category = db.getCategoryByID(idCategory);
        List<Product> list = new ArrayList();
        int id = Integer.parseInt(idType);
        if (id != 0) {

            for (Type i : category.getListtype()) {
                if (i.getIdType() == id) {
                    for (Product j : i.getListproduct()) {
                        list.add(j);
                    }
                }
            }
        } else {
            for (Type i : category.getListtype()) {
                for (Product j : i.getListproduct()) {
                    list.add(j);
                }
            }
        }
        int choice = Integer.parseInt(request.getParameter("sort"));
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
        request.setAttribute("idType", idType);
        request.setAttribute("listProduct", list);
        request.setAttribute("category", category);
        request.setAttribute("choice", choice);
        request.getRequestDispatcher("index-list-product.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
