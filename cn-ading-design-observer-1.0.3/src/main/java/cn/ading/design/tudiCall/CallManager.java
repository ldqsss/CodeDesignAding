package cn.ading.design.tudiCall;

import cn.ading.design.ShifuResult;
import cn.ading.design.tudiCall.listener.CallListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:50
 * @Author: Ading
 */
public class CallManager {
    Map<Enum<Tudi>, List<CallListener>> tudis = new HashMap<>();


    /**
     * 可变参数个数构造方法
     * <p>
     *     格式：
     *     修饰符 返回值类型 方法名（参数类型…变量名）{}
     * @param tudiCalls
     */
    public CallManager(Enum<Tudi>...  tudiCalls){
        for(Enum<Tudi> tudiCall : tudiCalls){
            this.tudis.put(tudiCall, new ArrayList<>());
        }
    }

    /**
     * 枚举
     * <p>
     *  徒弟用枚举的方式区分
     * <p>
     *     方便外部调用时，在规定下使用时间服务
     */
    public enum Tudi{
        Shashidi, Bajie, Houge
    }

    /**
     * 订阅
     * @param tudiEnum 徒弟类型
     * @param listener 监听
     */
    public void subscribe(Enum<Tudi> tudiEnum, CallListener listener){
        List<CallListener> allTudis =   tudis.get(tudiEnum);
        allTudis.add(listener);
    }

    /**
     * 取消订阅
     * @param tudiEnum 徒弟类型
     * @param listener 监听
     */
    public void unsubscribe(Enum<Tudi> tudiEnum, CallListener listener){
        this.tudis.remove(tudiEnum).add(listener);
    }

    /**
     * 通知
     * @param tudiEnum 土地类型
     * @param result 师傅是否被抓的结果
     */
    public void notify(Enum<Tudi> tudiEnum, ShifuResult result){
        List<CallListener> allTudi = this.tudis.get(tudiEnum);
        for(CallListener tudi : allTudi){
            tudi.doCall(result);
        }
    }
}
