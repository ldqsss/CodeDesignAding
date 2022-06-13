package cn.ading.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-20 10:55
 * @Author: Ading
 */
public class BaseFiredRiceNoodle implements FiredRiceNoodle{
    private Logger logger = LoggerFactory.getLogger(BaseFiredRiceNoodle.class);


    @Override
    public void getComponent(String component) {
        logger.info("From {}: 标准分量为 {}",getClass().getSimpleName(),component);
    }

    @Override
    public void getPrice(int price) {
        logger.info("From {}: 标准价格为 {} 元/份",getClass().getSimpleName(),price);
    }
}
