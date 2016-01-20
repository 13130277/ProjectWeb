<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="Model.Tour"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/home.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Tour Du Lịch Tham Quan Nội Thành Đà Lạt - City Tour Đà Lạt 1 Ngày</title>
<link href="/NEWPROJECT/NEWPROJECT/css/suppedkidcss.css" rel="stylesheet" type="text/css" />
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



</head>
<% Tour tour = (Tour) session.getAttribute("thongTinTour") ;%>
<body>
<div id="container">
  <%@include file="header.jsp" %>
 <%@include file="seach.jsp" %>
  <div id="list1"> 
    <!--start row-->
    <div class="row " > 
      <!--col-->
      <div class="col-xs-3 col-md-12">
        <div class="panel panel-default">
          <div class="panel-body" id="info1">
            <p id="titledl"><%tour.getNameTour(); %></p>
            <img src= "Resource?url=<%=tour.getImg()%>" alt="...">
            <div id="infoTour">
              <p id="tgian"> <span>Thời gian: </span>1 ngày 1 đêm<%= tour.getAmountDays() %></p>
              <p id="diadiem"><span>Mô tả : </span><%= tour.getShortContent() %> </p>
              <p id="ngaykh"><span>Ngày khởi hành: </span><%= tour.getDeparture() %> </p>
              <p id="giacu">Giá cũ: <span id="gachgiua"><%= tour.getNewPrice() %>VNĐ</span></p>
              <p id="giomoi"><span>Giá KM: </span><%= tour.getOldPrice() %>Đ</p>
             <a href="datTour.jsp"> <button type="button" class="btn btn-danger">Đặt Tour</button></a>
            </div>
          </div>
      
        <!--end col--> 
      </div>
      <!--end row--> 
      
    </div>
    
    <!--thong tin tour--> 
    
    <!--start row-->
    <div class="row"> 
      <!--col-->
      <div class="col-xs-3 col-md-12">
        <div class="panel panel-default">
          <div class="tittle">
            <div class="backgr">THÔNG TIN TOUR</div>
          </div>
          <div class="panel-body">
            <p class="titledl" id="ngay1">SÁNG: TP. HỒ CHÍ MINH/HÀ NỘI – ĐÀ LẠT</p>
            <div id="infoTour">
              <p id="ngay1">Nếu có nhu cầu đón tại sân bay liên khương hay bến xe Hương dẫn viên và tài xế sẽ đón qutrong tour trọn gói vì đây là nhu cầu riêng của quý khách . 
Chiều : quý khách có thể thăm quan thành phố Đà Lạt bằng xe HonDa bằng xe máy ( miễn phí) do bên công ty cung cấp . 
Tối : Tự do khám phá Đà Lạt về đêm 
 </p>
              <img src="../infoTour/DuLichTrongNuoc/DaLat/Tour Đà Lạt 3 ngày 2 đêm đường hầm đất sét ĐÀ LẠT - Đường Hầm Đất Sét/pictures/bbi1420613859_tour-du-lich-da-lat-chinh-phuc-dinh-langbiang-3-ngay-2-dem.jpg" />
              <p>8h30 thăm quan đường hầm đất sét 
Đường hầm đất sét này được bắt đầu xây dựng từ năm 2010 với chiều dài khoảng 2 km tính tới nay chủ nhân của nó anh Trịnh Bá Dũng đã đầu tư khoảng 200 tỷ đồng. Điều hấp dẫn du khách ghé thăm khu du lịch này là vì nó tái hiện về lịch sử thành phố Đà Lạt từ thủa ban sơ cho tới một Đà Lạt năng động và hiện đại như bây giờ. Anh Dũng nói " Toàn bộ công trình đường hầm điêu khắc có 2 chủ đề chính là tái tạo lịch sử thành phố Đà Lạt và những câu chuyện nhân văn hóa, nhân văn có tính giáo dục.
 
</p>
            </div>
            <p class="titledl" id="ngay2">CHIỀU: THIỀN VIỆN TRUC LÂM</p>
            <div id="infoTour">
              <p id="ngay1">- Thiền Viện Trúc Lâm
là ngôi chùa lớn xây dựng năm 1993 theo Thiền Tông, rộng 24 hecta, . Đến Thiền Viện Trúc Lâm, du khách sẽ được tắm mình trong không khí thanh tịnh nơi chốn Thiền môn.Từ trên cao quý khách có thể ngắm toàn cảnh hồ Tuyền Lâm cùng với tổng thể núi rừng hùng vỹ bao quanh . đã tạo thêm cho ngôi chùa có sức thu hút mãnh liệt với du khách .
-Thác Đatala(không bao máng trượt )
là ngôi chùa lớn xây dựng năm 1993 theo Thiền Tông, rộng 24 hecta, . Đến Thiền Viện Trúc Lâm, du khách sẽ được tắm mình trong không khí thanh tịnh nơi chốn Thiền môn.Từ trên cao quý khách có thể ngắm toàn cảnh hồ Tuyền Lâm cùng với tổng thể núi rừng hùng vỹ bao quanh . đã tạo thêm cho ngôi chùa có sức thu hút mãnh liệt với du khách .

 .</p>
              <img src="../infoTour/DuLichTrongNuoc/DaLat/Tour Đà Lạt 3 ngày 2 đêm đường hầm đất sét ĐÀ LẠT - Đường Hầm Đất Sét/pictures/fbx1420613791_tour-du-lich-da-lat-chinh-phuc-dinh-langbiang-3-ngay-2-dem.jpg" id="ngay1">
            <div id="infoTour">
              <p id="ngay1">
-Khu du lịch cáp treo 
có độ cao 1500m so với mực nước biển để du khách có thể ngắm toàn cảnh thành phố Đà Lạt. Với hệ thống cáp treo dài 2300m, du khách sẽ tha hồ thưởng ngoạn để thăm quan ngôi chùa lớn nhất Đà Lạt.
12h00 về trung tâm thành phố ăn cơm trưa 
13h30 tiếp tục thăm quan thành phố Đà Lạt 
 
 </p>
 <p>- Làng villa Pháp
có độ cao 1500m so với mực nước biển để du khách có thể ngắm toàn cảnh thành phố Đà Lạt. Với hệ thống cáp treo dài 2300m, du khách sẽ tha hồ thưởng ngoạn để thăm quan ngôi chùa lớn nhất Đà Lạt.
Trang trại caphee chồn đầu tiên tại Đà Lạt
có độ cao 1500m so với mực nước biển để du khách có thể ngắm toàn cảnh thành phố Đà Lạt. Với hệ thống cáp treo dài 2300m, du khách sẽ tha hồ thưởng ngoạn để thăm quan ngôi chùa lớn nhất Đà Lạt.
 </p>
              <img src="../infoTour/DuLichTrongNuoc/DaLat/Tour Đà Lạt 3 ngày 2 đêm đường hầm đất sét ĐÀ LẠT - Đường Hầm Đất Sét/pictures/dph1420613947_tour-du-lich-da-lat-chinh-phuc-dinh-langbiang-3-ngay-2-dem.jpg" /> <p>Chùa ve chai ( chùa linh Phước )
Chua Linh Phước tự tọa lạc trên một khu đất nằm bên phải quốc lộ 20 - đường từ Đà Lạt đi Cầu Đất, thuộc địa bàn Trại Mát, phường 11. Chùa được khởi công xây dựng vào năm 1949 và hòan thành vào năm 1952 do Phật tử địa phương phát tâm đóng góp.
Năm 1990 dưới sự thiết kế và chỉ huy thi công của Thầy Trụ trì đời thứ năm là Thượng Tọa Thích Tâm Vị và sự đóng góp của Phật tử địa phương cùng Phật tử các nơi, Chùa đã được xây dựng lại toàn bộ như ngày nay.
- Nhà ga cổ nhât Việt Nam 
. là nhà ga tàu hỏa của thành phố Đà Lạt, đây được xem là nhà ga cổ kính nhất Việt Nam và Đông Dương
 
16h00 kết thúc tour</p>
 <img src="../infoTour/DuLichTrongNuoc/DaLat/Tour Đà Lạt 3 ngày 2 đêm đường hầm đất sét ĐÀ LẠT - Đường Hầm Đất Sét/pictures/xvl1420613984_tour-du-lich-da-lat-chinh-phuc-dinh-langbiang-3-ngay-2-dem.JPG" id="ngay1">
          </div></div></div>
        </div>
        <!--end col--> 
      </div>
      <!--end row--> 
    </div>

  </div>
  </div>
  <!--end thong tin tour-->
  <%@include file="footer.jsp" %>
  <!-- InstanceEndEditable -->
  </div>

</body>
<!-- InstanceEnd --></html>
