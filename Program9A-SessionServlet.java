import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        session.setMaxInactiveInterval(60);

        Integer count =
        (Integer)session.getAttribute("count");

        if(count == null)
            count = 1;
        else
            count++;

        session.setAttribute("count", count);

        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Creation Time: " +
         new Date(session.getCreationTime()) + "<br>");
        out.println("Last Access Time: " +
         new Date(session.getLastAccessedTime()) + "<br>");
        out.println("Visit Count: " + count);
        out.println("</body></html>");
    }
}