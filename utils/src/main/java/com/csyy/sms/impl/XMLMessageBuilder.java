package com.csyy.sms.impl;

import com.csyy.sms.api.Message;
import com.csyy.sms.api.MessageBuilder;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangkui on 2016/12/7.
 */
public class XMLMessageBuilder implements MessageBuilder {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private final String ELEMENT_NAME = "sms";
    private final String ATTRIBUTE_CODE = "code";
    private final String ATTRIBUTE_TEMPLATE = "template";
    private String path;
    private Map<String, MessageTemplate> context = new HashMap<>();



    @Override
    public void readTemplate(String path) {

        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
        SAXReader reader = new SAXReader();
        Document document;
        try {
            document = reader.read(in);
            readXML(document);
        } catch (DocumentException e) {
            logger.info("解析xml File出错！", e);
        }
    }

    @Override
    public Message buildMessage(String messageNo, List<String> param) {
        Message message = buildMessage(messageNo);
        message.setParam(param);
        return message;
    }

    @Override
    public Message buildMessage(String messageNo) {
        MessageTemplate template = context.get(messageNo);
        Message message = new ShotMessage();
        message.setTemplate(template.getTemplate());
        return message;
    }

    private void readXML(Document document) {
        Element root = document.getRootElement();
        for (Element sms : (List<Element>) root.elements(ELEMENT_NAME)) {
            String code = sms.attribute(ATTRIBUTE_CODE).getText();
            String template = sms.attribute(ATTRIBUTE_TEMPLATE).getText();
            logger.info("[code:{},message:{}]", code, template);
            MessageTemplate info = new MessageTemplate(code, template);
            context.put(code, info);
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public static void main(String[] args) {
        String a = "您在麦芽{0}元的分期账单已全部还清，结清日期为{1}。登录麦芽分期查看更多详情。";
        System.out.println(MessageFormat.format(a,200,"2012-03-03"));

    }
}