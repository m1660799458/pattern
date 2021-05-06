package com.xingqiyi.bridge.paymode;

/**
 * TODO: 2021/5/6  付款验证方式
 *
 * @author xingqiyi
 */
public interface PayMode {
    /**
     * TODO: 2021/5/6  是否验证通过
     *
     * @param uId 用户id
     * @return .
     */
    boolean isSecurity(String uId);
}
