<%-- 
    Document   : index
    Created on : 29-oct-2011, 11:51:13
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Page</title>
    </head>
    <body>
        <h1>Beer Selection Page</h1>
       	<table width="600" border="0">
        <form method="post" action="SelectBeer.do">
          <tr>
            <td colspan="2">Select Beer characteristic</td>
          </tr>
          <tr>
            <td>Color:</td>
            <td>
            <select name="color" size="1">
                <option>light</option>
                <option>amber</option>
                <option>brown</option>
                <option>dark</option>
            </select>
			</td>
          </tr>
          <tr>
            <td colspan="2"><input type="submit" name="send"/></td>
          </tr>
          </form>
       </table>        
    </body>
</html>

