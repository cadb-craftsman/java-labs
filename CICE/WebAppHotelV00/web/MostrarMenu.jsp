<%-- 
    Document   : index
    Created on : 30-oct-2011, 15:08:32
    Author     : Charlie
--%>

<%@page import="com.whotel.jbeans.JB_Plato"%>
<%@page import="com.whotel.jbeans.JB_MenuPlato"%>
<%@page import="com.whotel.jbeans.JB_MenuDia"%>
<%@page import="com.whotel.jbeans.JB_Menu"%>
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
        <hr/>
        <%
            ArrayList<JB_Menu> menuList = (ArrayList<JB_Menu>) request.getAttribute("menuList");
                if (menuList != null) {
                
        %>
        <form name="menuDia" action="PedidosPersonalizados.do" method="get" target="">
            <div>
                <label id="lblMenuDia" name="lblMenudia">Seleccione el dia:</label>
                <%
                        out.println("<select id=cmbMenuDia name=cmbMenuDia>");
                        for (JB_Menu menu : menuList) {
                            out.println("<option value = " + menu.getMenuID() + " >" + menu.getMenuNombre() + "</option>");
                        }
                        out.println("</select>");            
                %>
                <input id="enviar" name="evento" type="submit" value="ConsultarMenuI"/>
            </div>
        </form>
        <%
                }
        %>
        <%
            ArrayList<JB_MenuDia> menuDiaList = (ArrayList<JB_MenuDia>) request.getAttribute("menuDiaList");
                if (menuDiaList != null) {
        
        %>
        <form name="datosUsuario" action="PedidosPersonalizados.do" method="get" target="">
            <table border="0">
                <thead>
                    <tr>
                        <td>
                            Menu del Dia
                        </td>                        
                    </tr>
                </thead>
                <tbody>  
                    <%
                            boolean pintar0 = true;
                            boolean pintar1 = true;
                            boolean pintar2 = true;
                            System.out.print("menuDiaList: " + menuDiaList.size());
                            for (JB_MenuDia menuDia : menuDiaList) {
                                out.println("<tr>");
                                for (JB_MenuPlato menuPlato : menuDia.getMenuPlatoList()) {

                                    if (menuPlato.getTipoMenu().equals("primero")) {
                                        if (pintar0) {
                                            out.println("<td>");
                                            out.println("<label id=lbl" + menuPlato.getTipoMenu() + " name=lbl" + menuPlato.getTipoMenu() + " >" + menuPlato.getTipoMenu() + ": </label>");
                                            out.println("</td>");
                                        }
                                        for (JB_Plato plato : menuDia.getPlatoList()) {
                                            if (menuPlato.getPlatoID() == plato.getPlatoID()) {

                                                out.println("<td>");
                                                out.println("<input type=radio name=gpo" + menuPlato.getTipoMenu() + " value=" + plato.getPlatoNombre() + ">");
                                                out.println(plato.getPlatoNombre());
                                                out.println("</input>");
                                                out.println("</td>");
                                                pintar0 = false;
                                            }
                                        }
                                        pintar0 = false;
                                    }

                                    if (menuPlato.getTipoMenu().equals("segundo")) {
                                        if (pintar1) {
                                            out.println("<td>");
                                            out.println("<label id=lbl" + menuPlato.getTipoMenu() + " name=lbl" + menuPlato.getTipoMenu() + " >" + menuPlato.getTipoMenu() + ": </label>");
                                            out.println("</td>");
                                        }

                                        for (JB_Plato plato : menuDia.getPlatoList()) {
                                            if (menuPlato.getPlatoID() == plato.getPlatoID()) {

                                                out.println("<td>");
                                                out.print("<input type=radio name=gpo" + menuPlato.getTipoMenu() + " value=" + plato.getPlatoNombre() + ">");
                                                out.print(plato.getPlatoNombre());
                                                out.print("</input>");
                                                out.println("</td>");
                                                pintar1 = false;
                                            }
                                        }
                                        pintar1 = false;
                                    }

                                    if (menuPlato.getTipoMenu().equals("postre")) {
                                        if (pintar2) {
                                            out.println("<td>");
                                            out.println("<label id=lbl" + menuPlato.getTipoMenu() + " name=lbl" + menuPlato.getTipoMenu() + " >" + menuPlato.getTipoMenu() + ": </label>");
                                            out.println("</td>");
                                        }

                                        for (JB_Plato plato : menuDia.getPlatoList()) {
                                            if (menuPlato.getPlatoID() == plato.getPlatoID()) {

                                                out.println("<td>");
                                                out.print("<input type=radio name=gpo" + menuPlato.getTipoMenu() + " value=" + plato.getPlatoNombre() + ">");
                                                out.print(plato.getPlatoNombre());
                                                out.print("</input>");
                                                out.println("</td>");
                                                pintar2 = false;
                                            }
                                        }
                                        pintar2 = false;
                                    }

                                }
                                out.println("</tr>");
                            }
                    %>
                    <tr>
                        <td>
                            <input id="enviar" name="evento" type="submit" value="ConsultarMenuS"/>
                        </td>                    
                    </tr>
                </tbody>
            </table>
        </form>  
    <%
        }   
    %>
    <hr/>                    
    </body>
</html>
