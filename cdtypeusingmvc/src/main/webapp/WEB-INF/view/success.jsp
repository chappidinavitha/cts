<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
CD added successfully<br/>

CD Title:${CdType.title}<br/>
CD Type:${CdType.type}<br/>
Cdtype releasedate:${CdType.date}<br/>
<a href="${pageContext.request.contextPath}/">home</a>
</body>
</html>