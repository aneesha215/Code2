<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="Home.jsp"> Home </a><br>

<h1> MAP </h1>
<form action="MapTSC" method="post">
Enter Class ID
<input type="text" name="CID" ><br>
Enter Subject ID
<input type="text" name="SID" ><br>
Enter Teacher ID
<input type="text" name="TID" ><br>
<button type="submit">create Mapping</button>
<button type="reset">Reset</button>
</form>
<br>
<a href="ClassTable.jsp">Display Class</a><br>
<a href="StudentsTable.jsp">Display Students</a><br>
</body>
</html>