<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Map Subject Class</title>
</head>
<body>
<a href="Home.jsp">Home</a><br>
<h1>Add Subject to Class</h1><br>
<form action="MapClassSubject" method="post">
Enter Class ID
<input type="text" name="CID" ><br>
Enter Subject ID
<input type="text" name="SID" ><br>
<button type="submit">Add Subject to Class</button>
<button type="reset">Reset</button>
</form>
<br>
<a href="ClassTable.jsp">Display Class</a><br>
<a href="StudentsTable.jsp">Display Students</a><br>
</body>
</html>