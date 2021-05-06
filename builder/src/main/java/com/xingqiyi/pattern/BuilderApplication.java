package com.xingqiyi.pattern;

import com.xingqiyi.pattern.matter.TileDongPengMatter;
import com.xingqiyi.pattern.service.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xingqiyi
 */
@Slf4j
@SpringBootApplication
public class BuilderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);
        log.info("Hello World BuilderApplication!!!");

        Builder builder = new Builder();
        log.info(builder.levelOne(150D).getDetail());
        log.info(builder.levelTwo(120D).getDetail());
        log.info(builder.levelThree(60D).getDetail());
    }
}
