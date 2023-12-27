<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List May</h1>
	<table>
		<tr>
			<th>ma May</th>
			<th>vi tri</th>
			<th>trang thai</th>
		</tr>
		<c:forEach items="${mays}" var="may">
			<tr>
				<td>${may.maMay }</td>
				<td>${may.viTri }</td>
				<td>${may.trangThai}</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>