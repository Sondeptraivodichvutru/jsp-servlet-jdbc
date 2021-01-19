<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<aside class="menu-sidebar d-none d-lg-block">
    <div class="logo">
        <a href="<c:url value="/admin-home"/>"> <img src="<c:url value='template/admin/images/icon/logo.png' />"
                                                     alt="Cool Admin" />
        </a>
    </div>
    <div class="menu-sidebar__content js-scrollbar1">
        <nav class="navbar-sidebar">
            <ul class="list-unstyled navbar__list">
                <li class="has-sub active"><a class="js-arrow" href="<c:url value='/admin-home'/>"> <i
                            class="fas fa-tachometer-alt"></i>Dashboard
                    </a>
                </li>
                <li><a href="<c:url value='/admin-crawler?type=list&page=1&maxPageItem=6&sortName=filename&sortBy=desc'/>"> <i class="fas fa-chart-bar"></i> 
                        Crawler Manage
                    </a></li>
                <li ><a href="<c:url value='/admin-category?type=list&page=1&maxPageItem=6&sortName=name&sortBy=desc'/>"> <i
                            class="fas fa-table"></i>Category Manage
                    </a></li>
                <li><a href="<c:url value='/admin-product?type=list&page=1&maxPageItem=6&status=1&sortName=name&sortBy=desc'/>"> <i
                            class="far fa-check-square"></i>Product Manage
                    </a></li>
                <li><a href="<c:url value='/admin-order?type=list&page=1&maxPageItem=6&status=1&sortName=createddate&sortBy=desc'/>"> <i
                            class="fas fa-calendar-alt"></i>Order Manage
                    </a></li>
                   
            </ul>
        </nav>
    </div>
</aside>