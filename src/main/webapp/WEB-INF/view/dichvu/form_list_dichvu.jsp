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
                                    <th>ma dich vu</th>
									<th>ten dich vu</th>
									<th>don vi tinh</th>
									<th>don gia</th>
									<th>Action <a href="${contextPath}/dichvu/create">[new]</a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty dichvus}">
                                	<c:forEach items="${dichvus}" var="dichvu">
										<tr>
											<td>${dichvu.maDV }</td>
											<td>${dichvu.tenDV}</td>
											<td>${dichvu.donViTinh}</td>
											<td>${dichvu.donGia}</td>
											<td>
												<a href="${contextPath}/dichvu/update?id=${dichvu.maDV}">Update</a>
<%-- 												<a href="${contextPath}/dichvu/delete?id=${dichvu.maDV}">Delete</a> --%>
											
<a href="" type="button"  data-toggle="modal" data-target="#exampleModal${dichvu.maDV }">Delete</a>

<!-- Modal -->
<div class="modal fade" id="exampleModal${dichvu.maDV }" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
        <a  href="${contextPath}/dichvu/delete?id=${dichvu.maDV}" class="btn btn-primary">có</a>
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
