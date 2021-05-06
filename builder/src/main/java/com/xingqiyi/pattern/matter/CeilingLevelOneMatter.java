package com.xingqiyi.pattern.matter;

import java.math.BigDecimal;

/**
 * TODO: 一级吊顶
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:42
 */
public class CeilingLevelOneMatter implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
