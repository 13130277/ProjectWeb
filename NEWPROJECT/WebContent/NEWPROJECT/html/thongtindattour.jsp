<%@page import="java.util.Date"%>
<%@page import="Model.Tour"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- InstanceBegin template="/Templates/home.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>CẨM NAN DU LỊCH</title>
<link href="/NEWPROJECT/NEWPROJECT/css/thongtindattour.css"
	rel="stylesheet" type="text/css" />
<!-- InstanceEndEditable -->
<link
	href="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="/NEWPROJECT/NEWPROJECT/css/footer-distributed-with-address-and-phones.css">
	<link
		href="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/css/font-awesome.min.css"
		rel="stylesheet" />
	<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/glyphicons.css"
		rel="stylesheet" type="text/css" />
	<link href="/NEWPROJECT/NEWPROJECT/css/UpdateAddmin/stylenewaddmin.css"
		rel="stylesheet" />
	<script
		src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
	<script
		src="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/app.min.js"
		type="text/javascript"></script>
	<link href="/NEWPROJECT/NEWPROJECT/css/css.css" rel="stylesheet"
		type="text/css" />
	<link
		href="/NEWPROJECT/NEWPROJECT/SpryAssets/SpryMenuBarHorizontal.css"
		rel="stylesheet" type="text/css" />
	<script src="/NEWPROJECT/NEWPROJECT/SpryAssets/SpryMenuBar.js"
		type="text/javascript"></script>
	<!-- Start WOWSlider.com HEAD section -->
	<link rel="stylesheet" type="text/css"
		href="/NEWPROJECT/NEWPROJECT/engine1/style.css" />
	<link href="/NEWPROJECT/NEWPROJECT/css/index/body_contenner.css"
		rel="stylesheet" type="text/css" />
	<script type="text/javascript"
		src="/NEWPROJECT/NEWPROJECT/engine1/jquery.js"></script>

	<!-- End WOWSlider.com HEAD section -->
</head>

<body>
	<%
// 		Tour tour = (Tour) request.getAttribute("infoTour");
		Tour tour = new Tour("123",null,"Travel around VietNam","qwe.jpg",new Date(11,10,1999),new Date(11,11,1999),30, null,12000000,10000000,"Chao");
		tour.setAdults(1);
	%>
	<div id="container">

		<%@include file="seach.jsp"%>

		<div class="panel panel-default tttour">
			<div class="panel-body">
				<div id="primary" class="content-area">
					<div class="page-title">
						<div class="page-title-inner">
							<div class="tittle">
								<div class="backgr">THÔNG TIN TOUR ĐÃ ĐẶT</div>
							</div>
							<h3 class="entry-title-main">Thanh toán</h3>
						</div>
					</div>
					<div id="content" class="site-content" role="main">
						<article id="post-14"
							class="post-14 page type-page status-publish hentry">
						<p>Cảm ơn bạn. Đơn hàng của bạn đã được nhận.</p>
						<table class="table table-responsive">
							<tbody>
								<tr class="active">
									<td>Order:</td>
									<td>Ngày :</td>
									<td>Tổng cộng :</td>
									<td>Phương thức thanh toán</td>
								</tr>
								<tr class="active">
									<td>6414</td>
									<td>22/12/2015</td>
									<td>3,300,000&nbsp;₫</td>
									<td>Thu tiền tận nhà miễn phí</td>
								</tr>
							</tbody>
						</table>
						<h3>Chi tiết đơn hàng</h3>
						<table class="table table-responsive">
							<thead>
								<tr class="active">
									<td>Tên Tour</td>
<<<<<<< HEAD
									<td>Số người</td>
									<td style="text-align: center;">Ngày đi</td>
									<td style="text-align: center;">Đơn giá</td>
									<td colspan="2" style="text-align: center;">Thao tác</td>
								</tr>
							</thead>
							<tbody>
								<tr class="active">
									<td style="width: 40%" class="product-name"><a
										href="TourPhanThiet.jsp"><%=tour.getNameTour()%></a>
										<td style="text-align: right;"><strong
											class="product-quantity">× <%=tour.getAdults() %></strong></td>
										<td>19/01/2016</td> <!-- 										<td>2</td> -->
										<td class="product-total"><span class="amount"><%=tour.getNewPrice()%>&nbsp;₫</span></td>
										<td>
											<form name="formupdate" method="post" action="updateProduct">
												<input name="count" type="text" id="count"
													style="width: 20px"> <input name="id" type="hidden"
													value="<%=tour.getIdTour()%>"> <input type="submit"
														value="Cập Nhật"
														style="border-radius: 10px; background-color: #00ffcc; border-color: #00ffcc;">
											</form>


									</td>
										<td>
											<form name="formdel" method="post" action="delProduct">
												<input name="id" type="hidden" value="<%=tour.getIdTour()%>"><input
													type="submit" value="Xóa"
													style="border-radius: 50%; background-color: #ccff00; border-color: #00ffcc;">
											</form>

									</td>
=======
									<td>Tổng</td>
								</tr>
								<tr class="active">
									<td class="product-name"><strong class="product-quantity">
											1× </strong><a href="TourPhanThiet.jsp">Tour Du Lịch Tham Quan Nội
											Thành Đà Lạt - City Tour Đà Lạt 1 Ngày</a>
										<td class="product-total"><span class="amount">3.700.000&nbsp;₫</span></td>
								</tr>
								<tr class="active">
									<form name="formupdate" method="post" action="updateProduct">
										<td><input name="count" type="text" id="count"
											style="width: 20px"> <%--<input name="id" type="hidden" value="<%=p.getId()%>"> --%>
												<input type="submit" value="Cập Nhật"></td>
										<td><form name="formdel" method="post"
												action="delProduct">
												<%-- <input name="id" type="hidden" value="<%=p.getId()%>"> --%>
												<input type="submit" value="Xóa">
											</form></td>
									</form>
									<tr class="active">
										<td><strong>Ngày Đi : </strong></td>
										<td>22/12/2015</td>
									</tr>
								<tr class="active">
									<td><strong>Người Lớn : </strong></td>
									<td>1</td>
								</tr>

								</tr>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
							</tbody>

						</table>
						<h3>Chi tiết khách hàng</h3>
						</header>
						<table class="table table-responsive">
							<tbody>
								<tr class="active">
									<th>Họ &amp; Tên:</th>
									<td data-title="Họ &amp; Tên">Nguyễn Long</td>
								</tr>
								<tr class="active">
									<th>Email:</th>
									<td data-title="Email">longnguyen110995@gmail.com</td>
								</tr>
								<tr class="active">
									<th>Số điện thoại:</th>
									<td data-title="Telephone">01672562508</td>
								</tr>
							</tbody>
						</table>
						<h3>Địa chỉ thanh toán</h3>
						<table class="table table-responsive">
							<tbody>
								<tr class="active">
									<td>
										<address>
											Nguyễn Long<br> lienthanh<br> 10 Linh Trung Thủ Đức
													Hồ Chí Minh<br> Hồ Chí Minh 
										</address>
										<div class="clear"></div> </article>
										<td>
								</tr>

							</tbody>

						</table>

						<!-- #post-## -->
					</div>
					<!-- #content -->

				</div>
			</div>
		</div>
		<!-- InstanceEndEditable -->
		<%@include file="footer.jsp"%>

	</div>

</body>
<!-- InstanceEnd -->
</html>
