/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hbtth
 */
public class UserDAO extends dbConfig {

    public UserDAO() {
        super();
    }

    public boolean checkLogin(User user) {
        String sql = "SELECT * FROM [User] WHERE [User].username = ? AND [User].password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public User getUser(User user) {
        String sql = "SELECT * FROM [User] WHERE [User].username = ? AND [User].password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idUser = rs.getInt(1);
                String username = rs.getString(2), password = rs.getString(3);
                String dayOfBirth = rs.getString(4);
                String phoneNumber = rs.getString(5), fullname = rs.getString(6), address = rs.getString(7);
                int gender = rs.getInt(8);
                return new User(idUser, username, password, dayOfBirth, phoneNumber, fullname, address, gender);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean addAccount(User user) {
        String sql = "INSERT INTO [dbo].[User] ([username], [password], [dayOfBirth], [phoneNumber], [fullname], [address], [gender])\n"
                + "     VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getDayOfBirth());
            ps.setString(4, user.getPhoneNumber());
            ps.setNString(5, user.getFullname());
            ps.setNString(6, user.getAddress());
            ps.setInt(7, user.getGender());
            int x = ps.executeUpdate();
            return x != 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        UserDAO db = new UserDAO();
        System.out.println(db.checkLogin(new User("username1", "password1")));
    }
}
