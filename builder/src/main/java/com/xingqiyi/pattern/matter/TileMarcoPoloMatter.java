package com.xingqiyi.pattern.matter;

import java.math.BigDecimal;

/**
 * TODO: 马可波罗瓷砖
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:52
 */
public class TileMarcoPoloMatter implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗瓷砖";
    }

    @Override
    public String model() {
        return "10002";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }
}
