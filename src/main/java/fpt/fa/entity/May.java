package fpt.fa.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

@Entity
public class May {
	@Id
	@Pattern(regexp = "^M[0-9]{3}$", message = "Phải đúng định dạng Mxxx")
	private String maMay;
	
	private String viTri;
	
	private String trangThai;
	
	@OneToMany(mappedBy = "compositeKeySuDungMay.maMay", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<SuDungMay> suDungMays;
	
	public May() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public May(String maMay, String viTri, String trangThai, Set<SuDungMay> suDungMays) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
		this.suDungMays = suDungMays;
	}

	public May(String maMay, String viTri, String trangThai) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
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

	public Set<SuDungMay> getSuDungMays() {
		return suDungMays;
	}

	public void setSuDungMays(Set<SuDungMay> suDungMays) {
		this.suDungMays = suDungMays;
	}

	@Override
	public String toString() {
		return "May [maMay=" + maMay + ", viTri=" + viTri + ", trangThai=" + trangThai + "]";
	}
	
	
}
