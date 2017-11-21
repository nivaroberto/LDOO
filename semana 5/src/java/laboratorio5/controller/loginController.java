
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import week5.models.*;
import week5.models.Authentication;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author roberto ivan hernandez chavarría 1452359
 */
public class loginController extends HttpServlet {

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

      //El objeto request obtiene la sesión de la aplicación a través de getSession()
      //Se almacena la sesión en el objeto session de tipo HttpSession
        HttpSession session = request.getSession();

        String txtUser = request.getParameter("usuario");
        String txtPass = request.getParameter("contraseña");
        String txtName = request.getParameter("name");
        String txtFullName = request.getParameter("fullname");

        boolean isValidUser =  Authentication.authenticate(txtUser, txtPass);

        if(isValidUser) {
          User user = new User(txtUser, txtPass, txtName, txtFullName);

          //Establecemos variables de sesión
          session.setAttribute("username", user.getUsername());
          session.setAttribute("name", user.getName());
          session.setAttribute("fullname", user.getFullName());

          //Mostramos el perfil del usuario
          response.sendRedirect("profile.jsp");
         }
        else {
          response.sendRedirect("error.jsp");
        }  
    }    
}