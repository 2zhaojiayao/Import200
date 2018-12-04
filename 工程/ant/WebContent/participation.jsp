<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>活动参与情况</title>
	<link rel="stylesheet" type="text/css" href="css/participation.css">
	<link rel="stylesheet" type="text/css" href="css/header_footer.css">
</head>
<body>
<!--header-->
<%@include file="header.jsp"%>
<!--conter-->
	<div class="conter">
		<p>如确认表格中活动参与情况不完善，班委可在此页面对活动参与情况作修改。</p>
		<div class="button">
		<a href="#"><div id="get1">下载活动参与情况表<img src="images/download.png"></div></a>
		<a href="#"><div id="get2">修改活动参与情况</div></a>
		</div>
	</div>
	
<!--footer-->
	<%@include file="footer.jsp"%>
</body>
</html>