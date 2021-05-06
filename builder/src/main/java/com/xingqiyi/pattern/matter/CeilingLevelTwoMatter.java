package com.xingqiyi.pattern.matter;

import java.math.BigDecimal;

/**
 * TODO: 二级吊顶
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:45
 */
public class CeilingLevelTwoMatter implements Matter {
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
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }
}
