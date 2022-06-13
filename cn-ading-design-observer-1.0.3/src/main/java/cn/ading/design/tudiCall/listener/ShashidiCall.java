package cn.ading.design.tudiCall.listener;

import cn.ading.design.ShifuResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:49
 * @Author: Ading
 */
public class ShashidiCall implements CallListener{
    private Logger logger = LoggerFactory.getLogger(BajieCall.class);

    @Override
    public void doCall(ShifuResult result) {
        logger.info("沙和尚: 大师兄！有只妖怪{} 出现了! {}",result.getYaoguai(),result.getMsg());
    }
}
