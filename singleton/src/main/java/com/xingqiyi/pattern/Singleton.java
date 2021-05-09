package com.xingqiyi.pattern;

import com.xingqiyi.pattern.service.Singleton01;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * TODO: 2021/5/9  个人理解：全局唯一
 *
 * @author xingqiyi
 */
@SpringBootApplication
@Slf4j
public class Singleton {
    public static void main(String[] args) {
        SpringApplication.run(Singleton.class, args);
        log.error("Hello World! ------ singleton ------ 8002");

        log.info(Singleton01.getInstance().getClass().getName());
    }
}
