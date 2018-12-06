<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>忘记密码</title>
	<link rel="stylesheet" type="text/css" href="css/recoverpwd.css" />
</head>
<body>
	<div class="top"><img src="images/logo2.png" class="logo"/></div>
	<form action="" method="post" class="formsty">
		<p class="fill">请填写您注册账号使用的邮箱:</p>
		<input type="text" class="mail" />
		<div class="prompt">
			<img src="images/msg.jpg" class="msg"/>
			<lable class="message">为了保证您的账户安全，我们将会向您的邮箱发送一封邮件，以确认是本人的操作。请确认查收并修改密码！</lable>
		</div> 
		<input type="submit" value="发送邮件" class="sub" />
	</form>
</body>
</html>