package com.issrv.test;

public class MitiSay extends Thread {

    public MitiSay(String threadName) {
        super(threadName);
    }
    
    public void run() {
        System.out.println(getName() + " 线程运行开始!");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            //Singleton1 s = new Singleton1();
            //s.sendMail("jiaowenzhe6@163.com", "卧榻之侧，岂能容他人酣睡！");
            Singleton.getInstance().sendMail("jiaowenzhe6@163.com", "卧榻之侧，岂能容他人酣睡！");
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " 线程运行结束!");
    }
    
    public static long getMemory() {
        return Runtime.getRuntime().freeMemory();
    }
}
