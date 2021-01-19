<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<div class="page-wrapper">
    <div class="page-content--bge5">
        <div class="container">
            <div class="login-wrap">
                <div class="login-content">
                    <div class="login-logo">
                        <a href="#"> <img src="template/login/images/icon/logo.png"
                                          alt="CoolAdmin">
                        </a>
                    </div>

                    <div class="login-form">
                        <c:if test="${not empty message}">
                            <div class="alert alert-${alert}">${message}</div>
                        </c:if>
                        <form action="<c:url value='/dang-nhap'/>" id="formLogin"
                              method="post">
                            <div class="form-group">
                                <label>User Name</label> <input class="au-input au-input--full"
                                                                placeholder="name" type="text" id="userName" name="userName" value="sonpro">
                            </div>
                            <div class="form-group">
                                <label>Password</label> <input class="au-input au-input--full"
                                                               type="password" id="password" name="password" placeholder="Password"value="123456">
                            </div>
                            <div class="login-checkbox"></div>
                            <input type="hidden" value="login" name="action" />
                            <button class="au-btn au-btn--block au-btn--green m-b-20"
                                    type="submit">Login</button>

                        </form>
                        <div class="register-link">
                            <p>
                                Don't you have account? <a href="#">Sign Up Here</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>