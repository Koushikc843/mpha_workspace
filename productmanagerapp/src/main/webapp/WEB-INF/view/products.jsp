<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mphasis.productmanagerapp.model.ProductModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>


</head>
<body>

	<jsp:include page="menu.jsp" />

	<h3>Products</h3>

	<%
    List<ProductModel> products = (List<ProductModel>) request.getAttribute("products");
%>

	<table border="1" width="800px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		</tr>

		<%
    if (products != null) {
        for (ProductModel p : products) {
%>
		<tr>
			<td><%= p.getId() %></td>
			<td><%= p.getName() %></td>
			<td><%= p.getPrice() %></td>
		</tr>
		<%
        }
    }
%>

	</table>
	<a href="${pageContext.request.contextPath}/downloadpdf">
    <button>Download PDF</button>
</a>

</body>
</html>