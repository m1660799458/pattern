package com.xingqiyi.pattern.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * TODO: 统一的MQ消息体
 *
 * @author xingqiyi
 * @date 2021年05月07日 下午4:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RebateInfo {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 业务ID
     */
    private String bizId;

    /**
     * 业务时间
     */
    private Date bizTime;

    /**
     * 业务描述
     */
    private String desc;

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }

}
