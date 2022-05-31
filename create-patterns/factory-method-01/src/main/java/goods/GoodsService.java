package goods;

import com.alibaba.fastjson.JSON;

/**
 * description:
 * date: 2022/5/31 15:39
 *
 * @author rui
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
