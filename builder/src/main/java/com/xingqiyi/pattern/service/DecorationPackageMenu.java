package com.xingqiyi.pattern.service;

import com.xingqiyi.pattern.matter.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: 装修包实现
 *
 * @author xingqiyi
 * @date 2021年05月06日 下午8:54
 */
public class DecorationPackageMenu implements IMenu {
    /**
     * 装修清单
     */
    private List<Matter> list = new ArrayList<Matter>();
    /**
     * 装修价格
     */
    private BigDecimal price = BigDecimal.ZERO;

    /**
     * 面积
     */
    private BigDecimal area;
    /**
     * 装修等级；豪华欧式、轻奢田园、现代简约
     */
    private String grade;

    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    /**
     * 吊顶
     *
     * @param matter 。
     * @return 。
     */
    @Override
    public IMenu appendCeiling(Matter matter) {
        this.list.add(matter);
        this.price = price.add(matter.price());
        return this;
    }


    /**
     * 涂料
     *
     * @param matter .
     * @return .
     */
    @Override
    public IMenu appendCoat(Matter matter) {
        this.list.add(matter);
        this.price = price.add(area.multiply(new BigDecimal("6")).multiply(matter.price()));
        return this;
    }

    /**
     * 地板
     *
     * @param matter .
     * @return .
     */
    @Override
    public IMenu appendFloor(Matter matter) {
        this.list.add(matter);
        this.price = price.add(area.multiply(matter.price()));
        return this;
    }

    /**
     * 地砖
     *
     * @param matter .
     * @return .
     */
    @Override
    public IMenu appendTile(Matter matter) {
        this.list.add(matter);
        this.price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");
        for (Matter matter: list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：").append(matter.price()).append(" 元。\n");
        }
        return detail.toString();
    }
}
