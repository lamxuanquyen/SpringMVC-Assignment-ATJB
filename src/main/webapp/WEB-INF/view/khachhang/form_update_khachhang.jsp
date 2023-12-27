<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg-12 text-center">
            <h2 class="mt-3">UPDATE KHACHHANG</h2>
        </div>
        <div class="col-lg">
            <form:form method="post" action="${contextPath}/khachhang/update"  modelAttribute="khachhang">
			    
			    <div class="form-group">
			        <form:label path="maKH" for="maKH" style="font-weight: bold">Mã KH<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="maKH" path="maKH" cssClass="form-control" readonly="true"/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="tenKH" for="tenKH" style="font-weight: bold">ten KH<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="tenKH" path="tenKH" cssClass="form-control" placeholder="Nhập ten KH ..."/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="diaChi" for="diaChi" style="font-weight: bold">dia chi<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="diaChi" path="diaChi" cssClass="form-control" placeholder="Nhập dia chi ..."/>
			    </div>
			    <div class="form-group mt-3">
			        <form:label path="soDienThoai" for="soDienThoai" style="font-weight: bold">so dien thoai<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="soDienThoai" path="soDienThoai" cssClass="form-control" placeholder="Nhập so dien thoai ..."/>
			    </div>
			    <div class="form-group mt-3">
			        <form:label path="diaChiEmail" for="diaChiEmail" style="font-weight: bold">email<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="diaChiEmail" path="diaChiEmail" cssClass="form-control" placeholder="Nhập email ..."/>
			    </div>
			
			    <div class="form-group mt-5">
			        <button class="btn btn-success" type="submit">update</button>
			        		 
			    </div>
			    			    		    
			</form:form>
	
        </div>
    </div>
</div>
