package servlets;

import java.io.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import db.ConexionDB;

public class Productos extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String subcategoria = request.getParameter("secciones");

        Statement st = null;
        ResultSet rs = null;
        try {
            // creo una conexion
            ConexionDB con = new ConexionDB();

            st = con.getConnection().createStatement();
            //busca los productos asociados a la seccion
            String tsql = "select * from productos ";
            tsql += "where idSubcategoria=" + subcategoria;
            rs = st.executeQuery(tsql);
            StringBuilder objProductos;
            //crea un array de objetos JSON con cada producto de la tabla
            objProductos = new StringBuilder("[");
            while (rs.next()) {
                objProductos.append("{'producto':'");
                objProductos.append(rs.getString("producto"));
                objProductos.append("','descripcion':'");
                objProductos.append(rs.getString("descripcion"));
                objProductos.append("','precio':");
                objProductos.append(rs.getString("precio"));
                objProductos.append("},");
            }
            //sustituye la ultima coma por el caracter de cierre del array
            objProductos.replace(objProductos.length() - 1, objProductos.length(), "]");
            out.println(objProductos.toString());
        } catch (Exception e) {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }
        out.close();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
