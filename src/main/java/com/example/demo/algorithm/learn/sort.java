package com.example.demo.algorithm.learn;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        /**
         *
         * Arrays.sort中元素用封装类
         * 数组使用Arrays.sort排序  集合使用Collections排序
         * 排序hashMap可以先转为数组 数组再使用Arrays.sort排序
         *
         */


        //排序不会改变相同元素原先的先后顺序 即稳定性  猜的



//        sort()是根据需要排序的数组的长度进行区分的:
//
//        首先先判断需要排序的数据量是否大于60。
//        小于60：使用插入排序，插入排序是稳定的
//        大于60的数据量会根据数据类型选择排序方式：
//        基本类型：使用快速排序。「因为基本类型不需要考虑稳定性」
//        Object类型：使用归并排序「因为归并排序具有稳定性」
//
//        注意：不管是快速排序还是归并排序。在二分的时候小于60的数据量依旧会使用插入排序
//
//        sort()对Obejct类型的排序是稳定的
//
//        因此对于有序集合如List，排序后的结果是稳定的。
//
//        但对于HashMap之类的无序集合来说，排序结果是不稳定的。
//        因此，如果想稳定排序，要使用LinkedHashMap




//        总之 基本数据类型是不稳定的 但是没什么区别 用object是稳定的

//        Arrays.sort(T[],Comparator<? super T> c)
//        内部采用的归并排序，因此是稳定的。
//
//        Arrays.sort(int[] a)
//        内部采用的快速排序，因此是不稳定的。
//
//        Collections.sort(List<T> list)、和Collections.sort(List<T> list，Comparator<？super T> c);



        HashMap<Integer,Integer> hashMap = new HashMap();
        Object[] objects = hashMap.keySet().toArray();
        Arrays.sort(objects);

        for (int i = 0; i < objects.length; i++) {
            Integer integer = (Integer) objects[i];
        }

        Integer[] integers = new Integer[20];
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });



//        用于求数组最大值
        ArrayList arrayList1 = new ArrayList();
        Collections.max(arrayList1);
    }
}
