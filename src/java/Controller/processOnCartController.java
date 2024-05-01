/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.CheckOutDAO;
import DAO.ProductDAO;
import Model.Cart;
import Model.Item;
import Model.Product;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

public class processOnCartController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        int val = Integer.parseInt(request.getParameter("val"));
        ProductDAO db = new ProductDAO();
        List<Product> list = db.getAllProduct();
        Cookie[] cookie = request.getCookies();
        String txtItemOnCart = null;
        if (cookie != null) {
            for (Cookie i : cookie) {
                if (i.getName().equals("cart")) {
                    txtItemOnCart = i.getValue();
                    i.setMaxAge(0);// xoa cookie
                    response.addCookie(i);// xoa cookie
                }
            }
        }
        Cart cart = new Cart(txtItemOnCart, list);
        cart.setQuantityItem(idProduct, val);
        StringBuilder sb = new StringBuilder();
        for (Item i : cart.getAllItemfromCart()) {
            sb.append(i.getProduct().getIdProduct()).append(":").append(i.getTotalProduct()).append(":").append(i.getCapacity()).append("!");
        }
        Cookie newCookie = new Cookie("cart", sb.toString());
        newCookie.setMaxAge(60 * 60 * 24 * 10);
        response.addCookie(newCookie);
        response.sendRedirect("cart");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookie = request.getCookies();
        HttpSession session = request.getSession();
        ProductDAO db = new ProductDAO();
        CheckOutDAO dbc = new CheckOutDAO();
        List<Product> list = db.getAllProduct();
        String txtCartOnCookie = null;
        if (cookie != null) {
            for (Cookie i : cookie) {
                if (i.getName().equals("cart")) {
                    txtCartOnCookie = i.getValue();
                    i.setMaxAge(0);
                    response.addCookie(i);
                }
            }
        }
        Cart cart = new Cart(txtCartOnCookie, list);
        User user = (User) session.getAttribute("User");
        dbc.checkOutAllOfProduct(cart,user);
        response.sendRedirect("cart");
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
