<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>活动详情</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/detail.js"></script>
<link rel="stylesheet" type="text/css"
	href="css/student_activitydetail.css">
<link rel="stylesheet" type="text/css" href="css/detail.css">
<link rel="stylesheet" type="text/css" href="css/header_footer.css"
	media="all">
</head>
<body>
	<!--header-->
	<%@include file="student_header.jsp"%>
	<!--main-->
	<div class="main">
		<div class="main_top">
			<span class="main_top_left1"><a href="index.jsp">首页</a></span>
			&nbsp;/&nbsp; <span class="main_top_left1"><a href="#">活动</a></span>
			&nbsp;/&nbsp; <span class="main_top_left2">活动详情</span>
		</div>
		<div class="main_center">
			<span class="main_center_left">${activitydetail.name }</span>
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
					<img src="${activitydetail.image }">
				</div>
				<div class="content_text">
					<form action="#" name="fileForm">
						<table>
							<tr class="tr">
								<td class="td1">活动名称</td>
								<td class="td2">${activitydetail.name }</td>
							</tr>
							<tr class="tr">
								<td class="td1">活动简介</td>
								<td class="td2"><div id="td2_box">${activitydetail.description }------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</div></td>
							</tr>
							<tr class="tr">
								<td class="td1">级别</td>
								<td class="td2">${activitydetail.level }</td>
							</tr>
							<tr class="tr">
								<td class="td1">举办者</td>
								<td class="td2">${activitydetail.organization.name}</td>
							</tr>
							<tr class="tr">
								<td class="td1">参与对象</td>
								<td class="td2">${activitydetail.participant}</td>
							</tr>
							<tr class="tr">
								<td class="td1">报名截止时间</td>
								<td class="td2">${activitydetail.applyEnd}</td>
							</tr>
							<tr class="tr">
								<td class="td1">活动起止时间</td>
								<td class="td2">${activitydetail.holdBegin}&nbsp;——&nbsp;${activitydetail.holdEnd}</td>
							</tr>
							<tr class="tr">
								<td class="td1">是否需要面试</td>
								<td class="td2">${activitydetail.isInterview }</td>
							</tr>
							<tr class="tr">
								<td class="td1">参与形式</td>
								<td class="td2">${activitydetail.style }</td>
							</tr>
							<tr class="tr">
								<td class="td1">类型</td>
								<td class="td2">${activitydetail.comprehensiveType }</td>
							</tr>
							<tr class="tr">
								<td class="td1">综测加分</td>
								<td class="td2">${activitystage.score }</td>
							</tr>
						</table>
						<div class="content_submit">
							<input type='button' id="text1" class="button" value="我要报名">
						</div>

						<div id="light" class="main-fixed-comp popup-mask">
							<div class="popup no-bottom boxtop">
								<div class="popup-title">项目协作成员</div>
								<div class="popup-content invite-popup">
									<input class="popup-input search-input" placeholder="请输入团队名称"><br>
									<div id="InputsWrapper">
										<div class="extend">
											<input type="text" name="mytext[]" id="field_1"
												class="popup-input search-input" placeholder="请输入队员 1 的学号" />
											<input type='button' rel="external nofollow"
												class="removeclass" value='删除'>
										</div>
									</div>
									<div class="popup-content cooperator-popup">
										<input type='button' rel="external nofollow"
											id="AddMoreFileBox" class="base-btn invite-btn" value="添加成员">
										<div class="btn2">
											<input type='button' id="text" class="base-btn invite-btn"
												value="确定"> <input type='button' id="text2"
												class="base-btn invite-btn" value="取消">
										</div>

									</div>
								</div>
							</div>

						</div>
						<div id="fade"></div>
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
							<div class="content_right_text1">活动名称</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......</div>
						</div>

					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							<a href="detail.jsp">去看看</a>
						</div>
						<div class="content_right_line"></div>
						<div class="content_right_box2">
							<a href="#">我要报名</a>
						</div>
					</div>
				</div>
				<div class="content_right_box">
					<div class="content_right_box_inside1">
						<img src="images/inside.svg" class="content_right_img">
						<div class="content_right_text">
							<div class="content_right_text1">活动名称</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......</div>
						</div>

					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							<a href="detail.jsp">去看看</a>
						</div>
						<div class="content_right_line"></div>
						<div class="content_right_box2">
							<a href="#">我要报名</a>
						</div>
					</div>
				</div>
				<div class="content_right_box">
					<div class="content_right_box_inside1">
						<img src="images/inside.svg" class="content_right_img">
						<div class="content_right_text">
							<div class="content_right_text1">活动名称</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......</div>
						</div>

					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							<a href="detail.jsp">去看看</a>
						</div>
						<div class="content_right_line"></div>
						<div class="content_right_box2">
							<a href="#">我要报名</a>
						</div>
					</div>
				</div>
				<div class="content_right_box">
					<div class="content_right_box_inside1">
						<img src="images/inside.svg" class="content_right_img">
						<div class="content_right_text">
							<div class="content_right_text1">活动名称</div>
							<div class="content_right_text2">
								这是一段很长的活动简介，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长......</div>
						</div>

					</div>
					<div class="content_right_box_inside2">
						<div class="content_right_box1">
							<a href="detail.jsp">去看看</a>
						</div>
						<div class="content_right_line"></div>
						<div class="content_right_box2">
							<a href="#">我要报名</a>
						</div>
					</div>
				</div>
				<div class="content_submit_two">
					<a href="#"><div class="button">其它热门活动</div></a>
				</div>
			</div>
		</div>
	</div>
	<!--footer-->
	<div class="bottom">
		<%@include file="footer.jsp"%>
	</div>

</body>
<script type="text/javascript"
	src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</html>