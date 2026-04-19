import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieListServlet")
public class CookieListServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        int count = 1;

        Cookie cookies[] = request.getCookies();

        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                if(c.getName().equals("visitCount"))
                {
                    count = Integer.parseInt(c.getValue());
                    count++;
                }
            }
        }

        Cookie c1 = new Cookie("username", name);
        Cookie c2 = new Cookie("visitCount", String.valueOf(count));

        c1.setMaxAge(60);
        c2.setMaxAge(60);

        response.addCookie(c1);
        response.addCookie(c2);

        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + " !</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");
        out.println("<h4>Cookie expiry set to 60 sec</h4>");

        out.println("<h3>Cookie List:</h3>");

        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                out.println(c.getName() + "<br>");
            }
        }

        out.println("</body></html>");
    }
}