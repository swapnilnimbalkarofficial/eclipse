<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
				<td colspan="2" align="center"><input type="submit" name="b1"
					value="Add"> <input type="submit" name="b1" value="Delete">
					<input type="submit" name="b1" value="Display"></td>
			</table>
		</form>
		</hr>
	</center>
</body>
</html>