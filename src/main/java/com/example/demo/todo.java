package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.util.http.HttpRequest;

import java.util.HashMap;

public class todo {
	// TODO: 2023/4/19  mybatisplus的乐观锁和逻辑删除组件 config中的两个文件 数据库索引

	// TODO: 2023/5/1 加密解密原理  时序图


	// TODO: 2023/4/21 前端跨域 
	
	// TODO: 2023/4/21 异步请求和同步请求返回的不同


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
