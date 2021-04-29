package com.xingqiyi.pattern.service.impl;

import com.xingqiyi.pattern.service.AbstractFactory;
import com.xingqiyi.pattern.service.Computer;
import com.xingqiyi.pattern.service.Phone;
import lombok.extern.slf4j.Slf4j;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月29日 下午9:04
 */
@Slf4j
public class MiFactory implements AbstractFactory {

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Computer createComputer() {
        return new MiComputer();
    }
}
