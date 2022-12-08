package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class MostrarMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu Hotel Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Menu Hotel el Paso</h1>\n");
      out.write("        <br/>\n");
      out.write("        <hr/>\n");
      out.write("        <form name=\"menuDia\" action=\"PedidosPersonalizados.do\" method=\"get\" target=\"\">\n");
      out.write("            <div>\n");
      out.write("                <label id=\"lblMenuDia\" name=\"lblMenudia\">Seleccione el dia:</label>\n");
      out.write("                <select id=\"cmbMenuDia\" name=\"cmbMenuDia\">                    \n");
      out.write("                    <option>lunes normal</option>\n");
      out.write("                    <option>martes normal</option>\n");
      out.write("                    <option>miercoles normal</option>\n");
      out.write("                    <option>jueves normal</option>\n");
      out.write("                    <option>viernes normal</option>\n");
      out.write("                    <option>lunes especial</option>\n");
      out.write("                    <option>martes especial</option>\n");
      out.write("                    <option>miercoles especial</option>\n");
      out.write("                    <option>jueves especial</option>\n");
      out.write("                    <option>viernes especial</option>\n");
      out.write("                </select> \n");
      out.write("                <input id=\"enviar\" name=\"evento\" type=\"submit\" value=\"ConsultarMenu\"/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <hr/>\n");
      out.write("        <form name=\"datosUsuario\" action=\"PedidosPersonalizados.do\" method=\"get\" target=\"\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    ");

                    
      out.write("\n");
      out.write("                </thead>\n");
      out.write("                <tbody>                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
