<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>个人页面_个人中心</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="css/student_personalcenter.css" />
<link rel="stylesheet" type="text/css" href="css/header_footer.css" />
</head>
<body>
	<%@include file="student_header.jsp"%>
	<table>
		<!--页面header-->
		<!--首页/个人首页-->
		<tr>
			<td>
				<table class="table1">
					<tr>
						<td class="tr0td0"><a href="#">首页</a> / <a href="#">个人中心</a>
						</td>
					</tr>
					<tr>
						<td><img src="images/01.png" class="img1"></td>
						<td>
							<p class="table1-ninhao">您好，赵家瑶！</p>
							<br>
							<p class="table1-little">LittleAnt| 最权威的活动展示和统计平台</p>
						</td>
						<td>
							<p class="table1-youshang">
								参加的活动数<br>
							</p>
							<p class="table1-youxia">${activitynum}</p>
						</td>
						<td>
							<p class="table1-youshang">
								综测分数<br>
							</p>
							<p class="table1-youxia">${nowscore}</p>
						</td>
						<td>
							<p class="table1-youshang">
								综测排名<br>
							</p>
							<p class="table1-youxia">${Studentactivitynum}</p>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>

			<table class="table2" cellpadding="0px" cellspacing="0px">
				<tr>
					<td class="table2-tr0td0">
						<!--我报名过的活动-->
						<table class="table5" cellspacing="0" cellpadding="0">
							<tr>
								<td colspan="3" class="table5-tr0">我报名过的活动</td>
							</tr>
							<!--已报名-->
							<tr class="table5-tr1">
								<td colspan="3" class="table5-tr1td0"><a href="#"><img
										src="images/03.png" width="14" height="14"></a>已报名</td>
							</tr>
							<tr class="table5-tr2">
								<td class="table5-tr2td0">
									<div class="table5-tr2td0-div">
										<table class="table6" cellspacing="0" cellpadding="0">
											<tr>
												<td class="table6-tr0td0"><img src="images/04.png"
													class="table6-tr0td0-img"></td>
												<td class="table6-tr0td1"><a href="#"
													name="table6-tr0td1-a">麦"dream"主持人风采大赛</a></td>
											</tr>
											<tr>
												<td colspan="2" class="table6-tr1"></td>
											</tr>
											<tr>
												<td colspan="2" class="table6-tr2">
													&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
											</tr>
											<tr>
												<td colspan="2" class="table6-tr3"></td>
											</tr>
											<tr>
												<td class="table6-tr4td0">数学与信息技术学院</td>
												<td class="table6-tr4td1">2017-03-25</td>
											</tr>
										</table>
									</div>
								</td>
								<td class="table5-tr2td1">
									<table class="table7" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table7-tr0td0"><img src="images/04.png"
												class="table7-tr0td0-img"></td>
											<td class="table7-tr0td1"><a href="#"
												name="table7-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table7-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table7-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table7-tr3"></td>
										</tr>
										<tr>
											<td class="table7-tr4td0">数学与信息技术学院</td>
											<td class="table7-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
								<td class="table5-tr2td2">
									<table class="table8" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table8-tr0td0"><img src="images/04.png"
												class="table8-tr0td0-img"></td>
											<td class="table8-tr0td1"><a href="#"
												name="table8-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table8-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table8-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table8-tr3"></td>
										</tr>
										<tr>
											<td class="table8-tr4td0">数学与信息技术学院</td>
											<td class="table8-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
							</tr>
							<!--进行中-->
							<tr class="table5-tr3">
								<td colspan="3" class="table5-tr3td0"><a href="#"><img
										src="images/03.png" width="14" height="14"></a>进行中</td>
							</tr>
							<tr class="table5-tr4">
								<td class="table5-tr4td0">
									<table class="table9" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table9-tr0td0"><img src="images/04.png"
												class="table9-tr0td0-img"></td>
											<td class="table9-tr0td1"><a href="#"
												name="table9-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table9-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table9-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table9-tr3"></td>
										</tr>
										<tr>
											<td class="table9-tr4td0">数学与信息技术学院</td>
											<td class="table9-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
								<td class="table5-tr4td1">
									<table class="table10" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table10-tr0td0"><img src="images/04.png"
												class="table10-tr0td0-img"></td>
											<td class="table10-tr0td1"><a href="#"
												name="table10-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table10-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table10-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table10-tr3"></td>
										</tr>
										<tr>
											<td class="table10-tr4td0">数学与信息技术学院</td>
											<td class="table10-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
								<td class="table5-tr4td2">
									<table class="table11" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table11-tr0td0"><img src="images/04.png"
												class="table11-tr0td0-img"></td>
											<td class="table11-tr0td1"><a href="#"
												name="table11-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table11-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table11-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table11-tr3"></td>
										</tr>
										<tr>
											<td class="table11-tr4td0">数学与信息技术学院</td>
											<td class="table11-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
							</tr>
							<!--已完成-->
							<tr class="table5-tr5">
								<td colspan="3" class="table5-tr5td0"><a href="#"><img
										src="images/03.png" width="14" height="14"></a>已完成</td>
							</tr>
							<tr class="table5-tr6">
								<td class="table5-tr6td0">
									<table class="table12" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table12-tr0td0"><img src="images/04.png"
												class="table12-tr0td0-img"></td>
											<td class="table12-tr0td1"><a href="#"
												name="table12-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table12-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table12-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table12-tr3"></td>
										</tr>
										<tr>
											<td class="table12-tr4td0">数学与信息技术学院</td>
											<td class="table12-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
								<td class="table5-tr6td1">
									<table class="table13" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table13-tr0td0"><img src="images/04.png"
												class="table13-tr0td0-img"></td>
											<td class="table13-tr0td1"><a href="#"
												name="table13-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table13-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table13-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table13-tr3"></td>
										</tr>
										<tr>
											<td class="table13-tr4td0">数学与信息技术学院</td>
											<td class="table13-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
								<td class="table5-tr6td2">
									<table class="table14" cellspacing="0" cellpadding="0">
										<tr>
											<td class="table14-tr0td0"><img src="images/04.png"
												class="table14-tr0td0-img"></td>
											<td class="table14-tr0td1"><a href="#"
												name="table14-tr0td1-a">麦"dream"主持人风采大赛</a></td>
										</tr>
										<tr>
											<td colspan="2" class="table14-tr1"></td>
										</tr>
										<tr>
											<td colspan="2" class="table14-tr2">
												&nbsp&nbsp&nbsp大赛是面向软件学院全体学生，为提升学生的临场应变能力和语言表...</td>
										</tr>
										<tr>
											<td colspan="2" class="table14-tr3"></td>
										</tr>
										<tr>
											<td class="table14-tr4td0">数学与信息技术学院</td>
											<td class="table14-tr4td1">2017-03-25</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
					<!--留白宽20px-->
					<td class="table2-tr0td1"></td>
					<!--日历+浏览历史-->
					<td>
						<table class="table3" cellpadding="0px" cellspacing="0px">
							<tr>
								<td class="table3-tr0td0">
									<!--日历-->
									<div class='calendar' id='calendar'></div> <script
										type='text/javascript' src='js/student_personalcenter.js'></script>
								</td>
							</tr>

							<tr>
								<td class="table3-tr1td0">
									<!--留白高10px-->
								</td>
							</tr>

							<tr>
								<td class="table3-tr2td0">
									<!--浏览历史-->
									<div class="table4">
										<p class="table4-p">浏览历史</p>
										<div class="table4-div">
											<ul class="table4-divul1">
												<c:forEach items="${scannedActList }" var="scannedAct">
													<li><a href="#">${scannedAct.name }</a></li>
												</c:forEach>
											</ul>
										</div>
										<a href="#" class="table4-a"><img src="images/02.png"
											width="40px" height="40px"></a>
									</div>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</tr>
	</table>
	<%@include file="footer.jsp"%>
</body>
<script type="text/javascript"
	src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</html>