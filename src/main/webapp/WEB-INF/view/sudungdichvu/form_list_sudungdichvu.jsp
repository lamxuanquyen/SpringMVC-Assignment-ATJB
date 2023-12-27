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
									<th>ma KH</th>
									<th>ngay su dung</th>
									<th>gio su dung</th>
									<th>so luong</th>
									<th>Action <a href="${contextPath}/sudungdichvu/create">[new]</a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty sudungdichvus}">
                                	<c:forEach items="${sudungdichvus}" var="sudungdichvu">
										<tr>
											<td>${sudungdichvu.compositeKeySuDungDichVu.maKH }</td>
											<td>${sudungdichvu.compositeKeySuDungDichVu.maDV}</td>
											<td>${sudungdichvu.compositeKeySuDungDichVu.ngaySuDung}</td>
											<td>${sudungdichvu.compositeKeySuDungDichVu.gioSuDung}</td>
											<td>${sudungdichvu.soLuong}</td>
											<td>
											
												<a href="${contextPath}/sudungdichvu/update?maKH=${sudungdichvu.compositeKeySuDungDichVu.maKH}&maDV=${sudungdichvu.compositeKeySuDungDichVu.maDV}&ngaySuDung=${sudungdichvu.compositeKeySuDungDichVu.ngaySuDung}&gioSuDung=${sudungdichvu.compositeKeySuDungDichVu.gioSuDung}">Update</a>
<%-- 												<a href="${contextPath}/sudungdichvu/delete?maKH=${sudungdichvu.compositeKeySuDungDichVu.maKH}&maDV=${sudungdichvu.compositeKeySuDungDichVu.maDV}&ngaySuDung=${sudungdichvu.compositeKeySuDungDichVu.ngaySuDung}&gioSuDung=${sudungdichvu.compositeKeySuDungDichVu.gioSuDung}">Delete</a> --%>

<a href="" type="button"  data-toggle="modal" data-target="#maKH_${sudungdichvu.compositeKeySuDungDichVu.maKH}&maDV_${sudungdichvu.compositeKeySuDungDichVu.maDV}&ngaySuDung_${sudungdichvu.compositeKeySuDungDichVu.ngaySuDung}&gioSuDung_${sudungdichvu.compositeKeySuDungDichVu.gioSuDung}">Delete</a>

<!-- Modal -->
<div class="modal fade" id="maKH_${sudungdichvu.compositeKeySuDungDichVu.maKH}&maDV_${sudungdichvu.compositeKeySuDungDichVu.maDV}&ngaySuDung_${sudungdichvu.compositeKeySuDungDichVu.ngaySuDung}&gioSuDung_${sudungdichvu.compositeKeySuDungDichVu.gioSuDung}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
        <a href="${contextPath}/sudungdichvu/delete?maKH=${sudungdichvu.compositeKeySuDungDichVu.maKH}&maDV=${sudungdichvu.compositeKeySuDungDichVu.maDV}&ngaySuDung=${sudungdichvu.compositeKeySuDungDichVu.ngaySuDung}&gioSuDung=${sudungdichvu.compositeKeySuDungDichVu.gioSuDung}" class="btn btn-primary">có</a>
     
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
