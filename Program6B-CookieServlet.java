import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        Cookie c = new Cookie("username", name);
        response.addCookie(c);

        out.println("<html><body>");
        out.println("<h2>Cookie Created for " + name + "</h2>");
        out.println("</body></html>");
    }
}