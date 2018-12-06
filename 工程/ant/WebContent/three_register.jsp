<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <link rel="stylesheet" type="text/css" href="css/three_register.css">
    <link rel="stylesheet" type="text/css" href="css/header_footer.css"
	media="all">
    <script type="text/javascript" src="js/three_register.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
</head>
<body>
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
                <form>
                    <div class="top_id">
                        <input type="text" name="userName" placeholder="学号">
                    </div>
                    <div class="normal">
                        <input type="text" name="userName" placeholder="姓名">
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="6-16位密码，区分大小写">
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="确认密码">
                    </div>
                    <label class="sex">
                        <span class="sex_span">性别</span>
                    </label>
                    <label class="sex_man">
                        <input type="radio" name="sex">男
                    </label>
                    <label class="sex_woman">
                        <input type="radio" name="sex">女
                    </label>
                    <div class="normal">
                        <input type="email" name="email" placeholder="邮箱">
                    </div>
                    <label class="textCode">
                        <input type="text" name="textCode" placeholder="输入验证码">
                        <img src="images/textCode.png">
                    </label>
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
                            <option value="">学院</option>
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="">专业</option>
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="">年级</option>
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="">班级</option>
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="6-16位密码，区分大小写">
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="确认密码">
                    </div>
                    <div class="normal">
                        <input type="email" name="email" placeholder="邮箱">
                    </div>
                    <label class="textCode">
                        <input type="text" name="textCode" placeholder="输入验证码">
                        <img src="images/textCode.png">
                    </label>
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
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="">专业（若为校级组织，则填选无）</option>
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="select_normal">
                        <select>
                            <option value="">组织名</option>
                            <option value="apple">软件学院</option>
                            <option value="banana">数信学院</option>
                            <option value="orange">化学学院</option>
                        </select>
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="6-16位密码，区分大小写">
                    </div>
                    <div class="normal">
                        <input type="password" name="pwd" placeholder="确认密码">
                    </div>
                    <div class="normal">
                        <input type="email" name="email" placeholder="邮箱">
                    </div>
                    <label class="textCode">
                        <input type="text" name="textCode" placeholder="输入验证码">
                        <img src="images/textCode.png">
                    </label>
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
<script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</html>
