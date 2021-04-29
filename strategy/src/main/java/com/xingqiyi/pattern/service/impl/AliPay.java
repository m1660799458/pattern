package com.xingqiyi.pattern.service.impl;

import com.xingqiyi.pattern.service.Pay;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月29日 下午10:10
 */
@Slf4j
public class AliPay implements Pay {
    @Override
    public void toPay(BigDecimal money) {
        log.info("AliPay 付款$"+money);
    }
}
