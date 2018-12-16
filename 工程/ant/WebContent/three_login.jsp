<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!--header -->
<head>
<meta charset="UTF-8">
<title>login-小蚂蚁</title>
<link rel="stylesheet" href="css/three_login.css">
<script type="text/javascript" src="js/three_login.js"></script>
</head>
<body>

	<!--轮播图-->
	<div class="container">
		<div class="login_body l_clear">
			<div id="container_img">
				<div id="list">
					<img src="images/bj5.jpg" alt="1" />
				</div>
			</div>
			<!--日历-->
			<div class="calendar">
				<div class="title">
					<h1 class="orange" id="calendar-title">Month</h1>
					<h2 class="orange" id="calendar-year">Year</h2>
					<a href="" id="cpre">&lt;</a> <a href="" id="cnext">&gt;</a>
				</div>

				<div class="body">
					<div class="lightgrey body-list">
						<ul>
							<li>SUN</li>
							<li>MON</li>
							<li>TUE</li>
							<li>WED</li>
							<li>THU</li>
							<li>FRI</li>
							<li>SAT</li>
						</ul>
					</div>

					<div class="darkgrey body-list">
						<ul id="days">

						</ul>
					</div>
				</div>
			</div>
			<!--登录界面-->
			<div class="login_form l_float">

				<div class="login_top">

					<div class="login_tags b_clear">
						<span class="top_tag l_float active" onClick="PwdLogin()">个人登录</span>
						<span class="top_tag m_float" onClick="QrcodeLogin()">班委登录</span>
						<span class="top_tag r_float" onClick="OgniLogin()">组织登录</span>
					</div>
				</div>
				<div class="login_con">
					<form action="stu_login" method="POST">
						<div>
							<label for="user_name">用户名</label> <input type="text" name="id"
								id="user_name" placeholder="账号为学号"> <img
								src="images/icons/user.svg">
							<p class="tips hidden">请检查您的账号</p>
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message1 } </font>
						</div>
						<div>
							<label for="user_pwd">密码</label> <input type="password"
								name="pwd" id="user_pwd" placeholder="请输入账户密码"> <img
								src="images/icons/lock.svg">
							<p class="tips hidden">请检查您的密码</p>
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message2 } </font>
						</div>
						<div class="b_clear">
							<label for="auth_code" class="b_clear">验证码</label> <input
								type="text" name="vcode" id="auth_code" class="l_float"
								maxlength="5" size="5"> <img src="vert" id="image"
								class="auth_code l_float">&nbsp;<a
								href="javascript:change()" class="l_float1">看不清，换一张</a> &nbsp;<br />
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message } </font>
						</div>
						<div class="b_clear submit">
							<a href="#" class="r_float">注册账号</a> <a href="#" class="r_float">忘记密码？</a>
							<button type="submit">登&nbsp;&nbsp;录</button>
							<p class="tips hidden">登录失败，请检查您的账户与密码</p>
						</div>
					</form>
				</div>
				<div class="login_con hidden">
					<form action="mon_login" method="POST">
						<div>
							<label for="user_name">用户名</label> <input type="text"
								name="email" id="user_name" placeholder="账号为班委邮箱"> <img
								src="images/icons/user.svg">
							<p class="tips hidden">请检查您的账号</p>
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message1 } </font>
						</div>
						<div>
							<label for="user_pwd">密码</label> <input type="password"
								name="pwd" id="user_pwd" placeholder="请输入账户密码"> <img
								src="images/icons/lock.svg">
							<p class="tips hidden">请检查您的密码</p>
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message2 } </font>
						</div>
						<div class="b_clear">
							<label for="auth_code" class="b_clear">验证码</label> <input
								type="text" name="vcode" id="auth_code" class="l_float"
								maxlength="5" size="5"> <img src="vert" id="image"
								class="auth_code l_float">&nbsp;<a
								href="javascript:change()" class="l_float1">看不清，换一张</a> &nbsp;<br />
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message } </font>

						</div>
						<div class="b_clear submit">
							<a href="#" class="r_float" id="orange">注册账号</a> <a href="#"
								class="r_float" id="orange">忘记密码？</a>
							<button type="submit">登&nbsp;&nbsp;录</button>

							<p class="tips hidden">登录失败，请检查您的账户与密码</p>
						</div>
					</form>

				</div>
				<div class="login_con hidden">
					<form action="org_login" method="POST">
						<div>
							<label for="user_name">用户名</label> <input type="text"
								name="email" id="user_name" placeholder="账号为组织邮箱"> <img
								src="images/icons/user.svg">
							<p class="tips hidden">请检查您的账号</p>
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message1 } </font>
						</div>
						<div>
							<label for="user_pwd">密码</label> <input type="password"
								name="pwd" id="user_pwd" placeholder="请输入账户密码"> <img
								src="images/icons/lock.svg">
							<p class="tips hidden">请检查您的密码</p>
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message2 } </font>
						</div>
						<div class="b_clear">
							<label for="auth_code" class="b_clear">验证码</label> <input
								type="text" name="vcode" id="auth_code" class="l_float"
								maxlength="5" size="5"> <img src="vert" id="image"
								class="auth_code l_float">&nbsp;<a
								href="javascript:change()" class="l_float1">看不清，换一张</a> &nbsp;<br />
							<!-- 获取信息和显示错误信息 -->
							<font color="red"> ${message } </font>
						</div>
						<div class="b_clear submit">
							<a href="three_register.jsp" class="r_float">注册账号</a> <a href="#"
								class="r_float">忘记密码？</a>
							<button type="submit">登&nbsp;&nbsp;录</button>

							<p class="tips hidden">登录失败，请检查您的账户与密码</p>
						</div>
					</form>

				</div>

			</div>

		</div>
		<!-- 页尾 -->
		<%@include file="footer.jsp"%>
</body>
</html>
