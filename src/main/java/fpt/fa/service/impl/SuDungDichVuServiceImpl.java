package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.fa.entity.CompositeKeySuDungDichVu;
import fpt.fa.entity.SuDungDichVu;
import fpt.fa.repository.SuDungDichVuRepository;
import fpt.fa.service.SuDungDichVuService;

@Service
public class SuDungDichVuServiceImpl implements SuDungDichVuService {
	@Autowired
	private SuDungDichVuRepository repository;

	@Override
	public void create(SuDungDichVu SuDungDichVu) {
		repository.save(SuDungDichVu);
	}

	@Override
	public void update(SuDungDichVu SuDungDichVu) {
		repository.save(SuDungDichVu);
	}

	@Override
	public SuDungDichVu findById(CompositeKeySuDungDichVu id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<SuDungDichVu> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(CompositeKeySuDungDichVu id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Page<SuDungDichVu> findAll(String search,Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(search,pageable);
	}

	@Override
	public double countAll() {
		// TODO Auto-generated method stub
		return repository.count();
	}

}
