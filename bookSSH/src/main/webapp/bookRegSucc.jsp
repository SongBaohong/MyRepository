<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	padding: 50px 0 0 110px;
	width: 733px;
	border: 1px solid red;
	height: 450px;
	overflow: hidden;
	font-size: 18px;
	color: #3c3c3c;
	box-sizing: border-box;
}
.right a{
	color: burlywood;
    font-size: 20px;
    font-family: serif;
    font-weight: bold;
    margin-left: 395px;
    line-height: 96px;

}
</style>
<body>
	<div class="wrap">
		<div class="first"></div>
		<ul class="left">
			<li><a href="index.html"><em>&gt</em> 首 &nbsp; &nbsp;&nbsp;&nbsp;页</a></li>
			<li><a href="bookRegister.jsp"><em>&gt</em> 入库登记</a></li>
			<li><a href="listBooks.jsp"><em>&gt</em> 库存列表</a></li>
		</ul>
		
		<ul class="right">
		
			<h1>成功登记《${bookName}》书籍库存</h1>
			<a href="BookDetailNameAction?bookName=${bookName}">查看详情</a>
			<%-- <% 
				String bookName = (String)request.getAttribute("bookName");
				request.setAttribute("bookName", bookName);
				/* out.print(bookName); */
			%> --%>
		</ul>

	</div>
</body>
</html>