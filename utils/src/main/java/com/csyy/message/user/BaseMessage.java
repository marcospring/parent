package com.csyy.message.user ;
import java.io.UnsupportedEncodingException ;

/**
 * 抽象的发短信的基类
 * @author rocky
 * @date 2016-05-17
 */
public abstract class BaseMessage {

    /**
     * 获取当前账户余额
     * @param phone:电话
     * @return
     */
    public abstract String getAccountBalance() throws Exception ;
    

    /**
     * 注册麦芽分期验证码模板
     * @param code:编码
     * @return
     */
    public abstract String registCodeMsg(String code,String[] phones) throws Exception;
    
    /**
     * 提交借款申请模板
     * @param money:钱
     * @return
     */
    public abstract String submitMessageMsg(String money,String[] phones) throws Exception;
    
    /**
     * 借款审核通过模板
     * @param money:钱
     * @return
     */
    public abstract String windControlPassMsg(String money,String[] phones) throws Exception;
    
    /**
     * 借款审核拒绝模板
     * @return
     */
    public abstract String windControlRefuseMsg(String[] phones) throws Exception;
    
    /**
     * 借款审核回退模板
     * @return
     */
    public abstract String windControlBackMsg(String[] phones) throws Exception;
    
    /**
     * 平台放款通知模板
     * @param dateStr: eg:2016年5月28日
     * @return
     */
    public abstract String platformGiveMoneyMsg(String dateStr,String[] phones) throws Exception;
    
    /**
     * 平台放款祝福语模板
     * @return
     */
    public abstract String platformGiveWishesMsg(String[] phones) throws Exception;
    
    /**
     * 用户还款提示模板
     * @param money
     * @return
     */
    public abstract String userReturnMoneyNoticeMsg(String dateStr,String money,String[] phones) throws Exception;
    
    /**
     * 用户还款成功提示模板
     * @param money
     * @return
     */
    public abstract String userReturnMoneySuccessMsg(String money,String[] phones) throws Exception;
    
    /**
     * 用户还款失败提示模板
     * @return
     */
    public abstract String userReturnMoneyFailMsg(String money,String[] phones) throws Exception;
   
    /**
     * DB用户通知短信
     * @return
     */
    public abstract String bdUserNoticeMsg(String[] phones,String faceName,String money,String limitMoney) throws Exception;
    
    /**
     * 门店授信完成
     * @return
     */
    public abstract String faceRiskNoticeMsg(String[] phones,String faceName,String faceNo,String faceAmount) throws Exception; 
    
    /**
     * 商户风控审核拒绝
     * @return
     */
    public abstract String shopRefuseNoticeMsg(String[] phones,String shopName,String shopNo) throws Exception; 
    
    /**
     * 日均警戒值
     */
    public abstract String faceDayNoticeMsg(String[] phones,String faceName,String dangerAmount,String tag) throws Exception;

    /**
     * 月均警戒值
     */
    public abstract String faceMonthNoticeMsg(String[] phones,String faceName,String dangerAmount,String tag) throws Exception;

    /**
     *门店授信额 
     */
    public abstract String faceAmountNoticeMsg(String[] phones,String faceName,String tag) throws Exception;
    
    /**
     * 用户还清所有款项短信
     * @return
     */
    public abstract String userReturnAllMoney(String[] phones) throws Exception;
    
    
    /**
     * 用户逾期提示模板 1
     * @return
     */
    public abstract String userOverdueOneMoneyMsg(String[] phones) throws Exception;
    
    
    /**
     * 用户逾期提示模板 2
     * @return
     */
    public abstract String userOverdueTwoMoneyMsg(String[] phones) throws Exception;
    
    
    /**
     * 用户逾期提示模板 15
     * @return
     */
    public abstract String userOverdueFiftheenMoneyMsg(String[] phones) throws Exception;
    
    
    /**
     * 用户逾期提示模板 30
     * @return
     */
    public abstract String userOverdueThirtyMoneyMsg(String[] phones) throws Exception;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * 简单注册验证码模板
     * @param code
     * @return
     */
    public abstract String getRegistCodeMsg(String code,String[] phones) throws Exception;
    
    /**
     * 简单验证码模板.
     * @param code
     * @return
     */
    public abstract String getSimpleCodeMsg(String code,String[] phones) throws Exception;
    
    /**
     * 简单验证码模板(10分钟有效).
     * @param code
     * @return
     */
    public abstract String getTenCodeMsg(String code,String[] phones) throws Exception;
    
    /**
     * 注册通知模板.
     * 
     * @param group
     * @param phone
     * @return
     */
    public abstract String getRegistNoticeMsg(String group,String companyPhone,String[] phones) throws Exception;
    
    /**
     * 密码验证码模板.
     * 
     * @param pass
     * @param phone
     * @return
     */
    public abstract String getPassNoticeCodeMsg(String pass,String companyPhone, String[] phones) throws Exception;
    
    /**
     * 订单验证码模板.
     * 
     * @param orderId
     * @param code
     * @return
     */
    public abstract String getOrderNoticeCodeMsg(String orderId, String code,String[] phones) throws Exception;
    
    /**
     * 订单信息验证码模板.
     * 
     * @param orderId
     * @param code
     * @return
     */
    public abstract String getOrderInfoNoticeCodeMsg(String orderId, String code,String[] phones) throws Exception;
    
    /**
     * 充值10000模板.
     * 
     * @param name
     * @param phones
     * @return
     */
    public abstract String getRechargeMsg(String name,String[] phones) throws Exception;

    /**
     * 短信结果.
     * @param result
     * @return
     * @throws UnsupportedEncodingException
     */
    public abstract String getMessageResult(String result) throws Exception;

    /**
     * 余额结果
     * @param result
     * @return
     * @throws UnsupportedEncodingException
     */
    public abstract String getBalanceResult(String result) throws Exception;

    /**
     * 发送短信验证码
     * @param token
     * @param token
     * @return phones
     * @throws Exception
     */
    public abstract  String getTokenMsg(String token,String[] phones) throws Exception;

    /**
     * 回退超过36小时提醒取消订单
     * @param phones
     * @return
     * @throws Exception
     */
    public abstract String orderReturn36HoursMsg(String[] phones,String money) throws Exception;

    /**
     * 还清短信提醒
     * @param money
     * @param phones
     * @return
     * @throws Exception
     */
    public abstract String getPayDueMsg(String money,String[] phones) throws Exception;


    /**
     * 取消订单
     * @param phones
     * @return
     * @throws Exception
     */
    public abstract String orderCancelMsg(String[] phones) throws Exception;


    /**
     * 确认要款
     * @param phones
     * @return
     * @throws Exception
     */
    public abstract String confirmLoan(String[] phones) throws Exception;
}
