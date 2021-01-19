<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

    <head>
        <title><dec:title default="Trang chủ" /></title>
        <!-- Fontfaces CSS-->
        <link href="<c:url value='/template/admin/css/font-face.css '/>"
              rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/font-awesome-4.7/css/font-awesome.min.css'/>"
            rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/font-awesome-5/css/fontawesome-all.min.css'/>"
            rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/mdi-font/css/material-design-iconic-font.min.css'/>"
            rel="stylesheet" media="all">
        <!-- Bootstrap CSS-->
        <link
            href="<c:url value='/template/admin/vendor/bootstrap-4.1/bootstrap.min.css'/>"
            rel="stylesheet" media="all">
        <!-- Vendor CSS-->
        <link
            href="<c:url value='/template/admin/vendor/animsition/animsition.min.css'/>"
            rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css'/>"
            rel="stylesheet" media="all">
        <link href="<c:url value='/template/admin/vendor/wow/animate.css'/>"
              rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/css-hamburgers/hamburgers.min.css'/>"
            rel="stylesheet" media="all">
        <link href="<c:url value='/template/admin/vendor/slick/slick.css'/>"
              rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/select2/select2.min.css'/>"
            rel="stylesheet" media="all">
        <link
            href="<c:url value='/template/admin/vendor/perfect-scrollbar/perfect-scrollbar.css'/>"
            rel="stylesheet" media="all">
        <!-- Main CSS-->
        <link href="<c:url value='/template/admin/css/theme.css'/>"
              rel="stylesheet" media="all">


        <link rel="stylesheet"
              href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">

        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script type='text/javascript' src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>


        <script src="<c:url value='/template/admin/js/js/jquery.2.1.1.min.js' />"></script>


        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">


        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>



        <script
        src="<c:url value='/template/paging/jquery.twbsPagination.js' />"></script>

        <script src="<c:url value='/ckeditor/ckeditor.js' />"></script>
    <body class="animsition">
        <div class="page-wrapper">
            <!-- header -->
            <%@ include file="/common/admin/headerMobie.jsp"%>
            <!-- header -->
            <!-- menu -->
            <%@ include file="/common/admin/menu.jsp"%>
            <!-- menu -->
            <div class="page-container">
                <script type="text/javascript">
                    try {
                        ace.settings.check('main-container', 'fixed')
                    } catch (e) {
                    }
                </script>

                <!-- header -->
                <%@ include file="/common/admin/headerDesktop.jsp"%>
                <!-- header -->

                <dec:body />
            </div>
        </div>

        <!-- Jquery JS-->

        <script
        src="<c:url value='/template/admin/vendor/jquery-3.2.1.min.js'/>"></script>
        <!-- Bootstrap JS-->
        <script
        src="<c:url value='/template/admin/vendor/bootstrap-4.1/popper.min.js'/>"></script>
        <script
        src="<c:url value='/template/admin/vendor/bootstrap-4.1/bootstrap.min.js'/>"></script>
        <!-- Vendor JS       -->
        <script
            src="<c:url value='/template/admin/vendor/slick/slick.min.js'/>">

        </script>
        <script src="<c:url value='/template/admin/vendor/wow/wow.min.js'/>"></script>
        <script
        src="<c:url value='/template/admin/vendor/animsition/animsition.min.js'/>"></script>
        <script
            src="<c:url value='/template/admin/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js'/>">

        </script>
        <script
        src="<c:url value='/template/admin/vendor/counter-up/jquery.waypoints.min.js'/>"></script>
        <script
            src="<c:url value='/template/admin/vendor/counter-up/jquery.counterup.min.js'/>">

        </script>
        <script
        src="<c:url value='/template/admin/vendor/circle-progress/circle-progress.min.js'/>"></script>
        <script
        src="<c:url value='/template/admin/vendor/perfect-scrollbar/perfect-scrollbar.js'/>"></script>
        <script
        src="<c:url value='/template/admin/vendor/chartjs/Chart.bundle.min.js'/>"></script>
        <script
            src="<c:url value='/template/admin/vendor/select2/select2.min.js'/>">

        </script>

        <!-- Main JS-->
        <script src="<c:url value='/template/login/js/main.js' />"></script>
    </body>

</html>