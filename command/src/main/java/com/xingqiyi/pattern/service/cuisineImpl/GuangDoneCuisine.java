package com.xingqiyi.pattern.service.cuisineImpl;

import com.xingqiyi.pattern.service.ICook;
import com.xingqiyi.pattern.service.ICuisine;

/**
 * TODO:
 *
 * @author xingqiyi
 * @date 2021年10月09日 7:58 下午
 */
public class GuangDoneCuisine implements ICuisine {

    private ICook iCook;

    public GuangDoneCuisine(ICook iCook) {
        this.iCook = iCook;
    }

    @Override
    public void cook() {
        this.iCook.doCooking();
    }
}
