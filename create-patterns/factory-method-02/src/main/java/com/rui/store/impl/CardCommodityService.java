package com.rui.store.impl;

import card.IQiYiCardService;
import com.alibaba.fastjson.JSON;
import com.rui.store.Commodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * description: 兑换卡
 * date: 2022/5/31 15:42
 *
 * @author rui
 */
public class CardCommodityService implements Commodity {
    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private final IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
