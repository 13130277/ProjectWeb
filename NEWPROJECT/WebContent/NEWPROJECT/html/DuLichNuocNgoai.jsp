<%@page import="Model.Tour"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/TourTrongNuoc.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>DU LỊCH NƯỚC NGOÀI</title>
<link href="/NEWPROJECT/NEWPROJECT/css/stylekid.css" rel="stylesheet" type="text/css" />
<!-- InstanceEndEditable -->
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="/NEWPROJECT/NEWPROJECT/css/footer-distributed-with-address-and-phones.css">
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/css/font-awesome.min.css" rel="stylesheet" />
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/glyphicons.css" rel="stylesheet" type="text/css" />
<link href="/NEWPROJECT/NEWPROJECT/css/UpdateAddmin/stylenewaddmin.css" rel="stylesheet" />
<script src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
<script src="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/app.min.js" type="text/javascript"></script>
<link href="/NEWPROJECT/NEWPROJECT/css/css.css" rel="stylesheet" type="text/css" />
<link href="/NEWPROJECT/NEWPROJECT/SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<script src="/NEWPROJECT/NEWPROJECT/SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<!-- Start WOWSlider.com HEAD section -->
<link rel="stylesheet" type="text/css" href="/NEWPROJECT/NEWPROJECT/engine1/style.css" />
<link href="/NEWPROJECT/NEWPROJECT/css/index/body_contenner.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/NEWPROJECT/NEWPROJECT/engine1/jquery.js"></script>


 <script type="text/javascript">
	$(document).ready(function() {
		$('#header').load("LoadDataHeader");
	});
</script>
</head>

<body>
<%ArrayList<Tour> listTour = (ArrayList<Tour>)session.getAttribute("listTourDuLichNuocNgoai"); %>
<div id="header"></div>
<div id="container">
  <div class="container">
    
<%ArrayList<Tour> listTour = (ArrayList<Tour>)session.getAttribute("listTourDuLichTrongNuoc"); %>
<div class="tittle">
    <div class="backgr">Tour Du Lịch Nước Ngoài</div>
  </div>
    <div id="list1">
  <!--start row-->
  <div class="row"> 
    <!--col-->
<<<<<<< HEAD
    <% for(int i =0 ;i<6;i++){
    	Tour tour = listTour.get(i);
    %>
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info1"> <img src="Resource?url=<%=tour.getImg() %>" />
        <div class="caption">
          <h3><%=tour.getNameTour() %></h3>
          <p><%=tour.getShortContent() %></p>
=======
    <%for (int i= 0;i<6;i++) {
    	 Tour tour = listTour.get(i);
    %>
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info1"> <img src=" Resource?url=<%=tour.getImg()%>"/>
          <h3><%=tour.getNameTour() %></h3>
          <p><%= tour.getShortContent() %></p>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div><%} %>
    <!--end col--> 
    <% } %>
    <!--col-->
    <div class="col-sm-6 col-md-4" >
      <div class="thumbnail"  id="info2"> <img src="../img/tournuocngoai/medium_wlw1421828538.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Nhật Bản</h3>
			<p>Nhật Bản - xứ sở hoa anh đào, một quốc gia hàng đầu thế giới về khoa học, công nghệ.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info3" > <img src="../img/img-product/37484_0_square.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Pháp</h3>
          <p>Pháp được biết đến với Tháp Eiffel, dòng sông Seine thơ mộng, Nhà thờ Đức Bà Paris cổ kính..</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info4"> <img src="../img/tournuocngoai/tour-thai-lan-top.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Thái Lan</h3>
          <p>Thái Lan, đất nước chùa tháp, thiên đàng mua sắm, thiên đàng du lịch..</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info5"> <img src="../img/tournuocngoai/nga.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Nga</h3>
          <p>Mùa hè là thời điểm thích hợp nhất để khám phá nước Nga, khi tuyết đã tan, hoa nở khắp nơi ...</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info6"> <img src="../img/tournuocngoai/brazil.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Brazil</h3>
          <p>Brazil - quốc gia của bóng đá - nổi tiếng với những bãi biển tuyệt đẹp, nhạc jazz... </p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
                  </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info7"> <img src="../img/tournuocngoai/medium_dwa1421828832.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Singapore</h3>
          <p>Singapore -đảo quốc sư tử, nơi nổi tiếng với những hòn đảo xinh đẹp, không khí trong lành </p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info8"> <img src="../img/tournuocngoai/canada.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Canada</h3>
          <p>Khung cảnh mùa thu của Canada đầy lãng mạn nét đỏ kiêu sa hay màu vàng cam lóng lánh ...</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info9"> <img src="../img/tournuocngoai/nuocanh.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Anh</h3>
          <p>Anh - xứ sở sương mù. Mỗi thành phố ở đây đều có các nhà hát opera, bảo tàng ...</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info10"> <img src="../img/tournuocngoai/y.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Ý</h3>
          <p>Ý nổi tiếng với những thành phố kính như Đấu trường La Mã, tháp nghiêng Piza…</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col-->
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info11"> <img src="../img/tournuocngoai/du-lich-han-quoc-1.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Hàn Quốc</h3>
          <p>Đất nước xứ sở kim chi,có nền ẩm thực cùng ngắm cảnh mùa thu trong lành tuyệt đẹp.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4" >
      <div class="thumbnail"  id="info12"> <img src="../img/tournuocngoai/halan.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Hà Lan</h3>
          <p>Hà Lan sở hữu những ngôi làng nhỏ với vô số chiếc cối xay gió cùng những cánh đồng Tullip lung linh..</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info13"> <img src="../img/tournuocngoai/duc.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Đức</h3>
          <p>Nước Đức có rất nhiều phong cảnh đẹp đáng để bạn khám phá và trải nghiệm</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info14"> <img src="../img/tournuocngoai/venezuela.jpg"alt="..." />
        <div class="caption">
          <h3>Du Lịch Venezuela</h3>
          <p>Venezuela – cái nôi đào tạo hoa hậu thế giới có những cánh rừng với hệ động thực vật phong phú</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info15"> <img src="../img/tournuocngoai/ando.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Ấn Độ</h3>
          <p>Ấn Độ là quốc gia hàng đầu trên thế giới về phát triển hình thức du lịch chữa bệnh</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info16"> <img src="../img/tournuocngoai/my.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Mỹ</h3>
          <p>Mỹ nổi tiếng với các công trình kiến trúc như: Nhà Trắng,tượng nữ thần tự do,...</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col-->
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info17"> <img src="../img/tournuocngoai/dubai.jpg" alt="..." />
        <div class="caption">
          <h3>Du Lịch Dubai</h3>
          <p>Dubai -"thành phố của những đại gia", "thành phố của những kỷ lục guiness "</p>
         <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a> 
          <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div></div>
    <!--end col--> 
    <!--end row--> 
  </div>

<%@include file="footer.jsp" %>
  <!-- InstanceEndEditable --></div>
</div>
</body>
<!-- InstanceEnd --></html>
