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
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        //Read post parameters
        String user = httpServletRequest.getParameter("txtUser");
        String pass = httpServletRequest.getParameter("txtPassword");
        System.out.println("User: " + user + "\n" +
                "Password: "+ pass);
        PrintWriter printWriter = httpServletResponse.getWriter(); 
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("El parametro de usuario es: " + user);
        printWriter.print("<br/>");
        printWriter.print("El parametro de password es: " + pass);
        printWriter.print("</body>");
        printWriter.print("</html>");
        
    }
}
