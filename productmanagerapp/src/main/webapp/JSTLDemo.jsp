<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ page import= java.util.*; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL demo</title>
</head>
<body>
<h3>JSTL Demo</h3>

<c:set var="city" value="Pune" />
<h3>City:<c:out value="${city}"/> </h3>

<hr>
<%
List<String> cities=new ArrayList<>();
cities.add("Pune");
cities.add("Mumbai");
cities.add("Chennai");
pageContext.setAttribute("cities",cities);
%>
<h3>Cities</h3>
<ol>
<c:forEach items="${cities}" var="ct">
<li>${ct }</li>
</c:forEach>

</ol>
</body>
</html>