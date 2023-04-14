package com.example.demo.leetcode.数组.螺旋矩阵;

class Solution {
    public int[][] generateMatrix(int n) {
        //把握住什么是循环的


        int loop=n/2;
        int [][]num=new int[n][n];
        int loopLen=n-1;


        int x=0,y=0;
        int count=1;

        while (loop>0){



            for (int i = 0; i < loopLen; i++) {
                num[x][y]=count;
                count++;
                y++;
            }
            for (int i = 0; i < loopLen; i++) {
                num[x][y]=count;
                count++;
                x++;
            }
            for (int i = 0; i < loopLen; i++) {
                num[x][y]=count;
                count++;
                y--;
            }
            for (int i = 0; i < loopLen; i++) {
                num[x][y]=count;
                count++;
                x--;
            }

            loopLen-=2;
            loop--;
            x++;
            y++;
        }


        if(n%2==1)
            num[(n-1)/2][(n-1)/2]=count;

        return num;

    }

//    public static void main(String[] args) {
//        int [][]x=new Solution().generateMatrix(3);
//
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[i].length; j++) {
//                System.out.println(x[i][j]);
//            }
//        }
//    }


    /*

    x竖 y横  区分
    1 2 3的x相同
                1 2 3
                4 5 6
                7 8 9*/

}