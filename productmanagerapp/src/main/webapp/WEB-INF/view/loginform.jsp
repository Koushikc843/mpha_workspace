<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignIn</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div id=form><form  action=" logincontroller" method="post">

<div>
<label id=lab>Login</label>
<input type='text' name='lg'>

</div>
<div><label id=lab>password</label>
<input type='text' name='ps'>
</div>
<div>
<button id=but>submit</button>
</div>

<div><%= request.getAttribute("msg") %></div>

</form></div>

</body>
</html>