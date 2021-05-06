package com.xingqiyi.bridge.paymode;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 人脸验证
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:08
 */
@Slf4j
public class FacePayMode implements PayMode {
    @Override
    public boolean isSecurity(String uId) {
        log.info("FacePayMode验证uId:::" + uId + "是否安全");
        return true;
    }
}
