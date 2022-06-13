package cn.ading.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-20 10:47
 * @Author: Ading
 */
public class AddEggFiredRiceNoodleDecorator extends FiredRiceNoodleDecorator{
    private Logger logger = LoggerFactory.getLogger(AddEggFiredRiceNoodleDecorator.class);

    public AddEggFiredRiceNoodleDecorator(FiredRiceNoodle firedRiceNoodle) {
        super(firedRiceNoodle);
    }

    @Override
    public void getComponent(String component) {
        firedRiceNoodle.getComponent(component);
        logger.info("From {}: 另外，再加个鸡蛋",getClass().getSimpleName());
    }

    @Override
    public void getPrice(int price) {
        firedRiceNoodle.getPrice(price);
        logger.info("From {}: 加鸡蛋+1元",getClass().getSimpleName());
    }

}
