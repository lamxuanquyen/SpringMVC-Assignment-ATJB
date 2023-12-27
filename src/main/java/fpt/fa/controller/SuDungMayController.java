package fpt.fa.controller;

import java.time.LocalDate;
import java.time.LocalTime;

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

import fpt.fa.entity.CompositeKeySuDungMay;
import fpt.fa.entity.May;
import fpt.fa.entity.SuDungDichVu;
import fpt.fa.entity.KhachHang;
import fpt.fa.entity.SuDungMay;
import fpt.fa.service.MayService;
import fpt.fa.service.KhachHangService;
import fpt.fa.service.SuDungMayService;

@Controller
@RequestMapping("/sudungmay")
public class SuDungMayController {
	@Autowired
	private SuDungMayService service;
	
	@Autowired
	private KhachHangService serviceKhachHang;

	@Autowired
	private MayService serviceMay;

	@GetMapping("/list")
	public String showList(Model model,
			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "compositeKeySuDungMay.maKH"));
		Page<SuDungMay> sudungmayList = service.findAll(search, pageable);
		model.addAttribute("sudungmays", sudungmayList.getContent());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("search", search);
		model.addAttribute("totalPages", sudungmayList.getTotalPages());
		model.addAttribute("totalElement", sudungmayList.getTotalElements());
		
		return "sudungmay/listSuDungMay";
	}

	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("khachhanglist", serviceKhachHang.findAll());
		model.addAttribute("maylist", serviceMay.findAll());
		model.addAttribute("sudungmay", new SuDungMay());
		return "sudungmay/createSuDungMay";
	}

	@RequestMapping(value = "/create",method = RequestMethod.POST)
	public String doCreate(@ModelAttribute("sudungmay") @Validated SuDungMay sudungmay, BindingResult result) {
		
		SuDungMay sdm = service.findById(sudungmay.getCompositeKeySuDungMay());
		if (sdm != null) {
			result.rejectValue("compositeKeySuDungMay.maKH", "keyInvalid", "da ton tai sudungmay nay");
		}
		if(result.hasErrors()) {
			return "sudungmay/createSuDungMay";
		}
//		System.out.println("show da ta form: "+ sudungmay);
//		KhachHang kh = serviceKhachHang.findById(sudungmay.getCompositeKeySuDungMay().getMaKH());
//		sudungmay.setKhachHang(kh);
//		May may = serviceMay.findById(sudungmay.getCompositeKeySuDungMay().getMaMay());
//		sudungmay.setMay(may);
		service.create(sudungmay);
//		System.out.println("=====PASS======");
		return "redirect:/sudungmay/list";
	}
	
//	@RequestMapping(value = "/create",method = RequestMethod.POST)
//	public String doCreate(@ModelAttribute("sudungmay") SuDungMay sudungmay) {
//		
//		System.out.println("show da ta form: "+ sudungmay);
//		KhachHang kh = serviceKhachHang.findById(sudungmay.getCompositeKeySuDungMay().getMaKH());
//		sudungmay.setKhachHang(kh);
//		May may = serviceMay.findById(sudungmay.getCompositeKeySuDungMay().getMaMay());
//		sudungmay.setMay(may);
//		service.create(sudungmay);
//		System.out.println("=====PASS======");
//		return "redirect:/sudungmay/list";
//	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(CompositeKeySuDungMay id, 
					            Model model) {
		model.addAttribute("sudungmay", service.findById(id));
		return "sudungmay/updateSuDungMay";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute(name = "sudungmay") SuDungMay sudungmay, Model model) {
//		KhachHang kh = serviceKhachHang.findById(sudungmay.getCompositeKeySuDungMay().getMaKH());
//		sudungmay.setKhachHang(kh);
//		May may = serviceMay.findById(sudungmay.getCompositeKeySuDungMay().getMaMay());
//		sudungmay.setMay(may);
		service.update(sudungmay);
		return "redirect:/sudungmay/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete( CompositeKeySuDungMay id, Model model) {
		service.delete(id);
		return "redirect:/sudungmay/list";
	}
	


//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "page", required = false, defaultValue = "1") int pageNumber) {
//		int pageSize = 10;
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "name"));
//		model.addAttribute("sudungmays", service.findAll(pageable).getContent());
//		return "sudungmay/listSuDungMay";
//	}
	
//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
//			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize,Sort.by(Direction.ASC, "compositeKeySuDungMay.maKH"));
//		model.addAttribute("sudungmays", service.findAll(pageable).getContent());
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("pageNumber", pageNumber);
//		model.addAttribute("totalPages", (int) Math.ceil((double) service.countAll() / (long) pageSize));
//		return "sudungmay/listSuDungMay";
//	}
//	
	
}
