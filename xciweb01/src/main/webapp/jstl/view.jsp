<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<caption>북산</caption>
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>포지션</td>
	</tr>
<c:forEach items="${list}" var="mem">
	<tr>
		<td>${mem.no}</td>
		<td>${mem.name}</td>
		<td>${mem.position}</td>
	</tr>	
</c:forEach>
</talbe>
</body>
</html>