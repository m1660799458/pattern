package com.xingqiyi.pattern.service.impl;

import com.xingqiyi.pattern.service.Phone;
import lombok.extern.slf4j.Slf4j;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月29日 下午9:33
 */
@Slf4j
public class MiPhone implements Phone {
    @Override
    public void printConfig() {
        log.info("MiPhone:::6G+128G");
    }
}
