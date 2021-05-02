package com.xingqiyi.pattern.study.innerclass.hasnotname;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 2021/5/2  用于匿名内部类
 *
 * @author xingqiyi
 * @date 2021年05月02日 上午11:37
 */
@Slf4j
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void print() {
        log.info("MyInterfaceImpl print()");
    }
}
