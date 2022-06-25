<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.bean.Teacher"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="Home.jsp">Home</a>
<a href="teacher.jsp">Teacher</a>
<h1>Teacher Table</h1>
<table>
<tr>
 <th> TID</th>
 <th>First Name</th>
 <th>Last Name</th>
</tr>

<%
 Object obj=session.getAttribute("listOfTeacher");
 if(obj!=null)
 {
	 List<Teacher> teachers= (List<Teacher>)obj;
	 
	 for(Teacher tch : teachers)
	 {
		 %>
		<tr>
			<td><%=tch.getTID()%></td>
			<td><%=tch.getfName()%></td>
			<td><%=tch.getlName()%></td>
		</tr>
	<%
	}			 
 }
 
%>

</table>
</body>
</html>