<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ page import="service.BookService" %>
<%@ page import="model.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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
	padding: 30px 0 0 70px;
	width: 733px;
	border: 1px solid red;
	height: 450px;
	overflow: hidden;
	box-sizing: border-box;
}

.right li {
	line-height: 30px;
}

.right h1 {
	font-size: 16px;
	color: #3c3c3c;
}

.right h2 {
	display: inline;
	font-size: 16px;
}

.right .into div {
	font-size: 14px;
	color: #3c3c3c;
	width: 378px;
	height: 100px;
	display: inline-block;
}
.right .into  a{
	margin-left: 35px;
    font-size: 17px;
    color: lightslategray;
}
.right .sec{
	float: right;
    margin-right: 109px;
    font-size: 18px;
    color: lightslategray;
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
			
			<li>
				<h1>编号：${book.id }</h1>
			</li>
			<li>
				<h1>书名：《${book.bookName }》</h1>
			</li>
			<li>
				<h1>类别：${book.bookClass }</h1>
			</li>
			<li>
				<h1>作者：${book.bookAuthor}</h1>
			</li>
			<li>
				<h1>折扣：${book.bookDiscount }</h1>

			</li>
			<li>
				<h1>价格：${book.bookPrice }</h1>
			</li>
			<li>
				<h1>数量：${book.bookCount }<a class="sec" href="SelectAllAction">返回列表</a></h1>
				
			</li>
			<li class="into">
				<h2>简介：</h2>
				<div><h2>${book.bookIntroduce }</h2></div>
				<a href="DeleteAction?id=${book.id}">删除此书籍</a>
				<a href="index.html">退出</a>
			</li>

		</ul>

	</div>
</body>
</html>