/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-01-06 02:27:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.NEWPROJECT.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.LoadData;
import java.util.ArrayList;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import DAO.TypeTourDaoImp;
import Model.Tour_Type;

public final class kid_0020_002d_0020Copy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/NEWPROJECT/html/header.jsp", Long.valueOf(1452047203426L));
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
      out.write("<title>DU LỊCH NƯỚC NGOÀI</title>\r\n");
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
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<!-- InstanceBegin template=\"/Templates/home.dwt\" codeOutsideHTMLIsLocked=\"false\" -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("<link href=\"../Bootstrap/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../Bootstrap/dist/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../Bootstrap/glyphicons.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script src=\"../Bootstrap/dist/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"../Bootstrap/bootstrap/js/bootstrap.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../Bootstrap/dist/js/app.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- Start WOWSlider.com HEAD section -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../engine1/style.css\" />\r\n");
      out.write("<link href=\"../SpryAssets/SpryAccordion.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../engine1/jquery.js\"></script>\r\n");
      out.write("<!-- End WOWSlider.com HEAD section -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		//ArrayList<Tour_Type> listTypeTour = (ArrayList<Tour_Type>) session.getAttribute("listTypeTour");
	
      out.write("\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"login_loout\">\r\n");
      out.write("\t\t\t\t<div id=\"DangKy\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Đăng Ký </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"DangNhap\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Đăng Nhập </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"LienHe\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Liên Hệ </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"banner\">\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../img/logo/flower banner 1 - Copy.jpg\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Nhập tour cần tìm...\" s /> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">Seach</button>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /input-group -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.col-lg-6 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"header-hot-line\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-phone-square fa-2x \"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"float: left; padding-right: 2px;\"></i> <span>\r\n");
      out.write("\t\t\t\t\t\t\t(04-3) 511.33.33<em style=\"color: #666 !important;\">-</em>\r\n");
      out.write("\t\t\t\t\t\t\t01999.102.888\r\n");
      out.write("\t\t\t\t\t\t</span> <i id=\"txt\">(Thời gian làm việc: 8:00 - 17:30 các ngày trong\r\n");
      out.write("\t\t\t\t\t\t\ttuần)</i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.row -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div></div>\r\n");
      out.write("\t\t\t<!--end header-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- InstanceBeginEditable name=\"Change\" -->\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home.jsp\"><i class=\"fa fa-home\"></i>Trang\r\n");
      out.write("\t\t\t\t\t\t\t\tchủ</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"Camnangdulich.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-book\"></i>Cẩm Nan Du Lịch</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\" action=\"../LoadData\" method=\"post\"><a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Du\r\n");
      out.write("\t\t\t\t\t\t\t\tLịch Trong Nước <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> ");

 	//for (Tour_Type los : listTypeTour) {
 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" name=\"type_Tour\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> ");

 	// 	los.getNameType();
 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t");

							//	}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"kid - Copy.jsp\"><i class=\"fa fa-plane\"></i>Du\r\n");
      out.write("\t\t\t\t\t\t\t\tLịch Nước Ngoài<span class=\"caret\"></span></a> <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Submenu 1-1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Submenu 1-2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Submenu 1-3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"file:///G|/NEWPROJECT/dangNhap.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-users\"></i>Khách Hàng</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"GioiThieu.jsp\"><i class=\"fa fa-user\"></i>Giới\r\n");
      out.write("\t\t\t\t\t\t\t\t\tThiệu</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- InstanceEndEditable -->\r\n");
      out.write("\t\t<!-- InstanceBeginEditable name=\"change\" -->\r\n");
      out.write("\t\t<div id=\"slider\">\r\n");
      out.write("\t\t\t<!-- Start WOWSlider.com BODY section -->\r\n");
      out.write("\t\t\t<div id=\"wowslider-container1\">\r\n");
      out.write("\t\t\t\t<div class=\"ws_images\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"../data1/images/01.jpg\" alt=\"\" title=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"wows1_0\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"../data1/images/02.jpg\" alt=\"\" title=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"wows1_1\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://wowslider.net\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"../data1/images/03.jpg\" alt=\"wowslider.net\" title=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"wows1_2\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"../data1/images/04.jpg\" alt=\"\" title=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"wows1_3\" /></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ws_bullets\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"../data1/images/01.jpg\" alt=\"\" />1</span></a> <a href=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"../data1/tooltips/02.jpg\" alt=\"\" />2</span></a> <a href=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"../data1/tooltips/03.jpg\" alt=\"\" />3</span></a> <a href=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"../data1/tooltips/04.jpg\" alt=\"\" />4</span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ws_script\" style=\"position: absolute; left: -99%\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://wowslider.com\">bootstrap carousel</a> by\r\n");
      out.write("\t\t\t\t\tWOWSlider.com v8.6\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ws_shadow\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"../engine1/wowslider.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"../engine1/script.js\"></script>\r\n");
      out.write("\t\t\t<!-- End WOWSlider.com BODY section -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End Content Wrapper. Contains page content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("  <!-- InstanceEndEditable --><!-- InstanceBeginEditable name=\"change\" -->\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div id=\"tittle1\"></div>\r\n");
      out.write("    <div id=\"list1\">\r\n");
      out.write("  <!--start row-->\r\n");
      out.write("  <div class=\"row\"> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info1\"> <img src=\"../img/tournuocngoai/great_wall_of_china.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Trung Quốc</h3>\r\n");
      out.write("          <p>Trung Quốc là chiếc nôi của nền văn hóa phương Đông nói chung và văn hóa Châu Á nói riêng</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\" >\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info2\"> <img src=\"../img/tournuocngoai/medium_wlw1421828538.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Nhật Bản</h3>\r\n");
      out.write("\t\t\t<p>Nhật Bản - xứ sở hoa anh đào, một quốc gia hàng đầu thế giới về khoa học, công nghệ.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info3\" > <img src=\"../img/img-product/37484_0_square.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Pháp</h3>\r\n");
      out.write("          <p>Pháp được biết đến với Tháp Eiffel, dòng sông Seine thơ mộng, Nhà thờ Đức Bà Paris cổ kính..</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info4\"> <img src=\"../img/tournuocngoai/tour-thai-lan-top.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Thái Lan</h3>\r\n");
      out.write("          <p>Thái Lan, đất nước chùa tháp, thiên đàng mua sắm, thiên đàng du lịch..</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info5\"> <img src=\"../img/tournuocngoai/nga.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Nga</h3>\r\n");
      out.write("          <p>Mùa hè là thời điểm thích hợp nhất để khám phá nước Nga, khi tuyết đã tan, hoa nở khắp nơi ...</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info6\"> <img src=\"../img/tournuocngoai/brazil.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Brazil</h3>\r\n");
      out.write("          <p>Brazil - quốc gia của bóng đá - nổi tiếng với những bãi biển tuyệt đẹp, nhạc jazz... </p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info7\"> <img src=\"../img/tournuocngoai/medium_dwa1421828832.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Singapore</h3>\r\n");
      out.write("          <p>Singapore -đảo quốc sư tử, nơi nổi tiếng với những hòn đảo xinh đẹp, không khí trong lành </p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info8\"> <img src=\"../img/tournuocngoai/canada.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Canada</h3>\r\n");
      out.write("          <p>Khung cảnh mùa thu của Canada đầy lãng mạn nét đỏ kiêu sa hay màu vàng cam lóng lánh ...</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info9\"> <img src=\"../img/tournuocngoai/nuocanh.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Anh</h3>\r\n");
      out.write("          <p>Anh - xứ sở sương mù. Mỗi thành phố ở đây đều có các nhà hát opera, bảo tàng ...</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info10\"> <img src=\"../img/tournuocngoai/y.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Ý</h3>\r\n");
      out.write("          <p>Ý nổi tiếng với những thành phố kính như Đấu trường La Mã, tháp nghiêng Piza…</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info11\"> <img src=\"../img/tournuocngoai/du-lich-han-quoc-1.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Hàn Quốc</h3>\r\n");
      out.write("          <p>Đất nước xứ sở kim chi,có nền ẩm thực cùng ngắm cảnh mùa thu trong lành tuyệt đẹp.</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\" >\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info12\"> <img src=\"../img/tournuocngoai/halan.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Hà Lan</h3>\r\n");
      out.write("          <p>Hà Lan sở hữu những ngôi làng nhỏ với vô số chiếc cối xay gió cùng những cánh đồng Tullip lung linh..</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info13\"> <img src=\"../img/tournuocngoai/duc.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Đức</h3>\r\n");
      out.write("          <p>Nước Đức có rất nhiều phong cảnh đẹp đáng để bạn khám phá và trải nghiệm</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info14\"> <img src=\"../img/tournuocngoai/venezuela.jpg\"alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Venezuela</h3>\r\n");
      out.write("          <p>Venezuela – cái nôi đào tạo hoa hậu thế giới có những cánh rừng với hệ động thực vật phong phú</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info15\"> <img src=\"../img/tournuocngoai/ando.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Ấn Độ</h3>\r\n");
      out.write("          <p>Ấn Độ là quốc gia hàng đầu trên thế giới về phát triển hình thức du lịch chữa bệnh</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--col-->\r\n");
      out.write("    <div class=\"col-sm-6 col-md-4 \">\r\n");
      out.write("      <div class=\"thumbnail\" id=\"info16\"> <img src=\"../img/tournuocngoai/my.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Mỹ</h3>\r\n");
      out.write("          <p>Mỹ nổi tiếng với các công trình kiến trúc như: Nhà Trắng,tượng nữ thần tự do,...</p>\r\n");
      out.write("          <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--end col-->\r\n");
      out.write("    <div class=\"col-xs-3 col-md-8\">\r\n");
      out.write("      <div class=\"thumbnail\"  id=\"info17\"> <img src=\"../img/tournuocngoai/dubai.jpg\" alt=\"...\" />\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h3>Du Lịch Dubai</h3>\r\n");
      out.write("          <p>Dubai -\"thành phố của những đại gia\", \"thành phố của những kỷ lục guiness \"</p>\r\n");
      out.write("         <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Đặt tour</a> \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-default\" role=\"button\">Xem chi tiết</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div></div>\r\n");
      out.write("    <!--end col--> \r\n");
      out.write("    <!--end row--> \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
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
