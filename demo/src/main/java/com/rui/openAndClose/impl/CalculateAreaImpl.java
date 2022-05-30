package com.rui.openAndClose.impl;

import com.rui.openAndClose.CalculateArea;

import java.math.BigDecimal;

/**
 * create date 2022/5/30 09:49
 *
 * @author rui
 */
public class CalculateAreaImpl implements CalculateArea {
    private final BigDecimal PI = BigDecimal.valueOf(3.14);

    public BigDecimal rectangle(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }

    public Double triangle(Double x, Double y, Double z) {
        Double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public BigDecimal circular(BigDecimal r) {
        return r.multiply(r).multiply(PI);
    }
}
