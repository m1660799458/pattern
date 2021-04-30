package com.xingqiyi.pattern;

import com.xingqiyi.pattern.util.ExportExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 * @author xingqiyi
 */
@Slf4j
@SpringBootApplication
public class CommonApp {
    public static void main(String[] args) {
        SpringApplication.run(CommonApp.class, args);
        log.info("Hello World!");
        long aa = System.currentTimeMillis();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.doExportExcel();
        long bb = System.currentTimeMillis();
        log.info(String.valueOf(bb - aa));
    }
}
