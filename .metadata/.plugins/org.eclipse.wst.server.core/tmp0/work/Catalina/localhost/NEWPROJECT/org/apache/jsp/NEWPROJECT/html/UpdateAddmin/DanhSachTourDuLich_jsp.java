/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.65
 * Generated at: 2016-01-20 06:11:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.NEWPROJECT.html.UpdateAddmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DanhSachTourDuLich_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<!-- InstanceBegin template=\"/Templates/Addmin.dwt\" codeOutsideHTMLIsLocked=\"false\" -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<!-- InstanceBeginEditable name=\"title\" -->\r\n");
      out.write("<title>Danh Sách Tour Du Lịch</title>\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("<link href=\"../../Bootstrap/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../../Bootstrap/dist/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../../Bootstrap/dist/css/admin.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../../Bootstrap/dist/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../../Bootstrap/glyphicons.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../../css/UpdateAddmin/stylenewaddmin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"file:///E|/GOC%20HOC%20TAP/DH13DT/NAM%202015_2016/LTWeb/css/UpdateAddmin/table.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../../Bootstrap/dist/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"../../Bootstrap/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../Bootstrap/dist/js/app.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"skin-green sidebar-mini\">\r\n");
      out.write("<header class=\"main-header\"> \r\n");
      out.write("  <!-- Logo --> \r\n");
      out.write("  <a href=\"#\" class=\"logo\"> <span class=\"logo-mini\"><b>THN</b></span> <span class=\"logo-lg\">Du Lịch Và Cuộc sống</span> </a>\r\n");
      out.write("  <nav class=\"navbar navbar-static-top\" role=\"navigation\"> <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\"> <span class=\"sr-only\">Toggle navigation</span> </a>\r\n");
      out.write("    <div class=\"navbar-custom-menu\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"dropdown user user-menu\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> <img src=\"../../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg\" class=\"user-image\" alt=\"User Image\"/> <span class=\"hidden-xs\">Admin</span> </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <!-- User image -->\r\n");
      out.write("            <li class=\"user-header\"> <img src=\"../../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg\" class=\"img-circle\" alt=\"User Image\" />\r\n");
      out.write("              <p> AdMin </p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"user-footer\">\r\n");
      out.write("              <div class=\"pull-left\"> <a href=\"ThongTinAdmin.jsp\" class=\"btn btn-default btn-flat\">Chỉnh sửa hông tin</a> </div>\r\n");
      out.write("              <div class=\"pull-right\"> <a href=\"#\" class=\"btn btn-default btn-flat\">Đăng xuất</a> </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<aside class=\"main-sidebar\">\r\n");
      out.write("  <section class=\"sidebar\">\r\n");
      out.write("    <div class=\"user-panel\">\r\n");
      out.write("      <div class=\"pull-left image\"> <img src=\"../../infoTour/DuLichTrongNuoc/DaLat/thacPongour/thacpongour.jpg\" class=\"img-circle\" alt=\"User Image\" /> </div>\r\n");
      out.write("      <div class=\"pull-left info\">\r\n");
      out.write("        <p>Supper admin</p>\r\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"sidebar-menu\">\r\n");
      out.write("      <li class=\"header\">MAIN NAVIGATION</li>\r\n");
      out.write("      <li class=\"treeview\"> <a href=\"NewThemMotDiaDiemDL.jsp\"> <i class=\"fa fa-cubes\"></i> <span>Địa Điểm Du Lịch</span> </a> </li>\r\n");
      out.write("      <li class=\"treeview\"> <a href=\"\"><i class=\"fa fa-plane\"></i> <span>Tour Du Lịch</span> <i class=\"fa fa-angle-left pull-right\"></i> </a>\r\n");
      out.write("        <ul class=\"treeview-menu\">\r\n");
      out.write("          <li><a href=\"NewThemMotTourDL.jsp\"><i class=\"fa fa-circle-o\"></i> Thêm Tour Du Lịch</a></li>\r\n");
      out.write("          <li><a href=\"DanhSachTourDuLich.jsp\"><i class=\"fa fa-circle-o\"></i> Danh Sách Tất Cả Các Tour</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"treeview\"> <a href=\"NewTatCaCacUser.jsp\"> <i class=\"fa fa-users\"></i> <span>Người Dùng</span> </a> </li>\r\n");
      out.write("      <li> <a href=\"NewBinhLuan.jsp\"> <i class=\"fa fa-comment\"></i> <span>Tất Cả Các Bình Luận</span> </a> </li>\r\n");
      out.write("      <li> <a href=\"ThongTinAdmin.jsp\"> <i class=\"fa fa-edit\"></i> <span>Chỉnh sửa thông tin</span> </a> </li>\r\n");
      out.write("      <li><a href=\"\"><i class=\"fa fa-sign-out\"></i> <span>Đăng xuất</span></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- /.sidebar --> \r\n");
      out.write("  \r\n");
      out.write("</aside>\r\n");
      out.write("<!-- InstanceBeginEditable name=\"content\" --> \r\n");
      out.write("<!-- Content Wrapper. Contains page content -->\r\n");
      out.write("<div class=\"content-wrapper\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("      <div class=\"thumbnail tile tile-orange\"> <a href=\"NewUserMoi.jsp\" > <span class=\"glyphicon glyphicon-user\"  ></span><span class=\"badge\">237</span>\r\n");
      out.write("        <p>Người Dùng Mới</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("      <div class=\"thumbnail tile tile-red\"> <a href=\"NewBinhLuanMoi.jsp\" > <span class=\"glyphicon glyphicon-comment\"  ></span><span class=\"badge\">237</span>\r\n");
      out.write("        <p>Bình Luận mới</p>\r\n");
      out.write("        </a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("      <div class=\"thumbnail tile tile-blue\"> <a href=\"NewTourMoiDat.jsp\" > <span class=\"glyphicon glyphicon-shopping-cart\"  ></span><span class=\"badge\">13</span>\r\n");
      out.write("        <p>Tour mới đặt</p>\r\n");
      out.write("        </a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("      <div class=\"thumbnail tile tile-green\"> <a href=\"TinNhanMoi.jsp\" > <span class=\"glyphicon glyphicon-envelope\"></span><span class=\"badge\">88</span>\r\n");
      out.write("        <p>Tin nhắn</p>\r\n");
      out.write("        </a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("      <div class=\"thumbnail tile tile-wisteria\"> <a href=\"#\" > <span class=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("        <p>Lịch</p>\r\n");
      out.write("        </a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- End Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"panel panel-default\">\r\n");
      out.write("    <div class=\"panel-heading\"><i class=\"fa fa-list-alt\"></i>Danh Sách Tour Du Lịch</div>\r\n");
      out.write("    <div class=\"panel-body\"> \r\n");
      out.write("      <!--row-->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <table class=\"table table-bordered table-striped\" >\r\n");
      out.write("          <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Mã Địa Diểm </th>\r\n");
      out.write("              <th>Mã Tour</th>\r\n");
      out.write("              <th>Tên tour</th>\r\n");
      out.write("              <th>Ảnh</th>\r\n");
      out.write("              <th>Mô Tả</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>DL2001</td>\r\n");
      out.write("              <td>DLTour01</td>\r\n");
      out.write("              <td>Thung Lũng Tình Yêu</td>\r\n");
      out.write("              <td><img /></td>\r\n");
      out.write("              <td>...Mô Tả ở Đây </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>DL2001</td>\r\n");
      out.write("              <td>DLTour01</td>\r\n");
      out.write("              <td>Thung Lũng Tình Yêu</td>\r\n");
      out.write("              <td><img /></td>\r\n");
      out.write("              <td>...Mô Tả ở Đây </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>DL2001</td>\r\n");
      out.write("              <td>DLTour01</td>\r\n");
      out.write("              <td>Thung Lũng Tình Yêu</td>\r\n");
      out.write("              <td><img /></td>\r\n");
      out.write("              <td>...Mô Tả ở Đây </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>DL2001</td>\r\n");
      out.write("              <td>DLTour01</td>\r\n");
      out.write("              <td>Thung Lũng Tình Yêu</td>\r\n");
      out.write("              <td><img /></td>\r\n");
      out.write("              <td>...Mô Tả ở Đây </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>DL2001</td>\r\n");
      out.write("              <td>DLTour01</td>\r\n");
      out.write("              <td>Thung Lũng Tình Yêu</td>\r\n");
      out.write("              <td><img /></td>\r\n");
      out.write("              <td>...Mô Tả ở Đây </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        <div class=\"pull-right\">\r\n");
      out.write("          <div class=\"btn-group\">\r\n");
      out.write("            <ul class=\"pagination pagination-sm\">\r\n");
      out.write("              <li><a href=\"#\">&laquo;</a></li>\r\n");
      out.write("              <li><a href=\"#\">1</a></li>\r\n");
      out.write("              <li><a href=\"#\">2</a></li>\r\n");
      out.write("              <li><a href=\"#\">3</a></li>\r\n");
      out.write("              <li><a href=\"#\">&raquo;</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.btn-group --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.pull-right --> \r\n");
      out.write("      </div>\r\n");
      out.write("      <!--end row--> \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("</body>\r\n");
      out.write("<!-- InstanceEnd -->\r\n");
      out.write("</html>\r\n");
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
