
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>

	<form:form method="post" action="saveEmployee.html">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="employeeName" /></td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td><form:input path="employeeSalary" /></td>
			</tr>
			<tr>
				<td>Designation :</td>
				<td><form:input path="employeeDesignation" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
