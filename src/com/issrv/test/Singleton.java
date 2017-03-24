package com.issrv.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {
    
    //在自己内部定义自己的一个实例，只供内部调用
    private static final Singleton instance = new Singleton();
    private final ExecutorService executorService;
    
    private Singleton() {
        this.executorService = Executors.newFixedThreadPool(5);
    }
    
    //这里提供了一个供外部访问本class的静态方法，可以直接访问
    public static Singleton getInstance(){
        return instance;
    }
    
    public void sendMail(final String to, final String content){
        this.executorService.execute(new Runnable() {
            
            @Override
            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("收件人:").append(to).append(",邮件内容：").append(content);
                System.out.println(stringBuilder.toString());
            }
        });
    }
}
