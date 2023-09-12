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

//        System.out.println(HttpRequest.httpPostJson();
        A a = new A("123",123);

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a","aaa");
        hashMap.put("b","bbb");


        System.out.println(JSON.toJSON(hashMap));
        System.out.println(JSON.toJSON(a));


        String jsonStr1 = "{'a':'123456','i':'123'}";
        // 调用parseObject()
        A aa = JSON.parseObject(jsonStr1, A.class);
        System.out.println("json字符串转简单java对象:"+aa.toString());

    }

}
