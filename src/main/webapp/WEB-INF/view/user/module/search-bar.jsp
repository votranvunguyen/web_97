<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section
	class='hero <c:if test="${!param.showBanner}">hero-normal</c:if>'>
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="hero__categories">
					<div class="hero__categories__all">
						<i class="fa fa-bars"></i> <span>Loại thiết bị</span>
					</div>
					<ul>
						<c:forEach var="loaiSp" items="${dsLoaiSanPham}">
							<li><a href="#">${loaiSp.tenLSP}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="col-lg-9">
				<div class="hero__search">
					<div class="hero__search__form">
						<form modelAttribute="sanPham" method="GET" action="shop/Search">
                            
							<c:url var="searchUrl" value="/home/Search?item=qqqq8">
							<c:param name="item" value="123" />
							
							</c:url>
							
							<input type="text" placeholder="Loại thiết bị bạn cần là gì?">
							<button type="submit" class="site-btn">TÌM</button>
						</form>
					</div>
					<div class="hero__search__phone">
						<div class="hero__search__phone__icon">
							<i class="fa fa-phone"></i>
						</div>
						<div class="hero__search__phone__text">
							<h5>+84 09.999.999</h5>
							<span>Hỗ trợ 24/7</span>
						</div>
					</div>
				</div>
				<!-- banner -->
				<c:if test="${param.showBanner}">
					<div class="hero__item set-bg"
						data-setbg="<c:url value ='https://bizweb.sapocdn.net/100/445/498/themes/848649/assets/slider_1.jpg?1651822707651'/>">

					</div>
				</c:if>
			</div>
		</div>
	</div>
</section>