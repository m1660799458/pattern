package com.xingqiyi.pattern.store;

import com.xingqiyi.pattern.service.ICommodity;
import com.xingqiyi.pattern.service.impl.CardCommodityService;
import com.xingqiyi.pattern.service.impl.CouponCommodityService;
import com.xingqiyi.pattern.service.impl.GoodsCommodityService;

/**
 * // TODO: 2021/4/28 模拟发奖多种商品
 *
 * @author xingqiyi
 * @date 2021年04月28日 下午7:47
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        switch (commodityType) {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CardCommodityService();
            default:
                throw new RuntimeException("不存在的商品服务类型");
        }
    }
}
