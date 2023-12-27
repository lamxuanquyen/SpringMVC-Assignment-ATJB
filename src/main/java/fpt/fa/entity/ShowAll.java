package fpt.fa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShowAll {

	private String maKH;

	private String tenKH;
	
	private String maMay;
	
	private String viTri;
	
	private String trangThai;
	
	private LocalDate ngayBatDauSuDung;
	
	private Integer thoiGianSuDung;
	
	private String maDV;
	
	private LocalDate ngaySuDung;
	
	private LocalTime gioSuDung;
	
	private Integer soLuong;
	
	private double tongTien;
	
	public ShowAll() {
		// TODO Auto-generated constructor stub
	}

	public ShowAll(String maKH, String tenKH, String maMay, String viTri, String trangThai, LocalDate ngayBatDauSuDung,
			Integer thoiGianSuDung, String maDV, LocalDate ngaySuDung, LocalTime gioSuDung, Integer soLuong) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
		this.ngayBatDauSuDung = ngayBatDauSuDung;
		this.thoiGianSuDung = thoiGianSuDung;
		this.maDV = maDV;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
		this.soLuong = soLuong;
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

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public LocalDate getNgayBatDauSuDung() {
		return ngayBatDauSuDung;
	}

	public void setNgayBatDauSuDung(LocalDate ngayBatDauSuDung) {
		this.ngayBatDauSuDung = ngayBatDauSuDung;
	}

	public Integer getThoiGianSuDung() {
		return thoiGianSuDung;
	}

	public void setThoiGianSuDung(Integer thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}

	public String getMaDV() {
		return maDV;
	}

	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}

	public LocalDate getNgaySuDung() {
		return ngaySuDung;
	}

	public void setNgaySuDung(LocalDate ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}

	public LocalTime getGioSuDung() {
		return gioSuDung;
	}

	public void setGioSuDung(LocalTime gioSuDung) {
		this.gioSuDung = gioSuDung;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	
}
