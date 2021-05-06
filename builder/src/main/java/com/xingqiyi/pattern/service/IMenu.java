package com.xingqiyi.pattern.service;

import com.xingqiyi.pattern.matter.Matter;

/**
 * TODO: 包装接口
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:39
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细
}
