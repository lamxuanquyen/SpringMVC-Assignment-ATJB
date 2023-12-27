package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.DTO.ShowDTO;
import fpt.fa.entity.CompositeKeySuDungMay;
import fpt.fa.entity.SuDungMay;

public interface SuDungMayService {
	void create(SuDungMay dv);
	void update(SuDungMay dv);
	SuDungMay findById(CompositeKeySuDungMay id);
	List<SuDungMay> findAll();
	void delete(CompositeKeySuDungMay id);
	List<Object[]> showAll();
	Page<ShowDTO> showAllDTO(Pageable pageable);
	double countAll();
	Page<SuDungMay> findAll(String search, Pageable pageable);
}
