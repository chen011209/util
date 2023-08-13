package com.example.demo.algorithm.learn;

public class binary {
    public static void main(String[] args) {


        //将数字转为二进制 输出
        //直接得到二进制需要不断除于2 得到余数
        System.out.println(Integer.toBinaryString(80));


        System.out.println(Integer.toHexString(80));

        System.out.println(Integer.toOctalString(80));

        //将二进制转为十进制
        System.out.println(Integer.parseInt("1100",2));
    }
}
