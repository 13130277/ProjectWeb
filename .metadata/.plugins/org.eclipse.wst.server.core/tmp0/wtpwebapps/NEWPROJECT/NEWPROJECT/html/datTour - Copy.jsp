<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/newTest.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Đặt Tour</title>
<link href="../css/index/datTour.css" rel="stylesheet" type="text/css" />
<!-- InstanceEndEditable -->
<link href="../Bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="../css/footer-distributed-with-address-and-phones.css">
<link href="../Bootstrap/dist/css/font-awesome.min.css" rel="stylesheet" />
<link href="../Bootstrap/glyphicons.css" rel="stylesheet" type="text/css" />
<link href="../css/UpdateAddmin/stylenewaddmin.css" rel="stylesheet" />
<script src="../Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
<script src="../Bootstrap/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../Bootstrap/dist/js/app.min.js" type="text/javascript"></script>
<link href="../css/css.css" rel="stylesheet" type="text/css" />



</head>

<body>
<div id="container">
<%@include file="header.jsp" %>
  <!-- InstanceEndEditable --><!-- InstanceBeginEditable name="change" -->
  <div id="ttdatTour">
  <div class="panel panel-default frist" >
    <div class="panel-heading titlefrist">Thông Tin Liên Hệ</div>
    <div class="panel-body bodyfirst"> 
      <!--start row-->
      <div class="row">
        <form>
          <div class="form-group">
            <label for="text">Họ Tên : <span style="color:#F00;">*</span></label>
            <input type="text" class="form-control" id="text" placeholder="Họ Và Tên">
          </div>
          <div class="form-group">
            <label for="text">Số Điện Thoại : <span style="color:#F00;">*</span> </label>
            <input type="text" class="form-control" id="text" placeholder="Số Điện Thoại">
          </div>
          <div class="form-group">
            <label for="inputEmail"> Email : <span style="color:#F00;">*</span> </label>
            <input type="email" class="form-control" id="inputEmail" placeholder="Email">
          </div>
          <div class="form-group">
            <label for="text"> Địa chỉ : </label>
            <input type="text" class="form-control" id="text" placeholder="Địa chỉ">
          </div>
        </form>
      </div>
    </div>
  </div>
  
  <!--end row-->
  
  <div class="panel panel-default sc">
    <div class="panel-heading schead">Thông Tin Đặt Tour</div>
    <div class="panel-body scbody"> <img src="../infoTour/DuLichTrongNuoc/DaLat/Tour Đà Lạt 3 ngày 2 đêm đường hầm đất sét ĐÀ LẠT - Đường Hầm Đất Sét/pictures/bbi1420613859_tour-du-lich-da-lat-chinh-phuc-dinh-langbiang-3-ngay-2-dem.jpg" />
      <div class="common infomation">
        <div>
          <div class="margin_negative_5"> <i class="protect_icon boardicons"></i>
            <h3>Tour Du Lịch Tham Quan Nội Thành Đà Lạt - City Tour Đà Lạt 1 Ngày </h3>
          </div>
        </div>
        <div class="form-group">
            <label>Ngày Khởi Hành</label>
            <input type="text" class="form-control" value="22/12/1025">
        </div>
        <div class="form-group">
            <label>Số lượng tour đặt</label>
            <input type="number" class="form-control">
        </div>
      </div>
      <div class="booking_bill background_none">
        <h3>Thông tin thanh toán</h3>
        <div id="s_view">
          
          <div class="viewport">
            <div class="overview">
              <p class="n_room">Tour Du Lịch Tham Quan Nội Thành Đà Lạt - City Tour Đà Lạt 1 Ngày</p>
              <div class="wap_bill">
                <table>
                  <tbody>
                    <tr>
                      <td class="w_60"><span id="stock"> 1 </span> phiếu </td>
                      <td class="w_10">x</td>
                      <td class="w_80"><span class="symbol_before"></span> <span  class="price_show">3.700.000</span> <span class="symbol_after">₫</span></td>
                      <td class="w_10"></td>
                      <td class="w_50"></td>
                      <td class="w_10">=</td>
                      <td align="right"><b id="money_total"><span class="symbol_before"></span> <span  class="price_show">3.700.000</span> <span class="symbol_after">₫</span></b></td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <p class="total_money"> Tổng số tiền <b> <span class="symbol_before"></span> <span data="3400000" class="price_show">3.700.00</span> <span class="symbol_after">₫</span> </b> </p>
        <div id="voucher_money"></div>
        <div id="money-payment"></div>
        <div class="clear"></div>
    </div>
    </div>
  </div>
  
  
  <div class="panel panel-default th">
    <div class="panel-heading thhead">Gửi yêu cầu đặt tour</div>
    <div class="panel-body thbody"> <a href="thongtindattour.jsp" class="btn btn-primary btn-block margin-bottom">Hoàn Thành</a>
      <div class=" boxnoti note_info_contact"> <b class="title_note" style="color:#F00 ;font-size:20px;">Lưu ý:</b>
        <ul>
          <li> Quý khách có thể thanh toán trước bằng thẻ <a href="#"> tại đây. </a> </li>
          <li> 
          
            Mytour sẽ liên hệ với quý khách (qua email hoặc điện thoại) trong vòng <span style="color:#F93; font-size:24px;">30 phút</span> (T2-CN: 08:00 - 23:00) để xác
            nhận tour và thời hạn thanh toán. 
            <!-- Việc thanh toán chỉ được tiến hành sau khi quý khách nhận được xác nhận còn phòng trống từ Mytour.vn --> 
          </li>
          <li> Quý khách sẽ thanh toán (tại nhà, tại Mytour, chuyển khoản hay thẻ) sau khi có xác nhận
            còn tour từ Mytour. </li>
          <li class="last"> Trường hợp Quý khách muốn xác nhận ngay, vui lòng liên hệ với Mytour theo Hotline:
            <div> Hà Nội: (04) 7109 9999</div>
            <div> Hồ Chí Minh:(08) 7309 9899</div>
          </li>
        </ul>

    </div>
    </div>
  </div>
  

</div>




  <!-- InstanceEndEditable -->
<%@include file="footer.jsp" %>
</div>

</body>
<!-- InstanceEnd --></html>
