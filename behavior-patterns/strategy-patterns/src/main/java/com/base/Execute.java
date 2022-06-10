package com.base;

import com.base.strategy.Strategy;

/**
 * description: 执行策略
 * date: 2022/6/10 17:25
 *
 * @author rui
 */
public class Execute {
    private final Strategy strategy;

    public Execute(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.operation(num1, num2);
    }
}
