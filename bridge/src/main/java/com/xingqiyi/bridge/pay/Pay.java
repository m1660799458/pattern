package com.xingqiyi.bridge.pay;

import com.xingqiyi.bridge.paymode.PayMode;

import java.math.BigDecimal;

/**
 * TODO: 付款方式抽象类
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:01
 */
public abstract class Pay {
    protected PayMode payMode;

    public Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * TODO: 2021/5/6  付款方法
     *
     * @param uId     用户ID
     * @param tradeId 交易ID
     * @param amount  钱
     * @return 。
     */
    public abstract String toPay(String uId, String tradeId, BigDecimal amount);
}
