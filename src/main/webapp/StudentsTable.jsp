<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.bean.Student"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="Home.jsp">Home</a><br>
<a href="student.jsp">Student</a><br>

<h1>Student Table</h1>
<table>
<tr>
 <th> SID</th>
 <th>First Name</th>
 <th>Last Name</th>
</tr>

<%
 Object obj=session.getAttribute("listOfStudent");
 if(obj!=null)
 {
	 List<Student> students= (List<Student>)obj;
	 
	 for(Student std : students)
	 {
		 %>
		<tr>
			<td><%=std.getSID()%></td>
			<td><%=std.getfName()%></td>
			<td><%=std.getlName()%></td>
		</tr>
	<%
	}			 
 }
 
%>

</table>
</body>
</html>