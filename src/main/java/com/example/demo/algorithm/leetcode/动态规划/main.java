package com.example.demo.algorithm.leetcode.动态规划;

/**
 * 动态规划需要从后往前走
 * 从后往前想
 *
 * dp(i,j) = dp(i-1,j) || dp(i,j-1)
 * 动态规划中用或可以找出多种路径下的可能
 *
 * 递推式 边界条件
 *
 * 递归先保存每个状态的可能性 需要在函数参数上加上需要保存的
 *
 * 动态规划列举所有情况 取最大值 即为路径
 */
public class main {
}
