<html>
<head>
<script>
function validate()
{
 var u=document.forms["f"]["uname"].value;
 var e=document.forms["f"]["email"].value;
 var d=document.forms["f"]["desig"].value;

 if(u=="" || e=="" || d=="")
 {
   alert("Fill all fields");
   return false;
 }
 return true;
}
</script>
</head>

<body>

<form name="f"
action="UserDataServlet"
onsubmit="return validate()">

Username:
<input type="text" name="uname"><br><br>

Email:
<input type="text" name="email"><br><br>

Designation:
<input type="text" name="desig"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>