package com.csyy.message.template;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.csyy.common.StringDefaultValue;

/**
 * 消息通知短信模板编写.
 *
 * @author rocky
 * @date 20165-05-16
 */
public class MessageTemplate {

    private final static String encodeing = "UTF-8";

    /**
     * 注册验证码模板
     * @param code
     * @return
     */
    public String registCodeMsg(String code){
        String result = new StringBuffer("您的验证码为:"+code+"，为保证账号安全，其勿泄露，如非本人操作，请忽略。").toString();
        return getUTF8(result);
    }

    /**
     * 提交申请
     * @param money
     * @return
     */
    public String submitMessageMsg(String money){
        //String result = new StringBuffer("您已成功提交申请，申请金额:"+money+"元，请等待5-10分钟查看结果。如有疑问请咨询麦芽分期微信公众账号。").toString();
        //2016-07-28
        //String result = new StringBuffer("您的分期申请已经提交啦~您本次申请的金额为"+money+"元，请等待5-10分钟查看结果。如有疑问，您可在麦芽分期微信公众号(微信号：maiyafenqi)进行咨询哦~").toString();
        String result = new StringBuffer("您的分期申请已经提交啦~您本次申请的金额为"+money+"元，请等待5-10分钟查看结果哦。").toString();
        return getUTF8(result);
    }

    /**
     * 审核通过
     * @param money
     * @return
     */
    public String windControlPassMsg(String money){
        //String result = new StringBuffer("您的分期消费已审批通过，通过金额:"+money+"元。请进入麦芽分期公众号(微信号:maiyafenqi)确认订单，获取放款。如有问题可拨打客服热线 400-064-6668。").toString();
        //2016-07-28
        //String result = new StringBuffer("恭喜您！您申请的"+money+"元分期消费审批通过啦~现在登录麦芽分期公众号(微信号:maiyafenqi)查看您的还款计划吧！如有问题可拨打客服热线1010-0668。").toString();
        String result = new StringBuffer("恭喜您，确认要款"+money+"元成功啦~现在可登录麦芽分期查看哦，如有疑问，可联系在线客服或拨打客服热线1010-0668。").toString();
        return getUTF8(result);
    }

    /**
     * 审核拒绝
     * @return
     */
    public String windControlRefuseMsg(){
        //String result = new StringBuffer("很遗憾，您的分期消费未审批通过。非常感谢您的支持，您可进入麦芽分期公众号(微信号:maiyafenqi)查看其他优惠服务。").toString();
        //2016-07-28
        //String result = new StringBuffer("很遗憾，您本次的分期申请暂时未通过审批，您可于25天后重新提交申请。非常感谢您的支持，您可以在麦芽分期公众号(微信号:maiyafenqi)中试试其他优惠服务哦！").toString();
        String result = new StringBuffer("很遗憾，您本次的分期消费申请暂时未通过审批，您可于25天后重新提交申请。感谢您的支持。").toString();
        return getUTF8(result);
    }

    /**
     * 审核回退
     * @return
     */
    public String windControlBackMsg(){
        //String result = new StringBuffer("您的申请正在审核中，个人信息填写有误，请进入麦芽分期公众号(微信号:maiyafenqi)查看。").toString();
        //2016-07-28
        //String result = new StringBuffer("呀！出错了！您的分期申请暂时没有通过审核，请登录麦芽分期公众号(微信号:maiyafenqi)更新个人信息，再次提交后我们将继续为您审核哦！").toString();
        String result = new String("亲爱哒，您的申请正在审核中，当前有回退资料，补充完整清晰的资料可提高您的审核通过率哦~请登录麦芽分期，再次提交后我们将继续为您审核哦！").toString();
        return getUTF8(result);
    }

    /**
     * 平台放款
     * @param dateStr
     * @return
     */
    public String platformGiveMoneyMsg(String dateStr){
        //String result = new StringBuffer("您的消费分期已筹资完毕，且放款成功。请进入麦芽分期公众号(微信号:maiyafenqi)查看。").toString();
        //2016-07-28
        //String result = new StringBuffer("您申请的分期款项已筹资完毕，并成功放款啦。您可进入麦芽分期公众号(微信号:maiyafenqi)快速查看。").toString();
        String result = new StringBuffer("您申请的分期款项已筹资完毕，并成功放款啦。").toString();
        return getUTF8(result);
    }

    /**
     * 平台放款祝福语
     * @param
     * @return
     */
    public String platformGiveWishesMsg(){
        //String result = new StringBuffer("麦芽分期为您提供了一次免费保理服务。选择麦芽，每天都是美美哒。").toString();
        //2016-07-28
        String result = new StringBuffer("麦芽分期为您提供了一次免费保理服务。选择麦芽，每天都是美美哒。").toString();
        return getUTF8(result);
    }

    /**
     * 用户还款
     * @param dateStr 2016年6月8日
     * @param money
     * @return
     */
    public String userReturnMoneyNoticeMsg(String dateStr,String money){
        //String result = new StringBuffer("您"+dateStr+"前记得登录麦芽分期公众号(微信号:maiyafenqi)还款哦，本期要还"+money+"元。").toString();
        //2016-07-28
        String result = new StringBuffer("小麦芽提醒您于"+dateStr+"前到麦芽分期公众号(微信号:maiyafenqi)进行还款，本期应还金额为"+money+"元，逾期将会为您带来不必要的损失哦，如已还款请忽略。").toString();
        return getUTF8(result);
    }

    /**
     * 用户还款成功
     * @param money
     * @return
     */
    public String userReturnMoneySuccessMsg(String money){
        //String result = new StringBuffer("您本期账单已还款成功，本期还款金额"+money+"元。麦芽分期，为更好的自己。").toString();
        //2016-07-28
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String result = new StringBuffer("您"+format.format(new Date())+"成功还款"+money+"元，登录麦芽分期查看更多详情，可有效提升信用额度哦。").toString();
        return getUTF8(result);
    }


    /**
     * 用户还款失败
     * @return
     */
    public String userReturnMoneyFailMsg(String money){
        //String result = new StringBuffer("亲爱的用户，您本期麦芽分期应还款金额"+money+"元，您的还款操作失败，请稍后重试或使用其他银行卡还款！").toString();
        //2016-07-28
        String result = new StringBuffer("很抱歉，您的本次还款操作失败，本期应还金额"+money+"元，请稍后重试或使用其他银行卡还款！如有问题可拨打客服热线1010-0668。").toString();
        return getUTF8(result);
    }


    /**
     * BD通知短信
     * @return
     */
    public String bdUserNoticeMsg(String faceName,String money,String limitMoney){
        String result = new StringBuffer("您负责的门店：["+faceName+"]，当前可用额度为["+money+"]元，低于预警值["+limitMoney+"]元，请及时联系风控部门提额，避免用户不能下单。").toString();
        return getUTF8(result);
    }

    /**
     * 门店授信完成
     * @return
     */
    public String faceRiskNoticeMsg(String faceName,String faceNo,String faceAmount){
        String result = new StringBuffer("门店名称："+faceName+"，门店编码："+faceNo+"，授信已完成，授信额度为："+faceAmount+"，请知晓！").toString();
        return getUTF8(result);
    }

    /**
     * 商户风控审核拒绝
     * @return
     */
    public String shopRefuseNoticeMsg(String shopName,String shopNo){
        String result = new StringBuffer("商户名称："+shopName+"，商户编码："+shopNo+"，基本信息风控审核拒绝，请及时处理！").toString();
        return getUTF8(result);
    }


    /**
     * 通知短信
     * @return
     */
    public String faceDayNoticeMsg(String faceName,String dangerAmount,String tag){
        String result;
        if (StringDefaultValue.isEmpty(tag)) {
            result=new StringBuffer("门店："+faceName+"，今日审批总额已达日警戒值："+dangerAmount+"元的120%，请注意！").toString();
        }else{
            result=new StringBuffer("门店："+faceName+"，今日审批总额已达日警戒值："+dangerAmount+"元的150%，请注意！").toString();
        }
        return getUTF8(result);
    }

    /**
     * 通知短信
     * @return
     */
    public String faceMonthNoticeMsg(String faceName,String dangerAmount,String tag){
        String result;
        if (StringDefaultValue.isEmpty(tag)) {
            result=new StringBuffer("门店："+faceName+"，本月审批总额已达月警戒值："+dangerAmount+"元的120%，请注意！").toString();
        }else{
            result=new StringBuffer("门店："+faceName+"，本月审批总额已达月警戒值："+dangerAmount+"元的150%，请注意！").toString();
        }
        return getUTF8(result);
    }


    /**
     * 通知短信
     * @return
     */
    public String faceAmountNoticeMsg(String faceName,String tag){
        String result;
        if (StringDefaultValue.isEmpty(tag)) {
            result=new StringBuffer("门店："+faceName+"，当前的可用授信额度已不足总授信额度的20%，请注意！").toString();
        }else{
            result=new StringBuffer("门店："+faceName+"，当前的可用授信额度已不足总授信额度的40%，请注意！").toString();
        }
        return getUTF8(result);
    }

    /**
     * 用户还清款项
     * @return
     */
    public String userReturnAllMoney(){
        String result = new StringBuffer("截至目前，您在麦芽分期款项已全部还清。").toString();
        return getUTF8(result);
    }

    /**
     * 用户逾期
     * @return
     */
    public String userOverdueOneMoneyMsg(){
        String result = new StringBuffer("亲爱的用户，您已逾期1天，请今日务必点击“还款”按钮进行还款，减轻逾期带来的不良影响。请进入麦芽分期公众号(微信号:maiyafenqi)查看。").toString();
        return getUTF8(result);
    }

    /**
     * 用户逾期
     * @return
     */
    public String userOverdueTwoMoneyMsg(){
        String result = new StringBuffer("您已逾期2天，速还款。若逾期超30天或失联等，系统会将您的案子移交专催团队，通过法律手段要求一次性全额还款并视情况记入征信系统。请进入麦芽分期公众号(微信号:maiyafenqi)查看。").toString();
        return getUTF8(result);
    }

    /**
     * 用户逾期
     * @return
     */
    public String userOverdueFiftheenMoneyMsg(){
        String result = new StringBuffer("您已逾期15天，速还款。若逾期超30天或失联等，系统会将您的案子移交专催团队，通过法律手段要求一次性全额还款并视情况记入征信系统 。请进入麦芽分期公众号(微信号:maiyafenqi)查看。").toString();
        return getUTF8(result);
    }

    /**
     * 用户逾期
     * @return
     */
    public String userOverdueThirtyMoneyMsg(){
        String result = new StringBuffer("您离逾期30天仅剩3天，即将被系统移交专催团队通过法律手段要求一次性全额还款并视情况记入征信系统。速还款，以避免被移交专催团队。请进入麦芽分期公众号(微信号:maiyafenqi)查看。").toString();
        return getUTF8(result);
    }

    /**
     * 简单注册验证码模板(注册验证).
     * @param code
     * @return
     */
    public String getRegistCodeMsg(String code){
        String result = new StringBuffer("感谢您的注册，验证码:"+code+"，请及时输入").toString();
        return getUTF8(result);
    }

    /**
     * 简单验证码模板.
     * @param code
     * @return
     */
    public String getSimpleCodeMsg(String code){
        String result = "您的验证码是:"+code;
        return getUTF8(result);
    }


    /**
     * 简单验证码模板(10分钟有效).
     * @param code
     * @return
     */
    public String getTenCodeMsg(String code){
        String result = "您好，您的验证码:"+code+"，10分钟内有效";
        return getUTF8(result);
    }


    /**
     * 注册通知模板.
     *
     * @param group
     * @param phone
     * @return
     */
    public String getRegistNoticeMsg(String group, String phone) {
        String result = "感谢您注册" + group + "会员，为了您的安全请及时去更换您的初始密码，如有疑问请联系:" + phone;
        return getUTF8(result);
    }

    /**
     * 密码验证码模板.
     *
     * @param pass
     * @param phone
     * @return
     */
    public String getPassNoticeCodeMsg(String pass, String phone) {
        String result = "您的帐号密码为:" + pass + "，请查收！客服电话:" + phone;
        return getUTF8(result);
    }

    /**
     * 订单验证码模板.
     *
     * @param orderId
     * @param code
     * @return
     */
    public String getOrderNoticeCodeMsg(String orderId, String code) {
        String result = "您此次购买商品的订单号为:" + orderId + "，提货码为:" + code + "，门店提货以此提货码为凭据，请牢记！";
        return getUTF8(result);
    }

    /**
     * 订单信息验证码模板.
     *
     * @param orderId
     * @param code
     * @return
     */
    public String getOrderInfoNoticeCodeMsg(String orderId, String code) {
        String result = "您此次购买商品的订单号为:" + orderId + "，提货码为:" + code + "，门店提货以此提货码为凭据，请牢记！";
        return getUTF8(result);
    }

    /**
     * 充值10000模板.
     *
     * @param name
     * @return
     */
    public String getRechargeMsg(String name) {
        String result = "尊敬的" + name + "，您已成功充值10000元，登录后可在我的账户中查看";
        return getUTF8(result);
    }

    /**
     *f发送短信验证码
     * @param token
     * @return
     */
    public String getTokenMsg(String token){
        StringBuilder result=new StringBuilder();
        result.append("验证码：");
        result.append(token);
        result.append("，请妥善保管您的验证码，切勿泄露给他人。");
        return result.toString();
    }


    /**
     * 用户逾期
     * @return
     */
    public String orderReturn36HoursMsg(String money){
        String result = new StringBuffer("您有一笔审核回退的订单需要再次提交，金额："+money+"元,请在12小时内尽快提交，超时后系统将自动取消该笔订单。").toString();
        return getUTF8(result);
    }

    /**
     * 还清短信提醒
     * @param money
     * @return
     * @throws Exception
     */
    public String getPayDueMsg(String money){
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String result = new StringBuffer("您在麦芽"+money+"元的分期账单已全部还清，结清日期为"+format.format(new Date())+"。登录麦芽分期查看更多详情。").toString();
        return getUTF8(result);
    }

    /**
     * utf8 编码
     * @param content
     * @return
     */
    public String getUTF8(String content) {
        try {
            content = new String(content.getBytes(), encodeing);
        }
        catch (UnsupportedEncodingException e) {
            try {
                content = URLEncoder.encode(content, encodeing);
            }
            catch (UnsupportedEncodingException e1) {
            }
        }
        return content;
    }


    /**
     * 取消订单
     * @return
     */
    public String orderCancelMsg(){
        String result = new StringBuffer("很遗憾，您当前申请的分期消费已经取消，如有疑问，可联系在线客服或拨打客服热线1010-0668。").toString();
        return getUTF8(result);
    }

    /**
     * 确认要款
     * @return
     */
    public String confirmLoan(){
        String result = new StringBuffer("恭喜您，审批已经通过啦！请登录麦芽分期查看审批结果，并在12小时内及时确认订单信息，超时系统将自动取消哦。如有疑问，可联系在线客服或拨打客服热线1010-0668。").toString();
        return getUTF8(result);
    }
}
