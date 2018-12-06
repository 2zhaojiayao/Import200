<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>活动</title>
	<link rel="stylesheet" type="text/css" href="css/activities.css">
	<link rel="stylesheet" type="text/css" href="css/header_footer.css">
	<link rel="stylesheet" type="text/css" href="css/activity.css">

</head>
<body>
<!-- header -->
<%@include file="header.jsp"%>
<!--type-->
	<div class="assembly">
			<div class="breadcrumb">
						<a href="#">首页</a>
						  &nbsp/&nbsp
						<a href="#" id="orange">活动</a>
			</div>
			<div id="search">
						<form>
							<input type="text" placeholder="  请输入您要搜索的内容...">
							<button type="submit"></button>
						</form>
					</div>
			<div class="out_type">
				<div class="label" id="orange">分类</div>
			</div>
	</div>
	<%@include file="activity.jsp"%>
	<script type="text/javascript" src="js/activity.js"></script>
	
<!--conter-->
	<div class="activities_conter">
		<div class="activity_object">
			<a href=""><img src="images/activity1.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>

		<div class="activity_object">
			<a href=""><img src="images/activity2.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>
		<div class="activity_object">
			<a href=""><img src="images/activity3.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>
		<div class="activity_object">
			<a href=""><img src="images/activity4.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>
		<div class="activity_object">
			<a href=""><img src="images/activity5.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>
		<div class="activity_object">
			<a href=""><img src="images/activity6.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>
		<div class="activity_object">
			<a href=""><img src="images/activity7.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		</div>
		<div class="activity_object">
			<a href=""><img src="images/activity8.jpg"></a>
		<ul>
			<li><a href="#">activity_name</a></li>
			<li><p id="grey">activity_describe</p></li>
			<li id="grey">activity_time</li>
		</ul>
		
	</div>
<!--分页器-->
		<div class="bottom_page">
					<ul class="pagination">
						<li><a href="#">«</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">6</a></li>
						<li><a href="#">7</a></li>
						<li><a href="#">»</a></li>
					</ul>
		</div>
	</div>
<!--footer-->
		<%@include file="footer.jsp"%>
			
</body>
</html>