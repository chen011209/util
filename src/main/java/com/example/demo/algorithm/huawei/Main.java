package com.example.demo.algorithm.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {

    static  void re(HashMap<String,ArrayList<String>> hashMap,ArrayList arrayList,String s){
        ArrayList<String> arrayList1 = hashMap.get(s);

        boolean mark = true;
        for (int i = 0; i < arrayList1.size(); i++) {
            if(arrayList.contains(arrayList1.get(i))){
                mark =false;
                break;
            }
        }

        if(mark)
            return;

        for (int i = 0; i < arrayList1.size(); i++) {
            arrayList.remove(arrayList1.get(i));
            re(hashMap,arrayList,arrayList1.get(i));
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String a = in.next();
        String b = in.next();

        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();

        String[] strings = a.split(",");


        String tmp1,tmp2;
        String[] tmp;
        ArrayList<String> arrayList;
        ArrayList<String> order = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            tmp = strings[i].split("-");
            tmp1 = tmp[0];
            tmp2 = tmp[1];


            if(!order.contains(tmp1)){
                order.add(tmp1);
            }

            if(!order.contains(tmp2)){
                order.add(tmp2);
            }


            if(hashMap.get(tmp2) !=null){
                hashMap.get(tmp2).add(tmp1);
            }else {
                arrayList = new ArrayList<>();
                arrayList.add(tmp1);
                hashMap.put(tmp2,arrayList);
            }

            if(hashMap.get(tmp1)==null){
                hashMap.put(tmp1,new ArrayList<>());
            }
        }

        String[] bad = b.split(",");

        System.out.println(hashMap);

        for (int i = 0; i < bad.length; i++) {
            order.remove(bad[i]);

            re(hashMap,order,bad[i]);


        }



        StringBuilder stringBuilder = new StringBuilder();
        if(order.size() == 0){
            System.out.println(",");
            return;
        }else{
            for (int i = 0; i < order.size(); i++) {
                stringBuilder.append(order.get(i)+",");
            }
        }

        System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));








        //        a1-a2,a5-a6,a2-a3
//        a5,a2





    }
}