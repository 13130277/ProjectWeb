
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="Model.Tour"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="Model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Đăng Ký</title>
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
	<div class="login-box">
		<div class="login-logo">
			<h3>
				<b style="color: White">Tạo Tài Khoản</b>
			</h3>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<form method="post">
				<p>Điền Thông Tin Của Bạn vào From sau</p>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Họ Và tên"
						name="fullname" /> <i
						class="glyphicon glyphicon-font form-control-feedback"></i>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Email"
						name="email" /> <i
						class="glyphicon glyphicon-envelope form-control-feedback"></i>
				</div>

				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Địa chỉ"
						name="address" /> <i
						class="glyphicon glyphicon-home form-control-feedback"></i>
				</div>
				<p>Điền Thông Tin Tài Khoản Của Bạn Vào From Sau :</p>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Tên tài khoản"
						name="userName" /> <i
						class="glyphicon glyphicon-user form-control-feedback"></i>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Mật khẩu"
						name="pass" /> <i
						class="glyphicon glyphicon-lock form-control-feedback"></i>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control"
						placeholder="Nhập lại mật khẩu" name="rePass" />
					 <i	class="glyphicon glyphicon-saved form-control-feedback"></i>
				</div>

				<div class="control-group">
					<div class="controls">
						<label style="margin-left: 20px;"class="checkbox"> <input type="checkbox" name="tnc" />
							Tôi Đồng ý <a href="#">tả các điều khoản </a>
						</label>
						<div id="register_tnc_error"></div>
					</div>
				</div>
			
				<div class="form-actions ">
				<button id="register-back-btn" type="button" style="color: #000" class="btn btn-default">
				<i	class="glyphicon glyphicon-circle-arrow-left "></i>  Trang chủ
				</button>
				<button id="register-back-btn" type="button" style="color: #000" class="btn btn-default pull-right">
				  Đăng ký <i class="glyphicon glyphicon-circle-arrow-right"></i>
				</button>        
			</div>
			</form>
		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->


</body>
</html>
