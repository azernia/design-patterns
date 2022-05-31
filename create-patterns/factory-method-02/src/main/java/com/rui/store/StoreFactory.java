package com.rui.store;

import com.rui.store.impl.CardCommodityService;
import com.rui.store.impl.CouponCommodityService;
import com.rui.store.impl.GoodsCommodityService;

/**
 * description:
 * date: 2022/5/31 15:48
 *
 * @author rui
 */
public class StoreFactory {
    /**
     * 奖品类型方式实例化
     * @param commodityType 奖品类型
     * @return              实例化对象
     */
    public Commodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的奖品服务类型");
    }

    /**
     * 奖品类信息方式实例化
     * @param clazz 奖品类
     * @return      实例化对象
     */
    public Commodity getCommodityService(Class<? extends Commodity> clazz) throws IllegalAccessException, InstantiationException {
        if (null == clazz) return null;
        return clazz.newInstance();
    }

}
