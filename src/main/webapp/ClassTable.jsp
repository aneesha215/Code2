<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bean.Class"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ClassTable</title>
</head>
<body>
<a href="Home.jsp">Home</a>
<a href="class.jsp">Class</a>
<h1>Class Table</h1>
<table>
<tr>
 <th> CID</th>
 <th>Class Name</th>
</tr>

<%
 Object obj=session.getAttribute("listOfClass");
 if(obj!=null)
 {
	 List<Class> Classes= (List<Class>)obj;
	 
	 for(Class cls : Classes)
	 {
		 %>
		<tr>
			<td><%=cls.getSID()%></td>
			<td><%=cls.getcName()%></td>
		</tr>
	<%
	}			 
 }

%>

</table>
</body>
</html>