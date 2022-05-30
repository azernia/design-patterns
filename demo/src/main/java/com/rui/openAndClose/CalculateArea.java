package com.rui.openAndClose;

import java.math.BigDecimal;

public interface CalculateArea {

    /**
     * 矩形
     *
     * @param x 长
     * @param y 宽
     * @return {@link BigDecimal}
     */
    BigDecimal rectangle(BigDecimal x, BigDecimal y);

    /**
     * 三角形
     * 海伦公式 S=√p(p-a)(p-b)(p-c) p=(a+b+c)/2
     *
     * @param x 边长 x
     * @param y 边长 y
     * @param z 边长 z
     * @return {@link Double}
     */
    Double triangle(Double x, Double y, Double z);

    /**
     * 圆
     *
     * @param r 半径
     * @return {@link BigDecimal}
     */
    BigDecimal circular(BigDecimal r);
}
