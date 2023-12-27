package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.entity.CompositeKeySuDungDichVu;
import fpt.fa.entity.SuDungDichVu;

public interface SuDungDichVuService {
	void create(SuDungDichVu dv);
	void update(SuDungDichVu dv);
	SuDungDichVu findById(CompositeKeySuDungDichVu id);
	List<SuDungDichVu> findAll();
	void delete(CompositeKeySuDungDichVu id);
	Page<SuDungDichVu> findAll(String search, Pageable pageable);
	double countAll();
}
