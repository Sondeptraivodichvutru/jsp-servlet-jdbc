<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<header class="header-desktop">
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="header-wrap">
                <form class="form-header" action="" method="POST">
                    <input class="au-input au-input--xl" type="text" name="search"
                           placeholder="Search for datas &amp; reports..." />
                    <button class="au-btn--submit" type="submit">
                        <i class="zmdi zmdi-search"></i>
                    </button>
                </form>
                <div class="header-button">
                    <div class="noti-wrap">
                        <div class="noti__item js-item-menu">
                            <i class="zmdi zmdi-comment-more"></i> <span class="quantity">1</span>
                            <div class="mess-dropdown js-dropdown">
                                <div class="mess__title">
                                    <p>Ế mà đòi có người nhắn tin :|</p>
                                </div>

                                <div class="mess__footer">
                                    <a href="#">View all messages</a>
                                </div>
                            </div>
                        </div>
                        <div class="noti__item js-item-menu">
                            <i class="zmdi zmdi-email"></i> <span class="quantity">1</span>
                            <div class="email-dropdown js-dropdown">
                                <div class="email__title">
                                    <p>Yo</p>
                                </div>
                                <div class="email__item">
                                    <div class="image img-cir img-40">
                                        <img src="<c:url value='template/admin/images/fpt.png '/>"
                                             alt="Cynthia Harvey" />
                                    </div>
                                    <div class="content">
                                        <p>Meeting about job  .  .  .   </p>
                                        <span>FPT Software, 1 hour ago</span>
                                    </div>
                                </div>															
                                <div class="email__footer">
                                    <a href="#">See all emails</a>
                                </div>
                            </div>
                        </div>
                        <div class="noti__item js-item-menu">
                            <i class="zmdi zmdi-notifications"></i> <span class="quantity">3</span>
                            <div class="notifi-dropdown js-dropdown">
                                <div class="notifi__title">
                                    <p>Sắp có lương rồi <3</p>
                                </div>												
                                <div class="notifi__footer">
                                    <a href="#">All notifications</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="account-wrap">
                        <div class="account-item clearfix js-item-menu">
                            <div class="image">
                                <img src="<c:url value='template/admin/images/icon/avatar-01.jpg'/>" alt="John Doe" />
                            </div>
                            <div class="content">
                                <a class="js-acc-btn" href="#">${USERMODEL.fullName}</a>
                            </div>
                            <div class="account-dropdown js-dropdown">
                                <div class="info clearfix">
                                    <div class="image">
                                        <a href="#"> <img src="<c:url value='/template/admin/images/icon/avatar-01.jpg'/>"
                                                          alt="${USERMODEL.fullName}" />
                                        </a>
                                    </div>
                                    <div class="content">
                                        <h5 class="name">
                                            <a href="#">${USERMODEL.fullName}</a>
                                        </h5>
                                        <span class="email">early access</span>
                                    </div>
                                </div>
                                <div class="account-dropdown__body">
                                    <div class="account-dropdown__item">
                                        <a href="#"> <i class="zmdi zmdi-account"></i>Account
                                        </a>
                                    </div>

                                    <div class="account-dropdown__item">
                                        <a href="#"> <i class="zmdi zmdi-settings"></i>Setting
                                        </a>
                                    </div>

                                </div>
                                <c:if test="${not empty USERMODEL}">
                                <div class="account-dropdown__footer">
                                    <a href="<c:url value="/thoat?action=logout"/>"> <i class="zmdi zmdi-power"></i>Logout
                                    </a>
                                </div>
                                </c:if>
                                <c:if test="${empty USERMODEL}">
                                <div class="account-dropdown__footer">
                                    <a href="<c:url value="/dang-nhap?action=login"/>"> <i class="zmdi zmdi-power"></i>Login
                                    </a>
                                </div>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>