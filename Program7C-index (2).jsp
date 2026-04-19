<%@ page import="javax.servlet.http.Cookie" %>

<html>
<body>
<h2>Active Cookie List</h2>

<%
Cookie cookies[] = request.getCookies();

if(cookies != null)
{
    for(Cookie c : cookies)
    {
%>

Name: <%= c.getName() %>
Value: <%= c.getValue() %><br><br>

<%
    }
}
else
{
    out.println("No Cookies Found");
}
%>

</body>
</html>