<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="js/resetpwd.js"></script>
	<link rel="stylesheet" type="text/css" href="css/resetpwd.css">
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<div class="top"><img src="images/logo2.png"/ class="logo"></div>
	<form action="" method="post" class="formsty">
		<p class="mailid">XXXXXXXXX.qq.com</p>
		<div class="prompt">新密码：</div>
		<input type="password" name="password" class="pwd" id="set" />
		<div class="prompt">确认密码：</div>
		<input type="password" name="password" class="pwd" id="confirm" onmouseleave="check()"/>
		<div class="message" id="check">两次输入的密码不一致，请重输</div>
		<input type="submit" value="提交修改" class="sub"/>
	</form>
</body>
</html>