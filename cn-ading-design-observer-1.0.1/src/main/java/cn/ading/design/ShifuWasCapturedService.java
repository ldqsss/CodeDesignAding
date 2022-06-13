package cn.ading.design;

/** 师傅被抓走了服务
 * @project: CodeDesign-Ading
 * @Created-Time: 2022-05-17 20:05
 * @Author: Ading
 */
public class ShifuWasCapturedService {

    /**
     * 师傅被妖怪抓走了吗？
     * @param yaoguai 妖怪
     * @return
     */
    public String captured(String yaoguai){
        return Math.abs(yaoguai.hashCode()) %2 == 0 ?
                "糟糕! 师傅被 ".concat(yaoguai).concat(" 抓走了!"): "还好,这 ".concat(yaoguai).concat(" 是只假妖怪,师傅无恙");
    }
}
