<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="humberger__menu__overlay"></div>
<div class="humberger__menu__wrapper">
	<div class="humberger__menu__logo">
		<a href="#"> <img src="<c:url value = '/resources/user/img/logo.png'/>"
			alt="">
		</a>
	</div>
	<div class="humberger__menu__cart">
		<ul>
			<li>
                <a href="#"> 
                    <i class="fa fa-heart"></i> 
                    <span>1</span>
                </a>
            </li>
			<li>
                <a href="#"> 
                    <i class="fa fa-shopping-bag"></i> 
                    <span>3</span>
                </a>
            </li>
		</ul>
		<div class="header__cart__price">
			Tổng tiền: <span>150.000đ</span>
		</div>
	</div>
	<div class="humberger__menu__widget">
		<div class="header__top__right__auth">
			<a href="#"><i class="fa fa-user"></i> Đăng nhập</a>
		</div>
	</div>
	<nav class="humberger__menu__nav mobile-menu">
		<ul>
			<li <% 
            	String tag = request.getParameter("activePage");
            	if(tag.equals("home")) {
            		out.print("class='active'");
            	}
            	%>
            >
                <a href='<c:url value = "/trang-chu" />'>Trang chủ</a>
            </li>
            
            <li <% 
            	if(tag.equals("shop-grid")) {
            		out.print("class='active'");
            	}
            	%>
            >
                <a href='<c:url value = "/shop/shop-grid" />'>Cửa Hàng</a>
            </li >
            
            <li <% 
            	if(tag.equals("shopping-cart")) {
            		out.print("class='active'");
            	}
            	%>
            >
                <a href='<c:url value = "/shop/shopping-cart" />'>Giỏ Hàng</a>
            </li>
            
            <li <% 
            	if(tag.equals("contact")) {
            		out.print("class='active'");
            	}
            	%>
            >
                <a href='<c:url value = "/contact" />'>Liên Hệ</a>
            </li>
			<!-- <li><a href="#">Pages</a>
                <ul class="header__menu__dropdown">
                    <li><a href="/shop/shop-details">Shop Details</a></li>
                    <li><a href="/shop/checkout">Thanh Toán</a></li>
                </ul>
            </li> -->
		</ul>
	</nav>
	<div id="mobile-menu-wrap"></div>
	<div class="header__top__right__social">
		<a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
		<a href="https://twitter.com/"><i class="fa fa-twitter"></i></a>
	</div>
	<div class="humberger__menu__contact">
		<ul>
			<li><i class="fa fa-envelope"></i> phukienamthanh999@gmail.com</li>
			<li>Miễn phí ship cho tất cả đơn hàng từ 99.000đ</li>
		</ul>
	</div>
</div>
