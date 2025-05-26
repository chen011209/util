package com.example.demo;


import java.util.Base64;

public class todo {

    // TODO: 2023/11/10 idea的learning Project
    // TODO: 2023/11/23 分布式的锁
    // TODO: 2023/11/23 rabbitMq队列何时创建 生产者 消费者？ 回调创建队列？
    // TODO: 2023/11/23 idea查看类继承 实现
    // TODO: 2023/11/23 idea查看重写类的方法被调用的时间


    public static String hexToBase64(String hex) {
        // 将十六进制字符串转换为字节数组
        byte[] bytes = hexToByteArray(hex);
        // 使用 Base64 进行编码
        return Base64.getEncoder().encodeToString(bytes);
    }

    private static byte[] hexToByteArray(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            // 将每两个十六进制字符转换为一个字节，使用乘法替代左移
            int highNibble = Character.digit(hex.charAt(i), 16) * 16;
            int lowNibble = Character.digit(hex.charAt(i + 1), 16);
            data[i / 2] = (byte) (highNibble + lowNibble);
        }
        return data;
    }

    public static void main(String[] args) {
        String hex = "27d48c32a26f1ac6dc56000f7626a7a5";
        String base64 = hexToBase64(hex);
        System.out.println("十六进制字符串: " + hex);
        System.out.println("Base64 编码结果: " + base64);
    }






}
