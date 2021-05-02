package com.xingqiyi.pattern.study.innerClass;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: 2021/5/2  静态内部类
 *
 * @author xingqiyi
 * @date 2021年05月02日 上午11:13
 */
@Slf4j
public class OutClassNotStatic {
    private String name;

    public OutClassNotStatic() {
        this.name = "OutClassNotStatic";
    }

    public void display() {
        log.info("OutClassNotStatic display() ::: name = " + name);

//        class InnerClassNotStatic {
//            String name;
//
//            InnerClassNotStatic() {
//                name = "InnerClassNotStatic";
//            }
//
//            void print() {
//                log.info("InnerClassNotStatic print() ::: name = " + name);
//            }
//        }
//        InnerClassNotStatic innerClassNotStatic = new InnerClassNotStatic();
//        innerClassNotStatic.print();
    }

    /**
     * 第二种写法
     */
    class InnerClassNotStatic {
        String name;

        InnerClassNotStatic() {
            name = "InnerClassNotStatic";
        }

        void print() {
            log.info("InnerClassNotStatic print() ::: name = " + name);
        }
    }

    public static void main(String[] args) {
        OutClassNotStatic outClassNotStatic = new OutClassNotStatic();
        outClassNotStatic.display();

        /**
         * 第二种写法
         */
        OutClassNotStatic.InnerClassNotStatic innerClassNotStatic = outClassNotStatic.new InnerClassNotStatic();
        innerClassNotStatic.print();
    }
}
