package com.xingqiyi.pattern.study.innerclass;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 2021/5/2  非静态内部类
 *
 * @author xingqiyi
 * @date 2021年05月02日 上午11:13
 */
@Slf4j
public class OutClassIsStatic {
    private String name;

    public OutClassIsStatic() {
        this.name = "OutClassIsStatic";
    }


    public void display() {
        log.info("OutClassIsStatic display() ::: name = " + name);
    }

    static class InnerClassIsStatic {
        String name;

        InnerClassIsStatic() {
            name = "InnerClassIsStatic";
        }

        void print() {
            log.info("InnerClassIsStatic print() ::: name = " + name);
        }
    }

    public static void main(String[] args) {
        OutClassIsStatic outClassNotStatic = new OutClassIsStatic();
        outClassNotStatic.display();

        OutClassIsStatic.InnerClassIsStatic innerClassIsStatic = new InnerClassIsStatic();
        innerClassIsStatic.print();
    }
}
