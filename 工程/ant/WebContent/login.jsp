<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!--header -->
    <head>
        <meta charset="UTF-8">
        <title>login-小蚂蚁</title>
        <link rel="stylesheet" href="css/login.css">
         <script src="js/login.js"></script> 
    </head>
    <body>

        <header>
            <nav class="b_clear">
                <div class="nav_logo l_float">
                    <img src="images/logo2.png" alt="">
                </div>
                
            </nav>
    </header>


        <!--轮播图-->
        <div class="container">
            <div class="login_body l_clear">
                <div id="container_img">
                    <div id="list" style="left: -1859px;">
                     <img src="images/bj5.jpg" alt="1" />
                     <img src="images/bj1.jpg" alt="1" />
                     <img src="images/bj2.jpg" alt="2" />
                     <img src="images/bj3.jpg" alt="3" />
                     <img src="images/bj4.jpg" alt="4" />
                     <img src="images/bj5.jpg" alt="5" />
                     <img src="images/bj1.jpg" alt="5" />
                    </div>
                   <div id="buttons">
                    <span index="1" class="on"></span>
                    <span index="2"></span>
                    <span index="3"></span>
                    <span index="4"></span>
                    <span index="5"></span>
                   </div>
                   <a href="javascript:;" id="prev" class="arrow">&lt;</a>
                   <a href="javascript:;" id="next" class="arrow">&gt;</a>
               </div>
<!--日历-->
                <div class="calendar">
                    <div class="title">
                     <h1 class="orange" id="calendar-title">Month</h1>
                      <h2 class="orange" id="calendar-year">Year</h2>
                     <a href="" id="cpre">&lt;</a>
                     <a href="" id="cnext">&gt;</a>
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
                        <form action="" method="POST">
                            <div>
                                <label for="user_name">用户名</label>
                                <input type="text" name="" id="user_name" placeholder="账号为学号">
                                <img src="images/icons/user.svg">
                                <p class="tips hidden">请检查您的账号</p>
                            </div>
                            <div>
                                <label for="user_pwd">密码</label>
                                <input type="password" name="" id="user_pwd" placeholder="请输入账户密码">
                                <img src="images/icons/lock.svg">
                                <p class="tips hidden">请检查您的密码</p>
                            </div>
                            <div class="b_clear">
                                <label for="auth_code" class="b_clear">验证码</label>
                                <input type="text" name="" id="auth_code" placeholder="填写验证码" class="l_float" maxlength="6">
                                
                                <button class="auth_code l_float">获取验证码</button>
                                <img src="images/icons/auth_code.svg">
                                <p class="tips hidden">验证码错误</p>
                                
                            </div>
                            <div class="b_clear submit">
                                <a href="#" class="r_float">注册账号</a>
                                <a href="#" class="r_float">忘记密码？</a>
                                <button type="submit">登&nbsp;&nbsp;录</button>
                                
                                <p class="tips hidden">登录失败，请检查您的账户与密码</p>
                            </div>
                        </form>   
                    </div>
                    <div class="login_con hidden">
                        <form action="" method="POST">
                            <div>
                                <label for="user_name">用户名</label>
                                <input type="text" name="" id="user_name" placeholder="账号为班委邮箱">
                                <img src="images/icons/user.svg">
                                <p class="tips hidden">请检查您的账号</p>
                            </div>
                            <div>
                                <label for="user_pwd">密码</label>
                                <input type="password" name="" id="user_pwd" placeholder="请输入账户密码">
                                <img src="images/icons/lock.svg">
                                <p class="tips hidden">请检查您的密码</p>
                            </div>
                            <div class="b_clear">
                                <label for="auth_code" class="b_clear">验证码</label>
                                <input type="text" name="" id="auth_code" placeholder="填写验证码" class="l_float" maxlength="6">
                                
                                <button class="auth_code l_float">获取验证码</button>
                                <img src="images/icons/auth_code.svg">
                                <p class="tips hidden">验证码错误</p>
                                
                            </div>
                            <div class="b_clear submit">
                                <a href="#" class="r_float" id="orange">注册账号</a>
                                <a href="#" class="r_float" id="orange">忘记密码？</a>
                                <button type="submit">登&nbsp;&nbsp;录</button>
                                
                                <p class="tips hidden">登录失败，请检查您的账户与密码</p>
                            </div>
                        </form>  
                        
                    </div>
                    <div class="login_con hidden">
                        <form action="" method="POST">
                            <div>
                                <label for="user_name">用户名</label>
                                <input type="text" name="" id="user_name" placeholder="账号为组织邮箱">
                                <img src="images/icons/user.svg">
                                <p class="tips hidden">请检查您的账号</p>
                            </div>
                            <div>
                                <label for="user_pwd">密码</label>
                                <input type="password" name="" id="user_pwd" placeholder="请输入账户密码">
                                <img src="images/icons/lock.svg">
                                <p class="tips hidden">请检查您的密码</p>
                            </div>
                            <div class="b_clear">
                                <label for="auth_code" class="b_clear">验证码</label>
                                <input type="text" name="" id="auth_code" placeholder="填写验证码" class="l_float" maxlength="6">
                                
                                <button class="auth_code l_float">获取验证码</button>
                                <img src="images/icons/auth_code.svg">
                                <p class="tips hidden">验证码错误</p>
                                
                            </div>
                            <div class="b_clear submit">
                                <a href="#" class="r_float" >注册账号</a>
                                <a href="#" class="r_float">忘记密码？</a>
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
