<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>

<c:url var="APIurl" value="/api-admin-crawler"/>
<c:url var ="NewURL" value="/admin-crawler"/>
<c:url var ="crawl" value="/admin-crawlerData"/>

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
                                    <label for="nf-email" class=" form-control-label">filename</label>
                                    <input type="text" id="filename" name="filename"
                                           value="${model.filename}"class="form-control">
                                           <span  class="help-block"></span>
                                </div>
                                <c:if test="${empty model.id}">
                                <div class="form-group">
                                    <label for="nf-password" class=" form-control-label">Link</label>
                                    <input type="text" id="link" name="link"
                                           value="${model.link}" class="form-control"> <span
                                           class="help-block"></span>
                                </div>
                                </c:if>
                                
                                <div>
                                    <c:if test="${not empty model.id}">
                                        <input  id="btnAddOrUpdateNew"  type="button" class="btn btn-primary btn-sm"
                                                value="Update"/>
                                    </c:if>
                                    <c:if test="${empty model.id}">
                                        <input id="btnAddOrUpdateNew" type="button" class="btn btn-primary btn-sm"
                                               value="Start"  />
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

    $('#btnAddOrUpdateNew').click(function (e) {
        e.preventDefault();
        var data = {};
        var formData = $('#formSubmit').serializeArray();
        $.each(formData, function (i, v) {
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
                    url: '${APIurl}',
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    dataType: 'json',
                    success: function (result) {
                        window.location.href = "${crawl}?type=list&link="
                                + result.link + "&filename="+result.filename+"&message=insert_success";
                    },
                    error: function (error) {
                        window.location.href = "${NewURL}?type=list&maxPageItem=6&page=1&message=error_system";
                    }
                });
    }
    function updateNew(data) {
        $
                .ajax({
                    url: '${APIurl}',
                    type: 'PUT',
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    dataType: 'json',
                    success: function (result) {
                        window.location.href = "${NewURL}?type=edit&id="
                                + result.id + "&message=update_success";
                    },
                    error: function (error) {
                        window.location.href = "${NewURL}?type=list&maxPageItem=6&page=1&message=error_system";
                    }
                });
    }
</script>
