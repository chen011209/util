package com.example.demo.algorithm.learn;

public class string {





    public static void main(String[] args) {

        //比较字符串
        if('1'=='2'){

        }

        //判断字符串是否存在
        System.out.println("123".contains("12"));

        //这样子统一成小写比较好算
        String s = "abcdABCD";
        s.toLowerCase();


        //用这个判断是否是字母
        Character.isLetter('a');



        //compareTo 只要第一位大就大 不能用于比较数字大小
        System.out.println("3".compareTo("200000000"));




        //字符串替换
        String s1 = null;
        s1.replace(" ","123");


        //trim可以删除空格
        s1.trim();


        //. 、 $、 | 和 * 等转义字符，必须得加 \\
        s1.split("123");



        //使用join 将字符串数组连接起来
        String[] strings = new String[3];
        strings[0] = "123";
        strings[1] = "456";
        strings[2] = "789";
        System.out.println(String.join(".",strings));

    }
}
