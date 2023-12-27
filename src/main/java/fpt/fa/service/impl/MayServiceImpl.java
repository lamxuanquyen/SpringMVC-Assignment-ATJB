package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.fa.entity.May;
import fpt.fa.repository.MayRepository;
import fpt.fa.service.MayService;

@Service
public class MayServiceImpl implements MayService {
	@Autowired
	private MayRepository repository;

	@Override
	public void create(May May) {
		repository.save(May);
	}

	@Override
	public void update(May May) {
		repository.save(May);
	}

	@Override
	public May findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<May> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Page<May> findAll(String search, Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(search, pageable);
	}

	@Override
	public double countAll() {
		// TODO Auto-generated method stub
		return repository.count();
	}

	@Override
	public List<May> searchMay(String key1, String key2, String key3) {
		// TODO Auto-generated method stub
		return repository.seachMay(key1, key2, key3);
	}

	@Override
	public List<May> searchModelMay(May may) {
		// TODO Auto-generated method stub
		return repository.seachModelMay(may);
	}

}
