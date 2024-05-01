/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAO.UserDAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author hbtth
 */
public class loginController extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie []cookie = request.getCookies();
        String username = null, password = null,remember = null;
        if(cookie != null){
            for(Cookie i : cookie){
                if(i.getName().equals("cUser")){
                    username = i.getValue();
                }
                if(i.getName().equals("cPass")){
                    password = i.getValue();
                }
                if(i.getName().equals("cRem")){
                    remember = i.getValue();
                }
            }
        }
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("remember", remember);
        request.getRequestDispatcher("index-login.jsp").forward(request, response);
    } 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkremember = request.getParameter("rem");
        UserDAO db = new UserDAO();
        if(db.checkLogin(new User(username,password))){
            if(checkremember!=null){
                Cookie cUser = new Cookie("cUser",username);
                Cookie cPass = new Cookie("cPass", password);
                Cookie cRem = new Cookie("cRem",checkremember);
                cUser.setMaxAge(60*60*24*10);
                cPass.setMaxAge(60*60*24);
                cRem.setMaxAge(60*60*24);
                response.addCookie(cUser);
                response.addCookie(cPass);
                response.addCookie(cRem);
                HttpSession session = request.getSession();
                User user = db.getUser(new User(username,password));
                session.setAttribute("User", user);
                response.sendRedirect("home");
            }else{
                HttpSession session = request.getSession();
                User user = db.getUser(new User(username,password));
                session.setAttribute("User", user);
                response.sendRedirect("home");
            }
        }else{
            request.setAttribute("noitce", "Tài khoản hoặc mật khẩu không đúng!");
            request.getRequestDispatcher("index-login.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
