<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>

<c:url var="APIurl" value="/api-admin-product" />
<c:url var="NewURL" value="/admin-product" />

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
									<label for="nf-email" class=" form-control-label">Name</label>
									<input type="text" id="name" name="name" value="${model.name}"
										class="form-control"> <span class="help-block"></span>
								</div>
								<div class="form-group">
									<label
										class="rs-select2--dark rs-select2--sm rs-select2--dark2">Category</label>
									<div class="">
										<select class="form-control" id="categoryCode"
											name="categoryCode">
											<c:if test="${empty model.categoryCode}">
												<option value="">Select category</option>
												<c:forEach var="item" items="${categories}">
													<option value="${item.code}">${item.name}</option>
												</c:forEach>
											</c:if>
											<c:if test="${not empty model.categoryCode}">
												<option value="">Select category</option>
												<c:forEach var="item" items="${categories}">
													<option value="${item.code}"
														<c:if test="${item.code == model.categoryCode}">selected="selected"</c:if>>
														${item.name}</option>
												</c:forEach>
											</c:if>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Price</label>
									<input type="text" id="code" name="price"
										value="${model.price}" class="form-control"> <span
										class="help-block"></span>
								</div>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Description  (Video: w680-h300)__(Image: w750-h415)</label>
									<textarea rows="10" cols="60" name="description"id="description">${model.description}</textarea>
									<span class="help-block"></span>
								</div>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Sale</label>
									<input type="text" id="code" name="sale" value="${model.sale}"
										class="form-control"> <span class="help-block"></span>
								</div>
								<div class="form-group">
									<label for="nf-password" class=" form-control-label">Image</label>
									<input type="text" id="code" name="image"
										value="${model.image}" class="form-control"> <span
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
								<input type="hidden" value="${model.filename}" id="filename"
									name="filename" />
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
						window.location.href = "${NewURL}?type=list&page=1&maxPageItem=6&status=1&sortName=name&sortBy=desc&message=insert_success";
					},
					error : function(error) {
						window.location.href = "${NewURL}?type=list&status=1&maxPageItem=6&page=1&message=error_system";
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
						window.location.href = "${NewURL}?type=list&page=1&maxPageItem=6&status=1&sortName=name&sortBy=desc&message=update_success";
					},
					error : function(error) {
						window.location.href = "${NewURL}?type=list&maxPageItem=6&status=1&page=1&message=error_system";
					}
				});
	}
</script>
