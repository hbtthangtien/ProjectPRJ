/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Image;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hbtth
 */
public class ImageDAO extends dbConfig{

    public ImageDAO() {
        super();
    }
    public List<Image> getlistImageForProduct(int id){
        List<Image> list = new ArrayList();
        String sql = "select * from [Image] where [Image].idProduct  = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idImage = rs.getInt(1);
                String nameImage = rs.getString(2);
                list.add(new Image(idImage, nameImage));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static void main(String[] args) {
        
    }
}
