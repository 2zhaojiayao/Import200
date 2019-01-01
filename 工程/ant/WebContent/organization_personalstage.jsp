<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>PersonalSatge</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css"
	href="css/organization_personalstage.css">
</head>
<body>
	<table class="table3-0" cellspacing="0" cellpadding="0">
		<tr style="background-color: #e5e5e5">
			<td style="width: 25%">学号</td>
			<td style="width: 25%">姓名</td>
			<td style="width: 25%">活动详情</td>
			<td style="width: 25%"></td>
		</tr>
		<form action="toparticipation?activityid=${activityid }&&pageNum=${participation.currentPageNum}" method="post"
					enctype="multipart/form-data">
		<c:forEach items="${participation.list }" var="parter">
		<tr>
			<td>${parter[0].id }<input type="hidden" name="stuid" value="${parter[0].id }"></td>
			<td>${parter[0].name }</td>
			<td><select name="stustage" class="sty1">
			<option>${parter[1].stage }</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		</c:forEach>
<!--  		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>
		<tr>
			<td>2016011XXX</td>
			<td>嘟嘟暴龙</td>
			<td><select name="" class="sty1"><option value="s">报名</option>
					<option>参加</option>
					<option>初赛</option>
					<option>决赛</option></select></td>
			<td><button class="button">编辑</button></td>
		</tr>-->
		<tr height="75" class="changecolor">
			<td colspan="4"><a href="toparticipationall?activityid=${activityid }&&pageNum=${participation.prePageNum}" class="previous"> 上一页 </a> 
			${participation.currentPageNum}/${participation.totalPageNum } 
			<a href="toparticipationall?activityid=${activityid }&&pageNum=${participation.nextPageNum}" class="next"> 下一页 </a>
	</table>
	<button class="button-submit">提交</button>
	</td>
	</tr>
	</form>
</body>
<script type="text/javascript"
	src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</html>