package cn.ading.design;

import java.util.Date;

/**
 * @project: CodeDesignAding
 * @Created-Time: 2022-05-17 20:23
 * @Author: Ading
 */
public class ShifuResult {
    private String yaoguai;    // 妖怪
    private String msg;    // 是非被抓信息
    private Date dateTime; // 发生时间

    public ShifuResult(String yaoguai, String msg, Date dateTime) {
        this.yaoguai = yaoguai;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getYaoguai() {
        return yaoguai;
    }

    public void setYaoguai(String yaoguai) {
        this.yaoguai = yaoguai;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
