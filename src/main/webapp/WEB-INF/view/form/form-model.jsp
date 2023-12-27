<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home qyn2512</title>

<!-- import file to header-->
<jsp:include page="/WEB-INF/view/layout/header.jsp" />

</head>
<body>
	<div class="d-flex" id="wrapper">
		<!-- Sidebar -->
		<jsp:include page="/WEB-INF/view/layout/sidebar.jsp" />

        <!-- Page content wrapper-->
        <div id="page-content-wrapper">            
			<!-- Top navigation -->              
            <jsp:include page="/WEB-INF/view/layout/navbar.jsp" />
               
            <!-- Page content-->
            <div class="container-fluid">
            	<h1 class="mt-4">Wellcome to here</h1>
                   
                <jsp:include page="/WEB-INF/view/form/listForm.jsp" />

            </div>
        </div>
    </div>
        
	<!-- import file js-->
	<jsp:include page="/WEB-INF/view/layout/javascript.jsp" />
</body>

<!-- import footer-->
<jsp:include page="/WEB-INF/view/layout/footer.jsp" />
</html>