<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg-12 text-center">
            <h2 class="mt-3">UPDATE MAY</h2>
        </div>
        <div class="col-lg">
            <form:form method="post" action="${pageContext.request.contextPath}/may/update"  modelAttribute="may">
			    
			    <div class="form-group">
			        <form:label path="maMay" for="maMay" style="font-weight: bold">Mã máy<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="maMay" path="maMay" cssClass="form-control" placeholder="Nhập mã máy ..."/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="viTri" for="viTri" style="font-weight: bold">Vị trí<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="viTri" path="viTri" cssClass="form-control" placeholder="Nhập vị trí ..."/>
			    </div>
			
			    <div class="form-group mt-3">
			        <form:label path="trangThai" for="trangThai" style="font-weight: bold">Trạng thái<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="trangThai" path="trangThai" cssClass="form-control" placeholder="Nhập trạng thái ..."/>
			    </div>
			
			    <div class="form-group mt-5">
			        <button class="btn btn-success" type="submit">Update</button>
			    </div>
			    			    		    
			</form:form>
	
        </div>
    </div>
</div>
