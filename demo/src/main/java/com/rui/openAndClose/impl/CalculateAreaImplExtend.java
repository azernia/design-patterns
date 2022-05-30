package com.rui.openAndClose.impl;

import java.math.BigDecimal;

/**
 * create date 2022/5/30 09:49
 *
 * @author rui
 */
public class CalculateAreaImplExtend extends CalculateAreaImpl {

    private final BigDecimal PI = BigDecimal.valueOf(3.1415926);

    @Override
    public BigDecimal circular(BigDecimal r) {
        return r.multiply(r).multiply(PI);
    }
}
