package com.wang.jufeng.base;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/23 10:41
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        AbstractBase abstractBase = new ChildBase("a", "a");
        abstractBase.print();

    }
}
