/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hbtth
 */
public class dbConfig {
    protected static Connection con = null;
    private String username = "sa", password = "ductung1706@";
    private String uri = "jdbc:sqlserver://localhost:1433;databaseName= AppleStore";
    private String url = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public dbConfig(){
        if(con == null){
            try {
                Class.forName(url);
                con = DriverManager.getConnection(uri,username, password);
                System.out.println("ok");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(dbConfig.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(dbConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public static void main(String[] args) {
        new dbConfig();
    }
}
