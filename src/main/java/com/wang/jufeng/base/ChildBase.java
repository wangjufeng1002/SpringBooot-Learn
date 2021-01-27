package com.wang.jufeng.base;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/23 10:45
 * @desc
 */
public class ChildBase extends AbstractBase {

    public ChildBase(String a, String b) {
        super(a, b);
    }

    @Override
    public void printA() {
        System.out.println("A=" + getA());
    }
}
