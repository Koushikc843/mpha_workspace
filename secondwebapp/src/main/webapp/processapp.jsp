<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>process</title>
<link href='style.css' rel='stylesheet'>
</head>
<body>
<%
String fname=request.getParameter("fname");
String email=request.getParameter("email");
String cellno=request.getParameter("cellno");

%>
<h3>Thank you!!</h3>
<h3>Name:<%= fname %></h3>
<h3>Email:<%= email %></h3>
<h3>cellno:<%= cellno %></h3>

</body>
</html>