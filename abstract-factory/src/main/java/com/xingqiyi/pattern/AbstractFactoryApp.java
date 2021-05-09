package com.xingqiyi.pattern;


import com.xingqiyi.pattern.service.AbstractFactory;
import com.xingqiyi.pattern.service.Computer;
import com.xingqiyi.pattern.service.Phone;
import com.xingqiyi.pattern.service.impl.HuaWeiFactory;
import com.xingqiyi.pattern.service.impl.MiFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * TODO: 2021/5/9  个人理解：工厂创建工厂来创建对象
 *
 * @author xingqiyi
 */
@SpringBootApplication
@Slf4j
public class AbstractFactoryApp {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(AbstractFactoryApp.class, args);
        log.info("Hello World!  AbstractFactory");

        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        Computer huaWeiFactoryComputer = huaWeiFactory.createComputer();
        huaWeiFactoryComputer.printSize();
        Phone huaWeiFactoryPhone = huaWeiFactory.createPhone();
        huaWeiFactoryPhone.printConfig();

        log.info("---------------------------------");
        AbstractFactory miFactory = new MiFactory();
        Computer miFactoryComputer = miFactory.createComputer();
        miFactoryComputer.printSize();
        Phone miFactoryPhone = miFactory.createPhone();
        miFactoryPhone.printConfig();
    }
}
