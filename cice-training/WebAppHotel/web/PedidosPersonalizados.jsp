<%-- 
    Document   : PedidosPersonalizados
    Created on : 30-oct-2011, 19:18:45
    Author     : Charlie
--%>

<%@page import="com.cice.model.JB_Usuario"%>
<%@page import="com.cice.model.MenuElegido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Hotel Page</title>
    </head>
    <body>
        <h1>Menu Hotel el Paso. Menu Elegido</h1>
        <table border="1">
            <thead>
                <tr>
                    <td colspan="2">
                        Menu Elegido
                    </td>
                </tr>
            </thead>
            <tbody>
                <%
                    MenuElegido menuElegido = (MenuElegido) request.getAttribute("menuElegido");
                    JB_Usuario usuario = (JB_Usuario) session.getAttribute("usuario");
                %>
                <tr>
                    <td>
                        <label id="lblPrimeros" name="lblPrimeros" >Primero: </label>                                                        
                    </td>                        
                    <td>
                        <%out.print(menuElegido.getPrimero());%>
                    </td>
                </tr>                   
                <tr>
                    <td>
                        <label id="lblSegundos" name="lblSegundos" >Segundo: </label>
                    </td>
                    <td>
                        <%out.print(menuElegido.getSegundo());%>
                    </td>
                </tr>                   
                <tr>
                    <td>
                        <label id="lblPostres" name="lblPostres" >Postre: </label>
                    </td>
                    <td>
                        <%out.print(menuElegido.getPostre());%>
                    </td>
                </tr>                  
                <tr>
                    <td>
                        <label id="lblUsuario" name="lblUsuario" >Usuario: </label>
                    </td>
                    <td>
                        <%out.print(usuario.getNombreUsuario());%>
                    </td>
                </tr> 
                <tr>
                    <td>
                        <label id="lblHabitacion" name="lblHabitacion" >Habitación: </label>
                    </td>
                    <td>
                        <%out.print(usuario.getNumeroHabitacion());%>
                    </td>
                </tr>                  
            </tbody>
        </table>        
    </body>
</html>
