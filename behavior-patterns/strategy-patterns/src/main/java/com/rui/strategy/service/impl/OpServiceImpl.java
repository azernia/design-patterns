package com.rui.strategy.service.impl;

import com.rui.strategy.Operation;
import com.rui.strategy.StrategyContext;
import com.rui.strategy.enums.OpEnum;
import com.rui.strategy.service.OpService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * description:
 * date: 2022/6/10 17:53
 *
 * @author rui
 */
@Service
public class OpServiceImpl extends StrategyContext implements OpService {

    @Override
    public BigDecimal doOperation(OpEnum opEnum, BigDecimal num1, BigDecimal num2) {
        Operation operation = opMap.get(opEnum);
        return operation.doOperation(num1, num2);
    }
}
