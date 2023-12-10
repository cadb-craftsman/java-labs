<%-- 
    Document   : index
    Created on : 30-oct-2011, 15:08:32
    Author     : Charlie
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <c:if test="${menuList != null}">
            <form name="menuDia" action="PedidosPersonalizados.do" method="get" target="">
                <div>
                    <label id="lblMenuDia" name="lblMenudia">Seleccione el dia:</label>
                    <select id=cmbMenuDia name=cmbMenuDia>                    
                        <c:forEach var="menu" items="${menuList}">
                            <option value = "${menu.menuID}">
                                ${menu.menuNombre}                          
                            </option>                                               
                        </c:forEach>
                    </select>
                    <input id="enviar" name="evento" type="submit" value="ConsultarMenuI"/>
                </div>
            </form>                        
        </c:if>        
        <c:if test="${menuDiaList != null}">
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
                        <c:forEach var="menuDia" items="${menuDiaList}">
                            <tr>                                
                                <c:forEach var="menuPlato" items="${menuDia.menuPlatoList}">
                                    <c:if test="${menuPlato.tipoMenu == 'primero'}">                                        
                                        <td>
                                            <label id="lbl+${menuPlato.tipoMenu}" name="lbl+${menuPlato.tipoMenu}">
                                                ${menuPlato.tipoMenu}
                                            </label>
                                        </td>
                                        <c:forEach var="plato" items="${menuDia.platoList}">
                                            <c:if test="${menuPlato.platoID == plato.platoID}">
                                                <td>
                                                    <input type="radio" name="gpo+${menuPlato.tipoMenu}" value="${plato.platoNombre}">
                                                    ${plato.platoNombre}
                                                    </input>
                                                </td>
                                            </c:if>
                                        </c:forEach>                                        
                                    </c:if>
                                    <c:if test="${menuPlato.tipoMenu == 'segundo'}">                                        
                                        <td>
                                            <label id="lbl+${menuPlato.tipoMenu}" name="lbl+${menuPlato.tipoMenu}">
                                                ${menuPlato.tipoMenu}
                                            </label>
                                        </td>
                                        <c:forEach var="plato" items="${menuDia.platoList}">
                                            <c:if test="${menuPlato.platoID == plato.platoID}">
                                                <td>
                                                    <input type="radio" name="gpo+${menuPlato.tipoMenu}" value="${plato.platoNombre}">
                                                    ${plato.platoNombre}
                                                    </input>
                                                </td>
                                            </c:if>
                                        </c:forEach>                                        
                                    </c:if>
                                    <c:if test="${menuPlato.tipoMenu == 'postre'}">                                        
                                        <td>
                                            <label id="lbl+${menuPlato.tipoMenu}" name="lbl+${menuPlato.tipoMenu}">
                                                ${menuPlato.tipoMenu}
                                            </label>
                                        </td>
                                        <c:forEach var="plato" items="${menuDia.platoList}">
                                            <c:if test="${menuPlato.platoID == plato.platoID}">
                                                <td>
                                                    <input type="radio" name="gpo+${menuPlato.tipoMenu}" value="${plato.platoNombre}">
                                                    ${plato.platoNombre}
                                                    </input>
                                                </td>
                                            </c:if>
                                        </c:forEach>                                        
                                    </c:if>                                                
                                </c:forEach>                                
                            </tr>                            
                        </c:forEach>
                        <tr>
                            <td>
                                <input id="enviar" name="evento" type="submit" value="ConsultarMenuS"/>
                            </td>                    
                        </tr>
                    </tbody>
                </table>
            </form>  
        </c:if>                    
        <hr/>                    
    </body>
</html>