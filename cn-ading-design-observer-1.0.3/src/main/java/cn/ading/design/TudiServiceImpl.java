package cn.ading.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:25
 * @Author: Ading
 */
public class TudiServiceImpl extends TudiService {

    private ShifuWasCapturedService capturedService = new ShifuWasCapturedService();


    @Override
    protected ShifuResult doCallOther(String yaoguai) {

        String msg = capturedService.captured(yaoguai);

        return new ShifuResult(yaoguai, msg, new Date());
    }
}
