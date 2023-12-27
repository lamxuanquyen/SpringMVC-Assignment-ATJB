package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.entity.DichVu;

public interface DichVuService {
	void create(DichVu dv);
	void update(DichVu dv);
	DichVu findById(String id);
	List<DichVu> findAll();
	void delete(String id);
	Page<DichVu> findAll(String search,Pageable pageable);
	double countAll();
}
