<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg-12 text-center">
            <h2 class="mt-3">UPDATE SUDUNGDICHVU</h2>
        </div>
        <div class="col-lg">
            <form:form method="post" action="${contextPath}/sudungdichvu/update"  modelAttribute="sudungdichvu">
			    
			    <div class="form-group">
			        <form:label path="compositeKeySuDungDichVu.maKH" for="compositeKeySuDungDichVu.maKH" style="font-weight: bold">Mã KH<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
<%-- 			        <form:select path="compositeKeySuDungDichVu.maKH" items="${khachhanglist}" itemValue="maKH" itemLabel="tenKH" cssClass="form-control"/> --%>
<%-- 			        <form:select id="compositeKeySuDungDichVu.maKH" path="compositeKeySuDungDichVu.maKH" cssClass="form-control" placeholder="chon mã KH ..."/> --%>
			        <form:input id="compositeKeySuDungDichVu.maKH" path="compositeKeySuDungDichVu.maKH" cssClass="form-control" readonly="true"/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="compositeKeySuDungDichVu.maDV" for="compositeKeySuDungDichVu.maDV" style="font-weight: bold">Mã DV<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="compositeKeySuDungDichVu.maKH" path="compositeKeySuDungDichVu.maKH" cssClass="form-control" readonly="true"/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="compositeKeySuDungDichVu.ngaySuDung" for="compositeKeySuDungDichVu.ngaySuDung" style="font-weight: bold">ngay Su Dung<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="compositeKeySuDungDichVu.ngaySuDung" path="compositeKeySuDungDichVu.ngaySuDung" cssClass="form-control" readonly="true"/>
			    </div>
			    
			    <div class="form-group mt-3">
			        <form:label path="compositeKeySuDungDichVu.gioSuDung" for="compositeKeySuDungDichVu.gioSuDung" style="font-weight: bold">gio Su Dung<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="compositeKeySuDungDichVu.gioSuDung" path="compositeKeySuDungDichVu.gioSuDung" cssClass="form-control" readonly="true"/>
			    </div>
			    
			    <div class="form-group mt-3">
			        <form:label path="soLuong" for="soLuong" style="font-weight: bold">so Luong<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="soLuong" path="soLuong" cssClass="form-control" placeholder="Nhập so Luong ..."/>
			    </div>
			
			    <div class="form-group mt-5">
			        <button class="btn btn-success" type="submit">update</button>
			 
			    </div>
			    			    		    
			</form:form>
	
        </div>
    </div>
</div>
