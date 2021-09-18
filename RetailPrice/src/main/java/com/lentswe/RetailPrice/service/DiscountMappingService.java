package com.lentswe.RetailPrice.web;


import com.lentswe.RetailPrice.data.models.DiscountType;
import com.lentswe.RetailPrice.data.models.UserType;
import org.springframework.stereotype.Service;

import java.util.function.Function;


public interface DiscountMappingService {

    DiscountType getDiscountByUserType(UserType userType);
    Function<Double, Double> getFunctionByDiscount(DiscountType discountType);
}