package com.example.demo;


import com.example.demo.util.code.jsonUtil.A;
import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class test extends Object{




    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }




    public static void main(String[] args) {
// 使用线程安全的 CopyOnWriteArrayList 避免 ConcurrentModificationException
        List<Integer> list = new ArrayList<>();

// 添加元素
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        Thread t1 = new Thread(() -> {
            // 迭代元素 (注意：Integer 是不可变的，这里的 i++ 不会修改 list 中的值)
            for (Integer i : list) {
                i++; // 这行代码实际上没有修改list中的元素
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("删除元素1");
            list.remove(Integer.valueOf(1)); // 使用 Integer.valueOf(1) 删除指定值的对象
        });

        t1.start();
        t2.start();

        HashSet<Integer> hashSet = new HashSet<>();

    }
}