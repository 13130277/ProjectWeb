/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-01-03 09:41:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.NEWPROJECT.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/NEWPROJECT/html/footer.jsp", Long.valueOf(1451809395344L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><!-- InstanceBegin template=\"/Templates/newTest.dwt\" codeOutsideHTMLIsLocked=\"false\" -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<!-- InstanceBeginEditable name=\"doctitle\" -->\r\n");
      out.write("<title>CẨM NAN DU LỊCH</title>\r\n");
      out.write("<link href=\"../css/stylekid.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("<link href=\"../Bootstrap/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/footer-distributed-with-address-and-phones.css\">\r\n");
      out.write("<link href=\"../Bootstrap/dist/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../Bootstrap/glyphicons.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../css/UpdateAddmin/stylenewaddmin.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../Bootstrap/dist/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"../Bootstrap/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../Bootstrap/dist/js/app.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../SpryAssets/SpryMenuBarHorizontal.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../SpryAssets/SpryMenuBar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- Start WOWSlider.com HEAD section -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../engine1/style.css\" />\r\n");
      out.write("<link href=\"../css/index/body_contenner.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../SpryAssets/SpryAccordion.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../engine1/jquery.js\"></script>\r\n");
      out.write("<script src=\"../SpryAssets/SpryAccordion.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- End WOWSlider.com HEAD section -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\">  <div id=\"login_loout\">\r\n");
      out.write("      <div id=\"DangKy\"><a href=\"#\" >Đăng Ký </a></div>\r\n");
      out.write("      <div id=\"DangNhap\" ><a href=\"#\"> Đăng Nhập </a></div>\r\n");
      out.write("      <div id=\"LienHe\" ><a href=\"#\"> Liên Hệ </a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"banner\">\r\n");
      out.write("      <div id=\"logo\"><a href=\"../home.jsp\"><img src=\"../img/logo/flower%20banner%201%20-%20Copy.jpg\"  /></a></div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-6\">\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\"  placeholder=\"Nhập tour cần tìm...\">\r\n");
      out.write("            <span class=\"input-group-btn\">\r\n");
      out.write("            <button class=\"btn btn-default\" type=\"button\">Seach</button>\r\n");
      out.write("            </span> </div>\r\n");
      out.write("          <!-- /input-group --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.col-lg-6 -->\r\n");
      out.write("        <div class=\"header-hot-line\" >\t\t\t\r\n");
      out.write("\t\t\t <i class=\"fa fa-phone-square fa-2x \" style=\"float:left; padding-right:2px;\"></i>\r\n");
      out.write("\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t(04-3) 511.33.33<em style=\"color: #666 !important;\">-</em> 01999.102.888 \r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<i id=\"txt\">(Thời gian làm việc: 8:00 - 17:30 các ngày trong tuần)</i>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <div ></div>\r\n");
      out.write(" <!--end header--> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- InstanceBeginEditable name=\"change2\" -->\r\n");
      out.write("  <div id=\"menu\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("        <ul class=\"nav nav-tabs\">\r\n");
      out.write("          <li ><a href=\"home.jsp\"><i class=\"fa fa-home\"></i>Trang chủ</a></li>\r\n");
      out.write("          <li><a href=\"Camnangdulich.jsp\"><i class=\"fa fa-book\"></i>Cẩm Nan Du Lịch</a></li>\r\n");
      out.write("          <li class=\"active\"><a href=\"kid.jsp\"><i class=\"fa fa-car\"></i>Du Lịch Trong Nước</a></li>\r\n");
      out.write("          <li><a href=\"kid - Copy.jsp\"><i class=\"fa fa-plane\"></i>Du Lịch Nước Ngoài</a></li>\r\n");
      out.write("          <li><a href=\"../dangky.jsp\"><i class=\"fa fa-users\"></i>Khách Hàng</a><ul></ul></li>\r\n");
      out.write("          <li><a href=\"GioiThieu.jsp\"><i class=\"fa fa-user\"></i>Giới Thiệu</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- InstanceEndEditable --><!-- InstanceBeginEditable name=\"change\" -->\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div id=\"tittle1\"></div>\r\n");
      out.write("  <div id=\"list1\">\r\n");
      out.write("  <!--start row-->\r\n");
      out.write("  <div class=\"row\"> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info1\"> <img src=\"../img/tourdalat/9-Du-lich-da-lat-thang-7-mytour-3.jpg\" \r\n");
      out.write("      title=\"Du Lịch Đà Lạt\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Đà Lạt</h3>\r\n");
      out.write("          <p>Đà lạt ví như Pari thu nhỏ, với những biệt thự xinh xắn mang kiến trúc Châu Âu, những lối đi đầy hoa và cỏ dại, với rừng thông bạt ngàn bao bọc</p>\r\n");
      out.write("          <p><a href=\"BookTour.jsp\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\" >\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info2\"> <img src=\"../img/tournhatrang/8-du-lich-nha-trang-co-gi-choi-mytour-1.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Nha Trang</h3>\r\n");
      out.write("\t\t\t<p>Nha Trang là một trong những bãi biển đẹp nhất Việt Nam được đầu tư để phát triển du lịch</p>\r\n");
      out.write("         <p><a href=\"BookTour.jsp\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info3\" > <img src=\"../img/tourcondao/9-du-lich-con-dao-co-gi-mytour-31.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Vũng Tàu</h3>\r\n");
      out.write("          <p>Vũng Tàu là thành phố du lịch nghỉ mát, tắm biển, dưỡng bệnh ở biển sớm nhất nước ta.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info4\"> <img src=\"../img/tourdanang/medium_jim1436146394_tour-du-lich-ba-na-nui-chua-trong-1-ngay-dl2.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Đà Nẵng</h3>\r\n");
      out.write("          <p>Đà Nẵng nổi tiếng với dòng sông Hàn thơ mộng  cùng các cây cầu độc đáo.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info5\"> <img src=\"../img/tourHaNoi/HaNoi3.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Hà Nội</h3>\r\n");
      out.write("          <p>Thành phố Hà Nội là Thủ đô ngàn năm văn hiến với những di tích cổ xưa, cuộc sống yên bình</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info6\"> <img src=\"../img/tourhochiminh/medium_vxn1420183560_tour-du-lich-city-sai-gon-dia-dao-cu-chi-1-ngay.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Sài Gòn</h3>\r\n");
      out.write("          <p>Sài Gòn mang những nét pha trộn độc đáo giữa văn hóa thời Pháp thuộc và cả bản sắc dân tộc</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info7\"> <img src=\"../img/tourquangninh/medium_ddu1410861929.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Quảng Ninh</h3>\r\n");
      out.write("          <p>Vịnh Hạ Long - di sản văn hoá hế giới với nhiều hang động độc đáo...</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info8\"> <img src=\"../img/tourhue/medium_cxa1421828237.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Huế</h3>\r\n");
      out.write("          <p>Cố đô Huế mang vẻ đẹp thơ mộng bên dòng sông Hương hiền hoà.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info9\"> <img src=\"../img/toursapa/sapa.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Sapa</h3>\r\n");
      out.write("          <p>Sa Pa như một thành phố trong sương huyền ảo, vẽ lên một bức tranh sơn thủy hữu tình.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info10\"> <img src=\"../img/tourphuquoc/dinh-cau-phu-quoc2-200x150.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Phú Quốc</h3>\r\n");
      out.write("          <p>Phú Quốc - Đảo ngọc của Việt Nam. Hòn đảo thơ mộng cúng với bờ cát trắng..</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info11\"> <img src=\"../img/tourquangnam/medium_lnd1410861981.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Hội An</h3>\r\n");
      out.write("          <p>Phố cổ Hội An với rất nhiều căn nhà phố cổ có độ tuổi hàng trăm năm vẫn còn nguyên vẹn. </p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\" >\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info12\"> <img src=\"../img/tourtamdao/9-du-lich-tam-dao-co-gi-mytour-4.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Tam Đảo</h3>\r\n");
      out.write("          <p>Tam Đảo là một điểm đến cuối tuần cho của dân miền Bắc.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info13\"> <img src=\"../img/tourmocchau/9-Du-lich-moc-chau-thang-1-mytour-1.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Mộc Châu</h3>\r\n");
      out.write("          <p>Mộc Châu có những đồi chè bạt ngàn, những cánh đồng hoa Cải hay hoa Dã Quỳ...</p>\r\n");
      out.write("         <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info14\"> <img src=\"../img/tourhagiang/du-lich-Ha-giang-thang-9-mytour-10.jpg\"alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Hà Giang</h3>\r\n");
      out.write("          <p>Hà Giang đẹp bởi phong cảnh hùng vĩ, những con đường quanh co,Sắc Hoa và Tình Người</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info15\"> <img src=\"../img/tourninhthuan/medium_eex1444730927.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Phan Thiết</h3>\r\n");
      out.write("          <p>Đến Phan Thiết nhất định phải đi Mũi Né,...</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info16\"> <img src=\"../img/tourninhbinh/medium_sor1410862076.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Ninh Bình</h3>\r\n");
      out.write("          <p>Ninh Bình hâp dẫn bởi các thắng cảnh tự nhiên vô cùng hùng vĩ và tráng lệ. </p>\r\n");
      out.write("         <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info17\"> <img src=\"../img/tournhatrang/Du-lich-cam-ranh-co-gi-choi-mytour-7.jpg\" alt=\"...\">\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Cam Ranh</h3>\r\n");
      out.write("          <p>Biển ở Cam Ranh không ồn ào, xô bồ và đô thị hóa như : Nha Trang, Mũi Né,</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a>\r\n");
      out.write("           <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- InstanceEndEditable -->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("<link href=\"../Bootstrap/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/footer-distributed-with-address-and-phones.css\">\r\n");
      out.write("<link href=\"../Bootstrap/dist/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../Bootstrap/glyphicons.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../Bootstrap/dist/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"../Bootstrap/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../Bootstrap/dist/js/app.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <footer class=\"footer-distributed\">\r\n");
      out.write("    <div class=\"footer-left\">\r\n");
      out.write("      <h3>Du Lịch V<span>à Cuộc Sống</span></h3>\r\n");
      out.write("      <p class=\"footer-links\"> <a href=\"home.jsp\">Trang Chủ</a> ·\r\n");
      out.write("       <a href=\"Camnangdulich.jsp\">Cẩm nang</a> · <a href=\"DuLichTrongNuoc.jsp\">Du Lịch Nội Địa</a> \r\n");
      out.write("       · <a href=\"DuLichNuocNgoai.jsp\">Du Lịch Nước Ngoài</a> \r\n");
      out.write("       · <a href=\"#\">Khách Hàng</a> · <a href=\"GioiThieu.jsp\">Giới Thiệu</a></p>\r\n");
      out.write("      <p class=\"footer-company-name\">CÔNG TY DU LỊCH VIỆT 2015</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-center\">\r\n");
      out.write("      <div> <i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("        <p><span> 175, Nguyễn Thái Bình ,</span>Quận 1,Tp.HCM.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div> <i class=\"fa fa-phone\"></i>\r\n");
      out.write("        <p>+1 555 123456</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div> <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("        <p><a href=\"mailto:support@company.com\">phongkhachhang@vtc.com</a></p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-right\">\r\n");
      out.write("      <p class=\"footer-company-about\"> <span>Công ty Du lịch Việt</span> Tận hưởng chuyến du lịch đầy ý nghĩa.</p>\r\n");
      out.write("      <div class=\"footer-icons\"> <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> <a href=\"#\"><i class=\"fa fa-twitter\"></i></a> <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a> <a href=\"#\"><i class=\"fa fa-github\"></i></a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- InstanceEnd --></html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
