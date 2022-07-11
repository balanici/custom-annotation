package com.balanici.customannotation.annotation;

import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Currency;

@Slf4j
public class CurrencyValidator implements ConstraintValidator<ValidCurrency, String> {
  @Override
  public void initialize(ValidCurrency constraintAnnotation) {
  }

  @Override
  public boolean isValid(String currencyAsset, ConstraintValidatorContext context) {
    try {
      Currency.getInstance(currencyAsset);
      return true;
    } catch (IllegalArgumentException | NullPointerException ex) {
//      context.
      return false;
    }
  }

}
