<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/Addmin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="title" -->
<title>Untitled Document</title>
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
  <div class="panel panel-default">
    <div class="row">
      <div class="col-md-3">
        <div class="box box-solid">
          <div class="box-header with-border">
            <h3 class="box-title">Tùy Chọn</h3>
            <div class="box-tools">
              <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i> </button>
            </div>
          </div>
          <div class="box-body no-padding">
            <ul class="nav nav-pills nav-stacked">
              <a href="compose.jsp" class="btn btn-primary btn-block margin-bottom">Soạn</a>
              <li class="active"><a href="#"><i class="fa fa-inbox"></i> Hộp thư đến <span class="label label-primary pull-right">12</span></a></li>
              <li><a href="#"><i class="fa fa-envelope-o"></i> Hộp thư đã gửi</a></li>
              <li><a href="#"><i class="fa fa-trash-o"></i> </a></li>
            </ul>
          </div>
          <!-- /.box-body --> 
        </div>
      </div>
      <!-- /.col -->
      <div class="col-md-9">
        <div class="box box-primary">
          <div class="box-header with-border">
            <h3 class="box-title">Compose New Message</h3>
          </div>
          <!-- /.box-header -->
          <div class="box-body">
            <div class="form-group">
              <input class="form-control" placeholder="To:">
            </div>
            <div class="form-group">
              <input class="form-control" placeholder="Subject:">
            </div>
            <div class="form-group">
              <textarea id="compose-textarea" class="form-control" style="display:none; ">              
                    </textarea>
              <iframe class="wysihtml5-sandbox" security="restricted" allowtransparency="true" frameborder="0" width="0" height="0" marginwidth="0" marginheight="0" style="display: block; border-collapse: separate; border: 1px solid rgb(210, 214, 222); clear: none; float: none; margin: 0px; outline: rgb(85, 85, 85) none 0px; outline-offset: 0px; padding: 6px 12px; position: static; top: auto; left: auto; right: auto; bottom: auto; z-index: auto; vertical-align: baseline; text-align: start; box-sizing: border-box; box-shadow: none; border-radius: 0px; width: 100%; height: 300px; background-color: rgb(255, 255, 255);"></iframe>
            </div>
          </div>
          <!-- /.box-body -->
          <div class="box-footer">
            <div class="pull-right">
              <button type="button" class="btn btn-default"><i class="fa fa-pencil"></i> Draft</button>
              <button type="submit" class="btn btn-primary"><i class="fa fa-envelope-o"></i> Send</button>
            </div>
            <button type="reset" class="btn btn-default"><i class="fa fa-times"></i> Discard</button>
          </div>
          <!-- /.box-footer --> 
        </div>
        <!-- /. box --> 
      </div>
      <!-- /.col --> 
    </div>
  </div>
</div>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>
