package com.xingqiyi.pattern.service.impl;

import com.xingqiyi.pattern.service.Computer;
import lombok.extern.slf4j.Slf4j;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月29日 下午9:37
 */
@Slf4j
public class HuaWeiComputer implements Computer {
    @Override
    public void printSize() {
        log.info("HuaWeiComputer:::15寸");
    }
}
