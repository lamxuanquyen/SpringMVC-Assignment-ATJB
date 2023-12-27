<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- Sidebar-->
<div class="border-end bg-white" id="sidebar-wrapper">
    <div class="sidebar-heading border-bottom bg-light">Danh Muc</div>
    <div class="list-group list-group-flush">
        <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${contextPath}/may/list">MAY</a>
        <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${contextPath}/dichvu/list">DICH VU</a>
        <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${contextPath}/khachhang/list">KHACH HANG</a>
        <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${contextPath}/sudungdichvu/list">SU DUNG DICH VU</a>
        <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${contextPath}/sudungmay/list">SU DUNG MAY</a>
        <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${contextPath}/showallsort">Show all</a>
    </div>
</div>
