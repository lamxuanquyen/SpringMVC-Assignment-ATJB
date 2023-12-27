package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.fa.DTO.ShowDTO;
import fpt.fa.entity.CompositeKeySuDungMay;
import fpt.fa.entity.SuDungMay;
import fpt.fa.repository.SuDungMayRepository;
import fpt.fa.service.SuDungMayService;

@Service
public class SuDungMayServiceImpl implements SuDungMayService {
	@Autowired
	private SuDungMayRepository repository;

	@Override
	public void create(SuDungMay SuDungMay) {
		repository.save(SuDungMay);
	}

	@Override
	public void update(SuDungMay SuDungMay) {
		repository.save(SuDungMay);
	}

	@Override
	public SuDungMay findById(CompositeKeySuDungMay id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<SuDungMay> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(CompositeKeySuDungMay id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Page<SuDungMay> findAll(String search,Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(search,pageable);
	}

	@Override
	public List<Object[]> showAll() {
		
		return repository.showAll();
	}

	@Override
	public Page<ShowDTO> showAllDTO(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.showAllDTO(pageable);
	}

	@Override
	public double countAll() {
		// TODO Auto-generated method stub
		return repository.count();
	}

}
