package com.xingqiyi.pattern.service;

import com.xingqiyi.pattern.matter.*;

/**
 * TODO: 描述一下咯
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午9:07
 */
public class Builder {
    public IMenu levelOne(Double area) {
        IMenu a = new DecorationPackageMenu(area, "豪华欧式");
        IMenu b = a.appendCeiling(new CeilingLevelTwoMatter());
        IMenu c = b.appendCoat(new CoatDuluxMatter());
        IMenu d = c.appendFloor(new FloorShengXiangMatter());

        return new DecorationPackageMenu(area, "豪华欧式")
//                吊顶，二级顶
                .appendCeiling(new CeilingLevelTwoMatter())
                // 涂料，多乐士
                .appendCoat(new CoatDuluxMatter())
                // 地板，圣象
                .appendFloor(new FloorShengXiangMatter());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
//                吊顶，二级顶
                .appendCeiling(new CeilingLevelTwoMatter())
                // 涂料，立邦
                .appendCoat(new CoatLiBangMatter())
                // 地砖，马可波罗
                .appendFloor(new TileMarcoPoloMatter());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
//                吊顶，二级顶
                .appendCeiling(new CeilingLevelTwoMatter())
                // 涂料，立邦
                .appendCoat(new CoatLiBangMatter())
                // 地砖，东鹏
                .appendFloor(new TileDongPengMatter());
    }

}
