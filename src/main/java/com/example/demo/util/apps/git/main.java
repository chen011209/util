package com.example.demo.util.apps.git;

/**
 * 使用场景：备份 版本回退 协同开发 代码追踪
 *
 * git是分布式的 svn是集中式的 区别在git所有版本在每个电脑里都存在 而svn需要连服务器才能切换版本
 *
 * git结构分为远程仓库 本地仓库 暂存区域 工作目录
 *
 * git回退直接check out revision 到最新的也check out到最新的版本 回退之前先提交代码 防止丢失未提交代码
 *
 * git分支在idea中直接右键分支 new Branch就可以在本地创建分支 切换到新创建的分支后push就可以提交分支到远程
 *
 * checkout分支可以切换分支 分支切换前先commit保存代码 或者用idea的smart check out
 *
 * 切回master主分支后 右键其他分支可以Merge其他分支到主分支 但是只在本地有 push后可以提交分支到远程
 *
 * 右键直接删除远程分支

 */
public class main {
    public static void main(String[] args) {
        System.out.println("test");
    }
}
