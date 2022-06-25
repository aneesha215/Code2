<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.bean.Subject"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subject Table</title>
</head>
<body>
<a href="Home.jsp">Home</a>
<a href="Subject.jsp">Subject</a>
<h1>Subject Table</h1>
<table>
<tr>
 <th> CID</th>
 <th>Class Name</th>
</tr>

<%
 Object obj=session.getAttribute("listOfSubject");
 if(obj!=null)
 {
	 List<Subject> subjects= (List<Subject>)obj;
	 
	 for(Subject sub : subjects)
	 {
		 %>
		<tr>
			<td><%=sub.getSID()%></td>
			<td><%=sub.getsName()%></td>
		</tr>
	<%
	}			 
 }
 
%>

</table>
</body>
</html>