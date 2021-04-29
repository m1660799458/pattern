package com.xingqiyi.pattern;

import com.xingqiyi.pattern.service.ICommodity;
import com.xingqiyi.pattern.store.StoreFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * // TODO: 2021/4/28  Hello world!
 *
 * @author xingqiyi
 */
@SpringBootApplication
@Slf4j
public class FactoryMethod {
    public static void main(String[] args) {
        SpringApplication.run(FactoryMethod.class, args);
        log.error("Hello World! ------ factory method ------ 8001");
        StoreFactory storeFactory = new StoreFactory();
        ICommodity iCommodity1 = storeFactory.getCommodityService(1);
        iCommodity1.sendCommodity("001", "A01", "123456", null);
        log.error("---------------------------------");

        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        ICommodity iCommodity2 = storeFactory.getCommodityService(2);
        iCommodity2.sendCommodity("002", "B02", "654321", extMap);
        log.error("---------------------------------");

        ICommodity iCommodity3 = storeFactory.getCommodityService(3);
        iCommodity3.sendCommodity("003", "C03", "000000", null);
    }
}
