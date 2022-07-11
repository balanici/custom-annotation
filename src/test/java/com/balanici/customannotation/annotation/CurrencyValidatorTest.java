package com.balanici.customannotation.annotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.PropertySource;

import javax.validation.ConstraintValidatorContext;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CurrencyValidatorTest {

  @InjectMocks
  private CurrencyValidator currencyValidator;

  @Mock
  private ValidCurrency validCurrency;

  @Mock
  private ConstraintValidatorContext constraintValidatorContext;

  @ParameterizedTest
  @CsvSource({"USD,true", "MDM,false", "MDL,true"})
  void isValid(String asset, boolean expected) {

    boolean actual = currencyValidator.isValid(asset, constraintValidatorContext);
    assertEquals(actual, expected);

  }
}