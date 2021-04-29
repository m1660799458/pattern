package com.xingqiyi.pattern.service.impl;

import com.xingqiyi.pattern.service.Computer;
import com.xingqiyi.pattern.service.Phone;
import lombok.extern.slf4j.Slf4j;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月29日 下午9:33
 */
@Slf4j
public class MiComputer implements Computer {
    @Override
    public void printSize() {
        log.info("MiComputer:::13寸");
    }
}
