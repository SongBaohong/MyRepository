<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
	padding: 24px 0 0 80px;
	width: 733px;
	border: 1px solid red;
	height: 450px;
	overflow: hidden;
	font-size: 18px;
	color: #3c3c3c;
	box-sizing: border-box;
}

.right  h1 {
	line-height: 44px;
	font-size: 16px;
	display: inline;
}

.right  h2 {
	line-height: 44px;
	font-size: 14px;
	display: inline;
}

.right .lia {
	font-size: 18px;
	margin-left: 169px;
	margin-top: 15px;
}

.right .lia a {
	color: blue;
	margin-right: 100px;
}
</style>
<body>
	<div class="wrap">
		<div class="first"></div>
		<ul class="left">
			<li><a href="index.html"><em>&gt</em> 首 &nbsp;
					&nbsp;&nbsp;&nbsp;页</a></li>
			<li><a href="bookRegister.jsp"><em>&gt</em> 入库登记</a></li>
			<li><a href="SelectAllAction"><em>&gt</em> 库存列表</a></li>
		</ul>
		<div class="right">
			<form method="post"
				action="<%=request.getContextPath() %>/BookRegisterAction">

				<h1>书名：</h1>
				<input type="text" name="bookName" value="${ param.bookName}">
				<br />

				<h1>类别：</h1>
				<input type="checkbox" name="bookClass" value="科学">
				<h2>科学</h2>
				<input type="checkbox" name="bookClass" value="教育">
				<h2>教育</h2>
				<input type="checkbox" name="bookClass" value="文学">
				<h2>文学</h2>
				<input type="checkbox" name="bookClass" value="生活">
				<h2>生活</h2>
				<input type="checkbox" name="bookClass" value="其他">
				<h2>其他</h2>
				<br />

				<h1>作者：</h1>
				<input type="text" name="bookAuthor" value="${param.bookAuthor}">
				<br />

				<h1>折扣：</h1>
				<input type="radio" name="bookDiscount" value="1.0"
					<c:if test="${param.bookDiscount eq 1}"> checked </c:if>>
				<h2>全价</h2>
				<input type="radio" name="bookDiscount" value="0.9"
					<c:if test="${param.bookDiscount eq 0.9 }"> checked </c:if>>
				<h2>9折</h2>
				<input type="radio" name="bookDiscount" value="0.8"
					<c:if test="${ param.bookDiscount eq 0.8 }"> checked </c:if>>
				<h2>8折</h2>
				<input type="radio" name="bookDiscount" value="0.7"
					<c:if test="${ param.bookDiscount eq 0.7 }"> checked</c:if> />
				<h2>7折</h2>
				<input type="radio" name="bookDiscount" value="0.6"
					<c:if test="${ param.bookDiscount eq 0.6 }">checked</c:if> />
				<h2>6折</h2>
				
				<br />

				<h1>价格：</h1>
				<input type="text" name="bookPrice" value="${ param.bookPrice}"> 
				<br />

				<h1>数量：</h1>
				<input type="text" name="bookCount" value="${ param.bookCount}">
				<br />
				<div class="ll">
					<h1>简介：</h1>
					<input type="text" name="bookIntroduce"
						value="${ param.bookIntroduce}">
				</div>
				<div class="lia">
					<input type="submit" name="" value="提交"> <input
						type="reset" name="" value="重置">
				</div>
			</form>

		</div>

	</div>
</body>
</html>
