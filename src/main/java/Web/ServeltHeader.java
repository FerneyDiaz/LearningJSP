package Web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferney
 */
@WebServlet("/ServeltHeaders")
public class ServeltHeader extends HttpServlet{
    
    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = httpServletResponse.getWriter();
        String httpMethod = httpServletRequest.getMethod();
        String uri = httpServletRequest.getRequestURI();
        printWriter.print("<html>");
        printWriter.print("<head>");
        printWriter.print("<title>Headers HTTP</title>");
        printWriter.print("</head>");
        printWriter.print("<body>");
        printWriter.print("<h1>Header HTTP</h1>");
        printWriter.print("Metodo HTTP: " + httpMethod + "</br>");
        printWriter.print("URI: " + uri + "</br>");
        //Imprimir todos los cabeceros
        Enumeration headers = httpServletRequest.getHeaderNames();
        while (headers.hasMoreElements()) {            
            String headerName = (String) headers.nextElement();
            printWriter.print("<b>" +headerName+ "</b>");
            printWriter.print(httpServletRequest.getHeader(headerName)+"</br></br>");
        }
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }
}
