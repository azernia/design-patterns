package com.rui.store.impl;

import com.alibaba.fastjson.JSON;
import com.rui.store.Commodity;
import coupon.CouponResult;
import coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * description: 优惠券
 * date: 2022/5/31 15:44
 *
 * @author rui
 */
public class CouponCommodityService implements Commodity {
    private final Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private final CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }

}
