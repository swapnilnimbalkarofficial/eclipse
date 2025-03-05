<%@ page import="com.model.Student, com.dao.StudentDao, java.util.List"%>
<html>
<body>
	<center>
		<h2>Student Form</h2>
		<hr>
		<form action="req1" method="get">
			<table>
				<tr>
					<td align="right">ID:</td>
					<td><input type="text" name="id" value="0"></td>
				</tr>
				<tr>
					<td align="right">Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td align="right">City:</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td align="right">Percentage:</td>
					<td><input type="text" name="percentage" value="0.0"></td>
				</tr>
				<td colspan="2" align="center"><input type="submit" name="b1" value="Add">
				<input type="submit" name="b1" value="Delete">
				<input type="submit" name="b1" value="Display">
				
				</td>
			</table>
		</form>
		<h2>List of Students</h2>
		<hr>
		<%
		// Get list of students from the database
		List<Student> list = new StudentDao().findAll();
		%>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>City</th>
				<th>Percentage</th>
			</tr>

			<%
			// Loop through the list of students
			for (Student s : list) {
			%>
			<tr>
				<td align="right"><%=s.getId()%></td>
				<td align="center"><%=s.getName()%></td>
				<td align="center"><%=s.getCity()%></td>
				<td align="right"><%=s.getPercentage()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</center>
</body>
</html>
