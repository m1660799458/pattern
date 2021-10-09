package com.xingqiyi.pattern;

import com.xingqiyi.pattern.service.XiaoEr;
import com.xingqiyi.pattern.service.cookImpl.GuangDongCook;
import com.xingqiyi.pattern.service.cookImpl.SiChuanCook;
import com.xingqiyi.pattern.service.cuisineImpl.GuangDoneCuisine;
import com.xingqiyi.pattern.service.cuisineImpl.SiChuanCuisine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * TODO: 命令者模式  个人理解：中间帮忙操作
 * 菜系
 * 01、山东（鲁菜）——宫廷最大菜系，以孔府风味为龙头。
 * 02、四川（川菜）——中国最有特色的菜系，也是民间最大菜系。
 * 03、江苏（苏菜）——宫廷第二大菜系，古今国宴上最受人欢迎的菜系。
 * 04、广东（粤菜）——国内民间第二大菜系，国外最有影响力的中国菜系，可以代表中国。
 * 05、福建（闽菜）——客家菜的代表菜系。
 * 06、浙江（浙菜）——中国最古老的菜系之一，宫廷第三大菜系。
 * 07、湖南（湘菜）——民间第三大菜系。
 * 08、安徽（徽菜）——徽州文化的典型代表。
 *
 * @author xingqiyi
 * @date 2021年10月09日20:08:51
 */
@SpringBootApplication
@Slf4j
public class Command {
    public static void main(String[] args) {
        SpringApplication.run(Command.class, args);
        log.error("Hello World! ------ command ------ 8007");

        GuangDoneCuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(siChuanCuisine);
        xiaoEr.playOrder();
    }
}
