package com.rui.strategy.controller;

import com.rui.strategy.enums.OpEnum;
import com.rui.strategy.service.OpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * description:
 * date: 2022/6/10 17:50
 *
 * @author rui
 */
@RestController
public class StrategyController {

    private final OpService opService;

    @Autowired
    public StrategyController(OpService opService) {
        this.opService = opService;
    }

    @GetMapping("/add")
    public BigDecimal add(BigDecimal num1, BigDecimal num2) {
        return opService.doOperation(OpEnum.ADD, num1, num2);
    }

    @GetMapping("/subtract")
    public BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        return opService.doOperation(OpEnum.SUBTRACT, num1, num2);
    }
}
