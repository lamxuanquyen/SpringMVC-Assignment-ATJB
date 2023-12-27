package fpt.fa.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fpt.fa.entity.May;

public interface MayRepository extends JpaRepository<May, String> {

//	List<May> findAllByNameContaining(String name);

	@Query(value = "select * from May m where m.maMay like %:maMay% and m.viTri like %:viTri% and m.trangThai like %:trangThai% ", nativeQuery = true)
	List<May> seachMay(@Param("maMay") String maMay, @Param("viTri") String viTri,
			@Param("trangThai") String trangThai);

	@Query(value = "select * from May m where m.maMay like %:#{#modelMay.maMay}% and m.viTri like %:#{#modelMay.viTri}% and m.trangThai like %:#{#modelMay.trangThai}%", nativeQuery = true)
	List<May> seachModelMay(@Param("modelMay") May may);

	@Query(value="select m From May m where m.maMay LIKE %?1% OR m.viTri LIKE %?1% OR m.trangThai LIKE %?1%")
	Page<May> findAll(String search, Pageable pageable);
}
