package com.rui.strategy.impl;

import com.rui.strategy.Operation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * description:
 * date: 2022/6/10 17:44
 *
 * @author rui
 */
@Component
public class Add implements Operation {
    @Override
    public BigDecimal doOperation(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}
