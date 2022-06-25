<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.bean.Subject"%>
     <%@ page import="com.bean.Class"%>
     <%@ page import="com.bean.Student"%>
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

<h1>Class Report</h1><br>
<form action="Report" method="get">
Enter Class ID
<input type="text" name="CID" ><br>
<button type="submit">Get Report</button>
<button type="reset">reset</button>
</form>
<h1>Student Table</h1>
<table>
<tr>
 <th> SID</th>
 <th>First Name</th>
 <th>Last Name</th>
</tr>

<%
  Class obj=(Class)session.getAttribute("Class");
 if(obj!=null)
 {
	 List<Student> students= (List<Student>)obj.getListOfStudent();
	 
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


<h1>Subject Table</h1>
<table>
<tr>
 <th> SID</th>
 <th>Subject Name</th>
</tr>

<%
 
 if(obj!=null)
 {
	 List<Subject> subjects= (List<Subject>)obj.getListOfSubject();
	 
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
<h1>Teacher Table</h1>
<table>
<tr>
 <th> TID</th>
 <th>First Name</th>
 <th>Second Name</th>
</tr>

<%
 
 if(obj!=null)
 {
	 List<Teacher> Teachers = (List<Teacher>)obj.getListOfTeacher();
	 
	 for(Teacher tch : Teachers)
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