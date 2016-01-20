
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
	<%
		String fullName = (String) request.getAttribute("fullNameTrue");
		String email = (String) request.getAttribute("emailTrue");
		String address = (String) request.getAttribute("addressTrue");
		String phone = (String) request.getAttribute("phoneTrue");
		String userName = (String) request.getAttribute("userNameTrue");
		
		String err_fullName = (String) request.getAttribute("fullName");
		String err_email = (String) request.getAttribute("email");
		String err_address = (String) request.getAttribute("address");
		String err_phone = (String) request.getAttribute("phone");
		String err_userName = (String) request.getAttribute("userName");
		String err_pass = (String) request.getAttribute("pass");

		if(fullName == null)
			fullName = "";
		if(email==null)
			email = "";
		if(address==null)
			address = "";
		if(phone==null)
			phone = "";
		if(userName==null)
			userName = "";
		
		if (err_fullName == null)
			err_fullName = "";
		if (err_email == null)
			err_email = "";
		if (err_address == null)
			err_address = "";
		if (err_phone == null)
			err_phone = "";
		if (err_userName == null)
			err_userName = "";
		if (err_pass == null)
			err_pass = "";
	%>


	<div class="login-box">
		<div class="login-logo">
			<h3>
				<b style="color: White">Tạo Tài Khoản</b>
			</h3>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<form action="/NEWPROJECT/ControlDangKy" method="post">
				<p>Điền Thông Tin Của Bạn vào From sau</p>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Họ Và tên"
						name="fullname" value="<%=fullName%>"/> <i
						class="glyphicon glyphicon-font form-control-feedback"></i> <span><%=err_fullName%></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Email" value="<%=email%>"
						name="email" /> <i
						class="glyphicon glyphicon-envelope form-control-feedback"></i> <span><%=err_email%></span>
				</div>

				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Địa chỉ" value="<%=address%>"
						name="address" /> <i
						class="glyphicon glyphicon-home form-control-feedback"></i> <span><%=err_address%></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Số điện thoại" value="<%=phone%>"
						name="phone" /> <i
						class="glyphicon glyphicon-home form-control-feedback"></i> <span><%=err_phone%></span>
				</div>
				<p>Điền Thông Tin Tài Khoản Của Bạn Vào From Sau :</p>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Tên tài khoản" value="<%=userName%>"
						name="userName" /> <i
						class="glyphicon glyphicon-user form-control-feedback"></i> <span><%=err_userName%></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Mật khẩu"
						name="pass" /> <i
						class="glyphicon glyphicon-lock form-control-feedback"></i> <span><%=err_pass%></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control"
						placeholder="Nhập lại mật khẩu" name="rePass" /> <i
						class="glyphicon glyphicon-saved form-control-feedback"></i>
				</div>

				<div class="control-group">
					<div class="controls">
						<label style="margin-left: 20px;" class="checkbox"> <input
							type="checkbox" name="tnc" /> Tôi Đồng ý <a href="#">tả các
								điều khoản </a>
						</label>
					</div>
				</div>
				<button id="register-back-btn" type="button" style="color: #000"
					class="btn btn-default">
					<i class="glyphicon glyphicon-circle-arrow-left "></i> Trang chủ
				</button>
				<button type="submit" id="register-back-btn" type="button" style="color: #000"
					class="btn btn-default pull-right" >
					Đăng ký <i class="glyphicon glyphicon-circle-arrow-right"></i>
				</button>

			</form>
		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->


</body>
</html>
