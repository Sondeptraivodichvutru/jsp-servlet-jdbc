<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!-- ##### Checkout Area Start ##### -->
<div class="checkout_area section-padding-80">
	<div class="container">
		<div class="row">

			<div class="col-12 col-md-6">
				<div class="checkout_details_area mt-50 clearfix">

					<div class="cart-page-heading mb-30">
						<h5>Billing Information</h5>
					</div>

					<form action="#" method="post">
						<div class="row">
							<div class="col-md-12 mb-3">
								<label for="first_name">Full Name <span>*</span></label> <input
									type="text" class="form-control" id="fullname" value="${user.fullName}"
									required>
							</div>
							<div class="col-12 mb-3">
								<label for="phone_number">Phone<span>*</span></label> <input
									type="number" class="form-control" id="phone" value="${user.phone}">
							</div>
							<div class="col-12 mb-4">
								<label for="email_address">Email Address <span>*</span></label>
								<input type="email" class="form-control" id="email" value="${user.email}">
							</div>
							<div class="col-12 mb-3">
								<label for="country">Country <span>*</span></label> <select
									class="w-100" id="country">
									<option value="usa">United States</option>
									<option value="uk">United Kingdom</option>
									<option value="ger">Germany</option>
									<option value="fra">France</option>
									<option value="ind">India</option>
									<option value="aus">Australia</option>
									<option value="bra">Brazil</option>
									<option value="cana">Canada</option>
								</select>
							</div>
							<div class="col-12 mb-3">
								<label for="street_address">Address <span>*</span></label> <input
									type="text" class="form-control mb-3" id="ddress" value="${user.address}">
							</div>
							<div class="col-12 mb-3">
								<label for="postcode">Post code <span>*</span></label> <input
									type="text" class="form-control" id="postcode" value="${user.postcode}">
							</div>
							<div class="col-12 mb-3">
								<label for="city">Town/City <span>*</span></label> <input
									type="text" class="form-control" id="city" value="${user.city}">
							</div>
							<div class="col-12 mb-3">
								<label for="state">Province <span>*</span></label> <input
									type="text" class="form-control" id="province" value="${user.province}">
							</div>
							<div class="col-12">
								<div class="custom-control custom-checkbox d-block mb-2">
									<input type="checkbox" class="custom-control-input"
										id="customCheck1"> <label class="custom-control-label"
										for="customCheck1">Terms and conitions</label>
								</div>
								<div class="custom-control custom-checkbox d-block">
									<input type="checkbox" class="custom-control-input"
										id="customCheck3"> <label class="custom-control-label"
										for="customCheck3">Subscribe to our newsletter</label>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>

			<div class="col-12 col-md-6 col-lg-5 ml-lg-auto">
				<div class="order-details-confirmation">

					<div class="cart-page-heading">
						<h5>Your Order</h5>
						<p>The Details</p>
					</div>

					<c:if test="${not empty items}">
						<ul class="order-details-form mb-4">
							<li><span>Product</span> <span>Total</span></li>
							<c:forEach var="item" items="${items}">
								<li><h5>${item.totalItem}</h5> <span>${item.name}</span> <span>${item.price}VND</span></li>
							</c:forEach>
							<li><span>Shipping</span> <span>Free</span></li>
							<li><span>Total</span> <span>${total}</span></li>
						</ul>
						<div id="accordion" role="tablist" class="mb-4">
						<div class="card">
							<div class="card-header" role="tab" id="headingOne">
								<h6 class="mb-0">
									<a data-toggle="collapse" href="#collapseOne"
										aria-expanded="false" aria-controls="collapseOne"><i
										class="fa fa-circle-o mr-3"></i>Paypal</a>
								</h6>
							</div>

							<div id="collapseOne" class="collapse" role="tabpanel"
								aria-labelledby="headingOne" data-parent="#accordion">
								<div class="card-body">
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Proin pharetra tempor so dales. Phasellus sagittis auctor
										gravida. Integ er bibendum sodales arcu id te mpus. Ut
										consectetur lacus.</p>
								</div>
							</div>
						</div>
						<div class="card">
							<div class="card-header" role="tab" id="headingTwo">
								<h6 class="mb-0">
									<a class="collapsed" data-toggle="collapse" href="#collapseTwo"
										aria-expanded="false" aria-controls="collapseTwo"><i
										class="fa fa-circle-o mr-3"></i>cash on delievery</a>
								</h6>
							</div>
							<div id="collapseTwo" class="collapse" role="tabpanel"
								aria-labelledby="headingTwo" data-parent="#accordion">
								<div class="card-body">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit. Explicabo quis in veritatis officia inventore, tempore
										provident dignissimos.</p>
								</div>
							</div>
						</div>
						<div class="card">
							<div class="card-header" role="tab" id="headingThree">
								<h6 class="mb-0">
									<a class="collapsed" data-toggle="collapse"
										href="#collapseThree" aria-expanded="false"
										aria-controls="collapseThree"><i
										class="fa fa-circle-o mr-3"></i>credit card</a>
								</h6>
							</div>
							<div id="collapseThree" class="collapse" role="tabpanel"
								aria-labelledby="headingThree" data-parent="#accordion">
								<div class="card-body">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit. Esse quo sint repudiandae suscipit ab soluta delectus
										voluptate, vero vitae</p>
								</div>
							</div>
						</div>
						<div class="card">
							<div class="card-header" role="tab" id="headingFour">
								<h6 class="mb-0">
									<a class="collapsed" data-toggle="collapse"
										href="#collapseFour" aria-expanded="true"
										aria-controls="collapseFour"><i
										class="fa fa-circle-o mr-3"></i>direct bank transfer</a>
								</h6>
							</div>
							<div id="collapseFour" class="collapse show" role="tabpanel"
								aria-labelledby="headingThree" data-parent="#accordion">
								<div class="card-body">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit. Est cum autem eveniet saepe fugit, impedit magni.</p>
								</div>
							</div>
						</div>
					</div>

					<a href="<c:url value=''/>" class="btn essence-btn">Place Order</a>
					</c:if>
					
					<c:if test="${ empty items}">
						<span>empty</span>
						<br>
						<a href="<c:url value='/trang-chu'/>" class="btn essence-btn">Back to shop</a>
					</c:if>
					
				</div>
			</div>
		</div>
	</div>
</div>
<!-- ##### Checkout Area End ##### -->
