<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>个人页面_完善信息</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="css/header_footer.css">
    <link rel="stylesheet" type="text/css" href="css/three_register.css">
    <script type="text/javascript" src="js/three_register.js"></script>
</head>
<body>
    <script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
    <div class="wrapper">
        <div class="logo"><img src="images/logo2.png"></div>
        <div class="msg">
            <span>为了统计您的活动参与情况，请完善您的信息
            </span>
        </div>
        <div class="article">
            <div class="reg">
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
                    <div class="submit">
                        <input type="submit" class="submit" value="提交">
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
