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
import fpt.fa.entity.May;
import fpt.fa.service.MayService;

@Controller
@RequestMapping("/may")
public class MayController {
	@Autowired
	private MayService service;

	@GetMapping("/list")
	public String showList(Model model,
			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "maMay"));
		Page<May> mayList = service.findAll(search, pageable);
		model.addAttribute("mays", mayList.getContent());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("search", search);
		model.addAttribute("totalPages", mayList.getTotalPages());
		model.addAttribute("totalElement", mayList.getTotalElements());
		
		return "may/listMay";
	}

	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("may", new May());
		return "may/createMay";
	}

	@PostMapping("/create")
	public String doCreate(@ModelAttribute("may") @Validated May may, BindingResult bindingResult) {
		
		May may1 = service.findById(may.getMaMay());
		if (may1 != null) {
			bindingResult.rejectValue("maMay", "maMayInvalid", "da ton tai maMay");
		}
		if(bindingResult.hasErrors()) {
			return "may/createMay";
		}
		
		service.create(may);
		return "redirect:/may/list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(@RequestParam String id, Model model) {
		model.addAttribute("may", service.findById(id));
		return "may/updateMay";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute(name = "may") May may, Model model) {
		service.update(may);
		return "redirect:/may/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam String id, Model model) {
		service.delete(id);
		return "redirect:/may/list";
	}

//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public String search(@RequestParam("search") String search, Model model) {
//		model.addAttribute("mays", service.searchMay(key1, key2, key3));
//		return "may/listMay";
//	}

//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public String searchModel(@ModelAttribute(name = "may") May may, Model model) {
//		model.addAttribute("mays", service.searchModelMay(may));
//		return "may/listMay";
//	}

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
//		model.addAttribute("mays", service.findAll(pageable).getContent());
//		return "may/list";
//	}

//	@GetMapping("/listsort")
//	public String showList(Model model,
//			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
//			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
//		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Direction.ASC, "maMay"));
//		model.addAttribute("mays", service.findAll(pageable).getContent());
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("pageNumber", pageNumber);
//		model.addAttribute("totalPages", (int) Math.ceil((double) service.countAll() / (long) pageSize));
//		return "may/listMay";
//	}
}
