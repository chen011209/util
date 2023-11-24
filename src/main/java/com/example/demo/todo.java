package com.example.demo;

import com.example.demo.util.code.http.HttpRequest;

import java.util.HashMap;

public class todo {

    // TODO: 2023/11/10 idea的learning Project
    // TODO: 2023/11/23 分布式的锁
    // TODO: 2023/11/23 rabbitMq队列何时创建 生产者 消费者？ 回调创建队列？
    // TODO: 2023/11/23 idea查看类继承 实现
    // TODO: 2023/11/23 idea查看重写类的方法被调用的时间


    public static void main(String[] args) throws Exception {


        HttpRequest httpRequest = new HttpRequest();

        HashMap<String,String> appTokenMap = new HashMap<>();
        appTokenMap.put("appId","CYC_TEST");
        appTokenMap.put("appSecret","cyc_TEST_123456_@");
        appTokenMap.put("tenantid","xindeco");
        appTokenMap.put("accountId","1454388596386563072");
        appTokenMap.put("language","zh_CN");

        String appTokenData = httpRequest.httpPostJson("http://localhost:8080/ierp/api/getAppToken.do", appTokenMap);

        int i = appTokenData.indexOf("app_token");
        String app_token = appTokenData.substring(i+12,i+48);

        HashMap<String,String> accessTokenMap = new HashMap<>();
        accessTokenMap.put("user","15060354899");
        accessTokenMap.put("apptoken",app_token);
        accessTokenMap.put("tenantid","xindeco");
        accessTokenMap.put("accountId","1454388596386563072");
        accessTokenMap.put("usertype","Mobile");
        accessTokenMap.put("language","zh_CN");



        String accessTokenData = httpRequest.httpPostJson("http://localhost:8080/ierp/api/login.do", accessTokenMap);


        int j = accessTokenData.indexOf("access_token");

        System.out.println(accessTokenData.substring(j+15,j+135));


    }

}
