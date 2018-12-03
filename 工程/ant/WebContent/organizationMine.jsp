<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>我的</title>
	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="css/header_footer.css">
	<link rel="stylesheet" type="text/css" href="css/organization.css">
</head>
<body>
	<div class="wrapper">
	<!-- 页头 -->
	<%@include file="header.jsp"%>
		<!-- 主要部分 -->
		<div class="main">
			<!-- 上部分 -->
			<div class="top_org">
				<div class="top_nav">
					<a href="#">首页</a>/
					<span>我的</span>
				</div>
				<div class="top_list">
					<div class="top_list_part">
						<div class="box">
							<div class="box_top"><span>未开始</span></div>
							<div class="box_bottom"><span>?个活动</span></div>
						</div>
					</div>
					<div class="top_list_part">
						<div class="box">
							<div class="box_top"><span>进行中</span></div>
							<div class="box_bottom"><span>?个活动</span></div>
						</div>
					</div>
					<div class="top_list_part">
						<div class="box">
							<div class="box_top"><span>已完成</span></div>
							<div class="box_bottom"><span>?个活动</span></div>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<!-- 下部分 -->
			<div class="bottom">
				<div class="bottom_detail">
					<div class="bottom_nav">
						<div class="bottom_nav_left">
							<span>我发布的活动列表</span>
						</div>
						<div class="bottom_nav_right">
							<div class="button">
								<div class="btn active"><a href="#">全部</a></div>
								<div class="btn"><a href="#">未开始</a></div>
								<div class="btn"><a href="#">进行中</a></div>
								<div class="btn"><a href="#">已结束</a></div>
							</div>
							<div class="search_org">
								<form>
									<input type="text" placeholder="请输入活动名称">
									<button type="submit"></button>
								</form>
							</div>
						</div>
					</div>
					<div class="clear"></div>
					<div class="bottom_publish">
						<a class="btn_publish">+发布活动</a>
					</div>
					<div class="bottom_list">
						<div class="bottom_list_detail">
							<div class="bottom_list_detail_left">
								<div class="num">
									<span>1</span>
								</div>
								<div class="detail">
									<p class="title">已发布过的活动名称</p>
									<p class="text">活动简介，这是一段比较长的活动简介</p>
								</div>
								<div class="author">
									<p class="text">发布者</p>
									<p class="text">Owner's name</p>
								</div>
							</div>
							<div class="bottom_list_detail_right">
								<div class="time">
									<p class="text">发布时间</p>
									<p class="text">2018-11-28 16:20</p>
								</div>
								<div class="progress">
									<div class="statusList">
									　　<div class="scheduleGray">
									  　　<div class="scheduleGreen"></div>
									　　</div>
									</div>
								</div>
								<div class="operation">
									<a href="#">编辑</a>
									<select class="form-control">
										<option value="">更多</option>
										<option value="apple">苹果</option>
										<option value="banana">香蕉</option>
										<option value="orange">桔子</option>
									</select>									
								</div>
							</div>
						</div>
						<div class="clear"></div>

						<div class="bottom_list_detail">
							<div class="bottom_list_detail_left">
								<div class="num">
									<span>2</span>
								</div>
								<div class="detail">
									<p class="title">已发布过的活动名称</p>
									<p class="text">活动简介，这是一段比较长的活动简介</p>
								</div>
								<div class="author">
									<p class="text">发布者</p>
									<p class="text">Owner's name</p>
								</div>
							</div>
							<div class="bottom_list_detail_right">
								<div class="time">
									<p class="text">发布时间</p>
									<p class="text">2018-11-28 16:20</p>
								</div>
								<div class="progress">
									<div class="statusList">
									　　<div class="scheduleGray">
									  　　<div class="scheduleGreen"></div>
									　　</div>
									</div>
								</div>
								<div class="operation">
									<a href="#">编辑</a>
									<select class="form-control">
										<option value="">更多</option>
										<option value="apple">苹果</option>
										<option value="banana">香蕉</option>
										<option value="orange">桔子</option>
									</select>									
								</div>
							</div>
						</div>
						<div class="clear"></div>

						<div class="bottom_list_detail">
							<div class="bottom_list_detail_left">
								<div class="num">
									<span>3</span>
								</div>
								<div class="detail">
									<p class="title">已发布过的活动名称</p>
									<p class="text">活动简介，这是一段比较长的活动简介</p>
								</div>
								<div class="author">
									<p class="text">发布者</p>
									<p class="text">Owner's name</p>
								</div>
							</div>
							<div class="bottom_list_detail_right">
								<div class="time">
									<p class="text">发布时间</p>
									<p class="text">2018-11-28 16:20</p>
								</div>
								<div class="progress">
									<div class="statusList">
									　　<div class="scheduleGray">
									  　　<div class="scheduleGreen"></div>
									　　</div>
									</div>
								</div>
								<div class="operation">
									<a href="#">编辑</a>
									<select class="form-control">
										<option value="">更多</option>
										<option value="apple">苹果</option>
										<option value="banana">香蕉</option>
										<option value="orange">桔子</option>
									</select>									
								</div>
							</div>
						</div>
						<div class="clear"></div>



						<div class="bottom_list_detail">
							<div class="bottom_list_detail_left">
								<div class="num">
									<span>4</span>
								</div>
								<div class="detail">
									<p class="title">已发布过的活动名称</p>
									<p class="text">活动简介，这是一段比较长的活动简介</p>
								</div>
								<div class="author">
									<p class="text">发布者</p>
									<p class="text">Owner's name</p>
								</div>
							</div>
							<div class="bottom_list_detail_right">
								<div class="time">
									<p class="text">发布时间</p>
									<p class="text">2018-11-28 16:20</p>
								</div>
								<div class="progress">
									<div class="statusList">
									　　<div class="scheduleGray">
									  　　<div class="scheduleGreen"></div>
									　　</div>
									</div>
								</div>
								<div class="operation">
									<a href="#">编辑</a>
									<select class="form-control">
										<option value="">更多</option>
										<option value="apple">苹果</option>
										<option value="banana">香蕉</option>
										<option value="orange">桔子</option>
									</select>									
								</div>
							</div>
						</div>
						<div class="clear"></div>


						<div class="bottom_list_detail">
							<div class="bottom_list_detail_left">
								<div class="num">
									<span>5</span>
								</div>
								<div class="detail">
									<p class="title">已发布过的活动名称</p>
									<p class="text">活动简介，这是一段比较长的活动简介</p>
								</div>
								<div class="author">
									<p class="text">发布者</p>
									<p class="text">Owner's name</p>
								</div>
							</div>
							<div class="bottom_list_detail_right">
								<div class="time">
									<p class="text">发布时间</p>
									<p class="text">2018-11-28 16:20</p>
								</div>
								<div class="progress">
									<div class="statusList">
									　　<div class="scheduleGray">
									  　　<div class="scheduleGreen"></div>
									　　</div>
									</div>
								</div>
								<div class="operation">
									<a href="#">编辑</a>
									<select class="form-control">
										<option value="">更多</option>
										<option value="apple">苹果</option>
										<option value="banana">香蕉</option>
										<option value="orange">桔子</option>
									</select>									
								</div>
							</div>
						</div>
						<div class="clear"></div>


						<div class="bottom_list_detail">
							<div class="bottom_list_detail_left">
								<div class="num">
									<span>6</span>
								</div>
								<div class="detail">
									<p class="title">已发布过的活动名称</p>
									<p class="text">活动简介，这是一段比较长的活动简介</p>
								</div>
								<div class="author">
									<p class="text">发布者</p>
									<p class="text">Owner's name</p>
								</div>
							</div>
							<div class="bottom_list_detail_right">
								<div class="time">
									<p class="text">发布时间</p>
									<p class="text">2018-11-28 16:20</p>
								</div>
								<div class="progress">
									<div class="statusList">
									　　<div class="scheduleGray">
									  　　<div class="scheduleGreen"></div>
									　　</div>
									</div>
								</div>
								<div class="operation">
									<a href="#">编辑</a>
									<select class="form-control">
										<option value="">更多</option>
										<option value="apple">苹果</option>
										<option value="banana">香蕉</option>
										<option value="orange">桔子</option>
									</select>									
								</div>
							</div>
						</div>
						<div class="clear"></div>
					</div>
					<div class="bottom_page">
						<div class="page">
							<ul class="pagination">
							  <li><a href="#">«</a></li>
							  <li><a href="#">1</a></li>
							  <li><a class="active" href="#">2</a></li>
							  <li><a href="#">3</a></li>
							  <li><a href="#">4</a></li>
							  <li><a href="#">5</a></li>
							  <li><a href="#">6</a></li>
							  <li><a href="#">7</a></li>
							  <li><a href="#">»</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 页尾 -->
		<%@include file="footer.jsp"%>
	</div>
</body>
</html>