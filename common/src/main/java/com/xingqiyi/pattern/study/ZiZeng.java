package com.xingqiyi.pattern.study;

import lombok.extern.slf4j.Slf4j;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年05月02日 上午10:31
 */
@Slf4j
public class ZiZeng {
    public void study() {
        int i = 0;
        log.info("i = " + i);
        int j = i++;
        log.info("i++ = " + i);
        log.info("j = " + j);
        int a = 0;
        log.info("a = " + a);
        int b = ++a;
        log.info("++a = " + a);
        log.info("b = " + b);
        log.info("The End");
    }
}
