package control;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TitulosLibro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String[] titulos = {"Parque Jurásico (Michael Crichton)",
            "Crónicas de la Dragonlance (Margaret Weis, Tracy Hickman)",
            "Sin noticias de Gurb (Eduardo Mendoza)",
            "Sherlock Holmes anotado (Arthur Conan Doyle)"};
        String textoXML = "<?xml version='1.0'?>";
        textoXML += "<listado>";
        for (int i = 0; i < titulos.length; i++) {
            textoXML += "<libro><titulo>" + titulos[i] + "</titulo>";
            textoXML += "<orden>" + i + "</orden></libro>";
        }
        textoXML += "</listado>";
        out.println(textoXML);
        out.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
