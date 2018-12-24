<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>班委页面_修改活动</title>
<link rel="stylesheet" href="css/amazeui.min.css">
<script type="text/javascript" src="js/amazeui.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<link type="text/css" rel="stylesheet"
	href="css/monitor_updateactivity.css" />
<script type="text/javascript" src="js/monitor_updateactivity.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<link type="text/css" rel="stylesheet"
	href="css/jquery.dataTables.min.css" />
</head>
<body>
	<table id="example" class="display" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th>学号</th>
				<c:forEach var="i" begin="0" end="14">
					<th>活动名称</th>
					<th>分数</th>
				</c:forEach>

			</tr>
		</thead>

		<tfoot>
			<tr>
				<th></th>
				<c:forEach var="i" begin="0" end="14">
					<th></th>
					<th></th>
				</c:forEach>
			</tr>
		</tfoot>

		<tbody>
			<tr>
				<td>${list.get(0) }</td>
				<c:forEach var="i" begin="0" end="14">
					<td><input type="text" name="activity" value="哈哈哈" /></td>
					<td><input type="text" name="score" value="3" /></td>
				</c:forEach>
			</tr>

		</tbody>
	</table>
	<button class="button" type="submit">提交表单</button>
</body>
</html>