/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Cart;
import Model.Item;
import Model.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hbtth
 */
public class CheckOutDAO extends dbConfig {

    public CheckOutDAO() {
        super();
    }

    public void checkOutAllOfProduct(Cart cart, User user) {
        int idOrder = createOrder(cart, user);
        for (Item i : cart.getAllItemfromCart()) {
            int idProduct = i.getProduct().getIdProduct();
            int amount = i.getTotalProduct();
            int total = i.getTotalPrice();
            String color = i.getCapacity();
            createOrderDetail(idProduct,amount ,total ,color , idOrder);
        }
        
    }
    public static void main(String[] args) {
        new CheckOutDAO().checkOutAllOfProduct(new Cart("1:1:Purple!", new ProductDAO().getAllProduct()), new UserDAO().getUser(new User("username1","password1")));
    }
    private void createOrderDetail(int idProduct, int quantity, int totalInvoice, String color, int idOrder) {
        String sql = "INSERT INTO [dbo].[OrderDetail] ([idOrder],[idProduct],[quantity],[totalInvoice],[capacity],[promotion]) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idOrder);
            ps.setInt(2, idProduct);
            ps.setInt(3, quantity);
            ps.setInt(4, totalInvoice);
            ps.setString(5, color);
            ps.setString(6, "Good");
            int x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int createOrder(Cart cart, User user) {
        String sql = "INSERT INTO [dbo].[Order]\n"
                + "           ([idUser]\n"
                + "           ,[fullname]\n"
                + "           ,[address]\n"
                + "           ,[totalInvoice])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, user.getIdUser());
            ps.setString(2, user.getFullname());
            ps.setString(3, user.getAddress());
            ps.setInt(4, cart.getTotalMoney());
            int x = ps.executeUpdate();
            if (x != 0) {
                return getIdOrder();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    private int getIdOrder() {
        String sql = "select Max(idOrder) from [Order]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
