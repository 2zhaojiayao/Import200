<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>个人页面_活动分类_ul</title>
	<link rel="stylesheet" type="text/css" href="css/student_activityclassify_ul.css">
	
	


</head> 
<body>
	<div class="activity_type">
		<ul class="big_type">
			<li>
				<ul class="small_type" id="types">
					<span class="type_header">按类别:</span>
					<li><a href="#"  class="normal">全部</a>	</li>
					<li><a href="#"  class="normal">志愿活动</a></li>
					<li><a href="#" class="normal">文体竞赛</a></li>
					<li><a href="#" class="normal">学术竞赛</a></li>
				</ul>
			</li>
			<div class="clear"></div>
			<li>
				<ul class="small_type" id="levels">
					<span class="type_header" >按级别:</span>
					<li><a href="#" class="normal">全部</a></li>
					<li><a href="#" class="normal">国家级</a></li>
					<li><a href="#" class="normal">省级</a></li>
					<li><a href="#" class="normal">市级</a></li>
					<li><a href="#" class="normal">校级</a></li>
				 <li> 
				    <div class="college" >
				   	 <input id="ipt" type="text" placeholder="院级" />
					 <ul id="ul">
					  <li><a href="javascript:;" class="normal">物理科学与信息工程学院</a></li>
					  <li><a href="javascript:;" class="normal">测试2</a></li>
					  <li><a href="javascript:;" class="normal" >测试3</a></li>
					  <li><a href="javascript:;" class="normal">测试4</a></li>
					  <li><a href="javascript:;" class="normal">测试5</a></li>
					  <li><a href="javascript:;" class="normal">测试6</a></li>
					 </ul>
 </div></li>
				 
				</ul>
			</li>
			<div class="clear"></div>
			<li>
				<ul class="small_type">
					<span class="type_header" id="timers">按时间:</span>
					<li><a href="#" class="normal">全部</a></li>
					<li><a href="#" class="normal">报名中</a></li>
					<li><a href="#" class="normal">进行中</a></li>
					<li><a href="#" class="normal">已结束</a></li>
				</ul>
			</li>
		</ul>
	</div> 
	<script type="text/javascript" src="js/search.js"></script> 	
  <script type="text/javascript" src="js/student_activityclassify_ul.js"></script>
</body>
<!-- <script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script> -->
</html>