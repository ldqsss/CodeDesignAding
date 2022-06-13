package cn.ading.design.test;

import cn.ading.design.ShifuResult;
import cn.ading.design.TudiService;
import cn.ading.design.TudiServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSON;


/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:35
 * @Author: Ading
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test(){
        TudiService tudiService = new TudiServiceImpl();
        ShifuResult shifuResult = tudiService.callOther("玉兔精");
        logger.info("测试结果{}",JSON.toJSONString(shifuResult));
        logger.info("__________________________________________");
        shifuResult = tudiService.callOther("白鹿精");
        logger.info("测试结果{}",JSON.toJSONString(shifuResult));
    }
}
