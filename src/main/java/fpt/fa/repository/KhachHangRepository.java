package fpt.fa.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fpt.fa.entity.KhachHang;
import fpt.fa.entity.May;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
	
//	List<KhachHang> findAllByNameContaining(String name);
//	@Query(value = "select m from KhachHang m where m.name like 'S%'")
//	List<KhachHang> findAllByNameStartS();

	@Query(value="select kh From KhachHang kh where kh.maKH LIKE %?1% OR kh.tenKH LIKE %?1% OR kh.diaChi LIKE %?1% OR kh.soDienThoai LIKE %?1% OR kh.diaChiEmail LIKE %?1%")
	Page<KhachHang> findAll(String search, Pageable pageable);
}
