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
						<i class="fa fa-bars"></i> <span>Danh mục sản phẩm</span>
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

							<input type="text" placeholder="Nhập từ khóa ...">
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
						data-setbg="<c:url value ='https://nhathuoclongchau.com.vn/frontend_v3/images/chuyen-trang-du-an/banner-home-v2.png'/>">

					</div>
				</c:if>
				<!-- banner - item -->
				<div>
					<h2
						style="text-align: center; padding: 16px; font-family: roboto, Arial, Helvetica, sans-serif; font-weight: 400;">Mua
						Thuốc Dễ Dàng Tại Nhà Thuốc 97</h2>
					<div
						style="display: flex; flex-direction: row; justify-content: space-around; margin-top: 16px;">
						<div class="hero__item_banner">
							<img alt=""
								src="https://nhathuoclongchau.com.vn/frontend_v3/images/banner-html/home/chuptoathuoc.png">
								<h5>CHỤP TOA THUỐC</h5>
								<p>đơn giản & nhanh chóng</p>
						</div>
						<div class="hero__item_banner">
							<img alt=""
								src="https://nhathuoclongchau.com.vn/frontend_v3/images/banner-html/home/info-ct.png">
							<h5>NHẬP THÔNG TIN LIÊN LẠC</h5>
								<p>để được tư vấn đặt hàng</p>
						</div>
						<div class="hero__item_banner">
							<img alt=""
								src="https://nhathuoclongchau.com.vn/frontend_v3/images/banner-html/home/duoc-sy.png">
							<h5>NHẬN BÁO GIÁ TỪ DƯỢC SỸ</h5>
								<p>đơn giản & nhanh chóng</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>