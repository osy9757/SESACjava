<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- page directive --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Calendar c = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH)+1;
	
	
	c.set(year, month-1,1);
	int week = c.get(Calendar.DAY_OF_WEEK);
	int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	c.set(year, month-2,1);
	int preWeek = c.get(Calendar.DAY_OF_WEEK);
	int preEndday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	c.set(year, month-1, endday);
	int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
%> 
<table border="1">
	<caption><%=(year+"."+month) %></caption><%-- expression --%>
	<tr>
		<th>일</th>
		<th>월</th>
		<th>화</th>
		<th>수</th>
		<th>목</th>
		<th>금</th>
		<th>토</th>
	</tr>
	<tr>
<% 
	for(int w = 1, k = preEndday-week+2; w<week; w++,k++) {
		%><td style="color:gray"><%=(k)%></td><%
	}
	for(int d=1, w=week;d<=endday; d++, w++) {
		%><td><%=(d)%></td><%
		if (w%7==0) %></tr><tr> <%;
	}
	for (int w=dayOfWeek;; w++) {%>
		<td></td><%
		if (w%6==0) break;
		}%>
	</tr>
</table>
</body>
</html>