<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>发布活动</title>
	<script type="text/javascript" src="js/publishactivity.js"></script>
	<link rel="stylesheet" type="text/css" href="css/publishactivity.css"/>
</head>
<body>
<!-- header -->
<div class="header"></div>
<!-- content -->
<div class="content">
	<!-- content_top -->
	<div class="content_top">
		<a href="#">首页</a> / 发布活动
		<h4>发布活动</h4>
		<p><为保证活动信息的准确性，请仔细填写以下内容></p>
	</div>
	<!-- content_main -->
	<div class="content_main">
		<!-- content_main_left -->
		<div class="left">
			<form class="alignform" action="" method="post">
				<lable class="sign">*</lable><label class="prompt">添加活动海报：</label>
				<lable class="addimg"><input type="file" name="img" class="upimg"/></lable><br>
				<lable class="sign">*</lable><label class="prompt">活动名称：</label>
				<input class="inputframe" type="text" name="activityname" placeholder="请输入活动名称"/><br>
				<label class="promptintro"><lable class="sign">*</lable>活动简介：</label>
				<textarea class="textarea" placeholder="请输入活动介绍信息"></textarea><br>
				<lable class="sign">*</lable><label class="prompt">报名开始时间：</label>
				<input class="inputframe" type="date" name="applybegintime" value="2018-01-01"/><br>
				<lable class="sign">*</lable><label class="prompt">报名截止时间：</label>
				<input class="inputframe" type="date" name="applyendtime" value="2018-01-01"/><br>
				<lable class="sign">*</lable><label class="prompt">活动开始时间：</label>
				<input class="inputframe" type="date" name="holdontime" value="2018-01-01"/><br>
				<lable class="sign">*</lable><label class="prompt">活动结束时间：</label>
				<input class="inputframe" type="date" name="holdendtime" value="2018-01-01"/><br>
				<lable class="sign">*</lable><label class="prompt">活动举办地点：</label>
				<input class="inputframe" type="text" name="place" placeholder="请输入活动举办地点"/><br>
				<lable class="sign">*</lable><label class="prompt">参与范围：</label>
				<select class="inputframe1">
					<option><-请选择活动面向对象范围-></option>
					<option>河北师范大学</option>
					<option>软件学院</option>
					<option>美术与设计学院</option>
					<option>数学与信息技术学院</option>
					<option>音乐学院</option>
				</select><br>
				<lable class="sign">*</lable><label class="prompt">参赛形式：</label>
				<select class="inputframe1">
					<option><-请选择活动参赛形式-></option>
					<option>团队</option>
					<option>个人</option>
				</select><br>
				<lable class="sign">*</lable><label class="prompt">活动级别：</label>
				<select class="inputframe1">
					<option><-请选择活动级别-></option>
					<option>国家级</option>
					<option>省级</option>
					<option>市级</option>
					<option>校级</option>
					<option>院级</option>
				</select><br>
				<lable class="sign">*</lable><label class="prompt">活动所属类别：</label>
				<select class="inputframe1">
					<option><-请选择用于展示的活动所属类别-></option>
					<option>志愿活动</option>
					<option>文体竞赛</option>
					<option>学术竞赛</option>
				</select><br>
				<lable class="sign">*</lable><label class="prompt">测评所属类别：</label>
				<select class="inputframe1">
					<option><-请选择用于综合测评的活动所属类别-></option>
					<option>品行表现</option>
					<option>学业表现</option>
					<option>能力表现</option>
				</select><br>
				<lable class="sign">*</lable><label class="prompt">综测加分：</label>
				<input type="button" value="+" class="gradebutton" onclick="addgrade()">
				<input type="text" class="grade" name="grade" id="grade" value="1">
				<input type="button" value="-" class="gradebutton" onclick="reducegrade()"><br>
				<div class="interview"><label class="interview1"><lable class="sign">*</lable>是否需要面试：</label>
				<span  class="interview2"><input type="radio" name="interview" value="需要面试"> 需要面试
				<input type="radio" name="interview" value="不需要面试"> 不需要面试</span></div>
				<input class="publishbutton" type="submit" value="发布活动"/><br>
				<i class="icon icon-calendar"></i>
			</form>
		</div>
		<!-- content_main_right -->
		<div class="right">
			<p class="recomm">近期热门活动</p>
			<div class="act">
				<img src="images/tag.png" class="sign"/><a href="#">麦“Dream”主持人风采大赛</a>
				<hr class="hrsty"/>
				<p class="intro">麦“Dream”主持人风采大赛是面向软件学院全体学生，致力于提升同学们的临场应变能力和语言表达能力并丰富大学生课余活动而产生的活动,活动分为初赛，复赛，决赛三部···</p>
				<hr class="hrsty"/>
				<div class="organ"><a href="#">软件学院学生会</a></div>
			</div>
			<div class="act">
				<img src="images/tag.png" class="sign"/><a href="#">麦“Dream”主持人风采大赛</a>
				<hr class="hrsty"/>
				<p class="intro">麦“Dream”主持人风采大赛是面向软件学院全体学生，致力于提升同学们的临场应变能力和语言表达能力并丰富大学生课余活动而产生的活动,活动分为初赛，复赛，决赛三部···</p>
				<hr class="hrsty"/>
				<div class="organ"><a href="#">软件学院学生会</a></div>
			</div>
			<div class="act">
				<img src="images/tag.png" class="sign"/><a href="#">麦“Dream”主持人风采大赛</a>
				<hr class="hrsty"/>
				<p class="intro">麦“Dream”主持人风采大赛是面向软件学院全体学生，致力于提升同学们的临场应变能力和语言表达能力并丰富大学生课余活动而产生的活动,活动分为初赛，复赛，决赛三部···</p>
				<hr class="hrsty"/>
				<div class="organ"><a href="#">软件学院学生会</a></div>
			</div>
			<div class="act">
				<img src="images/tag.png" class="sign"/><a href="#">麦“Dream”主持人风采大赛</a>
				<hr class="hrsty"/>
				<p class="intro">麦“Dream”主持人风采大赛是面向软件学院全体学生，致力于提升同学们的临场应变能力和语言表达能力并丰富大学生课余活动而产生的活动,活动分为初赛，复赛，决赛三部···</p>
				<hr class="hrsty"/>
				<div class="organ"><a href="#">软件学院学生会</a></div>
			</div>
			<button class="moreact">更多热门活动···</button>
		</div>
	</div>
</div>
<!-- footer -->
<div class="footer"></div>
</body>
</html>