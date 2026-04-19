import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("num"));
        int count = 0;

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                count++;
        }

        out.println("<html><body>");

        if(count==2)
            out.println("<h2>" + n + " is Prime Number</h2>");
        else
            out.println("<h2>" + n + " is Not Prime Number</h2>");

        out.println("</body></html>");
    }
}