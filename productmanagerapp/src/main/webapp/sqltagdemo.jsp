<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.sql" prefix="sql"%>
<html>
<head>
<link href='style.css' rel='stylesheet'>
</head>

<body>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/mydb" user="root" password="root@39" />

	<sql:query dataSource="${db}" var="products">
    select * from products
</sql:query>

	<h3>Products</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="row" items="${products.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.price}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>