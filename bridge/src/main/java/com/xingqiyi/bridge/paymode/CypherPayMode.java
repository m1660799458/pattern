package com.xingqiyi.bridge.paymode;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 密码验证
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:16
 */
@Slf4j
public class CypherPayMode implements PayMode {
    @Override
    public boolean isSecurity(String uId) {
        log.info("CypherPayMode验证uId:::" + uId + "是否安全");
        return false;
    }
}
