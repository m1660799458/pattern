package com.xingqiyi.pattern.dao;


import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * TODO: MQ消息体适配类
 *
 * @author xingqiyi
 * @date 2021年05月07日 下午4:57
 */
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map map = JSON.parseObject(strJson, Map.class);
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = map.get(link.get(key));
//            反射获取set方法调用
            RebateInfo.class.getMethod("set" + key.substring(0,1).toUpperCase()+key.substring(1),String.class).invoke(rebateInfo,val.toString());
        }
        return rebateInfo;
    }
}
