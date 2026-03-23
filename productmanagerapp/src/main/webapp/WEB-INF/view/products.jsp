<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>

    <jsp:include page="menu.jsp" />

    <h3>Products</h3>

    <!-- products list is already sent by Servlet -->
    
    <table border="1" width="800px">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
        </tr>

        <!-- JSTL Loop -->
        <c:forEach var="p" items="${products}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
            </tr>
        </c:forEach>

        <!-- Add Product Form -->
        <form action="${pageContext.request.contextPath}/productcontroller" method="post">
            <tr>
                <td><input type="text" name="id"></td>
                <td><input type="text" name="name"></td>
                <td><input type="text" name="price"></td>
            </tr>

            <tr>
                <th colspan="3">
                    <button type="submit">Add</button>
                </th>
            </tr>
        </form>
    </table>

    <br>

    <a href="${pageContext.request.contextPath}/downloadpdf">
        <button>Download PDF</button>
    </a>

</body>
</html>