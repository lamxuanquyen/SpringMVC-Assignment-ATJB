<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home qyn2512</title>

<jsp:include page="/WEB-INF/view/layout/header.jsp" />

</head>
<body>
	<div class="d-flex" id="wrapper">
			<!-- Sidebar -->
			<jsp:include page="/WEB-INF/view/layout/sidebar.jsp" />

            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
            
                <jsp:include page="/WEB-INF/view/layout/navbar.jsp" />
                
                <!-- Page content-->
                <div class="container-fluid">
                    
                    <jsp:include page="/WEB-INF/view/sudungdichvu/form_create_sudungdichvu.jsp" />
                    
                </div>
            </div>
        </div>
               
<jsp:include page="/WEB-INF/view/layout/javascript.jsp" />
<script type="text/javascript"	src="<c:url value='/resources/js/validate/create_su_dung_dich_vu.js' />"></script>
</body>
<jsp:include page="/WEB-INF/view/layout/footer.jsp" />
</html>