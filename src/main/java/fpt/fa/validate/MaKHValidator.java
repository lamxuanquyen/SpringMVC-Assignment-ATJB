package fpt.fa.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import fpt.fa.repository.KhachHangRepository;

public class MaKHValidator implements ConstraintValidator<ExistMaKH, String>{

	@Autowired
	private KhachHangRepository repository;
	
	@Override
    public void initialize(ExistMaKH constraintAnnotation) {
    }
	
	@Override
	public boolean isValid(String maKH, ConstraintValidatorContext context) {
		if (maKH != null && repository.existsById(maKH)) {
			return false;
		}
		return true;
	}

}
