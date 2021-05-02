package com.xingqiyi.pattern.study.innerclass.hasnotname;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 2021/5/2  测试匿名内部类
 *
 * @author xingqiyi
 * @date 2021年05月02日 上午11:39
 */
@Slf4j
public class TestMyInterfaceImpl {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                log.info("myInterface print");
            }
        };
        myInterface.print();


        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.print();
    }
}
