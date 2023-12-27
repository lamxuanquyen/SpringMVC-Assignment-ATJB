package fpt.fa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.fa.entity.KhachHang;
import fpt.fa.service.KhachHangService;
import fpt.fa.validate.Create;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
	@Autowired
	private KhachHangService service;


	@GetMapping("/list")
	public String showList(Model model,
			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "maKH"));
		Page<KhachHang> khachhangList = service.findAll(search, pageable);
		model.addAttribute("khachhangs", khachhangList.getContent());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("search", search);
		model.addAttribute("totalPages", khachhangList.getTotalPages());
		model.addAttribute("totalElement", khachhangList.getTotalElements());
        		
		return "khachhang/listKhachHang";
	}

	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("khachhang", new KhachHang());
		return "khachhang/createKhachHang";
	}

	@PostMapping("/create")
	public String doCreate(@ModelAttribute("khachhang") @Validated(Create.class) KhachHang kh, BindingResult result){
		
//		KhachHang kh1 = service.findById(kh.getMaKH());
//		if(kh1 != null) {
//			result.rejectValue("maKH", "maKhInvalid", "Đã tồn tại mã kh!");
//		}
		
		if(result.hasErrors()) {
			return "khachhang/createKhachHang";
		}
		service.create(kh);
		return "redirect:/khachhang/list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(@RequestParam String id, Model model) {
		model.addAttribute("khachhang", service.findById(id));
		return "khachhang/updateKhachHang";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute(name = "khachhang") KhachHang kh, Model model) {
		service.update(kh);
		return "redirect:/khachhang/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam String id, Model model) {
		service.delete(id);
		return "redirect:/khachhang/list";
	}
	

//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "page", required = false, defaultValue = "1") int pageNumber) {
//		int pageSize = 10;
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "name"));
//		model.addAttribute("khachhangs", service.findAll(pageable).getContent());
//		return "khachhang/list";
//	}
	
//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
//			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize,Sort.by(Direction.ASC, "maKH"));
//		model.addAttribute("khachhangs", service.findAll(pageable).getContent());
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("pageNumber", pageNumber);
//		model.addAttribute("totalPages", (int) Math.ceil((double) service.countAll() / (long) pageSize));
//		return "khachhang/listKhachHang";
//	}
}
