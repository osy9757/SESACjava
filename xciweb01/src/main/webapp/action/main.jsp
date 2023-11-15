<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#top {
   height:150px; 
   background-color:yellow;
}

#menu {
   width:250px; 
   background-color:red; 
   height:450px
}

#content {
   background-color:green;
}
</style>
</head>
<body style="margin: 0px;">
<%
   String msg = "안녕하세요~";
%>
<table style="width: 1180px">
<tr>
   <td colspan="2" id="top">
	   <jsp:include page="top.jsp">
	   		<jsp:param value="<%=msg %>" name="msg"/>
	   </jsp:include>
   </td>
</tr>
<tr>
   <td id="menu"><jsp:include page="menu.jsp"></jsp:include></td>
   <td id="content"><jsp:include page="content.jsp"></jsp:include></td>
</tr>
</table>
</body>
</html>