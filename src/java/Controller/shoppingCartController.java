/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAO.ProductDAO;
import Model.Cart;
import Model.Item;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author hbtth
 */
public class shoppingCartController extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie []cookie = request.getCookies();
        String txtItemOnCart = null;
        if(cookie != null){
            for(Cookie i : cookie){
                if(i.getName().equals("cart")){
                    txtItemOnCart = i.getValue();
                }
            }
        }
        ProductDAO db = new ProductDAO();
        List<Product> listProduct = db.getAllProduct();
        Cart cart = new Cart(txtItemOnCart,listProduct);
        request.setAttribute("cartOfUser", cart);
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
    } 


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie []cookie = request.getCookies();
        String idProduct = request.getParameter("idProduct");
        String capacity = request.getParameter("capacity"); // color
        int numberOfProduct = 1;//
        int priceOfProduct  = Integer.parseInt(request.getParameter("priceOfProduct"));
        ProductDAO db = new ProductDAO();
        List<Product> listProduct = db.getAllProduct();
        String txtItemOnCart = null;
        if(cookie != null){
            for(Cookie i : cookie){
                if(i.getName().equals("cart")){
                    txtItemOnCart = i.getValue();
                    i.setMaxAge(0);
                    response.addCookie(i);
                }
            }
        }
        String newItem = idProduct+":"+numberOfProduct+":"+capacity;
        if(txtItemOnCart!= null){
            txtItemOnCart = txtItemOnCart + newItem +"!";
        }else{
            txtItemOnCart = newItem +"!";
        }
        Cart cart = new Cart(txtItemOnCart, listProduct);
        StringBuilder sb = new StringBuilder();// 
        for(Item i : cart.getAllItemfromCart()){
            sb.append(i.getProduct().getIdProduct()).append(":").append(i.getTotalProduct()).append(":").append(i.getCapacity()).append("!");
        }
        Cookie newCookie = new Cookie("cart",sb.toString());
        newCookie.setMaxAge(60*60*24*10);
        response.addCookie(newCookie);
        response.sendRedirect("cart"); // goi doGet
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
