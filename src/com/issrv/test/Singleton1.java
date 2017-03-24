package com.issrv.test;


public class Singleton1 {
    
    
    public void sendMail(final String to, final String content){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("收件人:").append(to).append(",邮件内容：").append(content);
        System.out.println(stringBuilder.toString());
        System.out.println("发送邮件结束");
    }
}
