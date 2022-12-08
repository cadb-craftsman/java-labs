package control;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Comentariolibro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        String[] comentarios = {"En esta espectacular novela, los dinosaurios vuelven a conquistar la Tierra. En una isla remota, un grupo de hombres y mujeres emprende una carrera contra el tiempo para evitar un desastre mundial provocado por la desmedida ambici�n de comercializar la ingenier�a gen�tica. Pero todos los esfuerzos resultar�n vanos cuando el inescrupuloso proyecto quede fuera de control y el mundo a merced de unas bestias monstruosas...",
            "Al cabo de unos cinco a�os, un grupo de amigos se re�ne en El �ltimo Hogar mientras vientos de guerra asolan el mundo en el que viven. Un arma m�gica de incre�ble poder caer� en las manos de estos amigos y los obligar� a emprender una larga aventura que decidir� el destino de Krynn, su mundo. As� comienzan las Cr�nicas de la Dragonlance, la primera trilog�a de fantas�a �pica escrita por Weis y Hickman, que se ha convertido en referencia para todas las obras posteriores de este g�nero.",
            "Perdido en la Barcelona preol�mpica, el extraterrestre Gurb pone al servicio de su supervivencia la extra�a cualidad de adoptar el aspecto que le plazca. Se pierde con la apariencia de Marta S�nchez, mientras su compa�ero alien�gena inicia su b�squeda en la jungla urbana. Por su diario personal vamos conociendo las incre�bles peripecias de un extraterrestre en Barcelona. En este relato de car�cter par�dico y sat�rico la invenci�n de Eduardo Mendoza convierte la Barcelona cotidiana y absurda en el escenario de una carnavalada. Tras las m�scaras pintarrajeadas y grotesdecas se revela el verdadero rostro del hombre urbano actual y, tras el estilo literario, la acerada conciencia art�stica del escritor.",
            "Tiene entre sus manos la publicaci�n m�s importante del detective en cuatro d�cadas, editada por una de las autoridades sherlockianas m�s destacadas del mundo, Leslie S. Klinger �un libro que atraer� a todo lector y amante de la buena literatura�. Los que no conozcan al famoso detective apreciar�n la clara presentaci�n de Klinger de las renombradas historias en el orden original de publicaci�n, mientras que los sherlockianos experimentados se ver�n cautivados con las m�s de 1.000 anotaciones, cuidadosamente investigadas, para presentar la informaci�n hist�rica sobre la Inglaterra victoriana, al igual que explicaciones de las teor�as sherlockianas imperantes. El presente volumen, dentro de una serie de tres vol�menes, contiene los relatos publicados desde 1891 a 1893 y m�s tarde recogidos en forma de libro como 'Las aventuras de Sherlock Holmes' y 'Las memorias de Sherlock Holmes'."};
        int seleccionado = Integer.parseInt(request.getParameter("producto"));
        out.println(comentarios[seleccionado]);
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Descripcion corta";
    }
}
