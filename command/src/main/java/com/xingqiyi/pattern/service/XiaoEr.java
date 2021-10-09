package com.xingqiyi.pattern.service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:
 *
 * @author xingqiyi
 * @date 2021年10月09日 8:01 下午
 */
public class XiaoEr {
    List<ICuisine> iCuisineList = new ArrayList<>();

    public void order(ICuisine iCuisine) {
        iCuisineList.add(iCuisine);
    }

    public synchronized void playOrder() {
        for (ICuisine iCuisine : iCuisineList) {
            iCuisine.cook();
        }
        iCuisineList.clear();
    }
}
