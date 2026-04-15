<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<h2>Employee List</h2>

<a href="addEmployee.jsp">Add Employee</a>

<table border="1">
<tr>
    <th>Name</th>
    <th>Salary</th>
</tr>

<c:forEach var="e" items="${list}">
<tr>
    <td>${e.name}</td>
    <td>${e.salary}</td>
</tr>
</c:forEach>

</table>