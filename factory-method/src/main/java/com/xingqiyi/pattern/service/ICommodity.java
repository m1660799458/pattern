package com.xingqiyi.pattern.service;

import java.util.Map;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月28日 下午7:48
 */
public interface ICommodity {
    /**
     * // TODO: 2021/4/28 发奖接口
     *
     * @param uId         用户ID
     * @param commodityId 奖品ID
     * @param bizId       业务ID
     * @param extMap      扩展字段
     * @throws Exception .
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap);
}
