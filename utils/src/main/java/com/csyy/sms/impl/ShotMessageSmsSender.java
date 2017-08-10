package com.csyy.sms.impl;

import com.csyy.common.JSONUtils;
import com.csyy.sms.api.Message;
import com.csyy.sms.api.MessageBuilder;
import com.csyy.sms.api.TemplateSMSSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangkui on 2016/12/7.
 */
public class ShotMessageSmsSender implements TemplateSMSSender {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private MessageBuilder messageBuilder;
    /**
     * 模板路径
     */
    private String templateUrl;

    private Map<String, Object> providerConfig;
    /**
     * 发送短信Url
     */
    private String sendUrl;
    /**
     * 查询余额Url
     */
    private String balanceUrl;

    /**
     * 默认内容参数名称
     */
    private String contentParamName;
    /**
     * 默认电话参数名称
     */
    private String phoneParamName;
    /**
     * 请求工具
     */
    private RestTemplate request;

    private final static String ENCODING = "UTF-8";


    @Override
    public void contentParamName(String contentParamName) {
        if (StringUtils.isEmpty(contentParamName))
            this.contentParamName = "msg";

    }

    @Override
    public void phoneParamName(String phoneParamName) {
        if (StringUtils.isEmpty(phoneParamName))
            this.phoneParamName = "mobile";
    }

    @Override
    public void providerConfig(Map<String, Object> param) {
        this.providerConfig = param;
        logger.debug("运营商请求参数包含:{}", JSONUtils.toJson(param));
    }

    @Override
    public void send(String content, String... telephone) {
        phoneParamName(null);
        contentParamName(null);
        MultiValueMap<String, Object> requestParam = new LinkedMultiValueMap<>();
        content = getUTF8(content);
        String phoneNumbers = buildPhoneNumbers(telephone);
        requestParam.setAll(providerConfig);
        requestParam.add(phoneParamName, phoneNumbers);
        requestParam.add(contentParamName, content);
        String result = request.postForObject(getSendUrl(), requestParam, String.class);
        logger.info("[短信发送，url:{},请求参数:{},号码：{}，内容：{},结果：{}]", getSendUrl(), JSONUtils.toJson(requestParam),
                phoneNumbers, content,result);
    }

    @Override
    public void sendUrl(String url) {
        this.sendUrl = url;
    }

    @Override
    public void balanceUrl(String url) {
        this.balanceUrl = url;
    }

    @Override
    public void sendTemplateMessage(String messageNo, List<String> param, String... telephoneNo) {
        messageBuilder(null);
        Message message = messageBuilder.buildMessage(messageNo);
        message.setParam(param);
        String content = message.getMessage();
        send(content, telephoneNo);
    }

    @Override
    public void messageBuilder(MessageBuilder builder) {
        if (messageBuilder == null) {
            messageBuilder = new XMLMessageBuilder();
            messageBuilder.readTemplate(templateUrl);
        }

    }

    @Override
    public String getBalance() {
        throw new RuntimeException("unsupported");
    }

    private String buildPhoneNumbers(String[] telephone) {
        StringBuilder builder = new StringBuilder();
        for (String s : telephone) {
            builder.append(s);
            if (!s.equals(telephone[telephone.length - 1]))
                builder.append(",");
        }
        return builder.toString();
    }

    //getter and setter
    public MessageBuilder getMessageBuilder() {
        return messageBuilder;
    }

    public void setMessageBuilder(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    public String getContentParamName() {
        return contentParamName;
    }

    public void setContentParamName(String contentParamName) {
        this.contentParamName = contentParamName;
    }

    public String getPhoneParamName() {
        return phoneParamName;
    }

    public void setPhoneParamName(String phoneParamName) {
        this.phoneParamName = phoneParamName;
    }

    public Map<String, Object> getProviderConfig() {
        return providerConfig;
    }

    public void setProviderConfig(Map<String, Object> providerConfig) {
        this.providerConfig = providerConfig;
    }

    public RestTemplate getRequest() {
        return request;
    }

    public void setRequest(RestTemplate request) {
        this.request = request;
    }

    public String getSendUrl() {
        return sendUrl;
    }

    public void setSendUrl(String sendUrl) {
        this.sendUrl = sendUrl;
    }

    public String getBalanceUrl() {
        return balanceUrl;
    }

    public void setBalanceUrl(String balanceUrl) {
        this.balanceUrl = balanceUrl;
    }


    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * 构造UTF8字符串
     *
     * @param content
     * @return
     */
    private String getUTF8(String content) {
        try {
            content = new String(content.getBytes(), ENCODING);
        } catch (UnsupportedEncodingException e) {
            try {
                content = URLEncoder.encode(content, ENCODING);
            } catch (UnsupportedEncodingException e1) {
            }
        }
        return content;
    }
}
