package com.csyy.message.user;

import java.io.Serializable;

/**
 * 短信接收者参数配置
 * @author rocky
 * @date 20165-05-16
 */
public class MessageAccepter implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String receiver; //接收信息验证的用户名（不是账户名），是按照用户要求配置的名称，可以为空
    private String pswd; //接收信息服务需验证的密码，可以为空
    private String moTime; //格式YYMMDDhhmm，其中YY=年份的最后两位（00-99），MM=月份（01-12），DD=日（01-31），hh=小时（00-23），mm=分钟（00-59）
    private String destcode; //用户上行的目的号码
    private String mobile; //单一的手机号码
    private String msg; //MO短信内容，文字内容使用UTF-8编码
    private String isems; //是否为长短信的一部分，1:是，0，不是,不带该参数，默认为普通短信
    private String emshead; //Isems为1时，本参数以ASCII码形式显示长短信的头信息。用“,”隔开，分为三个部分，第一部分标识该条长短信的ID（该ID为短信中心生成）；第二部分，表明该长短信的总条数（pk_total）；第三部分，该条短信为该长短信的第几条(pk_number)。例如：234,4,1，该短信的ID为234,该长短信的总长度为4条，1，当前为第一条。
   
    public MessageAccepter() {
        super();
    }
    
    public MessageAccepter(String receiver, String pswd, String moTime, String destcode, String mobile, String msg,
            String isems, String emshead) {
        super();
        this.receiver = receiver;
        this.pswd = pswd;
        this.moTime = moTime;
        this.destcode = destcode;
        this.mobile = mobile;
        this.msg = msg;
        this.isems = isems;
        this.emshead = emshead;
    }
    
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public String getPswd() {
        return pswd;
    }
    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
    public String getMoTime() {
        return moTime;
    }
    public void setMoTime(String moTime) {
        this.moTime = moTime;
    }
    public String getDestcode() {
        return destcode;
    }
    public void setDestcode(String destcode) {
        this.destcode = destcode;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getIsems() {
        return isems;
    }
    public void setIsems(String isems) {
        this.isems = isems;
    }
    public String getEmshead() {
        return emshead;
    }
    public void setEmshead(String emshead) {
        this.emshead = emshead;
    }
    
}
