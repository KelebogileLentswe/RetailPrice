package com.lentswe.RetailPrice.web;


import com.lentswe.RetailPrice.data.models.DiscountType;
import com.lentswe.RetailPrice.data.models.UserType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Service
class DiscountMappingServiceImpl implements DiscountMappingService {

    private static final Double EMPLOYEE_PERCENTAGE = 30.0 / 100;
    private static final Double AFFILIATE_PERCENTAGE = 10.0 / 100;
    private static final Double LOYALTY_PERCENTAGE = 5.0 / 100;

    private final Map<UserType, DiscountType> userToDiscountMapping = new HashMap<>(4);
    private final Map<DiscountType, Function<Double, Double>> discountToFunction = new HashMap<>(4);

    public DiscountMappingServiceImpl() {
        initMaps();
    }

    public DiscountType getDiscountByUserType(UserType userType) {
        return userToDiscountMapping.getOrDefault(userType, DiscountType.NONE);
    }

    
    public Function<Double, Double> getFunctionByDiscount(DiscountType discountType) {
        return discountToFunction.getOrDefault(discountType, amount -> 0.0);
    }

    private void initMaps() {
        userToDiscountMapping.put(UserType.EMPLOYEE, DiscountType.EMPLOYEE_DISCOUNT);
        userToDiscountMapping.put(UserType.AFFILIATE, DiscountType.AFFILIATE_DISCOUNT);
        userToDiscountMapping.put(UserType.LOYAL, DiscountType.LOYALTY_DISCOUNT);
        userToDiscountMapping.put(UserType.REGULAR, DiscountType.NONE);

        discountToFunction.put(DiscountType.EMPLOYEE_DISCOUNT, amount -> amount * EMPLOYEE_PERCENTAGE);
        discountToFunction.put(DiscountType.AFFILIATE_DISCOUNT, amount -> amount * AFFILIATE_PERCENTAGE);
        discountToFunction.put(DiscountType.LOYALTY_DISCOUNT, amount -> amount * LOYALTY_PERCENTAGE);
        discountToFunction.put(DiscountType.NONE, amount -> 0.0);
    }
}