package com.rui.strategy;

import com.rui.strategy.enums.OpEnum;
import com.rui.strategy.impl.Add;
import com.rui.strategy.impl.Subtract;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description:
 * date: 2022/6/10 17:43
 *
 * @author rui
 */
@Component
public class StrategyContext {
    protected static ConcurrentHashMap<OpEnum, Operation> opMap = new ConcurrentHashMap<>();

    @Resource
    private Add add;

    @Resource
    private Subtract subtract;

    /**
     * 如果想在生成对象时完成某些初始化操作，而偏偏这些初始化操作又依赖于依赖注入，那么就无法在构造函数中实现。
     * 为此，可以使用@PostConstruct注解一个方法来完成初始化，@PostConstruct注解的方法将会在依赖注入完成后被自动调用。
     */
    @PostConstruct
    public void init() {
        opMap.put(OpEnum.ADD, add);
        opMap.put(OpEnum.SUBTRACT, subtract);
    }
}
