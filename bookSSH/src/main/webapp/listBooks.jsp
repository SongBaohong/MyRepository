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
	padding: 30px 0 0 27px;
	width: 733px;
	border: 1px solid red;
	height: 450px;
	overflow: hidden;
	box-sizing: border-box;
	position: relative;
}

.right th {
	width: 74px;
	height: 30px;
}

.right td {
	width: 74px;
	height: 26px;
	text-align: center;
	
}

.right td a {
	font-size: 16px;
	color: #3c3c3c;
	font-weight: bold;
}
.right .span {
	position: absolute;
    bottom: -2px;
    left: 173px;
}
.right .span a{
	font-size: 15px;
    color: teal;
    margin-right: 14px;
}
.right .span input{
	width: 50px;
    text-align: center;

}
.right .span h3{
	display: inline-block;
    font-size: 15px;
    color: darkgreen;
    margin-left: 10px;
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
		<div class="right">
			<table border="1">
				<tr>
					<th>编号</th>
					<th>书名</th>
					<th>作者</th>
					<th>价格</th>
					<th>数量</th>
					<th>操作</th>
					<th>操作</th>
					<th>操作</th>
				</tr>
		
			<c:forEach items="${list }" var="book">
				<tr>
					<td>${book.id}</td>
					<td>《${book.bookName}》</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookPrice}*${book.bookDiscount}</td>
					<td>${book.bookCount}</td>
					<td><a href="SelectDetailByIdAction?id=${book.id}" >详情</a></td>
					<td><a href="updateAction?id=${book.id}">更新</a></td>
					<td><a href="DeleteAction?id=${book.id}">删除</a></td>
				</tr>
			</c:forEach>
			
			
			</table>
			
			<span class="span">
				<a href="PageServlet">首页</a>
				<a href="PageServlet?">上一页</a>
				<a href="PageServlet?">下一页</a>
				<a href="PageServlet">尾页</a>
				<input type="text" name="pa" placeholder="跳页"><h3>共5页</h3>
				</span>
		</div>

	</div>
</body>
</html>