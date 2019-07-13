<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Enter your data</h2>
	<form:form action="add" modelAttribute="data">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
				<td style="color: red;">
				<%-- <form:errors path="firstName"></form:errors> --%>
				</td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>
				<td style="color: red;">
					<%-- <form:errors path="lastName"></form:errors> --%>
					</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>

			</tr>
		</table>
	</form:form>
</body>
</html>
