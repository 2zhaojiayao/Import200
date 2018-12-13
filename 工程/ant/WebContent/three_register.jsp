<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <link rel="stylesheet" type="text/css" href="css/three_register.css">
    <link rel="stylesheet" type="text/css" href="css/header_footer.css"
	media="all">
	<script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/three_register.js"></script>
</head>
<body>
    <script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
    <div class="wrapper">
        <div class="logo"><img src="images/logo2.png"></div>
        <div class="article">
            <div class="nav">
                <div class="top_tag nav_person active"><span onClick="personReg()">个人注册</span></div>
                <div class="top_tag nav_class" onClick="classReg()"><span>班委注册</span></div>
                <div class="top_tag nav_org" onClick="orgReg()"><span>组织注册</span></div>
            </div>
            <div class="clear"></div>
            <div class="reg show">
                <form action="studentRegister" method="post">
                	<div class="admitp">
                		<p id="admitStudentRegister" name="admitStudentRegister">${admitStudentRegister }</p>
                	</div>               	
                    <div class="top_id">
                        <input id="student_id" type="text" name="id" placeholder="学号">
                        <p id="top_id_msg"></p>
                    </div>
                    <div class="normal">
                        <input id="name" type="text" name="name" placeholder="请填写您的真实姓名">
                        <p id="name_msg"></p>
                    </div>
                    <div class="normal">
                        <input id="psd" type="password" name="password" placeholder="密码6~18位，以字母开头，只能包含字母、数字和下划线">
                        <p id="psd_msg"></p>
                    </div>
                    <div class="normal">
                        <input id="againpsd" type="password" name="againpwd" placeholder="确认密码">
                        <p id="againpsd_msg"></p>
                    </div>
                    <label class="sex">
                        <span class="sex_span">性别</span>
                    </label>
                    <label class="sex_man">
                        <input type="radio" name="gender" checked value="男">男
                    </label>
                    <label class="sex_woman">
                        <input type="radio" name="gender" value="女">女
                    </label>
                    <p id="sex_msg"></p>
                    <div class="normal">
                        <input id="email" type="email" name="email" placeholder="邮箱">
                        <p id="email_psg"></p>
                    </div>
                    <div class="regist">
                        <input id="student_submit" type="submit" class="submit" value="注册">
                        <a href="#">已有账户？登录</a>
                    </div>
                </form>
            </div>
            <div class="reg hidden">
                <form>
                    <div class="select_college">
                        <select id="college">
                            <option value="0">学院</option>
                            <c:forEach items="${college }" var="col">
						        <option value="${col }">${col.name }</option>
						   	</c:forEach>
                        </select>
                        <p id="college_msg"></p>
                    </div>
                    <div class="select_normal">
                        <select id="profession">
                            <option value="0">专业</option>
                            <c:forEach items="${college }" var="col">
						        <c:forEach items="${col.professions }" var="pro">
						        	<option value="${pro.id }">${pro.name }</option>
						   		</c:forEach>
						   	</c:forEach>
                        </select>
                        <p id="profession_msg"></p>
                    </div>
                    <div class="select_normal">
                        <select id="grade">
                            <option value="0">年级</option>
                            <c:forEach items="${grade }" var="gra">
						        <option value="${gra }">${gra }年级</option>
						   	</c:forEach>
                        </select>
                        <p id="grade_msg"></p>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="0">班级</option>
                            <option value="1">1班</option>
                            <option value="2">2班</option>
                            <option value="3">3班</option>
                            <option value="4">4班</option>
                            <option value="5">5班</option>
                            <option value="6">6班</option>
                            <option value="7">7班</option>
                            <option value="8">8班</option>
                            <option value="9">9班</option>
                            <option value="10">10班</option>
                            <option value="11">11班</option>
                            <option value="12">12班</option>
                        </select>
                        <p id="class_msg"></p>
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="6-16位密码，区分大小写">
                        <p id="psd_msg"></p>
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="确认密码">
                        <p id="againpsd_msg"></p>
                    </div>
                    <div class="normal">
                        <input type="email" name="email" placeholder="邮箱">
                        <p id="email_msg"></p>
                    </div>
                    <div class="regist">
                        <input type="submit" class="submit" value="注册">
                        <a href="">已有账户？登录</a>
                    </div>
                </form>
            </div>
            <div class="reg hidden">
                <form>
                    <div class="select_college">
                        <select>
                            <option value="">所属单位</option>
                            <option value="apple">河北师范大学</option>
                            <c:forEach items="${college }" var="col">
						        <option value="${col.id }">${col.name }</option>
						   	</c:forEach>
                        </select>
                        <p id="college_msg"></p>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="">组织名</option>
                            <option value="apple">团委</option>
                            <option value="banana">青协</option>
                            <option value="orange">学生会</option>
                            <option value="orange">社团</option>
                        </select>
                        <p id="org_msg"></p>
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="6-16位密码，区分大小写">
                        <p id="psd_msg"></p>
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="确认密码">
                        <p id="againpsd_msg"></p>
                    </div>
                    <div class="normal">
                        <input type="email" name="email" placeholder="邮箱">
                        <p id="email_msg"></p>
                    </div>        
                    <div class="regist">
                        <input type="submit" class="submit" value="注册">
                        <a href="">已有账户？登录</a>
                    </div>
                </form>
            </div>
        </div>
        <!-- 页尾 -->
        <%@include file="footer.jsp"%>
    </div>
</body>
</html>
