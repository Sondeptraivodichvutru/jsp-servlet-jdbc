
<!-- ##### Right Side Cart Area ##### -->
<div class="cart-bg-overlay"></div>

<div class="right-side-cart-area">

	<!-- Cart Button -->
	<div class="cart-button">
		<a href="#" id="rightSideCart"><img
			src="<c:url value='/template/web/img/core-img/bag.svg' />" alt="">
			<span>3</span></a>
	</div>

	<div class="cart-content d-flex">

		<!-- Cart List Area -->
		<div class="cart-list">
			<!-- Single Cart Item -->
			<!-- Cart List Area -->
			<div class="cart-list">
				<!-- Single Cart Item -->
				<c:forEach var="ytem" items="${cart.items}">
					<div class="single-cart-item">
						<a href="#" class="product-image"> <img
							src="${ytem.image}"
							class="cart-thumb" alt=""> <!-- Cart Item Desc -->
							<div class="cart-item-desc">
								<span class="product-remove"><i class="fa fa-close"
									aria-hidden="true"></i></span>
								<h6>${ytem.name}</h6>
								<p class="quantity">Quantity: ${ytem.totalItem}</p>
								<p class="price">Price: ${ytem.price}VND</p>
							</div>
						</a>
					</div>
				</c:forEach>
			</div>
		</div>
		<!-- Cart Summary -->
		<div class="cart-amount-summary">

			<h2>Summary</h2>
			<ul class="summary-table">
				<li><span>subtotal:</span> <span>Free</span></li>
				<li><span>delivery:</span> <span>Free</span></li>
				<li><span>discount:</span> <span>Free</span></li>
				<c:if test="${not empty total}">
				<li><span>total:</span> <span>${total}</span></li>
				</c:if>
				<c:if test="${empty total}">
				<li><span>total:</span> <span>0</span></li>
				</c:if>
			
			</ul>
			<div class="checkout-btn mt-100">
				<input type="hidden" value="${cart.items}" id="items" name="items" />
				<a href="<c:url value='/checkout'/>" class="btn essence-btn">check out</a>
			</div>
		</div>
		
	</div>
</div>

<!-- ##### Right Side Cart End ##### -->