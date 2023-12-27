package fpt.fa.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class DichVu {

	@Id
	@Column
	@Pattern(regexp = "^DV[0-9]{3}$", message = "Phải đúng định dạng DVxxx")
	private String maDV;

	@Column
	private String tenDV;
	@Column
	private String donViTinh;
	@Column
	@PositiveOrZero(message = "đơn giá phải >= 0")
	private Double donGia;
	
	@OneToMany(mappedBy = "compositeKeySuDungDichVu.maDV", cascade = CascadeType.ALL)
	private Set<SuDungDichVu> suDungDichVus;
	
	
	public DichVu() {
		// TODO Auto-generated constructor stub
	}

	public DichVu(String maDV, String tenDV, String donViTinh, Double donGia) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.donViTinh = donViTinh;
		this.donGia = donGia;
	}

	public String getMaDV() {
		return maDV;
	}


	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}


	public String getTenDV() {
		return tenDV;
	}


	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}


	public String getDonViTinh() {
		return donViTinh;
	}


	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}


	public Double getDonGia() {
		return donGia;
	}


	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "DichVu [maDV=" + maDV + ", tenDV=" + tenDV + ", donViTinh=" + donViTinh + ", donGia=" + donGia + "]";
	}
}
