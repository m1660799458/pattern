package com.xingqiyi.pattern.service.cookImpl;

import com.xingqiyi.pattern.service.ICook;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO:
 *
 * @author xingqiyi
 * @date 2021年10月09日 7:53 下午
 */
@Slf4j
public class GuangDongCook implements ICook {

    @Override
    public void doCooking() {
        log.info("广东（粤菜）——国内民间第二大菜系，国外最有影响力的中国菜系，可以代表中国。 ");
    }
}
