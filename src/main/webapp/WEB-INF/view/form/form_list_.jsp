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
                                    <th>ma May</th>
									<th>vi tri</th>
									<th>trang thai</th>
									<th>Action <a href="${contextPath}/may/create">[new]</a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty mays}">
                                	<c:forEach items="${mays}" var="may">
										<tr>
											<td>${may.maMay }</td>
											<td>${may.viTri}</td>
											<td>${may.trangThai}</td>
											<td>
												<a href="${contextPath}/may/update?id=${may.maMay}">Update</a>
												<a href="${contextPath}/may/delete?id=${may.maMay}">Delete</a>
			<%-- 									<a href="${contextPath}/may/detail?id=${may.maMay}">Detail</a> --%>
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
