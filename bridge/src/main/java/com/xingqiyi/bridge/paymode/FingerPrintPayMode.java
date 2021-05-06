package com.xingqiyi.bridge.paymode;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 指纹验证
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:15
 */
@Slf4j
public class FingerPrintPayMode implements PayMode {
    @Override
    public boolean isSecurity(String uId) {
        log.info("FingerPrintMode验证uId:::" + uId + "是否安全");
        return false;
    }
}
