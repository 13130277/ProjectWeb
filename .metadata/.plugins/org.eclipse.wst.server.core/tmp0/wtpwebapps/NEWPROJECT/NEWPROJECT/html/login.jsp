
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="Model.Tour"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="Model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Đăng Nhập</title>
<link
	href="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/css/admin.min.css"
	rel="stylesheet" type="text/css" />
<link href="/NEWPROJECT/NEWPROJECT/css/css.css" rel="stylesheet"
	type="text/css" />
<link
	href="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/css/font-awesome.min.css"
	rel="stylesheet" />
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/glyphicons.css"
	rel="stylesheet" type="text/css" />
<link href="/NEWPROJECT/NEWPROJECT/css/index/body_contenner.css"
	rel="stylesheet" type="text/css" />
<script
	src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
<script
	src="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/app.min.js"
	type="text/javascript"></script>

</head>
<body class="login-page">
	<%
		String email = (String) request.getAttribute("emailTrue");
		String err_email = (String) request.getAttribute("email");
		String err_pass = (String) request.getAttribute("pass");
		if(email==null)
			email = "";
		if (err_email == null)
			err_email = "";
		if (err_pass == null)
			err_pass = "";
	%>
	<div class="login-box">
		<div class="login-logo">
			<h3>
				<b style="color: White">Đăng Nhập Vào Tài Khoản Của Bạn</b>
			</h3>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body" action="NEWPROJECT/ctrDangNhap">
			<form method="post" action="/NEWPROJECT/ctrDangNhap">
				<div class="form-group has-feedback">
					<label for="email">Email: </label>
					<input type="text" class="form-control" name="email" value="<%=email%>"/>
						 <span	class="glyphicon glyphicon-envelope form-control-feedback"></span>
						 <span><%=err_email%></span>
				</div>
				<div class="form-group has-feedback trasparent">
					<label for="password">Password: </label> <input type="text" type="pass"
						class="form-control" name="pass" /> 
						<span class="glyphicon glyphicon-lock form-control-feedback"></span>
						 <span><%=err_pass%></span>
				</div>
				<div class="row">
					<div class="col-xs-8"></div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit"
							class="btn btn-primary btn-block btn-flat trasparent"
							style="color: #000">Sign In</button>
					</div>
					<!-- /.col -->
					<p>&nbsp;</p>

					<p style="margin-left: 20px; font-size: 18px">Quên Mật Khẩu</p>
					<p style="margin-left: 20px">
						Click <a href="#" style="color: #099">vào đây </a>để lấy lại mật khẩu
					</p>
					<p
						style="margin-left: 20px; border-top: 1px dotted #eee; padding-top: 20px;">
						Bạn chưa có tài khoản<a href="#" style="color: #099"> Tạo Tài
							Khoản </a>
					</p>
					<div style="float: right;" class="col-xs-4">
						<a href="NEWPROJECT/LoadDataHome"></a>
						<button type="submit"
							class="btn btn-primary btn-block btn-flat trasparent"
							style="color: #000">Trang Chủ</button>
						</a>
					</div>
					<!-- /.col -->
			</form>
		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->


</body>
</html>
