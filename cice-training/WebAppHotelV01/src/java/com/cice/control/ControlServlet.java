/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.control;

import com.whotel.jbeans.JB_Menu;
import com.whotel.jbeans.JB_MenuDia;
import com.whotel.jbeans.JB_MenuElegido;
import com.whotel.jbeans.JB_Usuario;
import com.whotel.negocio.GestionWHotel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Charlie
 */
public class ControlServlet extends HttpServlet {

    HttpSession session = null;

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher view = null;
        PrintWriter out = response.getWriter();
        try {

            session = request.getSession();
            if (session.isNew()) {
                String usr = request.getParameter("txtUsuario");
                String habitacion = request.getParameter("txtHabitacion");
                JB_Usuario usuario = new JB_Usuario(usr, habitacion);
                session.setAttribute("usuario", usuario);
            } else {
                JB_Usuario usuario = (JB_Usuario) session.getAttribute("usuario");
                session.setAttribute("usuario", usuario);
            }

            String evento = request.getParameter("evento");
            if (evento.equals("ConsultarMenu")) {
                
                ArrayList<JB_Menu> menuList = GestionWHotel.getInstance().getMenu();
                request.setAttribute("menuList", menuList);
                view = request.getRequestDispatcher("MostrarMenu.jsp");

            } else if (evento.equals("ConsultarMenuI")) {

                    String menuDia = request.getParameter("cmbMenuDia");
                    int menuID = Integer.parseInt(menuDia);                    
                    ArrayList<JB_MenuDia> menuDiaList = GestionWHotel.getInstance().getMenuDia(menuID);
                    request.setAttribute("menuDiaList", menuDiaList);
                    view = request.getRequestDispatcher("MostrarMenu.jsp");

                } else if (evento.equals("ConsultarMenuS")) {

                    String nPrimero = request.getParameter("gpoprimero");
                    String nSegundo = request.getParameter("gposegundo");
                    String nPostre = request.getParameter("gpopostre");
                    JB_MenuElegido menuElegido = new JB_MenuElegido(nPrimero, nSegundo, nPostre);
                    request.setAttribute("menuElegido", menuElegido);
                    view = request.getRequestDispatcher("PedidosPersonalizados.jsp");

                }

                view.forward(request, response);
            }  finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
