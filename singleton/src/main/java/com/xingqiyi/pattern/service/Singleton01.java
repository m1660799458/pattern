package com.xingqiyi.pattern.service;

/**
 * // TODO: 2021/4/28 线程安全 内部类
 *
 * @author xingqiyi
 * @date 2021年04月28日 下午9:50
 */
public class Singleton01 {
    private static class SingletonHolder {
        private static Singleton01 instance = new Singleton01();
    }

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return SingletonHolder.instance;
    }
}
