package com.balanici.customannotation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = CurrencyValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCurrency {

  String message() default "Invalid currency";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
