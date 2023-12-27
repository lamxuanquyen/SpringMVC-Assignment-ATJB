package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.fa.entity.KhachHang;
import fpt.fa.repository.KhachHangRepository;
import fpt.fa.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService {
	@Autowired
	private KhachHangRepository repository;

	@Override
	public void create(KhachHang KhachHang) {
		repository.save(KhachHang);
	}

	@Override
	public void update(KhachHang KhachHang) {
		repository.save(KhachHang);
	}

	@Override
	public KhachHang findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<KhachHang> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Page<KhachHang> findAll(String search,Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(search,pageable);
	}

	@Override
	public double countAll() {
		// TODO Auto-generated method stub
		return repository.count();
	}

}
