package cn.ading.design;

import cn.ading.design.tudiCall.CallManager;
import cn.ading.design.tudiCall.listener.BajieCall;
import cn.ading.design.tudiCall.listener.CallListener;
import cn.ading.design.tudiCall.listener.HougeCall;
import cn.ading.design.tudiCall.listener.ShashidiCall;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:58
 * @Author: Ading
 */
public abstract class TudiService {

    private CallManager callManager;

    public TudiService(){
        callManager = new CallManager(CallManager.Tudi.Shashidi,CallManager.Tudi.Bajie,CallManager.Tudi.Houge);
        callManager.subscribe(CallManager.Tudi.Shashidi, new ShashidiCall());
        callManager.subscribe(CallManager.Tudi.Bajie, new BajieCall());
        CallListener houge = new HougeCall();
        callManager.subscribe(CallManager.Tudi.Houge, houge);
        callManager.subscribe(CallManager.Tudi.Houge, houge);

    }


    public ShifuResult callOther(String yaoguai){
        ShifuResult result = doCallOther(yaoguai);

        callManager.notify(CallManager.Tudi.Shashidi,result);
        callManager.notify(CallManager.Tudi.Bajie,result);
        callManager.notify(CallManager.Tudi.Houge, result);

        return result;
    }



    abstract protected ShifuResult doCallOther(String yaoguai);

}
