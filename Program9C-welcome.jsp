<%
String name = request.getParameter("uname");
String t = request.getParameter("time");

if(name != null && t != null)
{
    int min = Integer.parseInt(t);

    session.setAttribute("username", name);

    session.setMaxInactiveInterval(min * 60);
}

String uname =
(String)session.getAttribute("username");
%>

<html>
<body>

<h2>Hello <%= uname %> !</h2>

<h3>Session Active</h3>

<a href="welcome.jsp">
Check Session Again
</a>

</body>
</html>