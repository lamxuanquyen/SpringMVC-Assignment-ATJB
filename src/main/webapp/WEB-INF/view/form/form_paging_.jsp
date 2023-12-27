<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<jsp:include page="/WEB-INF/view/form/set_page.jsp" />

<%
//     int[] array = {1, 2, 3, 4, 5,6 ,7 ,8 ,9 ,10};
//     request.setAttribute("numberPageList", array);
%>

<form id="pageSizeForm" action="${contextPath}/may/list"	method="get">
	<!-- Your other form elements here -->
	<div class="form-group form-inline ml-2">
		<label for="pageSize">
			Rows: 
						
<!-- 			<select -->
<!-- 				class="form-control ml-2" id="pageSize" name="pageSize" -->
<!-- 				onchange="this.form.submit()"> -->
<%-- 				<option value="1" ${pageSize eq 1 ? "selected": ""}>1</option> --%>
<%-- 				<option value="2" ${pageSize eq 2 ? "selected": ""}>2</option> --%>
<%-- 				<option value="3" ${pageSize eq 3 ? "selected": ""}>3</option> --%>
<%-- 				<option value="4" ${pageSize eq 4 ? "selected": ""}>4</option> --%>
<%-- 				<option value="5" ${pageSize eq 5 ? "selected": ""}>5</option> --%>
<%-- 				<option value="6" ${pageSize eq 6 ? "selected": ""}>6</option> --%>
<%-- 				<option value="7" ${pageSize eq 7 ? "selected": ""}>7</option> --%>
<%-- 				<option value="8" ${pageSize eq 8 ? "selected": ""}>8</option> --%>
<%-- 				<option value="9" ${pageSize eq 9 ? "selected": ""}>9</option> --%>
<%-- 				<option value="10" ${pageSize eq 10 ? "selected": ""}>10</option> --%>
<!-- 			</select> -->
			
<!-- 			<select class="select mx-2 rounded px-1" id="pageSize" name="pageSize"> -->
<%--                  <c:forEach var="number" begin="1" end="10" step="2" > --%>
<%--             		<option value="${number}" ${pageSize eq number ? "selected": ""}>${number}</option> --%>
<%--                  </c:forEach> --%>
<!--             </select> -->

			<select class="select mx-2 rounded px-1" id="pageSize" name="pageSize" onchange="this.form.submit()">
                 <c:forEach var="number" items="${numberPageList}" >
            		<option value="${number}" ${pageSize eq number ? "selected": ""}>${number}</option>
                 </c:forEach>
            </select>
			
			per page
		</label>
		
	</div>
	<div>Total record: ${totalElement }</div>
	
	<ul class="pagination d-flex justify-content-end mr-4">
		<c:if test="${pageNumber > 1}">
			<li class="page-item"><a class="page-link"
				href="${contextPath}/may/list?pageSize=${pageSize}&pageNumber=${pageNumber-1}&search=${search}">Previous</a></li>
	
		</c:if>
		<c:forEach begin="1" end="${totalPages}" var="i">
			<c:choose>
				<c:when test="${pageNumber eq i}">
					<li class="page-item"><a
						class="page-link active text-dark"> ${i} </a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="${contextPath}/may/list?pageSize=${pageSize}&pageNumber=${i}&search=${search}">${i}</a></li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	
		<c:if test="${pageNumber lt totalPages}">
			<li class="page-item"><a class="page-link"
				href="${contextPath}/may/list?pageSize=${pageSize}&pageNumber=${pageNumber+1}&search=${search}">Next</a></li>
		</c:if>
	</ul>
	<input name="search" value="${search }" type="hidden"/>
</form>
