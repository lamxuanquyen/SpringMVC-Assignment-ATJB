<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg-12 text-center">
            <h2 class="mt-3">UPDATE SUDUNGMAY</h2>
        </div>
        <div class="col-lg">
            <form:form method="post" action="${contextPath}/sudungmay/update"  modelAttribute="sudungmay">
			    
			    <div class="form-group">
			        <form:label path="compositeKeySuDungMay.maKH" for="compositeKeySuDungMay.maKH" style="font-weight: bold">Mã KH<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
<%-- 			        <form:select path="compositeKeySuDungMay.maKH" items="${khachhanglist}" itemValue="maKH" itemLabel="tenKH" cssClass="form-control"/> --%>
			        <form:input id="compositeKeySuDungMay.maKH" path="compositeKeySuDungMay.maKH" cssClass="form-control" readonly="true"/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="compositeKeySuDungMay.maMay" for="compositeKeySuDungMay.maMay" style="font-weight: bold">Mã May<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
<%-- 			        <form:select path="compositeKeySuDungMay.maMay" items="${maylist}" itemValue="maMay" itemLabel="maMay" cssClass="form-control"/> --%>
			        <form:input id="compositeKeySuDungMay.maMay" path="compositeKeySuDungMay.maMay" cssClass="form-control" readonly="true"/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="compositeKeySuDungMay.ngayBatDauSuDung" for="compositeKeySuDungMay.ngayBatDauSuDung" style="font-weight: bold">ngay bat dau Su Dung<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="compositeKeySuDungMay.ngayBatDauSuDung" path="compositeKeySuDungMay.ngayBatDauSuDung" cssClass="form-control" type ="date" readonly="true"/>
			    </div>
			    
			    <div class="form-group mt-3">
			        <form:label path="compositeKeySuDungMay.gioBatDauSuDung" for="compositeKeySuDungMay.gioBatDauSuDung" style="font-weight: bold">gio bat dau Su Dung<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="compositeKeySuDungMay.gioBatDauSuDung" path="compositeKeySuDungMay.gioBatDauSuDung" cssClass="form-control" type ="time" readonly="true"/>
			    </div>
			    
			    <div class="form-group mt-3">
			        <form:label path="thoiGianSuDung" for="thoiGianSuDung" style="font-weight: bold">thoiGianSuDung<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="thoiGianSuDung" path="thoiGianSuDung" cssClass="form-control" placeholder="Nhập so phut ..."/>
			    </div>
			
			    <div class="form-group mt-5">
			        <button class="btn btn-success" type="submit">update</button>
			        			 
			    </div>
			    			    		    
			</form:form>
	
        </div>
    </div>
</div>
