<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>

<c:url var="APIurl" value="/api-admin-order" />
<c:url var="NewURL" value="/admin-order" />

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
							
							<div class="form-group">
									<label
										class="rs-select2--dark rs-select2--sm rs-select2--dark2">Customer</label>
									<div class="">
										<select class="form-control" id="userId" name="userId">
											<c:if test="${empty model.userId}">
												<option value="">User</option>
												<c:forEach var="item" items="${user}">
													<option value="${item.id}">${item.fullName}</option>
												</c:forEach>
											</c:if>
											<c:if test="${not empty model.userId}">
												<option value="">Payment type</option>
												<c:forEach var="item" items="${user}">
													<option value="${item.id}"
														<c:if test="${item.id == model.userId}">selected="selected"</c:if>>
														${item.fullName}</option>
												</c:forEach>
											</c:if>
										</select>
									</div>
								</div>
							
								<div class="form-group">
									<label
										class="rs-select2--dark rs-select2--sm rs-select2--dark2">Payment</label>
									<div class="">
										<select class="form-control" id="paymentId" name="paymentId">
											<c:if test="${empty model.paymentId}">
												<option value="">Payment type</option>
												<c:forEach var="item" items="${payment}">
													<option value="${item.id}">${item.name}</option>
												</c:forEach>
											</c:if>
											<c:if test="${not empty model.paymentId}">
												<option value="">Payment type</option>
												<c:forEach var="item" items="${payment}">
													<option value="${item.id}"
														<c:if test="${item.id == model.paymentId}">selected="selected"</c:if>>
														${item.name}</option>
												</c:forEach>
											</c:if>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Status</label>
									<input type="text" id="status" name="status"
										value="${model.status}" class="form-control"> <span
										class="help-block"></span>
								</div>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Address</label>
									<input type="text" id="address" name="address"
										value="${model.address}" class="form-control"> <span
										class="help-block"></span>
								</div>
								<div>
									<c:if test="${not empty model.id}">
										<input id="btnAddOrUpdateNew" type="button"
											class="btn btn-primary btn-sm" value="Update" />
									</c:if>
									<c:if test="${empty model.id}">
										<input id="btnAddOrUpdateNew" type="button"
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
	$('#btnAddOrUpdateNew').click(function(e) {
		e.preventDefault();
		var data = {};
		var formData = $('#formSubmit').serializeArray();
		$.each(formData, function(i, v) {
			data["" + v.name + ""] = v.value;
		});
		var id = $('#id').val();
		if (id == "") {
			addNew(data);
		} else {
			updateNew(data);
		}
	});
	function addNew(data) {
		$
				.ajax({
					url : '${APIurl}',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(data),
					dataType : 'json',
					success : function(result) {
						window.location.href = "${NewURL}?type=edit&id="
								+ result.id + "&message=insert_success";
					},
					error : function(error) {
						window.location.href = "${NewURL}?type=list&page=1&maxPageItem=6&status=1&message=error_system";
					}
				});
	}
	function updateNew(data) {
		$
				.ajax({
					url : '${APIurl}',
					type : 'PUT',
					contentType : 'application/json',
					data : JSON.stringify(data),
					dataType : 'json',
					success : function(result) {
						window.location.href = "${NewURL}?type=edit&id="
								+ result.id + "&message=update_success";
					},
					error : function(error) {
						window.location.href = "${NewURL}?type=list&maxPageItem=6&status=1&page=1&message=error_system";
					}
				});
	}
</script>
