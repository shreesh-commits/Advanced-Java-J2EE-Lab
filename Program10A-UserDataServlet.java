import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet
{
 public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException
 {
   doGet(request,response);
 }

 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException
 {
   String u=request.getParameter("uname");
   String e=request.getParameter("email");
   String d=request.getParameter("desig");

   if(u.equals("") || e.equals("") || d.equals(""))
   {
     response.sendRedirect("index.jsp");
   }
   else
   {
     request.setAttribute("uname",u);
     request.setAttribute("email",e);
     request.setAttribute("desig",d);

     RequestDispatcher rd=
     request.getRequestDispatcher("result.jsp");

     rd.forward(request,response);
   }
 }
}