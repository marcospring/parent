package com.csyy.message.test;

import com.csyy.message.FinanceMessager;

public class MsgSender {
    
    public static void main(String[] args) throws Exception {
        
        FinanceMessager messager = new FinanceMessager();
        
        String[] phones = new String[]{"15764229720"};
        
        messager.getRegistCodeMsg("1235", phones);
        
    }
    
}
