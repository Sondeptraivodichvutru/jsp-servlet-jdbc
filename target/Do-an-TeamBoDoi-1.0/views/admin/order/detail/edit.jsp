<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>

<c:url var="APIurl" value="/api-admin-order-detail" />
<c:url var="NewURL" value="/admin-order-detail" />
<c:url var="CheckURL" value="/api-admin-check" />

<div class="main-content">
	<div class="section__content section__content--p30">
		<div class="container-fluid">
			<script type="text/javascript">
				try {
					ace.settings.check('breadcrumbs', 'fixed')
				} catch (e) {
				}
			</script>
			<div class="row">

				<div class="col-lg-6">
					<c:if test="${not empty messageResponse}">
						<div class="alert alert-${alert}">${messageResponse}</div>
					</c:if>
					<div class="card">
						<div class="card-header">
							<strong>Edit</strong> Form
						</div>

						<div class="card-body card-block">
							<form id="formSubmit">
								<c:if test="${not empty model.productId}">
									<input type="hidden" value="${model.price}" id="price"
										name="price" />
									<input type="hidden" value="${model.productId}" id="productId"
										name="productId" />
								</c:if>
								<c:if test="${empty model.productId}">
									<div class="form-group">
										<label for="nf-password" class=" form-control-label">Order
											Id</label> <input type="text" id="id" name="id" disabled="disabled"
											value="${model.id}" class="form-control"> <span
											class="help-block"></span>
									</div>
								</c:if>
								<c:if test="${empty model.productId}">
									<div class="form-group">
										<select class="form-control" id="productId btnClick"
											name="productId">
											<option>Select product</option>
											<c:forEach var="item" items="${product}">
												<option value="${item.id}">${item.name}</option>
											</c:forEach>
										</select>
										<button id="btnClick" type="button"
											class="au-btn--green au-btn--small ">Check</button>									
									</div>
								</c:if>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Quantity</label>
									<input type="text" id="quantity" name="quantity"
										value="${model.quantity}" class="form-control"> <span
										class="help-block"></span>
								</div>
								<c:if test="${empty model.productId}">
									<div class="form-group">
										<label for="nf-password" class=" form-control-label">Price</label>
										<a id="price" name="price" class="form-control"></a> <span
											class="help-block"></span>
									</div>

								</c:if>
								<div>
									<c:if test="${not empty model.productId}">
										<input id="btnUpdate" type="button"
											class="btn btn-primary btn-sm" value="Update" />
									</c:if>
									<c:if test="${empty model.productId}">
										<input id="btnAdd" type="button"
											class="btn btn-primary btn-sm" value="Add New" />
									</c:if>
									<button type="reset" class="btn btn-danger btn-sm">
										<i class="fa fa-ban"></i> Reset
									</button>
								</div>
								<input type="hidden" value="${model.id}" id="id" name="id" />
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script>
	var data = {};
	$('#btnClick').click(function() {
		var formData = $('#formSubmit').serializeArray();
		$.each(formData, function(i, v) {
			data["" + v.name + ""] = v.value;
		});
		checkProduct(data);
	})

	$('#btnUpdate').click(function(e) {
		e.preventDefault();
		var formData = $('#formSubmit').serializeArray();
		$.each(formData, function(i, v) {
			data["" + v.name + ""] = v.value;
		});
		updateNew(data);
	});

	$('#btnAdd').click(function(e) {
		e.preventDefault();
		var formData = $('#formSubmit').serializeArray();
		$.each(formData, function(i, v) {
			data["" + v.name + ""] = v.value;
		});
		addNew(data);
	});
	function checkProduct(data) {
		$.ajax({
			url : '${CheckURL}',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(data),
			dataType : 'json',
			success : function(result) {
				document.getElementById("price").innerHTML = result.price;
				data["price"] = result.price;
			},
			error : function(error) {
				alert('Pick other product!!!')
			}
		});
	}

	
	function addNew(data) {
		$.ajax({
			url : '${APIurl}',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(data),
			dataType : 'json',
			success : function(result) {
				window.location.href = "${NewURL}?type=list&id=" + data.id
						+ "&maxPageItem=6&page=1&message=insert_success";
			},
			error : function(error) {
				window.location.href = "${NewURL}?type=list&id=" + data.id
						+ "&maxPageItem=6&page=1&message=error_system";
			}
		});
	}
	function updateNew(data) {
		$.ajax({
			url : '${APIurl}',
			type : 'PUT',
			contentType : 'application/json',
			data : JSON.stringify(data),
			dataType : 'json',
			success : function(result) {
				window.location.href = "${NewURL}?type=list&id=" + data.id
						+ "&maxPageItem=6&page=1&message=update_success";
			},
			error : function(error) {
				window.location.href = "${NewURL}?type=list&id=" + data.id
						+ "&maxPageItem=6&page=1&message=error_system";
				;
			}
		});
	}
	
	
</script>
