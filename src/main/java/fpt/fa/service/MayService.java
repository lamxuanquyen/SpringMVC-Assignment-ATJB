package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.entity.May;

public interface MayService {
	void create(May may);
	void update(May may);
	May findById(String id);
	List<May> findAll();
	void delete(String id);
	Page<May> findAll(String search, Pageable pageable);
	double countAll();
	List<May> searchMay(String key1,String key2,String key3);
	List<May> searchModelMay(May may);
}
