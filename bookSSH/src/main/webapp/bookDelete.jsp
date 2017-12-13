<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="service.BookService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
html {
	background-color: yellowgreen;
	font-family: "微软雅黑";
}

ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

li {
	margin: 0;
}

a {
	text-decoration: none;
	font-weight: "微软雅黑";
}

.wrap {
	width: 903px;
	margin: 50px auto;
	border: 1px solid red;
	overflow: hidden;
}

.first {
	height: 128px;
	background: url("pic/banner.png") 0 0 no-repeat;
}

.left {
	width: 170px;
	height: 450px;
	background: url("pic/bg_left.png") 0 0 repeat;
	box-sizing: border-box;
	padding: 52px 0 0 30px;
	line-height: 57px;
	border: 1px solid red;
	float: left;
	overflow: hidden;
}

.left li {
	float: left;
	clear: left;
}

.left a {
	text-decoration: none;
	color: midnightblue;
	font-size: 18px;
	font-weight: 900;
}

.left em {
	font-style: normal;
	color: red;
}

.right {
	float: right;
	background-color: mistyrose;
	padding: 50px 0 0 180px;
	width: 733px;
	border: 1px solid red;
	height: 450px;
	overflow: hidden;
	font-size: 18px;
	color: #3c3c3c;
	box-sizing: border-box;
}
</style>
<body>
	<div class="wrap">
		<div class="first"></div>
		<ul class="left">
			<li><a href="index.html"><em>&gt</em> 首 &nbsp; &nbsp;&nbsp;&nbsp;页</a></li>
			<li><a href="bookRegister.jsp"><em>&gt</em> 入库登记</a></li>
			<li><a href="SelectAllAction"><em>&gt</em> 库存列表</a></li>
		</ul>
		
		<ul class="right">
		
			<h1>删除书籍信息成功</h1>
			<a href="index.html">返回主页面</a>
		</ul>
		
	</div>
</body>
</html>