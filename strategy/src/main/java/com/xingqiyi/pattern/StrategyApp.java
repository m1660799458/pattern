package com.xingqiyi.pattern;

import com.xingqiyi.pattern.service.Context;
import com.xingqiyi.pattern.service.Pay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

/**
 * TODO: 2021/5/9  个人理解：不同策略的选择，改变 context 对象的执行算法，有点像暴露一个接口里面给你分配你想要的算法
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
