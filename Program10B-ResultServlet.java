import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet
{
 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException
 {
   String roll=request.getParameter("roll");
   String name=request.getParameter("name");

   int a=Integer.parseInt(request.getParameter("s1"));
   int b=Integer.parseInt(request.getParameter("s2"));
   int c=Integer.parseInt(request.getParameter("s3"));
   int d=Integer.parseInt(request.getParameter("s4"));
   int e=Integer.parseInt(request.getParameter("s5"));

   double avg=(a+b+c+d+e)/5.0;

   String result="Pass";

   if(a<40 || b<40 || c<40 || d<40 || e<40)
      result="Fail";

   request.setAttribute("roll",roll);
   request.setAttribute("name",name);
   request.setAttribute("a",a);
   request.setAttribute("b",b);
   request.setAttribute("c",c);
   request.setAttribute("d",d);
   request.setAttribute("e",e);
   request.setAttribute("avg",avg);
   request.setAttribute("res",result);

   RequestDispatcher rd=
   request.getRequestDispatcher("result.jsp");

   rd.forward(request,response);
 }
}