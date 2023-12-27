package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.entity.KhachHang;

public interface KhachHangService {
	void create(KhachHang KhachHang);
	void update(KhachHang KhachHang);
	KhachHang findById(String id);
	List<KhachHang> findAll();
	void delete(String id);
	Page<KhachHang> findAll(String search,Pageable pageable);
	double countAll();
}
