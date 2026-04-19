<%@ page language="java" %>
<%
session.setMaxInactiveInterval(60);

String name = request.getParameter("uname");

if(name != null)
{
    session.setAttribute("username", name);
}

String uname = (String)session.getAttribute("username");
%>

<html>
<body>
<h2>Hello <%= uname %> !</h2>
<h3>Session expires in 1 minute</h3>
<a href="welcome.jsp">Check Session Again</a>
</body>
</html>