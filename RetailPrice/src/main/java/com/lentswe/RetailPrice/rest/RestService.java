package com.lentswe.RetailPrice.data.models;


import com.lentswe.RetailPrice.data.models.DiscountInfo;
import com.lentswe.RetailPrice.data.models.PaymentInfo;

import com.lentswe.RetailPrice.data.models.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discount")
public class RestService {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    public ResponseEntity<DiscountInfo> calculateDiscount(@RequestBody PaymentInfo paymentInfo) {
        DiscountInfo discountInfo = discountService.calculateDiscount(paymentInfo);
        return new ResponseEntity<>(discountInfo, HttpStatus.OK);
    }
}