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
				<ul class="small_type">
					<sapn class="type_header">按类别:</sapn>
					<li><a href="#">全部</a>	</li>
					<li><a href="#">志愿活动</a></li>
					<li><a href="#"> 文体竞赛</a></li>
					<li><a href="#">学术竞赛</a></li>
				</ul>
			</li>
			<div class="clear"></div>
			<li>
				<ul class="small_type">
					<sapn class="type_header">按级别:</sapn>
					<li><a href="#">全部	</a></li>
					<li><a href="#">国家级</a></li>
					<li><a href="#">省级</a></li>
					<li><a href="#">市级</a></li>
					<li><a href="#">校级</a></li>
				      <!--  <a>
				    	<select id="selected_search">
				    		<li class="white">软件学院</li>

				    		 <option class="white">数信学院</option>
				    		<option class="white">文学院</option> 
				    	</select></a>  --> 
				    	<!-- <a><div class="dropdown dropdown-hover">
                           <button class="btn" type="button" data-toggle="dropdown">按钮 <span class="caret"></span></button>
                           <ul class="dropdown-menu">
                              <li><a href="###">操作</a></li>
    <li><a href="###">另一个操作</a></li>
    <li><a href="###">更多操作</a></li>
  </ul>
</div>
				   </a>  -->
				 <li> <div class="college">
				   	<input id="ipt" type="text" placeholder="院级"/>
 <ul id="ul">
  <li><a href="javascript:;" >物理科学与信息工程学院</a></li>
  <li><a href="javascript:;">测试2</a></li>
  <li><a href="javascript:;">测试3</a></li>
  <li><a href="javascript:;">测试4</a></li>
  <li><a href="javascript:;">测试5</a></li>
  <li><a href="javascript:;">测试6</a></li>
 </ul>
 </div></li>
				 
				</ul>
			</li>
			<div class="clear"></div>
			<li>
				<ul class="small_type">
					<sapn class="type_header">按时间:</sapn>
					<li><a href="#">全部</a>	</li>
					<li><a href="#">报名中</a></li>
					<li><a href="#">进行中</a></li>
					<li><a href="#">已结束</a></li>
				</ul>
			</li>
		</ul>
	</div> 
		
  <script type="text/javascript" src="js/student_activityclassify_ul.js"></script>
</body>
<script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</html>