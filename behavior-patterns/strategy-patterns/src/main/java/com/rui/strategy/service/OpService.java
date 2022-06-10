package com.rui.strategy.service;

import com.rui.strategy.enums.OpEnum;

import java.math.BigDecimal;

/**
 * description:
 * date: 2022/6/10 17:51
 *
 * @author rui
 */
public interface OpService {
    BigDecimal doOperation(OpEnum opEnum, BigDecimal num1, BigDecimal num2);
}
