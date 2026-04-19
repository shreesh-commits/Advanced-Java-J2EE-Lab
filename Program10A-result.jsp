<html>
<body>

<h2>User Details</h2>

Username:
<%= request.getAttribute("uname") %><br><br>

Email:
<%= request.getAttribute("email") %><br><br>

Designation:
<%= request.getAttribute("desig") %><br><br>

<a href="index.jsp">Go Back</a>

</body>
</html>