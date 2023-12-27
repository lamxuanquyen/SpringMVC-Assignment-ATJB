<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg-12 text-center">
            <h2 class="mt-3">CREATE NEW DICHVU</h2>
        </div>
        <div class="col-lg">
            <form:form method="post" action="${contextPath}/dichvu/create"  modelAttribute="dichvu" id="formDv">
			    
			    <div class="form-group">
			        <form:label path="maDV" for="maDV" style="font-weight: bold">Mã dich vu<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="maDV" path="maDV" cssClass="form-control" placeholder="Nhập mã dich vu ..."/>
			        <form:errors path="maDV" cssClass ="error"></form:errors>
			        <span id = "errorMaDv" class ="error"></span>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="tenDV" for="tenDV" style="font-weight: bold">ten dich vu<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="tenDV" path="tenDV" cssClass="form-control" placeholder="Nhập ten dich vu ..."/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="donViTinh" for="donViTinh" style="font-weight: bold">Don vi tinh<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="donViTinh" path="donViTinh" cssClass="form-control" placeholder="Nhập don vi tinh ..."/>
			    </div>
			    
			    <div class="form-group mt-3">
			        <form:label path="donGia" for="donGia" style="font-weight: bold">don gia<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="donGia" path="donGia" cssClass="form-control" placeholder="Nhập don gia ..."/>
			        <form:errors path="donGia" cssClass ="error"></form:errors>
			        <span id = "errorDonGia" class ="error"></span>
			    </div>
			
			    <div class="form-group mt-5">
			        <button class="btn btn-success" type="submit">Thêm mới</button>
			        <button class="btn btn-dark ml-3" type="reset" >Reset</button>
			        <a class="btn btn-danger ml-3" type="text" href="${contextPath}/dichvu/list" >Hủy bỏ</a>				 
			    </div>
			    			    		    
			</form:form>
	
        </div>
    </div>
</div>
