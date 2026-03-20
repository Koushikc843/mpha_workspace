<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application</title>
<link href='style.css' rel='stylesheet'>
</head>
<body>
	<h3 id=h>Application</h3>
	<form action="processapp.jsp" method="post">
		<div>
			<div>
				<label id=lab> Full name</label> <input type='text' name='fname'>
			</div>
			<div>
			<label id=lab>Email</label>
			<input type='text' name='email'>
			</div>
			<div>
			<label id=lab>Cell #</label>
			<input type='text' name='cellno'>
			
			</div>
			<div>
			<button id=but>Apply</button>
			</div>
		</div>
	</form>
</body>
</html>