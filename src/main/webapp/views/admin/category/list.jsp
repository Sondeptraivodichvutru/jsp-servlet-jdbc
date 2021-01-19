<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-category" />
<c:url var="CategoryURL" value="/admin-category" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <div class="main-content">
        <div class="section__content section__content--p30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <!-- DATA TABLE -->
                        <form action="<c:url value='/admin-category'/>" id="formSubmit"
                              method="get">
                            <h3 class="title-5 m-b-35">Category Manage</h3>
                            <div class="alert alert-${alert}">${messageResponse}</div>
                            <div class="table-data__tool">
                                <div class="table-data__tool-left">

                                </div>
                                <div class="table-data__tool-right">
                                    <a flag="info"
                                       class="au-btn au-btn-icon au-btn--green au-btn--small"
                                       data-toggle="tooltip" title='Thêm bài viết'
                                       href='<c:url value="/admin-category?type=edit"/>'> <span>
                                            <i class="zmdi zmdi-plus"></i>add item
                                        </span>
                                    </a>

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
                            <div class="table-responsive table-responsive-data2">
                                <table class="table table-data2">
                                    <thead>
                                        <tr>
                                            <th><input type="checkbox" id="checkAll"></th>
                                            <th>Name</th>
                                            <th>Code</th>
                                        </tr>
                                    </thead>
                                    <tbody id="myUL">
                                        <c:forEach var="item" items="${model.listResult}">
                                            <tr class="tr-shadow">
                                                <td><input type="checkbox" id="checkbox_${item.id}"
                                                           value="${item.id}"></td>
                                                <td>${item.name}</td>
                                                <td>${item.code}</td>
                                                <td>
                                                    <div class="table-data-feature">

                                                        <c:url var="editURL" value="/admin-category">
                                                            <c:param name="type" value="edit" />
                                                            <c:param name="id" value="${item.id}" />
                                                        </c:url>
                                                        <a class="item" data-toggle="tooltip" title="Edit"
                                                           href='${editURL}'> <i class="zmdi zmdi-edit"
                                                                              aria-hidden="true"></i>
                                                        </a>
                                                        <button id="btnDelete" class="item" type="button"
                                                                data-toggle="tooltip" title='Delete'>
                                                            <span> <i class="zmdi zmdi-delete"></i>
                                                            </span>
                                                        </button>

                                                        <!-- 			<a class="item" id="btnDelete" data-toggle="tooltip" title="Delete"> 
                                                                <i class="zmdi zmdi-more" aria-hidden="true"></i>
                                                                </a>
                                                        -->
                                                    </div>
                                                </td>

                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>

                                <ul class="pagination" id="pagination"></ul>
                                <input type="hidden" value="" id="page" name="page" /> <input
                                    type="hidden" value="" id="maxPageItem" name="maxPageItem" /> <input
                                    type="hidden" value="" id="sortName" name="sortName" /> <input
                                    type="hidden" value="" id="sortBy" name="sortBy" /> <input
                                    type="hidden" value="" id="type" name="type" />

                            </div>
                        </form>
                        <!-- END DATA TABLE -->
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
    <!-- /.main-content
            var $j=jQuery.noConflict(); -->
    <script>
        var $j = jQuery.noConflict();
        var totalPages = ${model.totalPage};
        var currentPage = ${model.page};


        var limit = 6;
        $j(function () {
            window.pagObj = $j('#pagination').twbsPagination({
                totalPages: totalPages,
                visiblePages: 10,
                startPage: currentPage,
                onPageClick: function (event, page) {
                    if (currentPage != page) {
                        $j('#maxPageItem').val(limit);
                        $j('#page').val(page);
                        $j('#sortName').val('title');
                        $j('#sortBy').val('desc');
                        $j('#type').val('list');
                        $j('#formSubmit').submit();
                    }
                }
            });
        });

        $j("#btnDelete").click(function () {
            var data = {};
            var ids = $j('tbody input[type=checkbox]:checked').map(function () {
                return $j(this).val();
            }).get();
            data['ids'] = ids;
            deleteNew(data);
        });

        function deleteNew(data) {
            $j
                    .ajax({
                        url: '${APIurl}',
                        type: 'DELETE',
                        contentType: 'application/json',
                        data: JSON.stringify(data),
                        success: function (result) {
                            window.location.href = "${CategoryURL}?type=list&maxPageItem=6&page=1&message=delete_success";
                        },
                        error: function (error) {
                            window.location.href = "${CategoryURL}?type=list&maxPageItem=6&page=1&message=error_system";
                        }
                    });
        }
    </script>
</body>

</html>