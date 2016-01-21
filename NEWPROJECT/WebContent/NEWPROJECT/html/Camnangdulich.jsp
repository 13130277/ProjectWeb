<<<<<<< HEAD
<%@page import="Model.IMG"%>
=======
<%@page import="Model.HandBook"%>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="Model.HandBook"%> 
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/Camnangdulich.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>CẨM NANG DU LỊCH</title>
<link href="/NEWPROJECT/NEWPROJECT/css/camnang.css" rel="stylesheet" type="text/css" />
<link href="/NEWPROJECT/NEWPROJECT/css/GioiThieuCamNang.css" rel="stylesheet" type="text/css" />
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
<script type="text/javascript">
	$(document).ready(function() {
		$('#header').load("LoadDataHeader");
		
	});
</script>
</head>
<%ArrayList<HandBook> listBaiViet = (ArrayList<HandBook>) session.getAttribute("toulistTourDuLichNuocNgoai"); %>
<body>
<% ArrayList<HandBook> listHandBook = (ArrayList<HandBook>)session.getAttribute("listAllHandBook"); %>
<div id="header"></div>
<div id="container">
 <%@include file="seach.jsp" %>
  <div class="tittle">
    <div class="backgr">Du Lịch Việt Nam</div>
  </div>
 	<div class="list">
    <div class="wap_location_right">
    	<ul class="filter">
<<<<<<< HEAD
    	<%for (HandBook list : listHandBook){
    		list.getIdHandBook();
    	%>
    	<li><a class="image" href="<%= list.getIdHandBook()%>">
    	<img title="<%= list.getTitle() %>" src="Resource?url=<%=list.getMainImg()%>" /></a>
            <h2><a href="DuLichDaLat.jsp"><%= list.getTitle() %></a></h2>
           <div class="detail"><%= list.getShortContent() %></div>
=======
                   <li><a class="image" href="DuLichDaLat.jsp"><img src="../img/Camnangdulich/medium_ejz1446353394.jpg" /></a>
            <h2><a title="Đà Lạt tháng 7 - Ai đem mưa phùn qua phố?" href="DuLichDaLat.jsp">Đà Lạt tháng 7 - Ai đem mưa phùn qua phố?</a></h2>
           <div class="detail">Đà Lạt tháng 7 tựa những ngày mộng tưởng cho những ai lạc bước giữa chốn thanh sơ. 
           Tháng 7 của Đà Lạt là tháng của những ngày không nắng, của gót chân người lữ khách tìm về phố mơ. 
           Mytour muốn khẽ nâng đôi chân bạn trong một làn sương biếc, gởi bạn đến nơi của những thi ...</div>
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
               <p class="view_more"><a href="DuLichDaLat.jsp">Xem thêm</a></p>
               
         </li>
    	<% } %>
          
	</ul>
    </div>
    <div class="page_breakbar">
    <ul class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">&raquo;</a></li></ul>
  <p>&nbsp;</p>
  </div></div>
  
 <%@include file="footer.jsp" %>
  <!-- InstanceEndEditable --></div>

</body>
<!-- InstanceEnd --></html>
