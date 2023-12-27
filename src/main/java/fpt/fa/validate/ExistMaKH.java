package fpt.fa.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MaKHValidator.class)
public @interface ExistMaKH {

    String message() default "{ExistMaKH}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}