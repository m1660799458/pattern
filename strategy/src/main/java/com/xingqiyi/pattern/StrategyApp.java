package com.xingqiyi.pattern;

import com.xingqiyi.pattern.service.Context;
import com.xingqiyi.pattern.service.Pay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 * @author xingqiyi
 */
@Slf4j
@SpringBootApplication
public class StrategyApp {
    public static void main(String[] args) {
        SpringApplication.run(StrategyApp.class, args);
        log.info("Hello World StrategyApp!");

        Context.ALI_PAY.doPay(BigDecimal.valueOf(1000));
        Context.WE_CHAT_PAY.doPay(BigDecimal.valueOf(2000));
    }
}
