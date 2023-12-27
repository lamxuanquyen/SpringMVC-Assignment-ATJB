package fpt.fa.controller;

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
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.fa.entity.CompositeKeySuDungDichVu;
import fpt.fa.entity.DichVu;
import fpt.fa.entity.KhachHang;
import fpt.fa.entity.SuDungDichVu;
import fpt.fa.entity.SuDungMay;
import fpt.fa.service.DichVuService;
import fpt.fa.service.KhachHangService;
import fpt.fa.service.SuDungDichVuService;

@Controller
@RequestMapping("/sudungdichvu")
public class SuDungDichVuController {
	@Autowired
	private SuDungDichVuService service;
	
	@Autowired
	private KhachHangService serviceKhachHang;

	@Autowired
	private DichVuService serviceDichVu;

	@GetMapping("/list")
	public String showList(Model model,
			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "compositeKeySuDungDichVu.maKH"));
		Page<SuDungDichVu> sudungdichvuList = service.findAll(search, pageable);
		model.addAttribute("sudungdichvus", sudungdichvuList.getContent());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("search", search);
		model.addAttribute("totalPages", sudungdichvuList.getTotalPages());
		model.addAttribute("totalElement", sudungdichvuList.getTotalElements());
		
		return "sudungdichvu/listSuDungDichVu";
	}

	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("khachhanglist", serviceKhachHang.findAll());
		model.addAttribute("dichvulist", serviceDichVu.findAll());
		model.addAttribute("sudungdichvu", new SuDungDichVu());
		return "sudungdichvu/createSuDungDichVu";
	}

	@PostMapping("/create")
	public String doCreate(@ModelAttribute("sudungdichvu") @Validated SuDungDichVu sudungdichvu, BindingResult result) {
		SuDungDichVu sddv = service.findById(sudungdichvu.getCompositeKeySuDungDichVu());
		if (sddv != null) {
			result.rejectValue("compositeKeySuDungDichVu.maKH", "keyInvalid", "da ton tai sudungdichvu nay");
		}
		
		if(result.hasErrors()) {
			return "sudungdichvu/createSuDungDichVu";
		}
		service.create(sudungdichvu);
		return "redirect:/sudungdichvu/list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(CompositeKeySuDungDichVu id, 
					            Model model) {
		model.addAttribute("sudungdichvu", service.findById(id));
		return "sudungdichvu/updateSuDungDichVu";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute(name = "sudungdichvu") SuDungDichVu sudungdichvu, Model model) {
		service.update(sudungdichvu);
		return "redirect:/sudungdichvu/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete( CompositeKeySuDungDichVu id, Model model) {
		service.delete(id);
		return "redirect:/sudungdichvu/list";
	}
	

//	@ExceptionHandler(Exception.class)
//	public String showError(Exception e, Model model) {
//		model.addAttribute("errorMessage", e.getMessage());
//		return "error";
//	}

//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "page", required = false, defaultValue = "1") int pageNumber) {
//		int pageSize = 10;
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "name"));
//		model.addAttribute("sudungdichvus", service.findAll(pageable).getContent());
//		return "sudungdichvu/list";
//	}
	
//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
//			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize,Sort.by(Direction.ASC, "compositeKeySuDungDichVu.maKH"));
//		model.addAttribute("sudungdichvus", service.findAll(pageable).getContent());
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("pageNumber", pageNumber);
//		model.addAttribute("totalPages", (int) Math.ceil((double) service.countAll() / (long) pageSize));
//		return "sudungdichvu/listSuDungDichVu";
//	}
}
