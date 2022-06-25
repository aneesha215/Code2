<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher</title>
</head>
<body>
<h1>Teacher</h1><br>
<h3>Add Teacher</h3><br>
<form action="Teacher" method="post">
Teacher ID
<input type="text" name="CID" ><br>
First Name
<input type="text" name="fName" ><br>
Second Name
<input type="text" name="lName" ><br>
<button type="submit">Add Teacher</button>
<button type="reset">Reset</button>
</form>
<br>
<a href="Teacher">Display all Teacher</a>
<a href="mapTeacherSubjectClass.jsp">Create Teacher Mapping</a>
</body>
</html>