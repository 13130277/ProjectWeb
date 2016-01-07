<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/Addmin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="title" -->
<title>Đọc thư</title>
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
              <div class="pull-left"> <a href="ThongTinAdmin.html" class="btn btn-default btn-flat">Chỉnh sửa hông tin</a> </div>
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
      <li class="treeview"> <a href="NewThemMotDiaDiemDL.html"> <i class="fa fa-cubes"></i> <span>Địa Điểm Du Lịch</span> </a>
        
      </li>
      <li class="treeview"> <a href=""><i class="fa fa-plane"></i> <span>Tour Du Lịch</span> <i class="fa fa-angle-left pull-right"></i> </a>
        <ul class="treeview-menu">
          <li><a href="NewThemMotTourDL.html"><i class="fa fa-circle-o"></i> Thêm Tour Du Lịch</a></li>
          <li><a href="DanhSachTourDuLich.html"><i class="fa fa-circle-o"></i> Danh Sách Tất Cả Các Tour</a></li>
        </ul>
      </li>
      <li class="treeview"> <a href="NewTatCaCacUser.html"> <i class="fa fa-users"></i> <span>Người Dùng</span> </a>
      
      </li>
      
      <li> <a href="NewBinhLuan.html"> <i class="fa fa-comment"></i> <span>Tất Cả Các Bình Luận</span> </a> </li>
      <li> <a href="ThongTinAdmin.html"> <i class="fa fa-edit"></i> <span>Chỉnh sửa thông tin</span> </a> </li>
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
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
              </div>
            </div>
            <div class="box-body no-padding">
              <ul class="nav nav-pills nav-stacked">
              <a href="compose.html" class="btn btn-primary btn-block margin-bottom">Soạn</a>
                <li class="active"><a href="#"><i class="fa fa-inbox"></i> Hộp thư đến
                  <span class="label label-primary pull-right">12</span></a></li>
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
              <h3 class="box-title">Read Mail</h3>

              <div class="box-tools pull-right">
                <a href="#" class="btn btn-box-tool" data-toggle="tooltip" title="Previous"><i class="fa fa-chevron-left"></i></a>
                <a href="#" class="btn btn-box-tool" data-toggle="tooltip" title="Next"><i class="fa fa-chevron-right"></i></a>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body no-padding">
              <div class="mailbox-read-info">
                <h3>Message Subject Is Placed Here</h3>
                <h5>From: support@almsaeedstudio.com
                  <span class="mailbox-read-time pull-right">15 Feb. 2015 11:03 PM</span></h5>
              </div>
              <!-- /.mailbox-read-info -->
              <div class="mailbox-read-message">
                <p>Hello John,</p>

                <p>Keffiyeh blog actually fashion axe vegan, irony biodiesel. Cold-pressed hoodie chillwave put a bird
                  on it aesthetic, bitters brunch meggings vegan iPhone. Dreamcatcher vegan scenester mlkshk. Ethical
                  master cleanse Bushwick, occupy Thundercats banjo cliche ennui farm-to-table mlkshk fanny pack
                  gluten-free. Marfa butcher vegan quinoa, bicycle rights disrupt tofu scenester chillwave 3 wolf moon
                  asymmetrical taxidermy pour-over. Quinoa tote bag fashion axe, Godard disrupt migas church-key tofu
                  blog locavore. Thundercats cronut polaroid Neutra tousled, meh food truck selfies narwhal American
                  Apparel.</p>

                <p>Raw denim McSweeney's bicycle rights, iPhone trust fund quinoa Neutra VHS kale chips vegan PBR&amp;B
                  literally Thundercats +1. Forage tilde four dollar toast, banjo health goth paleo butcher. Four dollar
                  toast Brooklyn pour-over American Apparel sustainable, lumbersexual listicle gluten-free health goth
                  umami hoodie. Synth Echo Park bicycle rights DIY farm-to-table, retro kogi sriracha dreamcatcher PBR&amp;B
                  flannel hashtag irony Wes Anderson. Lumbersexual Williamsburg Helvetica next level. Cold-pressed
                  slow-carb pop-up normcore Thundercats Portland, cardigan literally meditation lumbersexual crucifix.
                  Wayfarers raw denim paleo Bushwick, keytar Helvetica scenester keffiyeh 8-bit irony mumblecore
                  whatever viral Truffaut.</p>

                <p>Post-ironic shabby chic VHS, Marfa keytar flannel lomo try-hard keffiyeh cray. Actually fap fanny
                  pack yr artisan trust fund. High Life dreamcatcher church-key gentrify. Tumblr stumptown four dollar
                  toast vinyl, cold-pressed try-hard blog authentic keffiyeh Helvetica lo-fi tilde Intelligentsia. Lomo
                  locavore salvia bespoke, twee fixie paleo cliche brunch Schlitz blog McSweeney's messenger bag swag
                  slow-carb. Odd Future photo booth pork belly, you probably haven't heard of them actually tofu ennui
                  keffiyeh lo-fi Truffaut health goth. Narwhal sustainable retro disrupt.</p>

                <p>Skateboard artisan letterpress before they sold out High Life messenger bag. Bitters chambray
                  leggings listicle, drinking vinegar chillwave synth. Fanny pack hoodie American Apparel twee. American
                  Apparel PBR listicle, salvia aesthetic occupy sustainable Neutra kogi. Organic synth Tumblr viral
                  plaid, shabby chic single-origin coffee Etsy 3 wolf moon slow-carb Schlitz roof party tousled squid
                  vinyl. Readymade next level literally trust fund. Distillery master cleanse migas, Vice sriracha
                  flannel chambray chia cronut.</p>

                <p>Thanks,<br>Jane</p>
              </div>
              <!-- /.mailbox-read-message -->
            </div>
            <!-- /.box-body -->
            <div class="box-footer">
              <div class="pull-right">
                <button type="button" class="btn btn-default"><i class="fa fa-reply"></i> Reply</button>
              </div>
              <button type="button" class="btn btn-default"><i class="fa fa-trash-o"></i> Delete</button>
            </div>
            <!-- /.box-footer -->
          </div>
          <!-- /. box -->
      </div>
        <!-- /.col -->
    </div>
</div>
      <!--end row--> 
      
    </div>
  </div>
  
   
  
  </div>
  <!-- End Content Wrapper. Contains page content --> 
</div>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>
