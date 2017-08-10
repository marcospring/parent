package com.csyy.message;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csyy.httpclient.HttpHelper;
import com.csyy.httpclient.ResponseContent;
import com.csyy.message.config.MessageConfig;
import com.csyy.message.constant.Constant;
import com.csyy.message.template.MessageTemplate;
import com.csyy.message.user.BaseMessage;
import com.csyy.message.util.MessageUtil;


/**
 * 消费金融短信提示
 * @author rocky
 * @date 2016-05-17
 */
public class FinanceMessager extends BaseMessage {

    private Logger logger = LoggerFactory.getLogger(FinanceMessager.class);

    private
    MessageTemplate template = new MessageTemplate();
    
    @Override
    public String getAccountBalance() throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(null);
        ResponseContent result = HttpHelper.postUrl(MessageUtil.getMsgVal("balanceUrl",Constant.BALANCE_URL) + config.toCheck());
        return getBalanceResult(result.getContent());
    }

    @Override
    public  String registCodeMsg(String code, String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.registCodeMsg(code));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public   String submitMessageMsg(String money,String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.submitMessageMsg(money));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String windControlPassMsg(String money, String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.windControlPassMsg(money));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String windControlRefuseMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.windControlRefuseMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String windControlBackMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.windControlBackMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String platformGiveMoneyMsg(String dateStr, String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.platformGiveMoneyMsg(dateStr));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String platformGiveWishesMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.platformGiveWishesMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String userReturnMoneyNoticeMsg(String dateStr,String money, String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userReturnMoneyNoticeMsg(dateStr,money));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String userReturnMoneySuccessMsg(String money, String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userReturnMoneySuccessMsg(money));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public  String userReturnMoneyFailMsg(String money,String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userReturnMoneyFailMsg(money));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }


	@Override
	public String bdUserNoticeMsg(String[] phones,String faceName, String money, String limitMoney) throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
		config.setMsg(template.bdUserNoticeMsg(faceName, money, limitMoney));
		 logger.info("短信的内容是："+config.getMsg());
		return sendContent(phones, config);
	}

	@Override
	public String faceRiskNoticeMsg(String[] phones,String faceName, String faceNo, String faceAmount) throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
		config.setMsg(template.faceRiskNoticeMsg(faceName, faceNo, faceAmount));
		 logger.info("短信的内容是："+config.getMsg());
		return sendContent(phones, config);
	}

	@Override
	public String shopRefuseNoticeMsg(String[] phones,String shopName, String shopNo) throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
		config.setMsg(template.shopRefuseNoticeMsg(shopName, shopNo));
		 logger.info("短信的内容是："+config.getMsg());
		return sendContent(phones, config);
	}
	
	@Override
	public String userReturnAllMoney(String[] phones) throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
		config.setMsg(template.userReturnAllMoney());
		 logger.info("短信的内容是："+config.getMsg());
		return sendContent(phones, config);
	}

    @Override
    public String userOverdueOneMoneyMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userOverdueOneMoneyMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String userOverdueTwoMoneyMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userOverdueTwoMoneyMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String userOverdueFiftheenMoneyMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userOverdueFiftheenMoneyMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String userOverdueThirtyMoneyMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.userOverdueThirtyMoneyMsg());
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }
    
    
    @Override
    public String getRechargeMsg(String name,  String[] phones) throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getRechargeMsg(name));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

 
    @Override
    public String getRegistCodeMsg(String code,  String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getRegistCodeMsg(code));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getSimpleCodeMsg(String code,  String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getSimpleCodeMsg(code));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getTenCodeMsg(String code,  String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getTenCodeMsg(code));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getRegistNoticeMsg(String group,String companyPhone, String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getRegistNoticeMsg(group, companyPhone));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getPassNoticeCodeMsg(String pass,String companyPhone,  String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getPassNoticeCodeMsg(pass, companyPhone));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getOrderNoticeCodeMsg(String orderId, String code,  String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getOrderNoticeCodeMsg(orderId, code));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getOrderInfoNoticeCodeMsg(String orderId, String code,  String[] phones)
            throws UnsupportedEncodingException {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getOrderInfoNoticeCodeMsg(orderId, code));
        logger.info("短信的内容是："+config.getMsg());
        return sendContent(phones, config);
    }

    @Override
    public String getMessageResult(String result) throws UnsupportedEncodingException {
        String temp[] = result.split("\n");
        String[] resust = temp[0].split(",");
        String status = resust[1];
        return MessageUtil.getMsgVal(status);
    }

    @Override
    public String getBalanceResult(String result) throws UnsupportedEncodingException {
        logger.info("得到的余额返回信息是:"+result);
        String temp[] = result.split("\n");
        String[] resust = temp[0].split(",");
        String status = resust[1];
        if (status.equals("0")) {
            String[] balances = temp[1].split(",");
            String balance = balances[1];
            return balance;
        }else {
            return MessageUtil.getMsgVal(status);
        }
    }
    
    /**
     * 发送和处理信息.
     * @param phones
     * @param config
     * @return
     * @throws UnsupportedEncodingException
     */
    private  String sendContent(String[] phones, MessageConfig config) throws UnsupportedEncodingException {
        ResponseContent result = null;
        try {
            logger.info("messageUrl="+MessageUtil.getMsgVal("messageUrl",Constant.MESSAGE_URL)+"短信发送串是:"+config.toSendMsg());
            result = HttpHelper.postUrl(MessageUtil.getMsgVal("messageUrl",Constant.MESSAGE_URL)+ config.toSendMsg());
        }catch (Exception e){
            logger.error("调用示远短信出错了"+e);
            return  null;
        }
        logger.info("短信的类容是:"+config.getMsg()+"短信返回的结果是:"+result.getContent());
        return getMessageResult(result.getContent());
    }

	@Override
	public String faceDayNoticeMsg(String[] phones, String faceName, String dangerAmount, String tag) throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.faceDayNoticeMsg(faceName, dangerAmount, tag));
        return sendContent(phones, config);
	}

	@Override
	public String faceMonthNoticeMsg(String[] phones, String faceName, String dangerAmount, String tag)
			throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.faceMonthNoticeMsg(faceName, dangerAmount, tag));
        return sendContent(phones, config);
	}

	@Override
	public String faceAmountNoticeMsg(String[] phones, String faceName, String tag) throws Exception {
		MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.faceAmountNoticeMsg(faceName, tag));
        return sendContent(phones, config);
	}

    @Override
    public String getTokenMsg(String token,String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getTokenMsg(token));
        return sendContent(phones, config);
    }

    @Override
    public String orderReturn36HoursMsg(String[] phones,String money) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.orderReturn36HoursMsg(money));
        return sendContent(phones, config);
    }

    @Override
    public String getPayDueMsg(String money, String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.getPayDueMsg(money));
        return sendContent(phones, config);
    }

    @Override
    public String orderCancelMsg(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.orderCancelMsg());
        return sendContent(phones, config);
    }

    @Override
    public String confirmLoan(String[] phones) throws Exception {
        MessageConfig config = new MessageConfig().initConfig(phones);
        config.setMsg(template.confirmLoan());
        return sendContent(phones, config);
    }
}
