package cn.ading.design;

import org.junit.Test;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-20 10:49
 * @Author: Ading
 */
public class ApiTest {
    @Test
    public void test_add_egg(){
        AddEggFiredRiceNoodleDecorator addEggDecorator =
                new AddEggFiredRiceNoodleDecorator(
                        new BaseFiredRiceNoodle());
        addEggDecorator.getComponent("大碗");
        addEggDecorator.getPrice(10);

    }

    @Test
    public void test_add_egg_spice(){
        AddSpiceFiredRiceNoodleDecorator addSpiceEgg =
                new AddSpiceFiredRiceNoodleDecorator(
                        new AddEggFiredRiceNoodleDecorator(
                                new BaseFiredRiceNoodle()));

        addSpiceEgg.getComponent("大大碗");
        addSpiceEgg.getPrice(10);
    }
}
