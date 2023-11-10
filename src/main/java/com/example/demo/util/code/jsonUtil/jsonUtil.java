package com.example.demo.util.code.jsonUtil;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class jsonUtil {

    public static void main(String[] args) {
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
