<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   <%@page import="Model.Tour"%>
      <%@page import="Model.Tour_Type"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/newTest.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>CẨM NAN DU LỊCH</title>
<link href="/NEWPROJECT/NEWPROJECT/css/stylekid.css" rel="stylesheet" type="text/css" />
<!-- InstanceEndEditable -->
<link href="/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
		$(document).ready(function() {
			$('#header').load("LoadDataHeader");
		});
	</script>
</head>

<body>
<%	List<Tour> listTour = (List<Tour>)session.getAttribute("listTourDuLichTrongNuoc") ;%>
<div id="header"></div>
<div id="container">
  <div class="container">
  <div id="tittle1">Du Lịch Trong Nước</div>
  <div id="list1">
  <!--start row-->
  <div class="row"> 
    <!--col-->
<<<<<<< HEAD
    <%for(int i  = 1 ;i < 7;i++){
    	//Tour tour = listTour.get(i);
    %>
=======
    <%for(int i =0;i< 6;i++){
    	 Tour tour = listTour.get(i);
    	%>
    }
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info1"> 
      <img src="Resource?url=<%=listTour.get(i).getImg() %>"/>
        <div class="caption">
<<<<<<< HEAD
          <h3><%=listTour.get(i).getNameTour() %></h3>
          <p><%=listTour.get(i).getShortContent() %></p>
=======
          <h3><%=tour.getNameTour() %></h3>
          <p><%= tour.getShortContent() %></p>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
          <p><a href="BookTour.jsp" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div><%} %>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4" >
      <div class="thumbnail"  id="info2"> <img src="../img/tournhatrang/8-du-lich-nha-trang-co-gi-choi-mytour-1.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Nha Trang</h3>
			<p>Nha Trang là một trong những bãi biển đẹp nhất Việt Nam được đầu tư để phát triển du lịch</p>
         <p><a href="BookTour.jsp" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info3" > <img src="../img/tourcondao/9-du-lich-con-dao-co-gi-mytour-31.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Vũng Tàu</h3>
          <p>Vũng Tàu là thành phố du lịch nghỉ mát, tắm biển, dưỡng bệnh ở biển sớm nhất nước ta.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info4"> <img src="../img/tourdanang/medium_jim1436146394_tour-du-lich-ba-na-nui-chua-trong-1-ngay-dl2.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Đà Nẵng</h3>
          <p>Đà Nẵng nổi tiếng với dòng sông Hàn thơ mộng  cùng các cây cầu độc đáo.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info5"> <img src="../img/tourHaNoi/HaNoi3.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Hà Nội</h3>
          <p>Thành phố Hà Nội là Thủ đô ngàn năm văn hiến với những di tích cổ xưa, cuộc sống yên bình</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info6"> <img src="../img/tourhochiminh/medium_vxn1420183560_tour-du-lich-city-sai-gon-dia-dao-cu-chi-1-ngay.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Sài Gòn</h3>
          <p>Sài Gòn mang những nét pha trộn độc đáo giữa văn hóa thời Pháp thuộc và cả bản sắc dân tộc</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info7"> <img src="../img/tourquangninh/medium_ddu1410861929.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Quảng Ninh</h3>
          <p>Vịnh Hạ Long - di sản văn hoá hế giới với nhiều hang động độc đáo...</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info8"> <img src="../img/tourhue/medium_cxa1421828237.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Huế</h3>
          <p>Cố đô Huế mang vẻ đẹp thơ mộng bên dòng sông Hương hiền hoà.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info9"> <img src="../img/toursapa/sapa.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Sapa</h3>
          <p>Sa Pa như một thành phố trong sương huyền ảo, vẽ lên một bức tranh sơn thủy hữu tình.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info10"> <img src="../img/tourphuquoc/dinh-cau-phu-quoc2-200x150.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Phú Quốc</h3>
          <p>Phú Quốc - Đảo ngọc của Việt Nam. Hòn đảo thơ mộng cúng với bờ cát trắng..</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col-->
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info11"> <img src="../img/tourquangnam/medium_lnd1410861981.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Hội An</h3>
          <p>Phố cổ Hội An với rất nhiều căn nhà phố cổ có độ tuổi hàng trăm năm vẫn còn nguyên vẹn. </p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4" >
      <div class="thumbnail"  id="info12"> <img src="../img/tourtamdao/9-du-lich-tam-dao-co-gi-mytour-4.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Tam Đảo</h3>
          <p>Tam Đảo là một điểm đến cuối tuần cho của dân miền Bắc.</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail" id="info13"> <img src="../img/tourmocchau/9-Du-lich-moc-chau-thang-1-mytour-1.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Mộc Châu</h3>
          <p>Mộc Châu có những đồi chè bạt ngàn, những cánh đồng hoa Cải hay hoa Dã Quỳ...</p>
         <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info14"> <img src="../img/tourhagiang/du-lich-Ha-giang-thang-9-mytour-10.jpg"alt="...">
        <div class="caption">
          <h3>Du Lịch Hà Giang</h3>
          <p>Hà Giang đẹp bởi phong cảnh hùng vĩ, những con đường quanh co,Sắc Hoa và Tình Người</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info15"> <img src="../img/tourninhthuan/medium_eex1444730927.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Phan Thiết</h3>
          <p>Đến Phan Thiết nhất định phải đi Mũi Né,...</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col--> 
    <!--col-->
    <div class="col-sm-6 col-md-4 ">
      <div class="thumbnail" id="info16"> <img src="../img/tourninhbinh/medium_sor1410862076.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Ninh Bình</h3>
          <p>Ninh Bình hâp dẫn bởi các thắng cảnh tự nhiên vô cùng hùng vĩ và tráng lệ. </p>
         <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div>
    <!--end col-->
    <div class="col-xs-3 col-md-8">
      <div class="thumbnail"  id="info17"> <img src="../img/tournhatrang/Du-lich-cam-ranh-co-gi-choi-mytour-7.jpg" alt="...">
        <div class="caption">
          <h3>Du Lịch Cam Ranh</h3>
          <p>Biển ở Cam Ranh không ồn ào, xô bồ và đô thị hóa như : Nha Trang, Mũi Né,</p>
          <p><a href="#" class="btn btn-primary" role="button">Đặt tour</a>
           <a href="#" class="btn btn-default" role="button">Xem chi tiết</a></p>
        </div>
      </div>
    </div></div>
  </div>
  </div>
  <!-- InstanceEndEditable -->
<%@include file="footer.jsp" %>
</div>

</body>
<!-- InstanceEnd --></html>
