<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method="post" action="j_security_check">
    <input type="text" name="j_username" placeholder="Username">
    <input type="password" name="j_password" placeholder="Password">
    <input type="submit" value="Login">
</form>
</body>
</html>