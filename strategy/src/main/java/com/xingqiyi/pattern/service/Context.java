package com.xingqiyi.pattern.service;

import com.xingqiyi.pattern.service.impl.AliPay;
import com.xingqiyi.pattern.service.impl.WeChatPay;

import java.math.BigDecimal;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月29日 下午10:12
 */
public enum Context {
    /**
     * TODO: 2021/4/29 微信
     */
    WE_CHAT_PAY() {
        private WeChatPay weChatPay = new WeChatPay();

        @Override
        public void doPay(BigDecimal money) {
            weChatPay.toPay(money);
        }
    },
    /**
     * TODO: 2021/4/29 支付宝
     */
    ALI_PAY() {
        private AliPay aliPay = new AliPay();

        @Override
        public void doPay(BigDecimal money) {
            aliPay.toPay(money);
        }
    };

    public abstract void doPay(BigDecimal money);
}
