
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
<script type="text/javascript">
	function validate(form) {
		if (form.firstName.value == "") {
			alert("Please fill in your first name");
			form.firstName.focus();
		} else if (form.lastName.value == "") {
			alert("Please fill in your last name");
			form.lastName.focus();
		} else if (form.emailAddress.value == "") {
			alert("Please fill in your email address");
			form.emailAddress.focus();
		} else {
			form.submit();
		}
	}
</script>

</head>
<body class="login-page">
	<%
		String err_userName = (String) request.getAttribute("userName");
		String err_pass = (String) request.getAttribute("pass");
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
		<form action="/NEWPROJECT/ControlDangKy" method="post">
			<div class="form">
				<table width="100%" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr height="40px">
						<td height="35" colspan="2" align="center" class="title">LOGIN</td>

					</tr>
					<tr height="40px">
						<td width="36%" height="35" align="center" colspan="2" class="td"><strong><span><%=err_userName%></span></strong></td>

					</tr>
					<tr height="40px">
						<td width="36%" height="35" align="right" class="td"><strong>Username:</strong></td>
						<td width="64%" height="35" class="td"><label for="uname"></label>
							<input name="userName" type="text" class="field" id="uname" /></td>
					</tr>
					<tr height="40px">
						<td height="35" align="right" class="td"><strong>Password:
						</strong></td>
						<td height="35" class="td"><input name="pass" type="password"
							class="field" id="pass" /></td>
					</tr>

					<tr height="40px">
						<td height="35" colspan="2" align="center" class="td"><input
							type="submit" value=" Đăng nhập" />&nbsp;&nbsp;&nbsp; <input
							type="submit" value="Cancel" /></td>
					</tr>

				</table>
				<div class="form-group has-feedback">
					<input type="text" class="form-control" placeholder="Tên tài khoản"
						name="userName" /> <i
						class="glyphicon glyphicon-user form-control-feedback"></i> <span><%=err_userName%></span>
				</div>
				<button type="submit" id="register-back-btn" type="button" style="color: #000"
					class="btn btn-default">
					<i class="glyphicon glyphicon-circle-arrow-left "></i> Trang chủ
				</button>
			</div>
		</form>
	</div>
	<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->


</body>
</html>
