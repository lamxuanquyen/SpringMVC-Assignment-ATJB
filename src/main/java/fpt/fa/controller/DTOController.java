package fpt.fa.controller;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.fa.DTO.ShowDTO;
import fpt.fa.service.SuDungMayService;

@Controller
public class DTOController {

	@Autowired
	private SuDungMayService service;

	@RequestMapping(value = "/showall", method = RequestMethod.GET)
	public String showAll(Model model) {
		List<Object[]> lists = service.showAll();
		List<ShowDTO> listDTO = new ArrayList<ShowDTO>();
		for (Object[] obj : lists) {

			Date ngayBDSD = (Date) obj[5];
			Date ngaySD = (Date) obj[8];
			Time gioSD = (Time) obj[9];

			ShowDTO dto = new ShowDTO((String) obj[0], (String) obj[1], (String) obj[2], (String) obj[3],
					(String) obj[4], (LocalDate) ngayBDSD.toLocalDate(), (Integer) obj[6], (String) obj[7],
					(LocalDate) ngaySD.toLocalDate(), (LocalTime) gioSD.toLocalTime(), (Integer) obj[10],
					(Double) obj[11]);

			listDTO.add(dto);
		}
		model.addAttribute("showList", listDTO);

		return "allshow/listAll";
	}

//	@RequestMapping(value = "/showalldto", method = RequestMethod.GET)
//	public String showAllDTO(Model model) {
//		List<ShowDTO> listDTO = service.showAllDTO();
//
//		model.addAttribute("showList", listDTO);
//		return "allshow/listAll";
//	}

	@GetMapping("/showallsort")
	public String showList(Model model,
			@RequestParam(name = "pageNumber", required = false, defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) 
	{
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
		Page<ShowDTO> showPage = service.showAllDTO(pageable);
		model.addAttribute("showList", showPage.getContent());
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("totalPages", showPage.getTotalPages());
		model.addAttribute("totalElement", showPage.getTotalElements());
		return "allshow/listAll";
	}
}
