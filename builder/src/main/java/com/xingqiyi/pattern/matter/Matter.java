package com.xingqiyi.pattern.matter;

import java.math.BigDecimal;

/**
 * TODO: 材料接口
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:41
 */
public interface Matter {
    String scene();      // 场景；地板、地砖、涂料、吊顶

    String brand();      // 品牌

    String model();      // 型号

    BigDecimal price();  // 价格

    String desc();       // 描述

}
