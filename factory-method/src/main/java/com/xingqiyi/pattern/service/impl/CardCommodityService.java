package com.xingqiyi.pattern.service.impl;


import com.alibaba.fastjson.JSON;
import com.xingqiyi.pattern.service.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * // TODO: 2021/4/28 第三方爱奇艺兑换卡
 *
 * @author xingqiyi
 * @date 2021年04月28日 下午7:48
 */
@Slf4j
public class CardCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[爱奇艺兑换卡]：success");
    }
}
