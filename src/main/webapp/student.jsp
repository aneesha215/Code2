<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
<body>
<h1>Student</h1><br>
<h3>Add Student</h3><br>
<form action="Student" method="post">
Student Id
<input type="text" name="CID" ><br>
First Name
<input type="text" name="fName" ><br>
Second Name
<input type="text" name="lName" ><br>
<button type="submit">Add Student</button>
<button type="reset">Reset</button>
</form>
<br>
<a href="Student">Display all Student</a><br>
<a href="addStudentClass.jsp">Add Student to Class</a><br>
</body>
</html>