<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%-- <jsp:include page="/WEB-INF/view/form/set_page.jsp" /> --%>

<%
    int[] array = {1, 2, 3, 4, 5,6 ,7 ,8 ,9 ,10};
    request.setAttribute("numberPageList", array);
%>

<form id="pageSizeForm" action="${contextPath}/dichvu/list" method="get">
	<!-- Your other form elements here -->
	<div class="form-group form-inline ml-2">
		<label for="pageSize">
			Rows: 
			
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
				href="${contextPath}/dichvu/list?pageSize=${pageSize}&pageNumber=${pageNumber-1}&search=${search}">Previous</a></li>
	
		</c:if>
		<c:forEach begin="1" end="${totalPages}" var="i">
			<c:choose>
				<c:when test="${pageNumber eq i}">
					<li class="page-item"><a
						class="page-link active text-dark"> ${i} </a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="${contextPath}/dichvu/list?pageSize=${pageSize}&pageNumber=${i}&search=${search}">${i}</a></li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	
		<c:if test="${pageNumber lt totalPages}">
			<li class="page-item"><a class="page-link"
				href="${contextPath}/dichvu/list?pageSize=${pageSize}&pageNumber=${pageNumber+1}&search=${search}">Next</a></li>
		</c:if>
	</ul>
	<input name="search" value="${search }" type="hidden"/>
</form>
