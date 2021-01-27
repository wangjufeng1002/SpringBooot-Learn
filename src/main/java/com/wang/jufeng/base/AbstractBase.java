package com.wang.jufeng.base;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/23 10:40
 * @desc
 */
public abstract class AbstractBase {
    private String a;
    private String b;

    public AbstractBase(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public abstract void printA();

    public void printB() {
        System.out.println("B=" + b);
    }

    public final void print() {
        printA();
        printB();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
