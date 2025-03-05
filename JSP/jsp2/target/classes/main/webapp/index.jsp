<%@page import="com.model.Student, com.dao.StudentDao, java.util.List"%>
<html>
<body>
	<center>
		<h2>List of Student</h2>
		<hr>
		<%List<Student> list= new StudentDao().findAll(); %>
		<table border="1">
			<th>ID</th>
			<th>Name</th>
			<th>City</th>
			<th>Percentage</th>
			<%
		for(Student s: list){
		%>
			<tr>
				<td><%=s.getId() %></td>
				<td><%=s.getName() %></td>
				<td><%=s.getCity() %></td>
				<td><%=s.getPercentage() %></td>
			</tr>
			}

		</table>
	</center>
</body>
</html>
