package control;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Comentariolibro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        String[] comentarios = {"En esta espectacular novela, los dinosaurios vuelven a conquistar la Tierra. En una isla remota, un grupo de hombres y mujeres emprende una carrera contra el tiempo para evitar un desastre mundial provocado por la desmedida ambición de comercializar la ingeniería genética. Pero todos los esfuerzos resultarán vanos cuando el inescrupuloso proyecto quede fuera de control y el mundo a merced de unas bestias monstruosas...",
            "Al cabo de unos cinco años, un grupo de amigos se reúne en El Último Hogar mientras vientos de guerra asolan el mundo en el que viven. Un arma mágica de increíble poder caerá en las manos de estos amigos y los obligará a emprender una larga aventura que decidirá el destino de Krynn, su mundo. Así comienzan las Crónicas de la Dragonlance, la primera trilogía de fantasía épica escrita por Weis y Hickman, que se ha convertido en referencia para todas las obras posteriores de este género.",
            "Perdido en la Barcelona preolímpica, el extraterrestre Gurb pone al servicio de su supervivencia la extraña cualidad de adoptar el aspecto que le plazca. Se pierde con la apariencia de Marta Sánchez, mientras su compañero alienígena inicia su búsqueda en la jungla urbana. Por su diario personal vamos conociendo las increíbles peripecias de un extraterrestre en Barcelona. En este relato de carácter paródico y satírico la invención de Eduardo Mendoza convierte la Barcelona cotidiana y absurda en el escenario de una carnavalada. Tras las máscaras pintarrajeadas y grotesdecas se revela el verdadero rostro del hombre urbano actual y, tras el estilo literario, la acerada conciencia artística del escritor.",
            "Tiene entre sus manos la publicación más importante del detective en cuatro décadas, editada por una de las autoridades sherlockianas más destacadas del mundo, Leslie S. Klinger –un libro que atraerá a todo lector y amante de la buena literatura–. Los que no conozcan al famoso detective apreciarán la clara presentación de Klinger de las renombradas historias en el orden original de publicación, mientras que los sherlockianos experimentados se verán cautivados con las más de 1.000 anotaciones, cuidadosamente investigadas, para presentar la información histórica sobre la Inglaterra victoriana, al igual que explicaciones de las teorías sherlockianas imperantes. El presente volumen, dentro de una serie de tres volúmenes, contiene los relatos publicados desde 1891 a 1893 y más tarde recogidos en forma de libro como 'Las aventuras de Sherlock Holmes' y 'Las memorias de Sherlock Holmes'."};
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
