package cn.ading.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:25
 * @Author: Ading
 */
public class TudiServiceImpl implements TudiService{
    private Logger logger = LoggerFactory.getLogger(TudiServiceImpl.class);
    private ShifuWasCapturedService capturedService = new ShifuWasCapturedService();


    @Override
    public ShifuResult callOther(String yaoguai) {
        // 妖怪出现，能不能抓走shifu
        String isCaptured = capturedService.captured(yaoguai);
        // 沙师弟说
        logger.info("沙师弟说: 大师兄!{}",isCaptured);
        // 八戒说
        logger.info("猪八戒: 猴哥!{}",isCaptured);
        // 悟空说
        logger.info("孙悟空: 烦死了！{}",isCaptured);

        // 结果
        return new ShifuResult(yaoguai,isCaptured,new Date());
    }
}
