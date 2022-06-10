package com.rui.strategy;

import java.math.BigDecimal;

/**
 * description:
 * date: 2022/6/10 17:43
 *
 * @author rui
 */
public interface Operation {
    BigDecimal doOperation(BigDecimal num1, BigDecimal num2);
}
