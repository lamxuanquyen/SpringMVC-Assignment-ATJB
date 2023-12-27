package fpt.fa.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import fpt.fa.validate.Create;
import fpt.fa.validate.ExistMaKH;
import fpt.fa.validate.Phone;
import fpt.fa.validate.Update;

@Entity
public class KhachHang {

	@Id
	@Column
	@Pattern(regexp = "^KH[0-9]{5}$", message = "Phải đúng định dạng KHxxxxx", groups = Create.class)
	@ExistMaKH(message = "khach hang da ton tai", groups = Create.class)
	private String maKH;

	private String tenKH;
	private String diaChi;
	
//	@Pattern(regexp = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)\\d{7}$", message = "Phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx!")
	@Phone(message = "Số điện thoại không hợp lệ",groups = {Create.class,Update.class} )
	private String soDienThoai;
	@Email
	private String diaChiEmail;
	
	@OneToMany(mappedBy = "compositeKeySuDungMay.maKH", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<SuDungMay> suDungMays;
	
	@OneToMany(mappedBy = "compositeKeySuDungDichVu.maKH", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<SuDungDichVu> suDungDichVus;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String maKH, String tenKH, String diaChi, String soDienThoai, String diaChiEmail) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diaChiEmail = diaChiEmail;
	}

	public KhachHang(String maKH, String tenKH, String diaChi, String soDienThoai, String diaChiEmail,
			Set<SuDungMay> suDungMays) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diaChiEmail = diaChiEmail;
		this.suDungMays = suDungMays;
	}

	
	
	public Set<SuDungDichVu> getSuDungDichVus() {
		return suDungDichVus;
	}

	public void setSuDungDichVus(Set<SuDungDichVu> suDungDichVus) {
		this.suDungDichVus = suDungDichVus;
	}

	public KhachHang(String maKH, String tenKH, String diaChi, String soDienThoai, String diaChiEmail,
			Set<SuDungMay> suDungMays, Set<SuDungDichVu> suDungDichVus) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diaChiEmail = diaChiEmail;
		this.suDungMays = suDungMays;
		this.suDungDichVus = suDungDichVus;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChiEmail() {
		return diaChiEmail;
	}

	public void setDiaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
	}

	public Set<SuDungMay> getSuDungMays() {
		return suDungMays;
	}

	public void setSuDungMays(Set<SuDungMay> suDungMays) {
		this.suDungMays = suDungMays;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai
				+ ", diaChiEmail=" + diaChiEmail + "]";
	}

	
}
