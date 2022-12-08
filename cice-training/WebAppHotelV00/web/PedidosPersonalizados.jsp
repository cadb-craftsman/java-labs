<%-- 
    Document   : PedidosPersonalizados
    Created on : 30-oct-2011, 19:18:45
    Author     : Charlie
--%>




<%@page import="com.whotel.jbeans.JB_MenuElegido"%>
<%@page import="com.whotel.jbeans.JB_Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Hotel Page</title>
    </head>
    <body>
        <h1>Menu Hotel el Paso</h1>
        <hr/>
        <table border="1">
            <thead>
                <tr>
                    <td colspan="2">
                        <h3>Menu Elegido</h3>
                    </td>
                </tr>
            </thead>
            <tbody>
                <%
                    JB_MenuElegido menuElegido = (JB_MenuElegido) request.getAttribute("menuElegido");
                    JB_Usuario usuario = (JB_Usuario) session.getAttribute("usuario");
                %>
                <tr>
                    <td>
                        <label id="lblPrimeros" name="lblPrimeros" >Primero: </label>                                                        
                    </td>                        
                    <td>
                        <%=(menuElegido.getPrimero())%>
                    </td>
                </tr>                   
                <tr>
                    <td>
                        <label id="lblSegundos" name="lblSegundos" >Segundo: </label>
                    </td>
                    <td>
                        <%=(menuElegido.getSegundo())%>
                    </td>
                </tr>                   
                <tr>
                    <td>
                        <label id="lblPostres" name="lblPostres" >Postre: </label>
                    </td>
                    <td>
                        <%=(menuElegido.getPostre())%>
                    </td>
                </tr>                  
                <tr>
                    <td>
                        <label id="lblUsuario" name="lblUsuario" >Usuario: </label>
                    </td>
                    <td>
                        <%=(usuario.getNombreUsuario())%>
                    </td>
                </tr> 
                <tr>
                    <td>
                        <label id="lblHabitacion" name="lblHabitacion" >Habitación: </label>
                    </td>
                    <td>
                        <%=(usuario.getNumeroHabitacion())%>
                    </td>
                </tr>                  
            </tbody>
        </table>
       <hr/>
    </body>
</html>
