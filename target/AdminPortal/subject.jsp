<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subject</title>
</head>
<body>
<h1>Subject</h1><br>
<h3>Add Subject</h3><br>

<form action="Subject" method="post">
Subject ID
<input type="text" name="CID" ><br>
Subject Name
<input type="text" name="sName" ><br>

<button type="submit">Add Subject</button>
<button type="reset">Reset</button>
</form>
<br>
<a href="Subject">Display all Subjects</a><br>
<a href="mapClassSub.jsp">Add Subject to Class</a><br>
</body>
</html>