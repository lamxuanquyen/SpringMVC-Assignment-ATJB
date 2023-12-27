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
									<th>ten KH</th>
									<th>dia chi</th>
									<th>sdt</th>
									<th>email</th>
									<th>Action <a href="${contextPath}/khachhang/create">[new]</a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty khachhangs}">
                                	<c:forEach items="${khachhangs}" var="khachhang">
										<tr>
											<td>${khachhang.maKH }</td>
											<td>${khachhang.tenKH}</td>
											<td>${khachhang.diaChi}</td>
											<td>${khachhang.soDienThoai}</td>
											<td>${khachhang.diaChiEmail}</td>
											<td>
												<a href="${contextPath}/khachhang/update?id=${khachhang.maKH}">Update</a>
<%-- 												<a href="${contextPath}/khachhang/delete?id=${khachhang.maKH}">Delete</a> --%>
<%-- 												<a href="${contextPath}/dichvu/detail?id=${may.maMay}">Detail</a> --%>
											
											
<a href="" type="button"  data-toggle="modal" data-target="#exampleModal${khachhang.maKH }">Delete</a>

<!-- Modal -->
<div class="modal fade" id="exampleModal${khachhang.maKH }" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
        <a  href="${contextPath}/khachhang/delete?id=${khachhang.maKH}" class="btn btn-primary">có</a>
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
