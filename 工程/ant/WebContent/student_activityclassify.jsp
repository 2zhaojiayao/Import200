<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个人页面_活动分类</title>
<link rel="stylesheet" type="text/css"
	href="css/student_activityclassify.css">
<link rel="stylesheet" type="text/css"
	href="css/student_activityclassify_ul.css">

</head>
<body>
	<!-- header -->
	<%@include file="student_header.jsp"%>
	<!--type-->
	<div class="assembly">
		<div class="breadcrumb">
			<a href="#">首页</a> &nbsp/&nbsp <a href="#" id="orange">活动</a>
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
	<%@include file="student_activityclassify_ul.jsp"%>
	<script type="text/javascript" src="js/student_activityclassify_ul.js"></script>

	<!--conter-->
	<div class="activities_conter">
		<div class="activities">
			<c:forEach var="activity" items="${activities}">
				<%-- 	<c:forEach var="c" items="${popcake}"> --%>
				<div class="activity_object">
					<a href=""><img src="${activity[2]}"></a>
					<ul>
						<li><a href="#">${activity[0]}</a></li>
						<li><p id="grey">${activity[3]}</p></li>
						<li id="grey">报名人数:${activity[4]}</li>
					</ul>
				</div>
			</c:forEach>
		</div>
		<div class="clear"></div>
		<!--  <a class="nextPage" href="#"> 下一页</a> -->
		<div class="page">
			<div class="lastPage">
				<c:if test="${pageNo>1}">
					<a href="beforeSearch?pageNo=${pageNo-1}">上一页</a>
				</c:if>
			</div>
			<div class="pageNo">
				<span>${pageNo}</span>/<span>${pageNum}</span>
			</div>
			<div class="nextPage">
				<c:if test="${pageNo<pageNum}">
					<a href="beforeSearch?pageNo=${pageNo+1}">下一页</a>
				</c:if>
			</div>
		</div>
	</div>

	<!--footer-->
	<%@include file="footer.jsp"%>

</body>

</html>