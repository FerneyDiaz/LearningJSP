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
@WebServlet("/StatusCode")
public class StatusCode extends HttpServlet{
    
    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws java.io.IOException
     */
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        String userSuccess = "Ferney";
        String passwordSuccess = "123";
        
        String user = httpServletRequest.getParameter("txtUser");
        String pass = httpServletRequest.getParameter("txtPass");
        
        PrintWriter printWriter = httpServletResponse.getWriter();
        
        if (userSuccess.equalsIgnoreCase(user) && passwordSuccess.equalsIgnoreCase(pass)) {
            printWriter.print("<h1>Correct data <br/>User:" + user + "<br/>Password: " + pass + "</h1>");
            
        }else{
            httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Access data wrong");
        }
        printWriter.close();
    }
}
