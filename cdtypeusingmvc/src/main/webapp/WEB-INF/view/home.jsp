<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border="1">
 <tr>
<td><h2>CDType: Homepage</h2></td>
 </tr>
</table>
<p>
This is the Home page for displaying editions of cd's....
</p>
<ul>
 <li><a href="list_cdtypes.jsp">List all cdtypes</a></li>
 </ul>
 <ul>
 <li><a href="${pageContext.request.contextPath}/CdType/showForm">Add a new cd</a></li>
 </ul>
</body>
</html>