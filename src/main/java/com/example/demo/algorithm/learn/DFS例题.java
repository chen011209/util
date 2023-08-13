package com.example.demo.algorithm.learn;

import java.util.Scanner;
import java.util.Stack;


public class DFS例题 {
    public static int n,m;
    public static int[][] nums ;
    public static Stack<String> s= new Stack<>();

    public static boolean DFS(int i,int j){
        nums[i][j] = 1;

        if(i==n-1&&j==m-1){
            return true;

        }




        if(j-1>=0&&nums[i][j-1]==0&&DFS(i,j-1)){
            int tmp = j-1;
            s.push("("+i+","+tmp+")");
            return true;
        }

        if(i-1>=0&&nums[i-1][j]==0&&DFS(i-1,j)){
            int tmp = i-1;
            s.push("("+tmp+","+j+")");
            return true;
        }

        if(i+1<n&&nums[i+1][j]==0&&DFS(i+1,j)){
            int tmp = i+1;
            s.push("("+tmp+","+j+")");
            return true;
        }

        if(j+1<m&&nums[i][j+1]==0&&DFS(i,j+1)){
            int tmp = j+1;

            s.push("("+i+","+tmp+")");
            return true;
        }


        nums[i][j] =  0;
        return false;

    }

    //走迷宫

    /**
     * 5 5
     * 0 1 0 0 0
     * 0 1 1 1 0
     * 0 0 0 0 0
     * 0 1 1 1 0
     * 0 0 0 1 0
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        n=scanner.nextInt();
        m=scanner.nextInt();

        nums =  new int[n][m];

        nums[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                nums[i][j] = scanner.nextInt();
            }
        }





        DFS(0,0);

        s.push("(0,0)");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
