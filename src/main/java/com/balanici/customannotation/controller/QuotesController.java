package com.balanici.customannotation.controller;

import com.balanici.customannotation.annotation.ValidCurrency;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
@Validated
public class QuotesController {

  @RequestMapping
  public ResponseEntity<String> getQuotes(@ValidCurrency @RequestParam(name = "sourceAsset") String sourceAsset,
                                          @ValidCurrency @RequestParam(name = "destinationAsset") String destinationAsset) {
    return new ResponseEntity<>("From: " + sourceAsset + " to: " + destinationAsset, HttpStatus.OK);
  }
}
