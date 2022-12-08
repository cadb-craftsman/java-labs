<%-- 
    Document   : index
    Created on : 30-oct-2011, 15:08:32
    Author     : Charlie
--%>

<%@page import="com.cice.model.MenuDia"%>
<%@page import="com.cice.model.JB_Platillos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Hotel Page</title>
    </head>
    <body>
        <h1>Menu Hotel el Paso</h1>
        <form name="datosUsuario" action="PedidosPersonalizados.do" method="get" target="">
            <table border="1">
                <thead>
                    <tr>
                        <td colspan="4">
                            Menu del Dia
                        </td>
                    </tr>
                </thead>
                <tbody>
                    <%
                        MenuDia menuDia = (MenuDia) request.getAttribute("menuDia");
                        JB_Platillos platillos = menuDia.getMenuDia().get(0);
                        String[] primeros = platillos.getPrimeros();
                        String[] segundos = platillos.getSegundos();
                        String[] postres = platillos.getPostres();
                    %>
                    <tr>
                        <td>
                            <label id="lblPrimeros" name="lblPrimeros" >Primeros: </label>                                                        
                        </td>                        
                        <td>
                            <input type="radio" name="gpoPrimeros" value="<%out.print(primeros[0]);%>"> <%out.print(primeros[0]);%> </input>
                        </td>
                        <td>
                            <input type="radio" name="gpoPrimeros" value="<%out.print(primeros[1]);%>"> <%out.print(primeros[1]);%> </input>
                        </td>
                        <td>
                            <input type="radio" name="gpoPrimeros" value="<%out.print(primeros[2]);%>"> <%out.print(primeros[2]);%> </input>
                        </td>                        
                    </tr>                   
                    <tr>
                        <td>
                            <label id="lblSegundos" name="lblSegundos" >Segundos: </label>
                        </td>
                        <td>
                            <input type="radio" name="gpoSegundos" value="<%out.print(segundos[0]);%>"> <%out.print(segundos[0]);%> </input>
                        </td>
                        <td>
                            <input type="radio" name="gpoSegundos" value="<%out.print(segundos[1]);%>"> <%out.print(segundos[1]);%> </input>
                        </td>
                        <td>
                            <input type="radio" name="gpoSegundos" value="<%out.print(segundos[2]);%>"> <%out.print(segundos[2]);%> </input>
                        </td>                                                
                    </tr>                   
                    <tr>
                        <td>
                            <label id="lblPostres" name="lblPostres" >Postres: </label>
                        </td>
                        <td>
                            <input type="radio" name="gpoPostres" value="<%out.print(postres[0]);%>"> <%out.print(postres[0]);%> </input>
                        </td>
                        <td>
                            <input type="radio" name="gpoPostres" value="<%out.print(postres[1]);%>"> <%out.print(postres[1]);%> </input>
                        </td>
                        <td>
                            <input type="radio" name="gpoPostres" value="<%out.print(postres[2]);%>"> <%out.print(postres[2]);%> </input>
                        </td>                          
                    </tr>                  
                    <tr>
                        <td colspan="4">
                            <input id="enviar" name="evento" type="submit" value="ConsultarPedido"/>
                        </td>
                    </tr>                   
                </tbody>
            </table>
        </form>    
    </body>
</html>
