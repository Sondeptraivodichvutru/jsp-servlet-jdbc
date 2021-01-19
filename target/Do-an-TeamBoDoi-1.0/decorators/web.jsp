<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><dec:title default="Trang chủ" /></title>

<meta name="description" content="Sublime project">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Favicon  -->
<link rel="icon" href="<c:url value='/template/web/img/core-img/favicon.ico'/>">

<!-- Core Style CSS -->
<link rel="stylesheet" href="<c:url value='/template/web/css/core-style.css'/>">
<link rel="stylesheet" href="<c:url value='/template/web/style.css'/>">
</head>
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- header -->
	
	<!-- cart -->
	<%@ include file="/common/web/cart.jsp"%>
	<!-- cart -->
	
	<dec:body />
	
	<!-- footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- footer -->


	<!-- jQuery (Necessary for All JavaScript Plugins) -->
	<script src="<c:url value='/template/web/js/jquery/jquery-2.2.4.min.js'/>"></script>
	<!-- Popper js -->
	<script src="<c:url value='/template/web/js/popper.min.js'/>"></script>
	<!-- Bootstrap js -->
	<script src="<c:url value='/template/web/js/bootstrap.min.js'/>"></script>
	<!-- Plugins js -->
	<script src="<c:url value='/template/web/js/plugins.js'/>"></script>
	<!-- Classy Nav js -->
	<script src="<c:url value='/template/web/js/classy-nav.min.js'/>"></script>
	<!-- Active js -->
	<script src="<c:url value='/template/web/js/active.js'/>"></script>
</body>
</html>