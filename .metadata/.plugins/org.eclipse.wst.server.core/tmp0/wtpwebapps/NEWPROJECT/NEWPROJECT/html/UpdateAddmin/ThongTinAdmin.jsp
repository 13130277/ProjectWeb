<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/Addmin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="title" -->
<title>Thông Tin Admin</title>
<!-- InstanceEndEditable -->
<link href="../../Bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="../../Bootstrap/dist/css/font-awesome.min.css" rel="stylesheet" />
<link href="../../Bootstrap/dist/css/admin.min.css" rel="stylesheet" type="text/css" />
<link href="../../Bootstrap/dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />
<link href="../../Bootstrap/glyphicons.css" rel="stylesheet" type="text/css" />
<link href="../../css/UpdateAddmin/stylenewaddmin.css" rel="stylesheet" type="text/css" />
<link href="file:///E|/GOC%20HOC%20TAP/DH13DT/NAM%202015_2016/LTWeb/css/UpdateAddmin/table.css" rel="stylesheet" type="text/css" />
<script src="../../Bootstrap/dist/js/jQuery-2.1.4.min.js"></script>
<script src="../../Bootstrap/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../../Bootstrap/dist/js/app.min.js" type="text/javascript"></script>
</head>

<body class="skin-green sidebar-mini">
<header class="main-header"> 
  <!-- Logo --> 
  <a href="#" class="logo"> <span class="logo-mini"><b>THN</b></span> <span class="logo-lg">Du Lịch Và Cuộc sống</span> </a>
  <nav class="navbar navbar-static-top" role="navigation"> <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button"> <span class="sr-only">Toggle navigation</span> </a>
    <div class="navbar-custom-menu">
      <ul class="nav navbar-nav">
        <li class="dropdown user user-menu"> <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <img src="../../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg" class="user-image" alt="User Image"/> <span class="hidden-xs">Admin</span> </a>
          <ul class="dropdown-menu">
            <!-- User image -->
            <li class="user-header"> <img src="../../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg" class="img-circle" alt="User Image" />
              <p> AdMin </p>
            </li>
            <li class="user-footer">
              <div class="pull-left"> <a href="ThongTinAdmin.jsp" class="btn btn-default btn-flat">Chỉnh sửa hông tin</a> </div>
              <div class="pull-right"> <a href="#" class="btn btn-default btn-flat">Đăng xuất</a> </div>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </nav>
</header>
<aside class="main-sidebar">
  <section class="sidebar">
    <div class="user-panel">
      <div class="pull-left image"> <img src="../../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg" class="img-circle" alt="User Image" /> </div>
      <div class="pull-left info">
        <p>Supper admin</p>
        <a href="#"><i class="fa fa-circle text-success"></i> Online</a> </div>
    </div>
    <ul class="sidebar-menu">
      <li class="header">MAIN NAVIGATION</li>
      <li class="treeview"> <a href="NewThemMotDiaDiemDL.jsp"> <i class="fa fa-cubes"></i> <span>Địa Điểm Du Lịch</span> </a>
        
      </li>
      <li class="treeview"> <a href=""><i class="fa fa-plane"></i> <span>Tour Du Lịch</span> <i class="fa fa-angle-left pull-right"></i> </a>
        <ul class="treeview-menu">
          <li><a href="NewThemMotTourDL.jsp"><i class="fa fa-circle-o"></i> Thêm Tour Du Lịch</a></li>
          <li><a href="DanhSachTourDuLich.jsp"><i class="fa fa-circle-o"></i> Danh Sách Tất Cả Các Tour</a></li>
        </ul>
      </li>
      <li class="treeview"> <a href="NewTatCaCacUser.jsp"> <i class="fa fa-users"></i> <span>Người Dùng</span> </a>
      
      </li>
      
      <li> <a href="NewBinhLuan.jsp"> <i class="fa fa-comment"></i> <span>Tất Cả Các Bình Luận</span> </a> </li>
      <li> <a href="ThongTinAdmin.jsp"> <i class="fa fa-edit"></i> <span>Chỉnh sửa thông tin</span> </a> </li>
      <li><a href=""><i class="fa fa-sign-out"></i> <span>Đăng xuất</span></a></li>
    </ul>
  </section>
  <!-- /.sidebar --> 
  
</aside><!-- InstanceBeginEditable name="content" --> 

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
   <div class="container">
    <div class="col-sm-6 col-md-2">
      <div class="thumbnail tile tile-orange"> <a href="NewUserMoi.jsp" > <span class="glyphicon glyphicon-user"  ></span><span class="badge">237</span>
        <p>Người Dùng Mới</p>
        </div>
    </div>
    <div class="col-sm-6 col-md-2">
      <div class="thumbnail tile tile-red"> <a href="NewBinhLuanMoi.jsp" > <span class="glyphicon glyphicon-comment"  ></span><span class="badge">237</span>
        <p>Bình Luận mới</p>
        </a> </div>
    </div>
    <div class="col-sm-6 col-md-2">
      <div class="thumbnail tile tile-blue"> <a href="NewTourMoiDat.jsp" > <span class="glyphicon glyphicon-shopping-cart"  ></span><span class="badge">13</span>
        <p>Tour mới đặt</p>
        </a> </div>
    </div>
    <div class="col-sm-6 col-md-2">
      <div class="thumbnail tile tile-green"> <a href="TinNhanMoi.jsp" > <span class="glyphicon glyphicon-envelope"></span><span class="badge">88</span>
        <p>Tin nhắn</p>
        </a> </div>
    </div>
    <div class="col-sm-6 col-md-2">
      <div class="thumbnail tile tile-wisteria"> <a href="#" > <span class="glyphicon glyphicon-calendar"></span>
        <p>Lịch</p>
        </a> </div>
    </div>
  </div>
  <div class="container">
    <div class="panel panel-default">
      <div class="panel-heading"><i class="fa fa-cog" style="padding-right:5px;"></i>Cài Đặt Tài Khoản Chung</div>
      <div class="panel-body"> 
        <!--row-->
        <div class="row">
          <table class="table table-hover">
            <tbody>
              <tr>
                <th>Tên Người Dùng</th>
                <td>Văn Cường</td>
                <td><a><i class="fa fa-pencil"></i> Chỉnh Sửa</a></td>
              </tr>
              <tr>
                <th>Email</th>
                <td>hoaiminhit1990@mail.com</td>
                <td><a><i class="fa fa-pencil"></i> Chỉnh Sửa</a></td>
              </tr>
              <tr>
                <th>Mật Khẩu</th>
                <td>......</td>
                <td><a><i class="fa fa-pencil"></i> Chỉnh Sửa</a></td>
              </tr>
              <tr>
                <th>Địa Chỉ</th>
                <td>192 Hầm tử</td>
                <td><a><i class="fa fa-pencil"></i> Chỉnh Sửa</a></td>
              </tr>
              <tr>
                <th>Số Điện Thoại</th>
                <td>19008099</td>
                <td><a><i class="fa fa-pencil"></i> Chỉnh Sửa</a></td>
              </tr>
            </tbody>
          </table>
        </div>
        
        <!--end row--> 
      </div>
    </div>
  </div>
</div>
</div>
<!-- End Content Wrapper. Contains page content -->
</div>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>
