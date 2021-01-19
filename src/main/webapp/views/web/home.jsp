<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>


<!-- ##### Welcome Area Start ##### -->
<section class="welcome_area bg-img background-overlay"
	style="background-image: url(template/web/img/home_slider_1.jpg);">
	<div class="container h-100">
		<div class="row h-100 align-items-center">
			<div class="col-12">
				<div class="hero-content">
					<font color="lightblue" style="font-size: 40px"> New
						Collection</font> </br> </br> </br> <a href="#" class="btn essence-btn">view
						collection</a>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- ##### Welcome Area End ##### -->

<!-- ##### Top Catagory Area Start ##### -->
<div class="top_catagory_area section-padding-80 clearfix">
	<div class="container">
		<div class="row justify-content-center">
			<!-- Single Catagory -->
			<div class="col-12 col-sm-6 col-md-4">
				<div
					class="single_catagory_area d-flex align-items-center justify-content-center bg-img"
					style="background-image: url(template/web/img/avds_large.jpg);">
					<div class="catagory-content">
						<a href="#">Camera</a>
					</div>
				</div>
			</div>
			<!-- Single Catagory -->
			<div class="col-12 col-sm-6 col-md-4">
				<div
					class="single_catagory_area d-flex align-items-center justify-content-center bg-img"
					style="background-image: url(template/web/img/avds2.jpg);">
					<div class="catagory-content">
						<a href="#">Smartphone</a>
					</div>
				</div>
			</div>
			<!-- Single Catagory -->
			<div class="col-12 col-sm-6 col-md-4">
				<div
					class="single_catagory_area d-flex align-items-center justify-content-center bg-img"
					style="background-image: url(template/web/img/avds3.jpg);">
					<div class="catagory-content">
						<a href="#">Laptop</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- ##### Top Catagory Area End ##### -->

<!-- ##### CTA Area Start ##### -->
<div class="cta-area">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="cta-content bg-img background-overlay"
					style="background-image: url(template/web/img/avds4.jpg);">
					<div class="h-100 d-flex align-items-center justify-content-end">
						<div class="cta--text">
							<h6>-60%</h6>
							<h2>Global Sale</h2>
							<a href="#" class="btn essence-btn">Buy Now</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- ##### CTA Area End ##### -->

<!-- ##### New Arrivals Area Start ##### -->
<section class="new_arrivals_area section-padding-80 clearfix">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="section-heading text-center">
					<h2>Popular Products</h2>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="popular-products-slides owl-carousel">
					<!-- Single Product -->
					<c:forEach var="item" items="${model.listResult}">
						<div class="single-product-wrapper">
							<!-- Product Image -->
							<div class="product-img">
								<img src="${item.image}" alt="">
								<!-- Product Badge -->
								<div class="product-badge new-badge">
									<span>New</span>
								</div>

								<!-- Favourite -->
								<div class="product-favourite">
									<a href="#" class="favme fa fa-heart"></a>
								</div>
							</div>
							<!-- Product Description -->
							<div class="product-description">
								<span>Dưa chuột cắn dở</span> <a
									href="<c:url value='/single-product?id=${item.id}'/>">
									<h6>${item.name}</h6>
								</a>
								<p class="product-price">${item.price}VNĐ</p>

								<!-- Hover Content -->
								<div class="hover-content">
									<!-- Add to Cart -->
									<div class="add-to-cart-btn">
										<a href="<c:url value='/cart?id=${item.id}'/>" class="btn essence-btn">Add to Cart</a>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>

				</div>
			</div>
		</div>
	</div>
</section>
<!-- ##### New Arrivals Area End ##### -->
<!-- ##### Brands Area Start ##### -->
<div
	class="brands-area d-flex align-items-center justify-content-between">
	<!-- Brand Logo -->
	<div class="single-brands-logo">
		<img src="<c:url value='/template/web/img/core-img/brand1.png'/>"
			alt="">
	</div>
	<!-- Brand Logo -->
	<div class="single-brands-logo">
		<img src="<c:url value='/template/web/img/core-img/brand2.png'/>"
			alt="">
	</div>
	<!-- Brand Logo -->
	<div class="single-brands-logo">
		<img src="<c:url value='/template/web/img/core-img/brand3.png'/>"
			alt="">
	</div>
	<!-- Brand Logo -->
	<div class="single-brands-logo">
		<img src="<c:url value='/template/web/img/core-img/brand4.png'/>"
			alt="">
	</div>
	<!-- Brand Logo -->
	<div class="single-brands-logo">
		<img src="<c:url value='/template/web/img/core-img/brand5.png'/>"
			alt="">
	</div>
	<!-- Brand Logo -->
	<div class="single-brands-logo">
		<img src="<c:url value='/template/web/img/core-img/brand6.png'/>"
			alt="">
	</div>
</div>
<!-- ##### Brands Area End ##### -->