/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Category;
import Model.ImageBanner;
import Model.Type;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hbtth
 */
public class CategoryDAO extends dbConfig{

    public CategoryDAO() {
        super();
    }
    public Category getCategoryByID(int id){
        String sql = "select * from [Categories] where idCategorie = ?";
        TypeDAO db = new TypeDAO();
        ImageBannerDAO dbi = new ImageBannerDAO();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String nameCategories = rs.getString(2);
                List<Type> listtype = db.getAllTypeByIdCategories(id);
                List<ImageBanner> listBanner = dbi.getAllImageBannerByIdCategory(id);
                Category category = new Category(id, nameCategories, listtype);
                category.setListImageBanner(listBanner);
                return category;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String getNameCategory(int id){
        String sql = "select * from [Categories] where idCategorie = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String nameCategories = rs.getString(2);
                return nameCategories;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
