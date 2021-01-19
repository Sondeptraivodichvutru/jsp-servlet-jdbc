<%@include file="/common/taglib.jsp"%>
<c:url var="crawlerURL" value="/admin-crawlerData-file" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<div class="main-content">
	<div class="section__content section__content--p30">
		<div class="container-fluid">
			<div class="row">

				<div class="row m-t-20">
					<div class="col-md-11">
						<!-- DATA TABLE -->
						<form action="<c:url value='crawlerURL'/>" id="formSubmit"
							method="get">
							<h3 class="title-5 m-b-35">Data</h3>
							<div class="alert alert-${alert}">${messageResponse}</div>
							<div class="table-data__tool">
								<div class="table-data__tool-left">

								</div>
								<div class="table-data__tool-right">
									<div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
										<select class="js-select2" name="type">
											<option selected="selected">Export</option>
											<option value="">png</option>
											<option value="">pdf</option>
										</select>
										<div class="dropDownSelect2"></div>
									</div>
								</div>
							</div>
							<div class="table-responsive m-b-40">
								<table class="table table-borderless table-data3">
									<thead>
										<tr>
											<th>status</th>
											<th>name</th>
											<th>price</th>
											<th>image</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="item" items="${model.listResult}">
											<tr>

												<td><c:if test="${ empty model.message}">
														<a
															class="hassubs au-btn au-btn-icon au-btn--green au-btn--small">
															<i class="zmdi zmdi-check-circle-u"></i>
														</a>
													</c:if> <c:if test="${not empty model.message}">
														<a class="hassubs au-btn btn-danger au-btn-small"> <i
															class="zmdi zmdi-thumb-down"></i>
														</a>
													</c:if></td>
												<td>${item.name}</td>
												<td>${item.price}</td>
												<td><img src="${item.image}"></td>
												<td>
													<div class="table-data-feature">
														<c:url var="editURL" value="/admin-product">
															<c:param name="type" value="edit" />
															<c:param name="name" value="${item.name}" />
															<c:param name="filename" value="${item.filename}" />
														</c:url>
														<a class="item" data-toggle="tooltip" title="Edit"
															href='${editURL}'> <i class="zmdi zmdi-edit"
															aria-hidden="true"></i>
														</a>
													</div>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</form>
					</div>

				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="copyright">
						<p>
							License © 2020 Teampro.<a href="">Teampro</a>.
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>

</html>