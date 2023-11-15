<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
 	String field = request.getParameter("field");
    String[] hobbies = request.getParameterValues("hobby");
 	String gender = request.getParameter("gender");
 	String motive = request.getParameter("motive");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name : <%=name %> <br />
phone : <%=phone %> <br />
field : <%=field %> <br />
hobby : <%=Arrays.toString(hobbies) %> <br />
gender : <%=gender %> <br />
motive : <%=motive %> <br />
</body>
</html>