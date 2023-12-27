package fpt.fa.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fpt.fa.entity.CompositeKeySuDungDichVu;
import fpt.fa.entity.SuDungDichVu;

public interface SuDungDichVuRepository extends JpaRepository<SuDungDichVu, CompositeKeySuDungDichVu> {
	
//	List<SuDungDichVu> findAllByNameContaining(String name);
//	@Query(value = "select m from SuDungDichVu m where m.name like 'S%'")
//	List<SuDungDichVu> findAllByNameStartS();
	
	
//	@Query("SELECT sddv FROM SuDungDichVu sddv WHERE sddv.compositeKeySuDungDichVu = :keys")
//    SuDungDichVu findByCompositeKey(@Param("keys") CompositeKeySuDungDichVu keys);
	
//	@Query("SELECT * FROM SuDungDichVu WHERE ma_KH = :keys.khachHang.maKH & ma_DV = :keys.dichVu.maDV & ngaySuDung = :keys.ngaySuDung & gioSuDung = :keys.gioSuDung")
//    SuDungDichVu findByCompositeKey(@Param("keys") CompositeKeySuDungDichVu keys);
//	
//	@Query("SELECT sddv FROM SuDungDichVu sddv WHERE sddv.compositeKeySuDungDichVu.maKH = :khachHangMaKH AND sddv.compositeKeySuDungDichVu.maDV = :dichVuMaDV AND sddv.compositeKeySuDungDichVu.ngaySuDung = :ngaySuDung AND sddv.compositeKeySuDungDichVu.gioSuDung = :gioSuDung")
//	SuDungDichVu findByCompositeKey(@Param("khachHangMaKH") String khachHangMaKH,
//	                                @Param("dichVuMaDV") String dichVuMaDV,
//	                                @Param("ngaySuDung") String ngaySuDung,
//	                                @Param("gioSuDung") String gioSuDung);
	
	@Query(value="select sddv From SuDungDichVu sddv where sddv.compositeKeySuDungDichVu.maKH LIKE %?1% OR sddv.compositeKeySuDungDichVu.maDV LIKE %?1% OR sddv.compositeKeySuDungDichVu.ngaySuDung LIKE %?1% OR sddv.compositeKeySuDungDichVu.gioSuDung LIKE %?1% OR sddv.soLuong LIKE %?1%")
	Page<SuDungDichVu> findAll(String search, Pageable pageable);
}
