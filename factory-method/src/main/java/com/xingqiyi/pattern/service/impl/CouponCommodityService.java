package com.xingqiyi.pattern.service.impl;


import com.alibaba.fastjson.JSON;
import com.xingqiyi.pattern.service.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * // TODO: 2021/4/28 优惠券
 *
 * @author xingqiyi
 * @date 2021年04月28日 下午7:54
 */
@Slf4j
public class CouponCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]：{\"code\":\"0000\",\"info\":\"发放成功\"}");
    }
}
