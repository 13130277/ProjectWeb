<%@ page import="Model.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/home.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Du Lịch Và Cuộc Sống</title>
<!-- InstanceEndEditable -->

<link href="../Bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="../Bootstrap/dist/css/font-awesome.min.css" rel="stylesheet" />
<link href="../Bootstrap/glyphicons.css" rel="stylesheet" type="text/css" />
<link href="../css/index/body_contenner.css" rel="stylesheet" type="text/css" />
<script src="../Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
<script src="../Bootstrap/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../Bootstrap/dist/js/app.min.js" type="text/javascript"></script>
</head>
<body>
<div id="container">
<%@include file="header.jsp" %>
<%@include file="seach.jsp" %>
  <div class="tittle">
    <a href="../html/Camnangdulich.jsp" ><div class="backgr">Tour Hot</div></a>
  </div>
  <div class="list">
    <div class="row">
      <div class="col-sm-8 col-md-6">
        <div class="thumbnail"> <img src="../infoTour/DuLichTrongNuoc/DaLat/Tour Đà Lạt 3 ngày 2 đêm đường hầm đất sét ĐÀ LẠT - Đường Hầm Đất Sét/pictures/bbi1420613859_tour-du-lich-da-lat-chinh-phuc-dinh-langbiang-3-ngay-2-dem.jpg" />
          <div class="caption">
            <h3> <a href="../#">Tour Du Lịch Tham Quan Nội Thành Đà Lạt - City Tour Đà Lạt 1 Ngày</a></h3>
            <p>Xuất phát từ đồi Robin cao 1.517m, vượt qua dãy đồi núi trập trùng, rừng thông vi vút, cáp treo Đà Lạt hiện nay là tuyến cáp treo dài nhất Việt Nam (2.267m) </p>
            <span class="sell-price"> 3.700.000 <sup>đ</sup></span> <span class="original-price"><del> 5.200.000  <sup>đ</sup></del></span>
            <p><a href="../html/datTour.jsp" class="btn btn-primary" role="button">Đặt mua</a> <a href="../html/TourPhanThiet.jsp" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-xs-6 col-md-6 small">
        <div class="thumbnail sml"> <img src="../infoTour/DuLichTrongNuoc/NhaTrang/nhatrang.jpg"  />
          <h4> <a href="../#">Du lịch Nha Trang  </a></h4>
          <p>Miễn phí phụ thu trẻ dưới 6 tuổi ngủ cùng cha mẹ .</p>
          <span class="sell-price"> 1.330.000 <sup>đ</sup></span> <span class="original-price"><del> 3.400.000 <sup>đ</sup></del></span>
          <div class="pull-right" >
            <p><a href="../#" class="btn btn-sm btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-sm btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-xs-6 col-md-6 small">
        <div class="thumbnail sml"> <img src="../infoTour/DuLichTrongNuoc/HaNoi/HaNoiDongBac/hobabe.jpg"  />
          <h4> <a href="../#">Hà Nội - Đông Bắc </a></h4>
          <p>Xe đưa Quý khách ra bến thuyền, đoàn lên thuyền tham quan Hồ Ba Bể (5 tiếng) </p>
          <span class="sell-price"> 1.330.000 <sup>đ</sup></span> <span class="original-price"><del> 3.400.000 <sup>đ</sup></del></span>
          <div class="pull-right" >
            <p><a href="../#" class="btn btn-sm btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-sm btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-xs-6 col-md-6 small">
        <div class="thumbnail sml"> <img src="../infoTour/DuLichTrongNuoc/BenTre/BenTre-Mytho/eia1436420446_tour-du-lich-my-tho-ben-tre-can-tho-trong-2-ngay-1-dem.jpg"  />
          <h4> <a href="../#">Mỹ Tho - Bến Tre  </a></h4>
          <p>uý khách xuống đò chèo con rạch nhỏ để chiêm ngưỡng những hàng dừa nước </p>
          <span class="sell-price"> 2.000.000 <sup>đ</sup></span> <span class="original-price"><del> 3.400.000 <sup>đ</sup></del></span>
          <div class="pull-right" >
            <p><a href="../#" class="btn btn-sm btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-sm btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="tittle">
    <a href="../html/Camnangdulich.jsp"><div class="backgr">Du Lịch trong Nước</div></a>
  </div>
  <div class="list">
    <div class="row">
      <div class="col-sm-6 col-md-4" style="margin-left:15px;">
        <div class="thumbnail"> <img src="../infoTour/DuLichTrongNuoc/BinhThuan/Bluebaymuine/bienphanthiet.jpg" />
          <div class="caption">
            <h3> <a href="../#"> Blue Bay Mũi Né Resort </a></h3>
            <span class="sell-price">1,690,000 <sup>đ</sup></span> <span class="original-price"><del> 2,100,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4" >
        <div class="thumbnail"> <img src="../infoTour/DuLichTrongNuoc/vungtau/langrungresort/174409-lan-rung-resort-2n1d-tang-lau-hai-san-xong-hoi.jpg" />
          <div class="caption">
            <h3> <a href="../#"> [Vũng Tàu] Lan Rừng Resort</a></h3>
            <span class="sell-price"> 1,485,000 <sup>đ</sup></span> <span class="original-price"><del>  2,296,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail"> <img src="../infoTour/DuLichTrongNuoc/BacLieu/NhaThoChaDiep/noi-an-nghi-cua-cha-diep.jpg" />
          <div class="caption">
            <h3> <a href="../#"> [Bạc Liêu] Viếng Nhà Thờ Cha Diệp </a></h3>
            <span class="sell-price"> 1.330.000 <sup>đ</sup></span> <span class="original-price"><del> 3.400.000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4" style="margin-left:15px;">
        <div class="thumbnail img-responsive "><img  height="300" itemprop="image" style="max-width: 100%;" src="../infoTour/DuLichTrongNuoc/BinhThuan/BinhChauLaGi/lagi.jpg" alt="" />
          <div class="caption">
            <h3> <a href="../#"> Tour Bình Châu – Lagi  </a></h3>
            <span class="sell-price">879,000 <sup>đ</sup></span> <span class="original-price"><del>  1,590,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail img-responsive "><img  height="300" itemprop="image" style="max-width: 100%;" src="../infoTour/DuLichTrongNuoc/NhaTrangPhuYenQuyNhon/nhatrangphuyenquynhon.jpg" alt="" />
          <div class="caption">
            <h3> <a href="../#">Quy Nhơn–Phú Yên–Nha Trang </a></h3>
            <span class="sell-price">2,390,000 <sup>đ</sup></span> <span class="original-price"><del> 4,390,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail img-responsive "><img  height="300" itemprop="image" style="max-width: 100%;" src="../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg" alt="" />
          <div class="caption">
            <h3> <a href="../#">Thác Pongour – Thác Voi </a></h3>
            <span class="sell-price"> 330,000 <sup>đ</sup></span> <span class="original-price"><del> 660,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="tittle">
<a href="../html/Camnangdulich.jsp"> <div class="backgr">Du Lịch Nước Ngoài</div></a>
  </div>
  <div class="list">
    <div class="row">
      <div class="col-sm-6 col-md-4" style="margin-left:15px;">
        <div class="thumbnail"> <img src="../infoTour/DuLichNuocNgoai/campuchia/campuchia.jpg" />
          <div class="caption">
            <h3> <a href="../#">Campuchia - Tour Cao Nguyên Bokor </a></h3>
            <span class="sell-price">3,279,000 <sup>đ</sup></span> <span class="original-price"><del>  5,179,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4" >
        <div class="thumbnail"> <img src="../infoTour/DuLichNuocNgoai/campuchia/Tour Siemriep - Phnompenh/208647-black-friday-cambodia-siemriep-phnompenh-4n3d-danh-cho-01-nguoi.jpg" />
          <div class="caption">
            <h3> <a href="../#"> Tour Siemriep - Phnompenh </a></h3>
            <span class="sell-price"> 3,500,000 <sup>đ</sup></span> <span class="original-price"><del> 3,900,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail"> <img src="../infoTour/DuLichNuocNgoai/thailan/bangkok-pataya/208639-black-friday-thailand-tour-bangkok-pataya-5n4d-danh-cho-01-nguoi.jpg" />
          <div class="caption">
            <h3> <a href="../#"> Tour Bangkok - Pataya</a></h3>
            <span class="sell-price"> 5,500,000 <sup>đ</sup></span> <span class="original-price"><del> 5,890,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4" style="margin-left:15px;">
        <div class="thumbnail img-responsive "><img  height="300" itemprop="image" style="max-width: 100%;" src="../infoTour/DuLichNuocNgoai/campuchia/thienduongbiendao/97485_body (3).jpg" alt="" />
          <div class="caption">
            <h3> <a href="../#">  Campuchia Thiên Đường Biển Đảo </a></h3>
            <span class="sell-price"> 3,400,000 <sup>đ</sup></span> <span class="original-price"><del>  4,900,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail img-responsive "><img  height="300" itemprop="image" style="max-width: 100%;" src="../infoTour/DuLichNuocNgoai/campuchia/sỉmiephuyenbi/168398-tour-kham-pha-siem-riep-huyen-bi-phnompenh-cao-nguyen-bokor-sihanoukville-dao-thien-duong-kohrong-ks-3-5-6n5d-danh-cho-1-khach.jpg" alt="" />
          <div class="caption">
            <h3> <a href="../#"> Siêm Riệp – Phnompenh </a></h3>
            <span class="sell-price"> 1.330.000 <sup>đ</sup></span> <span class="original-price"><del> 3.400.000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail img-responsive "><img  height="300" itemprop="image" style="max-width: 100%;" src="../infoTour/DuLichNuocNgoai/campuchia/giaimasiemriep/193078-campuchia-4n3d-giai-ma-siemriep-huyen-bi-phnompenh-danh-cho-1-nguoi.jpg" alt="" />
          <div class="caption">
            <h3> <a href="../#"> Tour Giải Mã Siemriep Huyền Bí</a></h3>
            <span class="sell-price"> 2,990,000 <sup>đ</sup></span> <span class="original-price"><del> 4,800,000 <sup>đ</sup></del></span>
            <p><a href="../#" class="btn btn-primary" role="button">Đặt mua</a> <a href="../#" class="btn btn-default" role="button">Xem Thêm</a></p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- InstanceEndEditable -->
<%@include file="footer.jsp" %>
 
  </div>

</body>
<!-- InstanceEnd --></html>
