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

<%-- <link rel="stylesheet"	href="<c:url value='/resources/css/bootstrap.min.css' />"> --%>
<%-- <script type="text/javascript"	src="<c:url value='/resources/js/jquery.js' />"></script> --%>
<%-- <script type="text/javascript"	src="<c:url value='/resources/js/bootstrap.min.js' />"></script> --%>
<%-- <link rel="stylesheet"	href="<c:url value='/resources/css/styles.css' />"> --%>


</head>
<body>
	<div class="d-flex" id="wrapper">
<!--             Sidebar -->
<!--             <div class="border-end bg-white" id="sidebar-wrapper"> -->
<!--                 <div class="sidebar-heading border-bottom bg-light">Start Bootstrap</div> -->
<!--                 <div class="list-group list-group-flush"> -->
<!--                     <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Dashboard</a> -->
<!--                     <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Shortcuts</a> -->
<!--                     <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Overview</a> -->
<!--                     <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Events</a> -->
<!--                     <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Profile</a> -->
<!--                     <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Status</a> -->
<!--                 </div> -->
<!--             </div> -->

			<jsp:include page="/WEB-INF/view/layout/sidebar.jsp" />

            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
            
<!--                 Top navigation -->
<!--                 <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom"> -->
<!--                     <div class="container-fluid"> -->
<!--                         <button class="btn btn-primary" id="sidebarToggle">Toggle Menu</button> -->
<!--                         <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button> -->
<!--                         <div class="collapse navbar-collapse" id="navbarSupportedContent"> -->
<!--                             <ul class="navbar-nav ms-auto mt-2 mt-lg-0"> -->
<!--                                 <li class="nav-item active"><a class="nav-link" href="#!">Home</a></li> -->
<!--                                 <li class="nav-item"><a class="nav-link" href="#!">Link</a></li> -->
<!--                                 <li class="nav-item dropdown"> -->
<!--                                     <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a> -->
<!--                                     <div class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown"> -->
<!--                                         <a class="dropdown-item" href="#!">Action</a> -->
<!--                                         <a class="dropdown-item" href="#!">Another action</a> -->
<!--                                         <div class="dropdown-divider"></div> -->
<!--                                         <a class="dropdown-item" href="#!">Something else here</a> -->
<!--                                     </div> -->
<!--                                 </li> -->
<!--                             </ul> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </nav> -->
                
                <jsp:include page="/WEB-INF/view/layout/navbar.jsp" />
                
                <!-- Page content-->
                <div class="container-fluid">
                    <h1 class="mt-4">Wellcome to Qyn2512</h1>
                    
<%--                     <jsp:include page="/WEB-INF/view/form/form_create_may.jsp" /> --%>
                    

                </div>
            </div>
        </div>
        
        
        
<!--         Bootstrap core JS -->
<!--         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> -->
<!--         Core theme JS -->
<!--         <script src="js/scripts.js"></script> -->
<%-- 	<script type="text/javascript"	src="<c:url value='/resources/js/bootstrap.bundle.min.js' />"></script> --%>
<%-- 	<script type="text/javascript"	src="<c:url value='/resources/js/scripts.js' />"></script> --%>

<jsp:include page="/WEB-INF/view/layout/javascript.jsp" />

</body>
<jsp:include page="/WEB-INF/view/layout/footer.jsp" />
</html>