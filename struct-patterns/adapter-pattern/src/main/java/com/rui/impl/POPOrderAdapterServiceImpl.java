package com.rui.impl;

import com.rui.OrderAdapterService;
import com.rui.service.POPOrderService;

/**
 * 第三方订单，判断首单逻辑
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private final POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
