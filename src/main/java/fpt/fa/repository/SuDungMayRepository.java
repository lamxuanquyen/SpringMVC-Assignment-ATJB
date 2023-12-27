package fpt.fa.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fpt.fa.DTO.ShowDTO;
import fpt.fa.entity.CompositeKeySuDungMay;
import fpt.fa.entity.SuDungDichVu;
import fpt.fa.entity.SuDungMay;

public interface SuDungMayRepository extends JpaRepository<SuDungMay, CompositeKeySuDungMay> {

	@Query(value = "select kh.maKH, kh.tenKH, m.maMay, m.viTri, m.trangThai,\r\n"
			+ "	sdm.ngayBatDauSuDung,sdm.thoiGianSuDung,\r\n"
			+ "	dv.maDV, sddv.ngaySuDung,sddv.gioSuDung, sddv.soLuong, dv.donGia\r\n"
			+ "from SuDungMay sdm\r\n"
			+ "left join KhachHang kh on sdm.maKH = kh.maKH\r\n"
			+ "left join May m on sdm.maMay = m.maMay\r\n"
			+ "left join SuDungDichVu sddv on kh.maKH = sddv.maKH\r\n"
			+ "left join DichVu dv on sddv.maDV = dv.maDV",nativeQuery = true)
	List<Object[]> showAll();
	
//	@Query("select distinct new fpt.fa.DTO.ShowDTO(" +
//	  "kh.maKH, kh.tenKH, m.maMay, m.viTri, m.trangThai, " +
//	  "sdm.compositeKeySuDungMay.ngayBatDauSuDung,sdm.thoiGianSuDung, " +
//	  "dv.maDV, sddv.compositeKeySuDungDichVu.ngaySuDung, " +
//	  "sddv.compositeKeySuDungDichVu.gioSuDung, sddv.soLuong) " +
//	  "from SuDungMay sdm " +
//	  "left join sdm.compositeKeySuDungMay.maKH kh " +
//	  "left join sdm.compositeKeySuDungMay.maMay m " +
//	  "left join kh.suDungDichVus sddv " +
//	  "left join sddv.compositeKeySuDungDichVu.maDV dv")	
//	List<ShowDTO> showAll();
	
	
	
	@Query(value = "SELECT distinct NEW fpt.fa.DTO.ShowDTO(" +
	        "kh.maKH, kh.tenKH, m.maMay, m.viTri, m.trangThai, " +
	        "sdm.compositeKeySuDungMay.ngayBatDauSuDung, sdm.thoiGianSuDung, " +
	        "sddv.compositeKeySuDungDichVu.maDV, sddv.compositeKeySuDungDichVu.ngaySuDung, " +
	        "sddv.compositeKeySuDungDichVu.gioSuDung, sddv.soLuong,dv.donGia) " +
	        "FROM SuDungMay sdm " +
	        "LEFT JOIN KhachHang kh ON sdm.compositeKeySuDungMay.maKH = kh.maKH " +
	        "LEFT JOIN May m ON sdm.compositeKeySuDungMay.maMay = m.maMay " +
	        "LEFT JOIN SuDungDichVu sddv ON sddv.compositeKeySuDungDichVu.maKH = kh.maKH " +
	        "LEFT JOIN DichVu dv ON sddv.compositeKeySuDungDichVu.maDV = dv.maDV "
	        , countQuery = "select count(1) "
	        		 +"FROM SuDungMay sdm " +
	     	        "LEFT JOIN KhachHang kh ON sdm.compositeKeySuDungMay.maKH = kh.maKH " +
	     	        "LEFT JOIN May m ON sdm.compositeKeySuDungMay.maMay = m.maMay " +
	     	        "LEFT JOIN SuDungDichVu sddv ON sddv.compositeKeySuDungDichVu.maKH = kh.maKH " +
	     	        "LEFT JOIN DichVu dv ON sddv.compositeKeySuDungDichVu.maDV = dv.maDV ")
	Page<ShowDTO> showAllDTO(Pageable pageable);
	
	
//	List<SuDungMay> findAllByNameContaining(String name);
//	@Query(value = "select m from SuDungMay m where m.name like 'S%'")
//	List<SuDungMay> findAllByNameStartS();

	
	
//	select  kh.maKH, kh.tenKH, m.maMay, m.viTri, m.trangThai,
//	sdm.ngayBatDauSuDung,sdm.thoiGianSuDung,
//	dv.maDV, sddv.ngaySuDung,sddv.gioSuDung, sddv.soLuong
//from SuDungMay sdm
//left join KhachHang kh on sdm.maKH = kh.maKH
//left join May m on sdm.maMay = m.maMay
//left join SuDungDichVu sddv on kh.maKH = sddv.maKH
//left join DichVu dv on sddv.maDV = dv.maDV
	
	
	@Query(value="select sdm From SuDungMay sdm where sdm.compositeKeySuDungMay.maKH LIKE %?1% OR sdm.compositeKeySuDungMay.maMay LIKE %?1% OR sdm.compositeKeySuDungMay.ngayBatDauSuDung LIKE %?1% OR sdm.compositeKeySuDungMay.gioBatDauSuDung LIKE %?1% OR sdm.thoiGianSuDung LIKE %?1%")
	Page<SuDungMay> findAll(String search, Pageable pageable);
}
