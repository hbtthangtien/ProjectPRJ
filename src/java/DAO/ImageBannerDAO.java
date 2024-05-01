/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ImageBanner;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hbtth
 */
public class ImageBannerDAO extends dbConfig{

    public ImageBannerDAO() {
        super();
    }
    public List<ImageBanner> getAllImageBannerByIdCategory(int idCategory){
        String sql = "select * from [ImageBanner] where idCategorie = ?";
        List<ImageBanner> list = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategory);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idImage = rs.getInt(1);
                String name = rs.getString(2);
                list.add(new ImageBanner(idImage, name));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImageBannerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static void main(String[] args) {
        ImageBannerDAO db = new ImageBannerDAO();
        List<ImageBanner> list = db.getAllImageBannerByIdCategory(1);
        System.out.println(list.size());
    }
}
