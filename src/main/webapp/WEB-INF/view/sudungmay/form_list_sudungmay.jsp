<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<section class="content">
       <div class="container-fluid">
           <!-- Striped Rows -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="card">
                    <div class="header">
                        <h2>
                            Danh sach
                        </h2>
                    </div>
                    <div class="body table-responsive">
                        <table class="table table-striped" id="dataTable-listMember">
                            <thead>
                                <tr>
                                    <th>ma KH</th>
									<th>ma MAY</th>
									<th>ngay bat dau su dung</th>
									<th>gio bat dau su dung</th>
									<th>thoi gian su dung</th>
									<th>Action <a href="${contextPath}/sudungmay/create">[new]</a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty sudungmays}">
                                	<c:forEach items="${sudungmays}" var="sudungmay">
										<tr>
											<td>${sudungmay.compositeKeySuDungMay.maKH }</td>
											<td>${sudungmay.compositeKeySuDungMay.maMay}</td>
											<td>${sudungmay.compositeKeySuDungMay.ngayBatDauSuDung}</td>
											<td>${sudungmay.compositeKeySuDungMay.gioBatDauSuDung}</td>
											<td>${sudungmay.thoiGianSuDung}</td>
											<td>
											
												<a href="${contextPath}/sudungmay/update?maKH=${sudungmay.compositeKeySuDungMay.maKH}&maMay=${sudungmay.compositeKeySuDungMay.maMay}&ngayBatDauSuDung=${sudungmay.compositeKeySuDungMay.ngayBatDauSuDung}&gioBatDauSuDung=${sudungmay.compositeKeySuDungMay.gioBatDauSuDung}">Update</a>
<%-- 												<a href="${contextPath}/sudungmay/delete?maKH=${sudungmay.compositeKeySuDungMay.maKH}&maMay=${sudungmay.compositeKeySuDungMay.maMay}&ngayBatDauSuDung=${sudungmay.compositeKeySuDungMay.ngayBatDauSuDung}&gioBatDauSuDung=${sudungmay.compositeKeySuDungMay.gioBatDauSuDung}">Delete</a> --%>

<a href="" type="button"  data-toggle="modal" data-target="#maKH_${sudungmay.compositeKeySuDungMay.maKH}&maMay_${sudungmay.compositeKeySuDungMay.maMay}&ngayBatDauSuDung_${sudungmay.compositeKeySuDungMay.ngayBatDauSuDung}&gioBatDauSuDung_${sudungmay.compositeKeySuDungMay.gioBatDauSuDung}">Delete</a>

<!-- Modal -->
<div class="modal fade" id="maKH_${sudungmay.compositeKeySuDungMay.maKH}&maMay_${sudungmay.compositeKeySuDungMay.maMay}&ngayBatDauSuDung_${sudungmay.compositeKeySuDungMay.ngayBatDauSuDung}&gioBatDauSuDung_${sudungmay.compositeKeySuDungMay.gioBatDauSuDung}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Xóa KH</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        Bạn có muốn xóa không ?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">hủy</button>
        <a href="${contextPath}/sudungmay/delete?maKH=${sudungmay.compositeKeySuDungMay.maKH}&maMay=${sudungmay.compositeKeySuDungMay.maMay}&ngayBatDauSuDung=${sudungmay.compositeKeySuDungMay.ngayBatDauSuDung}&gioBatDauSuDung=${sudungmay.compositeKeySuDungMay.gioBatDauSuDung}" class="btn btn-primary">có</a>
      </div>
    </div>
  </div>
</div>
											</td>
										</tr>
									</c:forEach>
                                </c:if>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!-- #END# Striped Rows -->
    </div>
</section>
