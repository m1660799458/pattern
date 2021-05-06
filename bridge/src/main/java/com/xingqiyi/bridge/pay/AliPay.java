package com.xingqiyi.bridge.pay;

import com.xingqiyi.bridge.paymode.PayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * TODO: 支付宝支付
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:13
 */
@Slf4j
public class AliPay extends Pay {
    public AliPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public String toPay(String uId, String tradeId, BigDecimal amount) {
        log.info("AliPay的toPay()");
        Boolean isSecurity = payMode.isSecurity(uId);
        if (isSecurity) {
            log.info("AliPay is security");
            return "success";
        } else {
            log.info("AliPay is not security");
            return "fail";
        }
    }
}
