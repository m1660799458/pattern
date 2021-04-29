package com.xingqiyi.pattern.service;

import java.math.BigDecimal;

/**
 * @author xingqiyi
 */
public interface Pay {
    /**
     * TODO: 2021/4/29 付款接口
     *
     * @param money 钱
     */
    void toPay(BigDecimal money);
}
