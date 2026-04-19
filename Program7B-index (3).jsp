<%@ page import="javax.servlet.http.Cookie" %>

<%
String name = request.getParameter("cname");
String domain = request.getParameter("domain");
int age = Integer.parseInt(request.getParameter("age"));

Cookie c = new Cookie(name, "Active");

c.setDomain(domain);
c.setMaxAge(age);

response.addCookie(c);
%>

<html>
<body>
<h2>Cookie Added Successfully</h2>

Name: <%= name %><br>
Domain: <%= domain %><br>
Max Age: <%= age %> seconds<br><br>

<a href="showcookies.jsp">Go to Active Cookie List</a>
</body>
</html>