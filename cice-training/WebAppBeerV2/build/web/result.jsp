<%-- 
    Document   : result
    Created on : 29-oct-2011, 12:20:57
    Author     : cice
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Page Result</title>
    </head>
    <body>
        <h1>Beer Recomendations JSP</h1>
        <p>
           <%
                List list = (List) request.getAttribute("styles");
                for(int i = 0; i < list.size(); i++){
                    out.print("<br>try: " + list.get(i) + "</br>" );
                }
            %>
        </p>
    </body>
</html>
