package com.xingqiyi.pattern.service.cookImpl;

import com.xingqiyi.pattern.service.ICook;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO:
 *
 * @author xingqiyi
 * @date 2021年10月09日 8:11 下午
 */
@Slf4j
public class SiChuanCook implements ICook {
    @Override
    public void doCooking() {
        log.info("四川（川菜）——中国最有特色的菜系，也是民间最大菜系。");
    }
}
