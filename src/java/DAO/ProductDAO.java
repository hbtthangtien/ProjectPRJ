/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Image;
import Model.Product;
import Model.Type;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hbtth
 */
public class ProductDAO extends dbConfig {

    public ProductDAO() {
        super();
    }

    public List<Product> getAllProductFlashSale() {
        List<Product> list = new ArrayList();
        TypeDAO db = new TypeDAO();
        ImageDAO dbi = new ImageDAO();
        String sql = "select * from Product where isSale = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idProduct = rs.getInt(1);
                String nameProduc = rs.getString(2);
                int primePrice = rs.getInt(3), salePrice = rs.getInt(4);
                String desPromotion = rs.getString(5);
                int quantity = rs.getInt(6);
                int idType = rs.getInt(8);
                Type type = db.getTypeByID(idType);
                Product product = new Product(idProduct, nameProduc, primePrice, salePrice, desPromotion, quantity, type);
                List<Image> listImage = dbi.getlistImageForProduct(idProduct);
                product.setListImage(listImage);
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getAllProductByType(int idType) {
        List<Product> list = new ArrayList();
        TypeDAO db = new TypeDAO();
        ImageDAO dbi = new ImageDAO();
        String sql = "select * from [Product] where idType = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idType);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idProduct = rs.getInt(1);
                String nameProduc = rs.getString(2);
                int primePrice = rs.getInt(3), salePrice = rs.getInt(4);
                String desPromotion = rs.getString(5);
                int quantity = rs.getInt(6);
                Type type = db.getTypeByID(idType);
                Product product = new Product(idProduct, nameProduc, primePrice, salePrice, desPromotion, quantity, type);
                List<Image> listImage = dbi.getlistImageForProduct(idProduct);
                product.setListImage(listImage);
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList();
        TypeDAO db = new TypeDAO();
        ImageDAO dbi = new ImageDAO();
        String sql = "select * from [Product]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idProduct = rs.getInt(1);
                String nameProduc = rs.getString(2);
                int primePrice = rs.getInt(3), salePrice = rs.getInt(4);
                String desPromotion = rs.getString(5);
                int quantity = rs.getInt(6);
                int idType = rs.getInt(8);
                Type type = db.getTypeByID(idType);
                Product product = new Product(idProduct, nameProduc, primePrice, salePrice, desPromotion, quantity, type);
                List<Image> listImage = dbi.getlistImageForProduct(idProduct);
                product.setListImage(listImage);
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        ProductDAO db = new ProductDAO();
        List<Product> list = db.searchProductByName("a");
        for (Product product : list) {
            System.out.println(product.getNameProduct());
        }
    }

    public List<Product> searchProductByName(String txtSearch) {
        List<Product> list = new ArrayList();
        TypeDAO db = new TypeDAO();
        ImageDAO dbi = new ImageDAO();
        String sql = "select * from [Product] where nameProduct like ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + txtSearch + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idProduct = rs.getInt(1);
                String nameProduc = rs.getString(2);
                int primePrice = rs.getInt(3), salePrice = rs.getInt(4);
                String desPromotion = rs.getString(5);
                int quantity = rs.getInt(6);
                int idType = rs.getInt(8);
                Type type = db.getTypeByID(idType);
                Product product = new Product(idProduct, nameProduc, primePrice, salePrice, desPromotion, quantity, type);
                List<Image> listImage = dbi.getlistImageForProduct(idProduct);
                product.setListImage(listImage);
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getProductById(int idProduct) {
        TypeDAO db = new TypeDAO();
        ImageDAO dbi = new ImageDAO();
        String sql = "select * from [Product] where idProduct = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProduct);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nameProduc = rs.getString(2);
                int primePrice = rs.getInt(3), salePrice = rs.getInt(4);
                String desPromotion = rs.getString(5);
                int quantity = rs.getInt(6);
                int idType = rs.getInt(8);
                Type type = db.getTypeByID(idType);
                Product product = new Product(idProduct, nameProduc, primePrice, salePrice, desPromotion, quantity, type);
                List<Image> listImage = dbi.getlistImageForProduct(idProduct);
                product.setListImage(listImage);
                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
