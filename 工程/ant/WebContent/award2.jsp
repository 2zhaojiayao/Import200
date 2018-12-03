<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html lang="zh_cn">
<head>
<meta charset="utf-8">
<link type="text/css" href="css/award2.css" rel="stylesheet">
<link type="text/css" href="css/header_footer.css" rel="stylesheet">
<title>评奖评优</title>
</head>

<body>
	<%@include file="header.jsp"%>
<div class="content">
	<div  id="steps">
	   <ol class="ui-step ui-step-yellow ui-step-3">
			<li class="step-start step-done">
				<div class="ui-step-line"></div>
				<div class="ui-step-cont">
					<span class="ui-step-cont-number">1</span>
					<span class="ui-step-cont-text">核对活动参与情况</span>
				</div>
			</li>
			<li class="step-start step-done">
                <div class="ui-step-line"></div>
				<div class="ui-step-cont">
					<span class="ui-step-cont-number">2</span>
					<span class="ui-step-cont-text">导入学业水平成绩</span>
				</div>
			</li>
			<li class="step-active">
				<div class="ui-step-line"></div>
				<div class="ui-step-cont">
					<span class="ui-step-cont-number">3</span>
					<span class="ui-step-cont-text">导入品德表现测评结果</span>
				</div>
			</li>
			<li class="step-end">
				<div class="ui-step-line"></div>
				<div class="ui-step-cont">
					<span class="ui-step-cont-number">4</span>
					<span class="ui-step-cont-text">生成综测成绩单</span>
				</div>
			</li>
		</ol>
	</div>
	<div class="tips"> 
		<img src="images/tips.svg">
		<span>提示：在导入品德测评结果之前，请先核对活动参与情况</span>
	</div>	
    <div class="button1">
    	<a href="#">导入品德测评结果表</a>
    </div>
</div>
	<%@include file="footer.jsp"%>				
</body>
</html>