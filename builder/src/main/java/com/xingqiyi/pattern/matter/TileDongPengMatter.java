package com.xingqiyi.pattern.matter;

import java.math.BigDecimal;

/**
 * TODO: 东鹏瓷砖
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:52
 */
public class TileDongPengMatter implements Matter{
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏瓷砖";
    }

    @Override
    public String model() {
        return "10001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，口碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶行业榜首。";
    }
}
