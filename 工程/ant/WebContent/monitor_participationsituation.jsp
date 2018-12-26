<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>班委页面_活动参与情况</title>
<link rel="stylesheet" type="text/css"
	href="css/monitor_participationsituation.css">
<link rel="stylesheet" type="text/css" href="css/header_footer.css">
</head>
<body>
	<!--header-->
	<%@include file="monitor_header.jsp"%>
	<!--conter-->
	<div class="conter">
		<p>如确认表格中活动参与情况不完善，班委可在此页面对活动参与情况作修改。</p>
		<div class="button">
			<a href="getset">
				<div id="get1">
					下载活动参与情况表 <img src="images/download.png">
				</div>
			</a> <a href="update">
				<div id="get2">修改活动参与情况</div>
			</a>
		</div>
	</div>

	<!--footer-->
	<%@include file="footer.jsp"%>
</body>
<script type="text/javascript"
	src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</html>