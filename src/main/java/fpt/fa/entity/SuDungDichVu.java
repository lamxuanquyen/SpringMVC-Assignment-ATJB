package fpt.fa.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class SuDungDichVu {

	@EmbeddedId
	@Valid
	private CompositeKeySuDungDichVu compositeKeySuDungDichVu;
	
	@Positive(message = "số lượng phải lớn hơn 0")
	private int soLuong;
	
	public SuDungDichVu() {
		// TODO Auto-generated constructor stub
	}

	public SuDungDichVu(CompositeKeySuDungDichVu compositeKeySuDungDichVu, int soLuong) {
		super();
		this.compositeKeySuDungDichVu = compositeKeySuDungDichVu;
		this.soLuong = soLuong;
	}

	public CompositeKeySuDungDichVu getCompositeKeySuDungDichVu() {
		return compositeKeySuDungDichVu;
	}

	public void setCompositeKeySuDungDichVu(CompositeKeySuDungDichVu compositeKeySuDungDichVu) {
		this.compositeKeySuDungDichVu = compositeKeySuDungDichVu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "SuDungDichVu [compositeKeySuDungDichVu=" + compositeKeySuDungDichVu + ", soLuong=" + soLuong + "]";
	}
	
	

}
