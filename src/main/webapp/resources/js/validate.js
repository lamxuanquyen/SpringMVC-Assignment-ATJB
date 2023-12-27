
$(document).ready(function () {
	
	validateFromPath();

})

function validateFromPath(){
	var currentPath = window.location.pathname;
	
	var path_may = new RegExp("/may/create")	
	if(path_may.test(currentPath)){
		console.log("create may: " + currentPath);
	}
	
	var path_khachhang = new RegExp("/khachhang/create")	
	if(path_khachhang.test(currentPath)){
		console.log("create khachhang: " + currentPath);
	}
	
	var path_dichvu = new RegExp("/dichvu/create")	
	if(path_dichvu.test(currentPath)){
		console.log("create dichvu: " + currentPath);
	}
	
	var path_sudungdichvu = new RegExp("/sudungdichvu/create")	
	if(path_sudungdichvu.test(currentPath)){
		console.log("create sudungdichvu: " + currentPath);
	}
	
	var path_sudungmay = new RegExp("/sudungmay/create")	
	if(path_sudungmay.test(currentPath)){
		console.log("create sudungmay: " + currentPath);
	}
	
}

function validateFormKhachHang(){
	
}
