<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>WELCOME FROM FIRST WEB PROJECT </h1>

<form action="addPerson">

<input type="text" name=id><br>
<input type="text" name=name><br>
<input type="text" name=pname><br>
<input type="submit"><br>
</form>

<form  action="byname">

<input type="text" name=name><br>
Search By Name<input type="Submit"> x

</form><br>

<form  action="bypname" >
<input type="text" name=pname><br>
Search By Pname<input type="Submit" >

</form><br>

<form  action="bypnamesorted" >
<input type="text" name=pname><br>
 Search By Pname<input type="Submit">
</form>
</body>