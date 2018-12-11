<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>组织者页面_成功发布</title>
<link rel="stylesheet" type="text/css" href="css/updatepwd_success.css">
<script language="javascript" type="text/javascript">
	setTimeout(function() {
		this.location.href = "three_login.jsp"
	}, 5000);
</script>
</head>
<body>
	<script type="text/javascript"
		src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>

	<!--content-->
	<div class="content">
		<img src="images/success.png">
		<p>
			更改密码成功，<span class="time"></span>秒后跳回登录页面
		</p>
	</div>

</body>
<script type="text/javascript">
	var timeEle = document.querySelector('.time'), count = 5;
	timeEle.innerHTML = count;
	// 设置计时器
	var judge = setInterval(function() {
		count--;
		if (!count) {
			// 清除计时器
			clearInterval(judge);
		}
		;
		// 标签当中显示时间
		timeEle.innerHTML = count;
	}, 1000);
</script>
</html>