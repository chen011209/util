package com.example.demo.algorithm.learn;
import java.util.*;
import java.util.Queue;


// DFS使用递归使用  BFS使用队列实现
//可以添加一个数组保存 是否已经走过

//假设当前位置能走 标记为1 如果不能走 再设为0
public class DFSBFS {


    static class A{
        public A left;
        public A right;
        public int value;
    }


    public static void DFS(A tmp){
        System.out.println(tmp.value);

        if(tmp.left!=null){
            DFS(tmp.left);
        }

        if(tmp.right!=null){
            DFS(tmp.right);
        }
    }


    public static void main(String[] args) {

        A a = new A();
        a.value =0;

        A a1 = new A();
        a1.value = 1;

        A a2 = new A();
        a2.value =2;

        A a3 = new A();
        a3.value =3;

        A a4 = new A();
        a4.value =4;

        a.left = a1;
        a.right=a2;

        a1.right = a3;
        a1.left = null;

        a2.left = null;
        a2.right = null;

        a3.left = null;
        a3.right = a4;

        System.out.println("DFS");
        DFS(a);






        System.out.println("BFS");
        Queue<A> queue = new LinkedList<>();

        queue.add(a);

        while(!queue.isEmpty()){
            A tmp = queue.remove();
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
            System.out.println(tmp.value);
        }



    }
}