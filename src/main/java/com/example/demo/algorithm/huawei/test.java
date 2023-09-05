package com.example.demo.algorithm.huawei;

import java.util.*;




import java.util.Scanner;

public class test {







    public static void main(String[] args) {


        LinkedList<Integer> path = new LinkedList<>();
        path.add(1);
        path.add(2);
        path.add(3);

        int tmp = 0;


        for (int j = 0; j < path.size(); j++) {
            tmp+= path.get(j);
            tmp*=10;

        }
        tmp/=10;
        tmp -= 1;

        System.out.println(tmp);





    }
}