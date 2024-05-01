/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Product;
import Model.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hbtth
 */
public class TypeDAO extends dbConfig {

    public TypeDAO() {
        super();
    }

    public Type getTypeByID(int id) {
        CategoryDAO db = new CategoryDAO();
        String sql = "select * from [Types]\n"
                + "where [Types].idType = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Type type = new Type();
                int idtype = rs.getInt(1);
                String nameType = rs.getString(2);
                int idCategory = rs.getInt(3);
                String name = db.getNameCategory(idCategory);
                type.setIdType(idtype);
                type.setNameType(nameType);
                type.setNameCategory(name);
                return type;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Type> getAllType(){
        List<Type> list = new ArrayList();
        String sql = "Select * from [Types]";
        ProductDAO db = new ProductDAO();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Type type = new Type();
                int idtype = rs.getInt(1);
                String nameType = rs.getString(2);
                type.setIdType(idtype);
                type.setNameType(nameType);
                List<Product> listproduct = db.getAllProductByType(idtype);
                type.setListproduct(listproduct);
                list.add(type);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<Type> getAllTypeByIdCategories(int idCategory){
        List<Type> list = new ArrayList();
        String sql = "select * from [Types] where idCategorie = ?";
        ProductDAO db = new ProductDAO();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategory);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Type type = new Type();
                int idtype = rs.getInt(1);
                String nameType = rs.getString(2);
                type.setIdType(idtype);
                type.setNameType(nameType);
                List<Product> listproduct = db.getAllProductByType(idtype);
                type.setListproduct(listproduct);
                list.add(type);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        TypeDAO db = new TypeDAO();
        List<Type> list = db.getAllTypeByIdCategories(1);
        System.out.println(list.size());
    }
}
