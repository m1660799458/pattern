package com.xingqiyi.bridge.pay;

import com.xingqiyi.bridge.paymode.PayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * TODO: 微信支付
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:07
 */
@Slf4j
public class WeChatPay extends Pay {
    public WeChatPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public String toPay(String uId, String tradeId, BigDecimal amount) {
        log.info("WeChatPay的toPay()");
        boolean isSecurity = payMode.isSecurity(uId);
        if (isSecurity) {
            log.info("WeChatPay is security");
            return "success";
        } else {
            log.info("WeChatPay is not security");
            return "fail";
        }
    }
}
