<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng Nhập</title>

<style>
html {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background: #1eb9c5;
}

.login-box {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 400px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: rgba(0, 0, 0, .5);
	box-sizing: border-box;
	box-shadow: 0 15px 25px rgba(0, 0, 0, .6);
	border-radius: 10px;
}

.login-box h2 {
	margin: 0 0 30px;
	padding: 0;
	color: #fff;
	text-align: center;
}

.login-box .user-box {
	position: relative;
}

.login-box .user-box input {
	width: 100%;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	margin-bottom: 30px;
	border: none;
	border-bottom: 1px solid #fff;
	outline: none;
	background: transparent;
}

.login-box .user-box label {
	position: absolute;
	top: 0;
	left: 0;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	pointer-events: none;
	transition: .5s;
}

.login-box .user-box input:focus ~ label, .login-box .user-box input:valid 
	~ label {
	top: -20px;
	left: 0;
	color: #03e9f4;
	font-size: 12px;
}

.login-box form a {
	position: relative;
	display: inline-block;
	padding: 10px 20px;
	color: #03e9f4;
	font-size: 16px;
	text-decoration: none;
	text-transform: uppercase;
	overflow: hidden;
	transition: .5s;
	margin-top: 40px;
	letter-spacing: 4px
}

.login-box a:hover {
	background: #03e9f4;
	color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0
		100px #03e9f4;
}

.login-box a span {
	position: absolute;
	display: block;
}

.login-box a span:nth-child(1) {
	top: 0;
	left: -100%;
	width: 100%;
	height: 2px;
	background: linear-gradient(90deg, transparent, #03e9f4);
	animation: btn-anim1 1s linear infinite;
}

@
keyframes btn-anim1 { 0% {
	left: -100%;
}

50
%
,
100
%
{
left
:
100%;
}
}
.login-box a span:nth-child(2) {
	top: -100%;
	right: 0;
	width: 2px;
	height: 100%;
	background: linear-gradient(180deg, transparent, #03e9f4);
	animation: btn-anim2 1s linear infinite;
	animation-delay: .25s
}

@
keyframes btn-anim2 { 0% {
	top: -100%;
}

50
%
,
100
%
{
top
:
100%;
}
}
.login-box a span:nth-child(3) {
	bottom: 0;
	right: -100%;
	width: 100%;
	height: 2px;
	background: linear-gradient(270deg, transparent, #03e9f4);
	animation: btn-anim3 1s linear infinite;
	animation-delay: .5s
}

@
keyframes btn-anim3 { 0% {
	right: -100%;
}

50
%
,
100
%
{
right
:
100%;
}
}
.login-box a span:nth-child(4) {
	bottom: -100%;
	left: 0;
	width: 2px;
	height: 100%;
	background: linear-gradient(360deg, transparent, #03e9f4);
	animation: btn-anim4 1s linear infinite;
	animation-delay: .75s
}

@
keyframes btn-anim4 { 0% {
	bottom: -100%;
}
50
%
,
100
%
{
bottom
:
100%;
}
}
/*  */
button.btn.btn-success {
    font-size: 24px;
    text-transform: uppercase;
}
button.btn.btn-success:hover {
    background: black;
    color: white
}
</style>
</head>
<body>
<body>


	<div class="login-box">
		<h2>Đăng Nhập</h2>

		<!-- Login Form -->
		<form action="${pageContext.request.contextPath}/authenticateTheUser"
			method="POST">
			<!-- Place for messages: error, alert etc ... -->

			<div>

				<!-- Check for login error -->

				<c:if test="${param.error != null}">

					<div class="alert alert-danger col-xs-offset-1 col-xs-10"
						style="color: red; margin-bottom: 24px;">Tài khoản hoặc mật
						khẩu không hợp lệ</div>

				</c:if>

				<!-- Check for logout -->

				<c:if test="${param.logout != null}">

					<div class="alert alert-success col-xs-offset-1 col-xs-10"
						style="color: white; margin-bottom: 10px">You have been
						logged out.</div>

				</c:if>


			</div>

			<!-- User name -->
			<div style="margin-bottom: 25px" class="user-box">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-user"></i></span> <input type="text"
					name="username" placeholder="" class="user-box"> <label>Tài
					Khoản</label>
			</div>

			<!-- Password -->
			<div style="margin-bottom: 25px" class="user-box">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-lock"></i></span> <input type="password"
					name="password" placeholder="" class="user-box"> <label>Mật
					Khẩu</label>
			</div>


			<div class="user-box">
				<button type="submit" class="btn btn-success"
					style="width: 100%; height: 50px; border: green; background: #00cccc; border-radius: 5px">Đăng
					Nhập</button>
				<a href="${pageContext.request.contextPath}/access-denied"
					class="btn btn-primary" role="button" aria-pressed="true">Đăng
					ký mới</a>

			</div>


			<!-- I'm manually adding tokens ... Bro! -->

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />

		</form>
	</div>
	</div>

	</div>
</body>

</html>