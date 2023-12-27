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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.fa.entity.DichVu;
import fpt.fa.service.DichVuService;

@Controller
@RequestMapping("/dichvu")
public class DichVuController {
	@Autowired
	private DichVuService service;


	@GetMapping("/list")
	public String showList(Model model,
			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "maDV"));
		Page<DichVu> dichvuList = service.findAll(search, pageable);
		model.addAttribute("dichvus", dichvuList.getContent());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("search", search);
		model.addAttribute("totalPages", dichvuList.getTotalPages());
		model.addAttribute("totalElement", dichvuList.getTotalElements());
		
		return "dichvu/listDichVu";
	}

	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("dichvu", new DichVu());
		return "dichvu/createDichVu";
	}

	@PostMapping("/create")
	public String doCreate(@ModelAttribute("dichvu") @Validated DichVu dv, BindingResult result) {
		DichVu dv1 = service.findById(dv.getMaDV());
		if (dv1 != null) {
			result.rejectValue("maDV", "maDVInvalid", "da ton tai maDV");
		}
		
		if(result.hasErrors()) {
			return "dichvu/createDichVu";
		}		
		service.create(dv);
		return "redirect:/dichvu/list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(@RequestParam String id, Model model) {
		model.addAttribute("dichvu", service.findById(id));
		return "dichvu/updateDichVu";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute(name = "dichvu") DichVu dv, Model model) {
		service.update(dv);
		return "redirect:/dichvu/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam String id, Model model) {
		service.delete(id);
		return "redirect:/dichvu/list";
	}
	

//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "page", required = false, defaultValue = "1") int pageNumber) {
//		int pageSize = 10;
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "name"));
//		model.addAttribute("mays", service.findAll(pageable).getContent());
//		return "dichvu/list";
//	}
	
//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
//			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize,Sort.by(Direction.ASC, "maDV"));
//		model.addAttribute("dichvus", service.findAll(pageable).getContent());
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("pageNumber", pageNumber);
//		model.addAttribute("totalPages", (int) Math.ceil((double) service.countAll() / (long) pageSize));
//		return "dichvu/listDichVu";
//	}
}
