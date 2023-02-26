<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Shop Details</title>

    <jsp:include page="./module/link-css.jsp"/>
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Humberger Begin -->
    <jsp:include page="./module/header-mobile.jsp" >
    	<jsp:param name="activePage" value="shopGrid" />
    </jsp:include>
    <!-- Humberger End -->

    <!-- Header Section Begin -->
    <jsp:include page="./module/header.jsp" >
    	<jsp:param name="activePage" value="shopGrid" />
    </jsp:include>
    <!-- Header Section End -->

    <!-- Search bar Begin -->
    <jsp:include page="./module/search-bar.jsp" >
        <jsp:param name="showBanner" value="false" />
    </jsp:include>

    <!-- Breadcrumb Section Begin -->
    <section class="breadcrumb-section set-bg" data-setbg="<c:url value = '/resources/user/img/breadcrumb.jpg' />">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="breadcrumb__text">
                        <h2>Product name</h2>
                        <div class="breadcrumb__option">
                            <a href='<c:url value = "/trang-chu" />'>Trang chủ</a>
                            <!-- thay chữ vegetables bằng tên category -->
                            <!-- dùng jsp để thay -->
                            <a href='<c:url value = "/category/id" />'>Category</a>
                            <span>Product name</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Product Details Section Begin -->
    <section class="product-details spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="product__details__pic">
                        <div class="product__details__pic__item">
                            <img class="product__details__pic__item--large"
                                src="<c:url value = '/resources/user/img/product/details/product-details-1.jpg' />" alt="" />
                        </div>
                        <div class="product__details__pic__slider owl-carousel">
                            <img data-imgbigurl="img/product/details/product-details-2.jpg"
                                src="<c:url value = '/resources/user/img/product/details/thumb-1.jpg' />" alt="" />
                            <img data-imgbigurl="img/product/details/product-details-3.jpg"
                                src="<c:url value = '/resources/user/img/product/details/thumb-2.jpg' />" alt="" />
                            <img data-imgbigurl="img/product/details/product-details-5.jpg"
                                src="<c:url value = '/resources/user/img/product/details/thumb-3.jpg' />" alt="" />
                            <img data-imgbigurl="img/product/details/product-details-4.jpg"
                                src="<c:url value = '/resources/user/img/product/details/thumb-4.jpg' />" alt="" />
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="product__details__text">
                        <h3>Product name</h3>
                        <div class="product__details__rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star-half-o"></i>
                            <span>(18 đánh giá)</span>
                        </div>
                        <div class="product__details__price">$50.00</div>
                        <p>
                            Mô tả cơ bản các thông tin về sản phẩm.
                            Mô tả cơ bản các thông tin về sản phẩm.
                            Mô tả cơ bản các thông tin về sản phẩm.
                            Mô tả cơ bản các thông tin về sản phẩm.
                        </p>
                        <div class="product__details__quantity">
                            <div class="quantity">
                                <div class="pro-qty">
                                    <input type="text" value="1" />
                                </div>
                            </div>
                        </div>
                        <a href="#" class="primary-btn">THÊM VÀO GIỎ HÀNG</a>
                        <a href="#" class="heart-icon"><span class="icon_heart_alt"></span></a>
                        <ul>
                            <li><b>Availability</b> <span>In Stock</span></li>
                            <li>
                                <b>Shipping</b>
                                <span>01 day shipping. <samp>Free pickup today</samp></span>
                            </li>
                            <li><b>Weight</b> <span>0.5 kg</span></li>
                            <li>
                                <b>Share on</b>
                                <div class="share">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                    <a href="#"><i class="fa fa-pinterest"></i></a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="product__details__tab">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#tabs-1" role="tab"
                                    aria-selected="true">Mô tả</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#tabs-2" role="tab"
                                    aria-selected="false">Information</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#tabs-3" role="tab"
                                    aria-selected="false">Reviews <span>(1)</span></a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tabs-1" role="tabpanel">
                                <div class="product__details__tab__desc">
                                    <h6>Thông tin sản phẩm</h6>
                                    <p>
                                        Vestibulum ac diam sit amet quam vehicula elementum sed
                                        sit amet dui. Pellentesque in ipsum id orci porta dapibus.
                                        Proin eget tortor risus. Vivamus suscipit tortor eget
                                        felis porttitor volutpat. Vestibulum ac diam sit amet quam
                                        vehicula elementum sed sit amet dui. Donec rutrum congue
                                        leo eget malesuada. Vivamus suscipit tortor eget felis
                                        porttitor volutpat. Curabitur arcu erat, accumsan id
                                        imperdiet et, porttitor at sem. Praesent sapien massa,
                                        convallis a pellentesque nec, egestas non nisi. Vestibulum
                                        ac diam sit amet quam vehicula elementum sed sit amet dui.
                                        Vestibulum ante ipsum primis in faucibus orci luctus et
                                        ultrices posuere cubilia Curae; Donec velit neque, auctor
                                        sit amet aliquam vel, ullamcorper sit amet ligula. Proin
                                        eget tortor risus.
                                    </p>
                                    <p>
                                        Praesent sapien massa, convallis a pellentesque nec,
                                        egestas non nisi. Lorem ipsum dolor sit amet, consectetur
                                        adipiscing elit. Mauris blandit aliquet elit, eget
                                        tincidunt nibh pulvinar a. Cras ultricies ligula sed magna
                                        dictum porta. Cras ultricies ligula sed magna dictum
                                        porta. Sed porttitor lectus nibh. Mauris blandit aliquet
                                        elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam
                                        sit amet quam vehicula elementum sed sit amet dui. Sed
                                        porttitor lectus nibh. Vestibulum ac diam sit amet quam
                                        vehicula elementum sed sit amet dui. Proin eget tortor
                                        risus.
                                    </p>
                                </div>
                            </div>
                            <div class="tab-pane" id="tabs-2" role="tabpanel">
                                <div class="product__details__tab__desc">
                                    <h6>Thông tin sản phẩm</h6>
                                    <p>
                                        Vestibulum ac diam sit amet quam vehicula elementum sed
                                        sit amet dui. Pellentesque in ipsum id orci porta dapibus.
                                        Proin eget tortor risus. Vivamus suscipit tortor eget
                                        felis porttitor volutpat. Vestibulum ac diam sit amet quam
                                        vehicula elementum sed sit amet dui. Donec rutrum congue
                                        leo eget malesuada. Vivamus suscipit tortor eget felis
                                        porttitor volutpat. Curabitur arcu erat, accumsan id
                                        imperdiet et, porttitor at sem. Praesent sapien massa,
                                        convallis a pellentesque nec, egestas non nisi. Vestibulum
                                        ac diam sit amet quam vehicula elementum sed sit amet dui.
                                        Vestibulum ante ipsum primis in faucibus orci luctus et
                                        ultrices posuere cubilia Curae; Donec velit neque, auctor
                                        sit amet aliquam vel, ullamcorper sit amet ligula. Proin
                                        eget tortor risus.
                                    </p>
                                    <p>
                                        Praesent sapien massa, convallis a pellentesque nec,
                                        egestas non nisi. Lorem ipsum dolor sit amet, consectetur
                                        adipiscing elit. Mauris blandit aliquet elit, eget
                                        tincidunt nibh pulvinar a. Cras ultricies ligula sed magna
                                        dictum porta. Cras ultricies ligula sed magna dictum
                                        porta. Sed porttitor lectus nibh. Mauris blandit aliquet
                                        elit, eget tincidunt nibh pulvinar a.
                                    </p>
                                </div>
                            </div>
                            <div class="tab-pane" id="tabs-3" role="tabpanel">
                                <div class="product__details__tab__desc">
                                    <h6>Thông tin sản phẩm</h6>
                                    <p>
                                        Vestibulum ac diam sit amet quam vehicula elementum sed
                                        sit amet dui. Pellentesque in ipsum id orci porta dapibus.
                                        Proin eget tortor risus. Vivamus suscipit tortor eget
                                        felis porttitor volutpat. Vestibulum ac diam sit amet quam
                                        vehicula elementum sed sit amet dui. Donec rutrum congue
                                        leo eget malesuada. Vivamus suscipit tortor eget felis
                                        porttitor volutpat. Curabitur arcu erat, accumsan id
                                        imperdiet et, porttitor at sem. Praesent sapien massa,
                                        convallis a pellentesque nec, egestas non nisi. Vestibulum
                                        ac diam sit amet quam vehicula elementum sed sit amet dui.
                                        Vestibulum ante ipsum primis in faucibus orci luctus et
                                        ultrices posuere cubilia Curae; Donec velit neque, auctor
                                        sit amet aliquam vel, ullamcorper sit amet ligula. Proin
                                        eget tortor risus.
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Product Details Section End -->

    <!-- Related Product Section Begin -->
    <section class="related-product">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title related__product__title">
                        <h2>Sản phẩm liên quan</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="product__item">
                        <div class="product__item__pic set-bg"
                            data-setbg="<c:url value = '/resources/user/img/product/product-1.jpg' />">
                            <ul class="product__item__pic__hover">
                                <li>
                                    <a href="#"><i class="fa fa-heart"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-retweet"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-shopping-cart"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="product__item__text">
                            <h6><a href="#">Crab Pool Security</a></h6>
                            <h5>$30.00</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="product__item">
                        <div class="product__item__pic set-bg"
                            data-setbg="<c:url value = '/resources/user/img/product/product-2.jpg' />">
                            <ul class="product__item__pic__hover">
                                <li>
                                    <a href="#"><i class="fa fa-heart"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-retweet"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-shopping-cart"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="product__item__text">
                            <h6><a href="#">Crab Pool Security</a></h6>
                            <h5>$30.00</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="product__item">
                        <div class="product__item__pic set-bg"
                            data-setbg="<c:url value = '/resources/user/img/product/product-3.jpg' />">
                            <ul class="product__item__pic__hover">
                                <li>
                                    <a href="#"><i class="fa fa-heart"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-retweet"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-shopping-cart"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="product__item__text">
                            <h6><a href="#">Crab Pool Security</a></h6>
                            <h5>$30.00</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="product__item">
                        <div class="product__item__pic set-bg"
                            data-setbg="<c:url value = '/resources/user/img/product/product-7.jpg' />">
                            <ul class="product__item__pic__hover">
                                <li>
                                    <a href="#"><i class="fa fa-heart"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-retweet"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-shopping-cart"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="product__item__text">
                            <h6><a href="#">Crab Pool Security</a></h6>
                            <h5>$30.00</h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Related Product Section End -->

    <!-- Footer Section Begin -->
    <jsp:include page="./module/footer.jsp" />
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <jsp:include page="./module/link-js.jsp"/>
</body>

</html>