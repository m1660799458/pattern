package com.xingqiyi.bridge;

import com.xingqiyi.bridge.pay.AliPay;
import com.xingqiyi.bridge.pay.Pay;
import com.xingqiyi.bridge.pay.WeChatPay;
import com.xingqiyi.bridge.paymode.FacePayMode;
import com.xingqiyi.bridge.paymode.FingerPrintPayMode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

/**
 * TODO: 2021/5/9  个人理解：主要是两大模块的组合
 * @author xingqiyi
 */
@SpringBootApplication
@Slf4j
public class BridgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeApplication.class, args);

        log.info("hello world BridgeApplication!!!");

        log.info("-----------AliPay------------");
        Pay aliPay = new AliPay(new FacePayMode());
        aliPay.toPay("001", "A01", BigDecimal.valueOf(99));

        log.info("-----------WeChatPay------------");
        Pay weChatPay = new WeChatPay(new FingerPrintPayMode());
        weChatPay.toPay("007", "C36", BigDecimal.valueOf(111));
    }

}
