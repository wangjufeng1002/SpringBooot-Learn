package com.wang.jufeng.enumTest;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/23 11:30
 * @desc
 */
public enum ParentEnum {
    ADD("+") {
        @Override
        public int exec(int a,int b) {
            return a+b;
        }
    };

    ParentEnum(String s) {

    }
    public abstract int exec(int a, int b);
}
