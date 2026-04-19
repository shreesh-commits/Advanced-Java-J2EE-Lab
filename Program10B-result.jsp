<html>
<body>

<h2>Student Result</h2>

Roll No: <%= request.getAttribute("roll") %><br><br>

Name: <%= request.getAttribute("name") %><br><br>

Sub1: <%= request.getAttribute("a") %><br>
Sub2: <%= request.getAttribute("b") %><br>
Sub3: <%= request.getAttribute("c") %><br>
Sub4: <%= request.getAttribute("d") %><br>
Sub5: <%= request.getAttribute("e") %><br><br>

Average:
<%= request.getAttribute("avg") %><br><br>

Result:
<%= request.getAttribute("res") %><br><br>

<a href="index.jsp">Go Back</a>

</body>
</html>