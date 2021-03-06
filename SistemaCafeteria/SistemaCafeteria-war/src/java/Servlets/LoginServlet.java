/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Classes.Users;
import DesingPatterns.Iterator;
import DesingPatterns.Proxy;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.scene.web.WebEvent;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author cbzn_
 */
public class LoginServlet extends HttpServlet {

    @EJB
    private Proxy proxy;
    int idUser;

    //Método que verifica la existencia del usuario ingresado
    public boolean checkUser(String user, String pass){
        List<Users> users = proxy.users();
        Users usuario; 
        Iterator iterador = new Iterator(users);
        while(iterador.hasNext()){
            usuario = (Users)iterador.next();
            if(usuario.getUsersName().equals(user) && usuario.getUsersPass().equals(pass)){
                idUser = usuario.getIdUsers();
                return true;
            }
        }
        return false;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if(checkUser(request.getParameter("user"), request.getParameter("pass"))){
            request.setAttribute("idUser", idUser);
            RequestDispatcher rd = request.getRequestDispatcher("FoodsListServlet");
            rd.forward(request, response);
        }
        else{
            response.sendRedirect("Login.jsf");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
