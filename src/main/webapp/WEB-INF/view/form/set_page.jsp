<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
//     List<Integer> numberPageList = new ArrayList<>();
//     for (int i = 1; i <= 10; i++) {
//         numberPageList.add(i);
//     }
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    request.setAttribute("numberPageList", array);
%>
