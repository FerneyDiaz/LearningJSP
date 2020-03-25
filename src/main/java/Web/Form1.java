package Web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferney
 */
@WebServlet("/Form1")
public class Form1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = httpServletResponse.getWriter();
        
        String user = httpServletRequest.getParameter("txtUser");
        String pass = httpServletRequest.getParameter("txtPassword");
        String [] webTechnologies = httpServletRequest.getParameterValues("technology");
        String gender = httpServletRequest.getParameter("gender");
        String occupation = httpServletRequest.getParameter("slcOccupation");
        String []genreMusic = httpServletRequest.getParameterValues("slcMusic");
        String comment = httpServletRequest.getParameter("txaComment");
        
        printWriter.print("<html>");
        printWriter.print("<head>");
        printWriter.print("<title>Response servlet</title>");
        printWriter.print("</head>");
        printWriter.print("<body>");
        printWriter.print("<h1>Parametros procesados por el servlet</h1>");
        printWriter.print("<table border='1'>");
        printWriter.print("<tr><td><label>User: </label></td><td>" + user + "</td></tr>");
        printWriter.print("<tr><td><label>Password: </label></td><td>" + pass + "</td></tr>");
        printWriter.print("<tr><td><label>Web technologies: </label></td><td>");
        for (int i = 0; i < webTechnologies.length; i++) {
            printWriter.print(webTechnologies[i] + "</br>");
        }        
        printWriter.print("</td></tr>");
        printWriter.print("<tr><td><label>Gender: </label></td><td>" + gender + "</td></tr>");
        printWriter.print("<tr><td><label>Occupation: </label></td><td>" + occupation + "</td></tr>");
        printWriter.print("<tr><td><label>Genre music: </label></td><td>");
        if(genreMusic != null){
        for (int i = 0; i < genreMusic.length; i++) {
            printWriter.print(genreMusic[i] + "</br>");
        }
        }
        printWriter.print("</td></tr>");
        printWriter.print("<tr><td><label>Comment: </label></td><td>");
        if (comment != null) {
            printWriter.print(comment);
        }
        printWriter.print("</td></tr>");
        printWriter.print("</table>");
        printWriter.print("</body>");
        printWriter.print("</html>");       
    }

}