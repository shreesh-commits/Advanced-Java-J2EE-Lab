import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FactServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("num"));

        int fact = 1;

        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial = " + fact + "</h2>");
        out.println("</body></html>");
    }
}