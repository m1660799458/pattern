package com.xingqiyi.pattern;

import com.alibaba.fastjson.JSON;
import com.xingqiyi.pattern.dao.Accounts;
import com.xingqiyi.pattern.dao.MQAdapter;
import com.xingqiyi.pattern.dao.RebateInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

/**
 * AdapterApplication
 * TODO: 2021/5/9  个人理解：动态适配转换
 *
 * @author xingqiyi
 */
@SpringBootApplication
@Slf4j
public class AdapterApplication {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        SpringApplication.run(AdapterApplication.class, args);
        log.info("Hello World AdapterApplication!!!");

        Accounts accounts = new Accounts();
        accounts.setNumber("100001");
        accounts.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        accounts.setAccountDate(new Date());
        accounts.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(accounts.toString(), link01);
        log.info("mq.create_account(适配前)" + accounts.toString());
        log.info("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));
    }
}
