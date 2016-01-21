
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="Model.Tour"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="Model.User"%>
<%@page import="DAO.TourDaoImp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- InstanceBegin template="/Templates/home.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Du Lịch Và Cuộc Sống</title>
<link
	href="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css"
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
	$(document).ready(function() {
		$('#header').load("LoadDataHeader");
		
	});
</script>
</head>
<body>
	<%
<<<<<<< HEAD
		ArrayList<Tour> listTourHot = (ArrayList<Tour>) session.getAttribute("tourHot");
		ArrayList<Tour> listTourTN = (ArrayList<Tour>) session.getAttribute("tourTrongNuoc");
		ArrayList<Tour> listTourNN = (ArrayList<Tour>) session.getAttribute("tourNuocNgoai");
=======
 	ArrayList<Tour> listTourHot = (ArrayList<Tour>) session.getAttribute("tourHot");
 	ArrayList<Tour> listTourTN = (ArrayList<Tour>) session.getAttribute("tourTrongNuoc");
 	ArrayList<Tour> listTourNN = (ArrayList<Tour>) session.getAttribute("tourNuocNgoai");
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
	%>
	
	<div id="header"></div>
	<div id="container">
			<jsp:include page="header.jsp"></jsp:include>
		<jsp:include page="seach.jsp"></jsp:include>
		<div class="tittle">
			<div class="backgr">Tour Hot</div>
		</div>
		<div class="list">
			<div class="row">
				<div class="col-sm-8 col-md-6">
					<div class="thumbnail">
						<img
							src="D:\LapTrinhJava\WebImg\img\Camnangdulich\medium_tgy1446212990.jpg" />
						<div class="caption">
							<h3>
								<a href="#"><%=listTourHot.get(0).getNameTour()%></a>
							</h3>
							<p><%=listTourHot.get(0).getShortContent()%></p>
							<span class="sell-price"> <%=listTourHot.get(0).getNewPrice()%> <sup>đ</sup></span>
							<span class="original-price"><del>
									<%= listTourHot.get(0).getNewPrice() %> <sup>đ</sup>
								</del></span>
							<p>
								<a href="/NEWPROJECT/NEWPROJECT/html/datTour.jsp"
									class="btn btn-primary" role="button">Đặt mua</a> <a
									href="/NEWPROJECT/NEWPROJECT/html/TourPhanThiet.jsp"
									class="btn btn-default" role="button">Xem Thêm</a>
							</p>
						</div>
					</div>
				</div>
<<<<<<< HEAD
					<%
					for ( int i = 0; i < 3; i++){
						Tour lot = listTourHot.get(i);
						String list = lot.getIdTour();
=======
				<%
 					for ( int i = 0; i < 3; i++){
						Tour lot = listTourHot.get(i);
 						String list = lot.getIdTour();
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
					
				%>
				<div class="col-xs-6 col-md-6 small">
					<div class="thumbnail sml">
						<img src="Resource?url=<%=lot.getImg() %>" />
						<h4>
<<<<<<< HEAD
							<a href="DuLichTrongNuoc?newURL<%=list%>"><%lot.getNameTour(); %></a>
						</h4>
						<p><% lot.getShortContent(); %></p>
						<span class="sell-price"> <% lot.getNewPrice(); %> <sup>đ</sup></span> <span
							class="original-price"><del>
								<% lot.getOldPrice(); %> <sup>đ</sup>
=======
							<a href="DuLichTrongNuoc?newURL<%=list%>"><%=lot.getNameTour()%></a>
						</h4>
						<p><%lot.getShortContent(); %></p>
						<span class="sell-price"> <%=lot.getNewPrice() %> <sup>đ</sup></span> <span
							class="original-price"><del>
								<%= lot.getOldPrice() %> <sup>đ</sup>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
							</del></span>
						<div class="pull-right">
							<p>
								<a href="/NEWPROJECT/NEWPROJECT/html/datTour.jsp" class="btn btn-sm btn-primary" role="button">Đặt
									mua</a> <a href="" class="btn btn-sm btn-default" role="button">Xem
									Thêm</a>
							</p>
						</div>
					</div>
<<<<<<< HEAD
				</div><% } %>
=======
				</div><%} %>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
							
		<div class="tittle">
			<div class="backgr">Du Lịch trong Nước</div>
		</div>
		<%
		for ( int i = 0; i < 6; i++){
			Tour listTN = listTourTN.get(i);
<<<<<<< HEAD
			String tourIn = listTN.getIdTour();
=======
 			String tourIn = listTN.getIdTour();
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d

		%>
		<div class="list">
			<div class="row">
				<div class="col-sm-6 col-md-4" style="margin-left: 15px;">
					<div class="thumbnail">
						<img
							src="Resource?url=<%= listTN.getImg() %>" />
						<div class="caption">
							<h3>
<<<<<<< HEAD
								<a href="#"> <%listTN.getShortContent(); %> </a>
							</h3>
							<span class="sell-price"><%listTN.getNewPrice(); %><sup>đ</sup></span> <span
								class="original-price"><del>
									<%listTN.getOldPrice(); %><sup>đ</sup>
=======
								<a href="#"> <%=listTN.getShortContent() %> </a>
							</h3>
							<span class="sell-price"><%=listTN.getNewPrice() %><sup>đ</sup></span> <span
								class="original-price"><del>
									<%=listTN.getOldPrice() %><sup>đ</sup>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
								</del></span>
							<p>
								<a href="/NEWPROJECT/NEWPROJECT/html/datTour.jsp" class="btn btn-primary" role="button">Đặt mua</a> <a
									href="#" class="btn btn-default" role="button">Xem Thêm</a>
							</p>
						</div>
					</div>
				</div><% } %>
				
		<div class="tittle">
			<a href="/NEWPROJECT/NEWPROJECT/html/Camnangdulich.jsp">
				<div class="backgr">Du Lịch Nước Ngoài</div>
			</a>
		</div>
		<%
<<<<<<< HEAD
			for(int i =0 ; i < 6;i++){
				Tour listNN = listTourNN.get(i);
				String tourOut = listNN.getIdTour();
=======
 			for(int i =0 ; i < 6;i++){
 				Tour listNN = listTourNN.get(i);
 				
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
		%>
		<div class="list">
			<div class="row">
				<div class="col-sm-6 col-md-4" style="margin-left: 15px;">
					<div class="thumbnail">
						<img
							src="Resource?url=<%=listNN.getImg() %>" />
<<<<<<< HEAD
						<div class="caption">
							<h3>
								<a href="#">Campuchia - Tour Cao Nguyên Bokor </a>
							</h3>
							<span class="sell-price">3,279,000 <sup>đ</sup></span> <span
								class="original-price"><del>
									5,179,000 <sup>đ</sup>
								</del></span>
							<p>
								<a href="#" class="btn btn-primary" role="button">Đặt mua</a> <a
									href="#" class="btn btn-default" role="button">Xem Thêm</a>
							</p>
						</div>
					</div>
				</div><% } %>
				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<img
							src="F:/GOC_HOC_TAP/2015-2016/LTW/infoTour/DuLichNuocNgoai/campuchia/Tour Siemriep - Phnompenh/208647-black-friday-cambodia-siemriep-phnompenh-4n3d-danh-cho-01-nguoi.jpg" />
=======
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
						<div class="caption">
							<h3>
								<a href="#"><%= listNN.getShortContent() %> </a>
							</h3>
							<span class="sell-price"><%= listNN.getNewPrice() %><sup>đ</sup></span> <span
								class="original-price"><del>
									<%=listNN.getOldPrice() %> <sup>đ</sup>
								</del></span>
							<p>
								<a href="#" class="btn btn-primary" role="button">Đặt mua</a> <a
									href="#" class="btn btn-default" role="button">Xem Thêm</a>
							</p>
						</div>
					</div>
				</div><%} %>
					<!-- InstanceEndEditable -->
		<%@include file="footer.jsp"%>

	</div>

</body>
<!-- InstanceEnd -->
</html>
