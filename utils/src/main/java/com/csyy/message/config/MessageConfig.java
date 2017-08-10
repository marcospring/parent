package com.csyy.message.config;

import java.io.Serializable;

import com.csyy.message.util.MessageUtil;

/**
 * 短信参数配置
 * @author rocky
 * @date 20165-05-16
 */
public class MessageConfig implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String account = "ig09k4"; // 用户账号
    private String pswd = "imA5e0wp"; // 用户密码
    private String mobile = ""; // 合法手机号
    private String msg = ""; // 短信内容，验证码短信内容控制在70个字符内。使用URL方式编码为UTF-8格式。通知短信内容超过70个字符时，会被拆分成多条，然后以长短信的格式发送.
    private boolean needstatus=true; // 是否需要状态报告，取值true或false，true，表明需要状态报告；false不需要状态报告.
    private String product = ""; // 用户订购的产品id，不填写（针对老用户）系统采用用户的默认产品，用户订购多个产品时必填，否则会发生计费错误.
    private String extno = ""; // 可选参数，扩展码，用户定义扩展码，3位(默认不用填写).
    
    public MessageConfig() {
        account = MessageUtil.getMsgVal("account","ig09k4");
        pswd = MessageUtil.getMsgVal("pswd","imA5e0wp");
    }
    
    public MessageConfig(String account, String pswd,String mobile, String msg, boolean needstatus) {
        super();
        this.account = account;
        this.pswd = pswd;
        this.mobile = mobile;
        this.msg = msg;
        this.needstatus = needstatus;
    }
    
    public MessageConfig(String account, String pswd,String mobile, String msg, boolean needstatus, String product,
            String extno) {
        super();
        this.account = account;
        this.pswd = pswd;
        this.mobile = mobile;
        this.msg = msg;
        this.needstatus = needstatus;
        this.product = product;
        this.extno = extno;
    }
    
    public String getAccount() {
        return account;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }
    
    
    public String getPswd() {
        return pswd;
    }
    
    public void setPswd(String pswd) {
        this.pswd = pswd;
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
    
    public boolean getNeedstatus() {
        return needstatus;
    }
    
    public void setNeedstatus(boolean needstatus) {
        this.needstatus = needstatus;
    }
    
    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    
    public String getExtno() {
        return extno;
    }
    
    public void setExtno(String extno) {
        this.extno = extno;
    }
   
    
    /**
     * 初始化手机号,用 "," 分割.
     * @return
     */
    public MessageConfig initConfig(String[] phones){
        MessageConfig config = new MessageConfig();
        config.setAccount(account);
        config.setPswd(pswd);
        StringBuffer mobiles = new StringBuffer("");
        if (phones!=null && phones.length > 0) {
            for (int i = 0; i < phones.length; i++) {
                if (i==phones.length-1) {
                    if (phones[i].length()==11) {
                        mobiles.append(phones[i]);
                    }
                }else {
                    if (phones[i].length()==11) {
                        mobiles.append(phones[i]+",");
                    }
                }
            }
        }
        config.setMobile(mobiles.toString());
        config.setNeedstatus(needstatus);
        config.setProduct(product);
        config.setExtno(extno);
        return config;
    }
    
    /**
     * 检查余额
     * @return
     */
    public String toCheck(){
        return "?account=" + this.getAccount() + "&pswd=" + this.getPswd();
    }
    
    /**
     * 发送消息.
     */
    public String toSendMsg() {
        StringBuffer phones = new StringBuffer("?account=" + this.getAccount() + "&pswd=" + this.getPswd() + "&mobile=");
        phones.append(this.getMobile());
        phones.append("&msg=" + this.getMsg() + "&needstatus=" + this.getNeedstatus() + "&product=" + this.getProduct()
                + "&extno=" + this.getExtno());
        return phones.toString();
    }
    
}
