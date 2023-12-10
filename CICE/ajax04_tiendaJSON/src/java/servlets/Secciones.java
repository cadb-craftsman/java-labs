package servlets;

import java.io.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import db.ConexionDB;

public class Secciones extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Statement st = null;
        ResultSet rs = null;

        try {
            // creo una conexion
            ConexionDB con = new ConexionDB();

            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from subcategorias");
            
            StringBuilder objSecciones;
            //crea un array de objetos JSON con cada seccion de la tabla
            objSecciones = new StringBuilder("[");
            while (rs.next()) {
                objSecciones.append("{'id':");
                objSecciones.append(rs.getString("idSubcategoria"));
                objSecciones.append(",'nombre':'");
                objSecciones.append(rs.getString("subcategoria"));
                objSecciones.append("'},");
            }
            //sustituye la ultima coma por el caracter de cierre del array
            objSecciones.replace(objSecciones.length() - 1, objSecciones.length(), "]");
            out.println(objSecciones.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.close();
    }
}
