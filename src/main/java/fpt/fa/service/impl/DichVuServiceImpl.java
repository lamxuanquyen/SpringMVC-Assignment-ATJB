package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.fa.entity.DichVu;
import fpt.fa.repository.DichVuRepository;
import fpt.fa.service.DichVuService;

@Service
public class DichVuServiceImpl implements DichVuService {
	@Autowired
	private DichVuRepository repository;

	@Override
	public void create(DichVu DichVu) {
		repository.save(DichVu);
	}

	@Override
	public void update(DichVu DichVu) {
		repository.save(DichVu);
	}

	@Override
	public DichVu findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<DichVu> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Page<DichVu> findAll(String search,Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(search,pageable);
	}

	@Override
	public double countAll() {
		// TODO Auto-generated method stub
		return repository.count();
	}

}
