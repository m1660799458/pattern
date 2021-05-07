package com.xingqiyi.pattern.dao;


import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


/**
 * TODO: 账户
 *
 * @author xingqiyi
 * @date 2021年05月07日 下午4:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
    /**
     * 开户编号
     */
    private String number;
    /**
     * 开户地
     */
    private String address;
    /**
     * 开户时间
     */
    private Date accountDate;
    /**
     * 开户描述
     */
    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
