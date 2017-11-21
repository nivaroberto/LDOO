<%-- 
    Document   : login
    Created on : 15/09/2017, 08:30:38 PM
    Author     : Roberto iván hernandez chavarría 1452359
--%>

<%
    if(session.getAttribute("username") != null)
        response.sendRedirect("profile.jsp");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form action="loginController" method="post">
              Usuario <input type="text" id="username">
              Contraseña <input type="password" id="Contraseña">
              iniciar sesión <input type="submit" id="enviar">
             
        </form>
    </body>
</html>

<%
    if(session.getAttribute("username") != null)
        response.sendRedirect("profile.jsp");
%>