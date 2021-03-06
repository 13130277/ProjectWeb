<%@page import="Model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="DAO.TypeTourDaoImp"%>
<%@page import="Model.Tour_Type"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- InstanceBegin template="/Templates/home.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!-- InstanceEndEditable -->
<link
	href="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/css/font-awesome.min.css"
	rel="stylesheet" />
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/glyphicons.css"
	rel="stylesheet" type="text/css" />
<script
	src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
<script
	src="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/app.min.js"
	type="text/javascript"></script>
<link href="/NEWPROJECT/NEWPROJECT/css/css.css" rel="stylesheet"
	type="text/css" />
<!-- Start WOWSlider.com HEAD section -->
<link rel="stylesheet" type="text/css"
	href="/NEWPROJECT/NEWPROJECT/engine1/style.css" />
<script type="text/javascript"
	src="/NEWPROJECT/NEWPROJECT/engine1/jquery.js"></script>
<!-- End WOWSlider.com HEAD section -->
</head>
<body>
	<%
		User us;
		ArrayList<Tour_Type> listTourTN = (ArrayList<Tour_Type>) session.getAttribute("listTourTN");
		ArrayList<Tour_Type> listTourNN = (ArrayList<Tour_Type>) session.getAttribute("listTourNN");
	%>
	<div id="container">
		<div id="header">
			<div id="login_loout">

				<%
					try {
						us = (User) session.getAttribute("user");
					} catch (Exception e) {
						us = new User();
					}
				%>
				<%
					if (us == null) {
				%>
				<div id="DangKy">
					<a href="/DangKy">Đăng Ký </a>
				</div>
				<div id="DangNhap">
					<a href="#"> Đăng Nhập </a>
				</div>
				<%
					} else {
				%>
				<li class="dropdown">Xin Chào : <a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <%=us.getUserName()%><span
						class="caret"></span></a> </a>
					<ul class="dropdown-menu">
						<li><a href="DuLichTrongNuoc?newUrl=all">Thông Tin Cá
								Nhân</a></li>
						<li><a href="DuLichTrongNuoc?newUrl=123>"> Đăng Xuất</a></li>
					</ul></li>
				<%
					}
				%>

				<div id="LienHe">
					<a href="#">Liên Hệ </a>
				</div>
			</div>
			<div id="banner">
				<div id="logo">
					<img
						src="Resource?url=D:\LapTrinhJava\WebImg\img\logo\flower banner 1 - Copy.jpg" />
				</div>
				<div class="row">
					<div class="col-lg-6">
						<div class="input-group">
							<input type="text" class="form-control"
								placeholder="Nhập tour cần tìm..." s /> <span
								class="input-group-btn">
								<button class="btn btn-default" type="button">Seach</button>
							</span>
						</div>
						<!-- /input-group -->
					</div>
					<!-- /.col-lg-6 -->
					<div class="header-hot-line">
						<i class="fa fa-phone-square fa-2x "
							style="float: left; padding-right: 2px;"></i> <span>
							(04-3) 511.33.33<em style="color: #666 !important;">-</em>
							01999.102.888
						</span> <i id="txt">(Thời gian làm việc: 8:00 - 17:30 các ngày trong
							tuần)</i>

					</div>
				</div>
				<!-- /.row -->
			</div>
			<div></div>
			<!--end header-->
		</div>
		<!-- InstanceBeginEditable name="Change" -->
		<div id="menu">
			<div class="row">
				<div class="col-md-12">
					<ul class="nav nav-tabs">
						<li><a href="LoadDataHome"><i class="fa fa-home"></i>Trang
								Chủ</a></li>
						<li><a href="CamNanDuLich"><i class="fa fa-book"></i>Cẩm
								Nan Du Lịch</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Du Lịch Trong Nước<span
								class="caret"></span></a> </a>
							<ul class="dropdown-menu">
								<li><a href="DuLichTrongNuoc?newUrl=all"> Tất cả các
										Tour</a></li>
								<%
									for (Tour_Type los : listTourTN) {
										String param = los.getIdTourType();
								%>
								<li><a href="DuLichTrongNuoc?newUrl=<%=param%>"> <%=los.getNameType()%>
								</a></li>

								<%
									}
								%>
							</ul></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Du Lịch Nước Ngoài<span
								class="caret"></span></a> </a>
							<ul class="dropdown-menu">
								<li><a href="DuLichNuocNgoai?newUrl=all"> Tất cả các
										Tour</a></li>
								<%
									for (Tour_Type los : listTourNN) {
										String param = los.getIdTourType();
								%>
								<li><a href="DuLichNuocNgoai?newUrl=<%=param%>"> <%=los.getNameType()%>
								</a></li>

								<%
									}
								%>
							</ul></li>

						<li><a href="file:///G|/NEWPROJECT/NEWPROJECT/dangNhap.jsp"><i
								class="fa fa-users"></i>Khách Hàng</a></li>
						<li><a href="GioiThieu.jsp"><i class="fa fa-user"></i>Giới
								Thiệu</a></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- InstanceEndEditable -->
		<!-- InstanceBeginEditable name="change" -->
		<div id="slider">
			<!-- Start WOWSlider.com BODY section -->
			<div id="wowslider-container1">
				<div class="ws_images">
					<ul>
						<li><img src="/NEWPROJECT/NEWPROJECT/data1/images/01.jpg"
							alt="" title="" id="wows1_0" /></li>
						<li><img src="/NEWPROJECT/NEWPROJECT/data1/images/02.jpg"
							alt="" title="" id="wows1_1" /></li>
						<li><a href="http://wowslider.net"><img
								src="/NEWPROJECT/NEWPROJECT/data1/images/03.jpg"
								alt="wowslider.net" title="" id="wows1_2" /></a></li>
						<li><img src="/NEWPROJECT/NEWPROJECT/data1/images/04.jpg"
							alt="" title="" id="wows1_3" /></li>
					</ul>
				</div>
				<div class="ws_bullets">
					<div>
						<a href="#" title=""><span><img
								src="/NEWPROJECT/NEWPROJECT/data1/images/01.jpg" alt="" />1</span></a> <a
							href="#" title=""><span><img
								src="/NEWPROJECT/NEWPROJECT/data1/tooltips/02.jpg" alt="" />2</span></a> <a
							href="#" title=""><span><img
								src="/NEWPROJECT/NEWPROJECT/data1/tooltips/03.jpg" alt="" />3</span></a> <a
							href="#" title=""><span><img
								src="/NEWPROJECT/NEWPROJECT/data1/tooltips/04.jpg" alt="" />4</span></a>
					</div>
				</div>
				<div class="ws_script" style="position: absolute; left: -99%">
					<a href="http://wowslider.com">bootstrap carousel</a>

				</div>
				<div class="ws_shadow"></div>
			</div>
			<script type="text/javascript"
				src="/NEWPROJECT/NEWPROJECT/engine1/wowslider.js"></script>
			<script type="text/javascript"
				src="/NEWPROJECT/NEWPROJECT/engine1/script.js"></script>
			<!-- End WOWSlider.com BODY section -->
		</div>
		<!-- End Content Wrapper. Contains page content -->
	</div>
</body>
</html>