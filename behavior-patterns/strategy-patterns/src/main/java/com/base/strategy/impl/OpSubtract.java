package com.base.strategy.impl;

import com.base.strategy.Strategy;

/**
 * description:
 * date: 2022/6/10 17:23
 *
 * @author rui
 */
public class OpSubtract implements Strategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
