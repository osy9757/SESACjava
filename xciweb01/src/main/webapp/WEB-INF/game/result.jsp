<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        text-align: center;
    }
    table {
        margin: auto;
        border-collapse: collapse;
        width: 50%;
    }
    th, td {
        border: 1px solid ;
        padding: 8px;
        text-align: center;
    }
    th {
        padding-top: 12px;
        padding-bottom: 12px;
        color: white;
    }
</style>
</head>
<body>
<table border = "1">
	<tr>
		<td>You</td>
		<td>vs</td>
		<td>Com</td>
	</tr>
	<tr>
		<td>${you}</td>
		<td> </td>
		<td>${com}</td>
	</tr>
	<tr>
		<td colspan = "3">result is ${winner}</td>
	</tr>
</table>
</body>
</html>