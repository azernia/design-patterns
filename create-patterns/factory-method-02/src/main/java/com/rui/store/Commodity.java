package com.rui.store;

import java.util.Map;

/**
 * description: 发放商品
 * date: 2022/5/31 15:41
 *
 * @author rui
 */
public interface Commodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}

