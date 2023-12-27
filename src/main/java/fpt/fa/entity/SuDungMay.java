package fpt.fa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class SuDungMay {

	@EmbeddedId
	private CompositeKeySuDungMay compositeKeySuDungMay;
	
	@Column
	@Positive(message = "thoiGianSuDung phải lớn hơn 0")
	private int thoiGianSuDung;
	
//	@MapsId("maKH")
//	@ManyToOne
//    @JoinColumn(name = "ma_KH", referencedColumnName = "ma_KH", insertable = false, updatable = false)
//	private KhachHang khachHang;
//	
//	@MapsId("maMay")
//	@ManyToOne
//    @JoinColumn(name = "ma_may", referencedColumnName = "ma_may", insertable = false, updatable = false)
//	private May may;
	
	public SuDungMay() {
		// TODO Auto-generated constructor stub
	}

	public SuDungMay(CompositeKeySuDungMay compositeKeySuDungMay, int thoiGianSuDung) {
		super();
		this.compositeKeySuDungMay = compositeKeySuDungMay;
		this.thoiGianSuDung = thoiGianSuDung;
	}

	public CompositeKeySuDungMay getCompositeKeySuDungMay() {
		return compositeKeySuDungMay;
	}

	public void setCompositeKeySuDungMay(CompositeKeySuDungMay compositeKeySuDungMay) {
		this.compositeKeySuDungMay = compositeKeySuDungMay;
	}

	public int getThoiGianSuDung() {
		return thoiGianSuDung;
	}

	public void setThoiGianSuDung(int thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}

//	public KhachHang getKhachHang() {
//		return khachHang;
//	}
//
//	public void setKhachHang(KhachHang khachHang) {
//		this.khachHang = khachHang;
//	}
//
//	public May getMay() {
//		return may;
//	}
//
//	public void setMay(May may) {
//		this.may = may;
//	}

	@Override
	public String toString() {
		return "SuDungMay [compositeKeySuDungMay=" + compositeKeySuDungMay + ", thoiGianSuDung=" + thoiGianSuDung + "]";
	}
	
	

}
