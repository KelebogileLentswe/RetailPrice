package com.lentswe.RetailPrice.web;


import com.lentswe.RetailPrice.data.models.DiscountInfoe;
import com.lentswe.RetailPrice.data.models.UserType;;
import org.springframework.stereotype.PaymentInfo;;



public interface DiscountService {

    DiscountInfo calculateDiscount(PaymentInfo paymentInfo);
}