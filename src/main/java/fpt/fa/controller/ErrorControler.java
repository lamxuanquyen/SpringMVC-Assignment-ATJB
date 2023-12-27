//package fpt.fa.controller;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class ErrorControler {
//	@ExceptionHandler(Exception.class)
//	public String showError(Exception e, Model model) {
//		model.addAttribute("errorMessage", e.getMessage());
//		return "errorpage/error";
//	}
//}
