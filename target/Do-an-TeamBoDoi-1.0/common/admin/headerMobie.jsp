<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<header class="header-mobile d-block d-lg-none">
    <div class="header-mobile__bar">
        <div class="container-fluid">
            <div class="header-mobile-inner">
                <a class="logo" href="<c:url value="/trang-chu"/>"> <img
                        src="<c:url value='/template/admin/images/icon/logo.png'/>" alt="CoolAdmin" />
                </a>
                <button class="hamburger hamburger--slider" type="button">
                    <span class="hamburger-box"> <span class="hamburger-inner"></span>
                    </span>
                </button>
            </div>
        </div>
    </div>
    <nav class="navbar-mobile">
        <div class="container-fluid">
            <ul class="navbar-mobile__list list-unstyled">
                <li class="has-sub"><a class="js-arrow" href="#"> <i
                            class="fas fa-tachometer-alt"></i>Dashboard
                    </a>
                    <ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
                        <li><a href="index.html">Dashboard 1</a></li>
                        <li><a href="index2.html">Dashboard 2</a></li>
                        <li><a href="index3.html">Dashboard 3</a></li>
                        <li><a href="index4.html">Dashboard 4</a></li>
                    </ul></li>
                <li><a href="AccountManage.html"> <i class="fas fa-chart-bar"></i>Account
                        Manage
                    </a></li>
                <li><a href="CategoryManage.html"> <i class="fas fa-table"></i>Category
                        Manage
                    </a></li>
                <li><a href="ProductManage.html"> <i
                            class="far fa-check-square"></i>Product Manage
                    </a></li>
                <li><a href="OrderManage.html"> <i
                            class="fas fa-calendar-alt"></i>Order Manage
                    </a></li>
            </ul>
        </div>
    </nav> </header>
