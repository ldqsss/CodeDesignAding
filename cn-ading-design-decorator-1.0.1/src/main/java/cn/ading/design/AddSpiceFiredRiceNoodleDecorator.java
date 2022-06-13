package cn.ading.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-20 11:10
 * @Author: Ading
 */
public class AddSpiceFiredRiceNoodleDecorator extends FiredRiceNoodleDecorator{
    private Logger logger = LoggerFactory.getLogger(AddSpiceFiredRiceNoodleDecorator.class);

    public AddSpiceFiredRiceNoodleDecorator(FiredRiceNoodle firedRiceNoodle) {
        super(firedRiceNoodle);
    }

    @Override
    public void getComponent(String component) {
        super.getComponent(component);
        logger.info("From {}: 老板加辣椒!",getClass().getSimpleName());
    }

    @Override
    public void getPrice(int price) {
        super.getPrice(price);
        logger.info("From {}: 不要钱的辣!使劲加哈哈哈！",getClass().getSimpleName());

    }
}
