package com.xingqiyi.pattern.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * TODO: 第三方订单
 *
 * @author xingqiyi
 * @date 2021年05月07日 下午4:45
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderMq {
    /**
     * 用户ID
     */
    private String uid;
    /**
     * 商品
     */
    private String sku;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date createOrderTime;

}
