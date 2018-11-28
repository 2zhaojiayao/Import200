<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>活动详情</title>
	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="css/detail.css">
	<link rel="stylesheet" type="text/css" href="css/header_footer.css" media="all">
</head>
<body>
	<script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>　　
	<!--header-->
	<header><%@include file="header.jsp" %></header>
	<!--main-->
	<div class="main">
		<div class="main_top">
			<span class="main_top_left1"><a href="index.jsp">首页</a></span>
			&nbsp;/&nbsp;
			<span class="main_top_left1"><a href="index.jsp">活动</a></span>
			&nbsp;/&nbsp;
			<span class="main_top_left2">活动详情</span>
		</div>
		<div class="main_center">
			<span class="main_center_left">活动名称</span>
		</div>
		<div class="main_bottom">
			<span class="main_bottom_left">这里是活动内容的简介---------------------------------大概会有一行文字---------------------------------</span>
		</div>
	</div>
	<!--content-->
	<div class="content">
		<div class="content_box">
			<div class="content_left">
				<div class="content_img">
					<img src="images/center.jpg">
				</div>
				<div class="content_text">
					<form action="#" method="post">
						<table>
							<tr class="tr">
								<td class="td1">活动名称</td>
								<td class="td2">XXX活动</td>
							</tr>
							<tr class="tr">
								<td class="td1">活动简介</td>
								<td class="td2">---------------------------------------------------------------------------------------------------------------------------------------------------------------------------</td>
							</tr>
							<tr class="tr">
								<td class="td1">举办者</td>
								<td class="td2">XXX组织</td>
							</tr>
							<tr class="tr">
								<td class="td1">参与对象</td>
								<td class="td2">XXX、XXX、XXX</td>
							</tr>
							<tr class="tr">
								<td class="td1">报名截止时间</td>
								<td class="td2">XXXX年-XX月-XX日</td>
							</tr>
							<tr class="tr">
								<td class="td1">活动举办时间</td>
								<td class="td2">XXXX年-XX月-XX日</td>
							</tr>
							<tr class="tr">
								<td class="td1">是否需要面试</td>
								<td class="td2">是/否</td>
							</tr>
							<tr class="tr">
								<td class="td1">综测加分</td>
								<td class="td2">X分</td>
							</tr>
						</table>
						<div class="content_submit">
							<input type="submit" name="submit" value="我要报名" class="button">
						</div>				
					</form>
				</div>
			</div>
			<div class="content_right">
				<div class="content_right_word">热门活动推荐</div>
				<hr>
				<div class="content_right_box">
					<div class="content_right_box_inside1">
						<img src="images/inside.svg" class="content_right_img">
						<div class="content_right_text">
							<div class="content_right_text1">
								活动名称
							</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......
							</div>
						</div>
						
					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							去看看
						</div>
						<div class="content_right_line">	
						</div>
						<div class="content_right_box2">
							我要报名
						</div>
					</div>
				</div>
				<div class="content_right_box">
					<div class="content_right_box_inside1">
						<img src="images/inside.svg" class="content_right_img">
						<div class="content_right_text">
							<div class="content_right_text1">
								活动名称
							</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......
							</div>
						</div>
						
					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							去看看
						</div>
						<div class="content_right_line">	
						</div>
						<div class="content_right_box2">
							我要报名
						</div>
					</div>
				</div>
				<div class="content_right_box">
					<div class="content_right_box_inside1">
						<img src="images/inside.svg" class="content_right_img">
						<div class="content_right_text">
							<div class="content_right_text1">
								活动名称
							</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......
							</div>
						</div>
						
					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							去看看
						</div>
						<div class="content_right_line">	
						</div>
						<div class="content_right_box2">
							我要报名
						</div>
					</div>
				</div>
				<div class="content_submit_two">
					<a href="#"><div class="button"> 其它热门活动</div></a>
				</div>	
			</div>			
		</div>
	</div>
	<!--footer-->
	<footer>
		<%@include file="footer.jsp" %>		
	</footer>
</body>
</html>