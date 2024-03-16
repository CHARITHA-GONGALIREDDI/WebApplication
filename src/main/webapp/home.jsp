<!DOCTYPE html>
<%@page import="application.Servlet"%>
<%@page import="application.Dao"%>
<%@page import="application.Model"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<H1>Hey you....</H1>
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Age</th>
<th>Date Of Birth</th>
</tr>
<% 
            @SuppressWarnings("unchecked")
            ArrayList<Model> list =(ArrayList<Model>)request.getAttribute("list");
if (list != null) {
            for(Model data: list) {
        %>
        <tr>
        	<td><%=data.getId() %></td>
            <td><%=data.getName() %></td>
            <td><%=data.getEmail() %></td>
            <td><%=data.getAge() %></td>
            <td><%=data.getDateOfBirth() %></td>
            </tr>
        <% }
} %>
</table>
</body>
</html>