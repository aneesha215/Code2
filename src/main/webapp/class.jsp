<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Class</h1><br>
<h3>Add Class</h3><br>
<form action="Class" method="post">
Class ID
<input type="text" name="CID" ><br>
Class Name
<input type="text" name="cName" ><br>
<button type="submit">Add Class</button>
<button type="reset">reset</button>
</form>
<br>
<br>
<a href="Class">Display all Class</a><br>
<a href="mapClassSub.jsp">Add Subject to Class</a><br>
<a href="addStudentClass.jsp">Add Student to Class</a><br>
</body>
</html>