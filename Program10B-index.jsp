<html>
<head>
<script>
function validate()
{
 var x=document.forms["f"];

 for(i=0;i<x.length-1;i++)
 {
   if(x[i].value=="")
   {
     alert("Fill all fields");
     return false;
   }
 }
 return true;
}
</script>
</head>

<body>

<form name="f"
action="ResultServlet"
onsubmit="return validate()">

Roll No:
<input type="text" name="roll"><br><br>

Student Name:
<input type="text" name="name"><br><br>

Sub1:
<input type="text" name="s1"><br><br>

Sub2:
<input type="text" name="s2"><br><br>

Sub3:
<input type="text" name="s3"><br><br>

Sub4:
<input type="text" name="s4"><br><br>

Sub5:
<input type="text" name="s5"><br><br>

<input type="submit" value="Show Result">

</form>

</body>
</html>