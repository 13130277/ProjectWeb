/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.65
 * Generated at: 2016-01-19 05:00:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.NEWPROJECT.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.User;
import java.util.ArrayList;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import DAO.TypeTourDaoImp;
import Model.Tour_Type;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/NEWPROJECT/NEWPROJECT/Bootstrap/dist/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<link href=\"/NEWPROJECT/NEWPROJECT/Bootstrap/glyphicons.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"/NEWPROJECT/NEWPROJECT/Bootstrap/bootstrap/js/bootstrap.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/NEWPROJECT/NEWPROJECT/Bootstrap/dist/js/app.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"/NEWPROJECT/NEWPROJECT/css/css.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<!-- Start WOWSlider.com HEAD section -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/NEWPROJECT/NEWPROJECT/engine1/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/NEWPROJECT/NEWPROJECT/engine1/jquery.js\"></script>\r\n");
      out.write("<!-- End WOWSlider.com HEAD section -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		User us;
		ArrayList<Tour_Type> listTourTN = (ArrayList<Tour_Type>) session.getAttribute("listTourTN");
		ArrayList<Tour_Type> listTourNN = (ArrayList<Tour_Type>) session.getAttribute("listTourNN");
	
      out.write("\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"login_loout\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					try {
						us = (User) session.getAttribute("user");
					} catch (Exception e) {
						us = new User();
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (us == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"DangKy\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/DangKy\">Đăng Ký </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"DangNhap\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Đăng Nhập </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">Xin Chào : <a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> ");
      out.print(us.getUserName());
      out.write("<span\r\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></span></a> </a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"DuLichTrongNuoc?newUrl=all\">Thông Tin Cá\r\n");
      out.write("\t\t\t\t\t\t\t\tNhân</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"DuLichTrongNuoc?newUrl=123>\"> Đăng Xuất</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"LienHe\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Liên Hệ </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"banner\">\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"Resource?url=F:\\GOC_HOC_TAP\\2015-2016\\LTW\\img\\logo\\flower banner 1 - Copy.jpg\" />\r\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"LoadDataHome\"><i class=\"fa fa-home\"></i>Trang\r\n");
      out.write("\t\t\t\t\t\t\t\tChủ</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"CamNanDuLich\"><i class=\"fa fa-book\"></i>Cẩm\r\n");
      out.write("\t\t\t\t\t\t\t\tNan Du Lịch</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Du Lịch Trong Nước<span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></span></a> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"DuLichTrongNuoc?newUrl=all\"> Tất cả các\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tTour</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (Tour_Type los : listTourTN) {
										String param = los.getIdTourType();
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"DuLichTrongNuoc?newUrl=");
      out.print(param);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(los.getNameType());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Du Lịch Nước Ngoài<span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></span></a> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"DuLichNuocNgoai?newUrl=all\"> Tất cả các\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tTour</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (Tour_Type los : listTourNN) {
										String param = los.getIdTourType();
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"DuLichNuocNgoai?newUrl=");
      out.print(param);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(los.getNameType());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"file:///G|/NEWPROJECT/NEWPROJECT/dangNhap.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-users\"></i>Khách Hàng</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"GioiThieu.jsp\"><i class=\"fa fa-user\"></i>Giới\r\n");
      out.write("\t\t\t\t\t\t\t\tThiệu</a></li>\r\n");
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
      out.write("\t\t\t\t\t\t<li><img src=\"/NEWPROJECT/NEWPROJECT/data1/images/01.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" title=\"\" id=\"wows1_0\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/NEWPROJECT/NEWPROJECT/data1/images/02.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" title=\"\" id=\"wows1_1\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://wowslider.net\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/data1/images/03.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"wowslider.net\" title=\"\" id=\"wows1_2\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/NEWPROJECT/NEWPROJECT/data1/images/04.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" title=\"\" id=\"wows1_3\" /></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ws_bullets\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/data1/images/01.jpg\" alt=\"\" />1</span></a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/data1/tooltips/02.jpg\" alt=\"\" />2</span></a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/data1/tooltips/03.jpg\" alt=\"\" />3</span></a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\" title=\"\"><span><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/data1/tooltips/04.jpg\" alt=\"\" />4</span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ws_script\" style=\"position: absolute; left: -99%\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://wowslider.com\">bootstrap carousel</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ws_shadow\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\"\r\n");
      out.write("\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/engine1/wowslider.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\"\r\n");
      out.write("\t\t\t\tsrc=\"/NEWPROJECT/NEWPROJECT/engine1/script.js\"></script>\r\n");
      out.write("\t\t\t<!-- End WOWSlider.com BODY section -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End Content Wrapper. Contains page content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
