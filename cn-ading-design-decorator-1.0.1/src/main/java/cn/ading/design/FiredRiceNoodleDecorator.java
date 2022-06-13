package cn.ading.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-20 10:32
 * @Author: Ading
 */
public abstract class FiredRiceNoodleDecorator implements FiredRiceNoodle{

    public FiredRiceNoodleDecorator(FiredRiceNoodle firedRiceNoodle) {
        this.firedRiceNoodle = firedRiceNoodle;
    }

    public FiredRiceNoodleDecorator() {

    }

    protected FiredRiceNoodle firedRiceNoodle;

    @Override
    public void getComponent(String component) {
        firedRiceNoodle.getComponent(component);
    }

    @Override
    public void getPrice(int price) {
        firedRiceNoodle.getPrice(price);
    }
}
