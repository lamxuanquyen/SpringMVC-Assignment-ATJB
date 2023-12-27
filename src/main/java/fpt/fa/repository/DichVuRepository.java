package fpt.fa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fpt.fa.entity.DichVu;

public interface DichVuRepository extends JpaRepository<DichVu, String>{
	@Query(value="select dv From DichVu dv where dv.maDV LIKE %?1% OR dv.tenDV LIKE %?1% OR dv.donViTinh LIKE %?1% OR dv.donGia LIKE %?1%")
	Page<DichVu> findAll(String search, Pageable pageable);
}
