package com.lzy.javaagent;

public class AgentTest {

    public static void main(String[] args){
        businessMethod("hello");
    }

    public static void businessMethod(String param){
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接收到参数：" + param);
    }
}
