package fpt.fa.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone, String>{

	@Override
    public void initialize(Phone constraintAnnotation) {
    }
	
	@Override
	public boolean isValid(String phoneNo, ConstraintValidatorContext context) {
		if (phoneNo ==null) {
			return false;
		}
		String regexp = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)\\d{7}$";
		return phoneNo.matches(regexp);
	}

}
