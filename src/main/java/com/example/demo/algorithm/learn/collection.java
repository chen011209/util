package com.example.demo.algorithm.learn;

import java.util.*;

public class collection {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        Stack<Integer> stack1 = (Stack<Integer>) stack.clone();

        stack.pop();

        System.out.println(stack.size());
        System.out.println(stack1.size());

//        使用clone函数复制另一个栈


        //定义队列
        Queue<Integer> queue = new LinkedList();


        //定义栈
        Stack<Integer> stack2 = new Stack<>();



        //定义优先队列
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(1);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());



        //可以直接复制数组
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> tmp2 = new ArrayList<>(tmp);
    }
}
